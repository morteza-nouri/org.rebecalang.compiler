parser grammar TimedRebecaParser;

import CoreRebecaParser;

rebecaCode returns [TimedRebecaCode rc]
    :
        {$rc = new TimedRebecaCode();}
		(rd = recordDeclaration {$rc.getRecordDeclaration().add($rd.rd);})*
		(
			(ENV fd = fieldDeclaration SEMI {$rc.getEnvironmentVariables().add($fd.fd);})
			|
			(FEATUREVAR featureName = IDENTIFIER SEMI
				{
				VariableDeclarator vd = new VariableDeclarator();
				vd.setVariableName($featureName.text);
				vd.setLineNumber($featureName.getLine());
				vd.setCharacter($featureName.getCharPositionInLine());
				FieldDeclaration fd = new FieldDeclaration();
				fd.getVariableDeclarators().add(vd);
				fd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
    			fd.setCharacter($featureName.getCharPositionInLine());
				fd.setLineNumber($featureName.getLine());
				$rc.getFeatureVariables().add(fd);
				}
			)
		)*
        (
            mbd = mailboxDeclaration {$rc.getMailboxDeclaration().add($mbd.mbd);}
            |
        	rcd = reactiveClassDeclaration {$rc.getReactiveClassDeclaration().add($rcd.rcd);}
        	|
        	intd = interfaceDeclaration {$rc.getInterfaceDeclaration().add($intd.intd);}
    	)+
        md = timedMainDeclaration  {$rc.setMainDeclaration($md.md);}
    ;

mailboxDeclaration returns [MailboxDeclaration mbd]
    :
        {$mbd = new MailboxDeclaration();}
        MAILBOX mailboxName = IDENTIFIER
        	{	$mbd.setName($mailboxName.text);
        		$mbd.setLineNumber($mailboxName.getLine()); $mbd.setCharacter($mailboxName.getCharPositionInLine());
        	}
        LBRACE

        (KNONWSENDERS
        LBRACE
            (fd = fieldDeclaration {$mbd.getKnownSenders().add($fd.fd);} SEMI)*
        RBRACE)?

        (ORDERS
        LBRACE
            (orders = orderSpecifications {$mbd.getOrders().addAll($orders.orders);})*
        RBRACE)?
        RBRACE {$mbd.setEndLineNumber($RBRACE.getLine());$mbd.setEndCharacter($RBRACE.getCharPositionInLine());}
    ;

timedMainDeclaration returns [TimedMainDeclaration md]
	:
		{$md = new TimedMainDeclaration();}
		MAIN {$md.setLineNumber($MAIN.getLine());$md.setCharacter($MAIN.getCharPositionInLine());}
		LBRACE
		(mmbd = mainMailboxDefinition {$md.getMainMailboxDefinition().add($mmbd.mmbd);})*
		(mrd = timedMainRebecDefinition {$md.getMainRebecDefinition().add($mrd.mrd);})*
		RBRACE {$md.setEndLineNumber($RBRACE.getLine());$md.setEndCharacter($RBRACE.getCharPositionInLine());}
	;

mainMailboxDefinition returns [MainMailboxDefinition mmbd]
    :
        {$mmbd = new MainMailboxDefinition();}
        t = type mailboxName = IDENTIFIER {$mmbd.setType($t.t);$mmbd.setName($mailboxName.text);
            $mmbd.setLineNumber($mailboxName.getLine()); $mmbd.setCharacter($mailboxName.getCharPositionInLine());}
        LPAREN (el = expressionList {$mmbd.getBindings().addAll($el.el);})? RPAREN
        SEMI
    ;

timedMainRebecDefinition returns [TimedMainRebecDefinition mrd]
	:
		{$mrd = new TimedMainRebecDefinition();}
    	(an = annotation {$mrd.getAnnotations().add($an.an);})*
		t = type rebecName = IDENTIFIER {$mrd.setType($t.t);$mrd.setName($rebecName.text);
			$mrd.setLineNumber($rebecName.getLine()); $mrd.setCharacter($rebecName.getCharPositionInLine());}
		(LT e = expression {$mrd.setMailbox($e.e);} GT)?
		LPAREN (el = expressionList {$mrd.getBindings().addAll($el.el);})? RPAREN
		COLON
		LPAREN (el = expressionList {$mrd.getArguments().addAll($el.el);})? RPAREN
		SEMI
	;

orderSpecifications returns [List<Expression> orders]
    :
        {$orders = new LinkedList<Expression>();}
        e = conditionalExpression {$orders.add($e.e);}
        (COMMA e = conditionalExpression {$orders.add($e.e);})*
    ;

primary returns [TermPrimary tp]
    :   
    id1 = IDENTIFIER {$tp = new TermPrimary(); $tp.setName($id1.text);
					  $tp.setLineNumber($id1.getLine()); $tp.setCharacter($id1.getCharPositionInLine());}
    (	lp = LPAREN 
    	{TimedRebecaParentSuffixPrimary psp = new TimedRebecaParentSuffixPrimary(); 
    	 psp.setLineNumber($lp.getLine()); psp.setCharacter($lp.getCharPositionInLine());
    	 $tp.setParentSuffixPrimary(psp);}
		(el = expressionList {$tp.getParentSuffixPrimary().getArguments().addAll($el.el);})?
		RPAREN
    	(AFTER LPAREN ef = expression RPAREN {psp.setAfterExpression($ef.e);})?
    	(DEADLINE LPAREN ed = expression RPAREN {psp.setDeadlineExpression($ed.e);})?
    )?
	(LBRACKET e2 = expression RBRACKET {$tp.getIndices().add($e2.e);})*
    ;
