// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/TimedRebecaComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.modelcompiler.timedrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TimedRebecaCompleteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAILBOX=1, KNONWSENDERS=2, ORDERS=3, AFTER=4, DEADLINE=5, INTLITERAL=6, 
		FLOATLITERAL=7, DOUBLELITERAL=8, CHARLITERAL=9, STRINGLITERAL=10, WS=11, 
		COMMENT=12, LINE_COMMENT=13, BREAK=14, CASE=15, CLASS=16, CONTINUE=17, 
		DEFAULT=18, ELSE=19, FOR=20, GOTO=21, IF=22, IMPORT=23, NEW=24, PACKAGE=25, 
		PRIVATE=26, PROTECTED=27, PUBLIC=28, RECORD=29, RETURN=30, SWITCH=31, 
		WHILE=32, ENV=33, FEATUREVAR=34, INSTANCEOF=35, REACTIVECLASS=36, INTERFACE=37, 
		ABSTRACT=38, EXTENDS=39, IMPLEMENTS=40, MSGSRV=41, MAIN=42, STATEVARS=43, 
		KNOWNREBECS=44, THIS=45, TRUE=46, FALSE=47, NULL=48, LPAREN=49, RPAREN=50, 
		LBRACE=51, RBRACE=52, LBRACKET=53, RBRACKET=54, SEMI=55, COMMA=56, DOT=57, 
		EQ=58, BANG=59, TILDA=60, QUES=61, COLON=62, EQEQ=63, AMPAMP=64, BARBAR=65, 
		PLUSPLUS=66, SUBSUB=67, SUPER=68, PLUS=69, SUB=70, STAR=71, SLASH=72, 
		AMP=73, BAR=74, CARET=75, PERCENT=76, PLUSEQ=77, SUBEQ=78, STAREQ=79, 
		SLASHEQ=80, AMPEQ=81, BAREQ=82, CARETEQ=83, TILDAEQ=84, PERCENTEQ=85, 
		MONKEYS_AT=86, BANGEQ=87, GT=88, LT=89, LTLT=90, LTLTEQ=91, GTGT=92, GTGTEQ=93, 
		IDENTIFIER=94;
	public static final int
		RULE_rebecaCode = 0, RULE_mailboxDeclaration = 1, RULE_timedMainDeclaration = 2, 
		RULE_mainMailboxDefinition = 3, RULE_timedMainRebecDefinition = 4, RULE_orderSpecifications = 5, 
		RULE_primary = 6, RULE_rebecaModel = 7, RULE_packageDeclaration = 8, RULE_importDeclaration = 9, 
		RULE_recordDeclaration = 10, RULE_mainDeclaration = 11, RULE_mainRebecDefinition = 12, 
		RULE_fieldDeclaration = 13, RULE_variableDeclarators = 14, RULE_variableDeclarator = 15, 
		RULE_variableInitializer = 16, RULE_arrayInitializer = 17, RULE_interfaceDeclaration = 18, 
		RULE_reactiveClassDeclaration = 19, RULE_methodDeclaration = 20, RULE_constructorDeclaration = 21, 
		RULE_msgsrvDeclaration = 22, RULE_synchMethodDeclaration = 23, RULE_formalParameters = 24, 
		RULE_formalParametersDeclaration = 25, RULE_formalParameterDeclaration = 26, 
		RULE_block = 27, RULE_statement = 28, RULE_forInit = 29, RULE_switchBlock = 30, 
		RULE_statementExpression = 31, RULE_annotation = 32, RULE_type = 33, RULE_genericTypeParams = 34, 
		RULE_dimensions = 35, RULE_expression = 36, RULE_assignmentOperator = 37, 
		RULE_conditionalExpression = 38, RULE_conditionalOrExpression = 39, RULE_conditionalAndExpression = 40, 
		RULE_inclusiveOrExpression = 41, RULE_exclusiveOrExpression = 42, RULE_andExpression = 43, 
		RULE_equalityExpression = 44, RULE_instanceOfExpression = 45, RULE_relationalExpression = 46, 
		RULE_relationalOp = 47, RULE_shiftExpression = 48, RULE_shiftOp = 49, 
		RULE_additiveExpression = 50, RULE_multiplicativeExpression = 51, RULE_unaryExpression = 52, 
		RULE_unaryExpressionNotPlusMinus = 53, RULE_castExpression = 54, RULE_expressionList = 55, 
		RULE_literal = 56;
	private static String[] makeRuleNames() {
		return new String[] {
			"rebecaCode", "mailboxDeclaration", "timedMainDeclaration", "mainMailboxDefinition", 
			"timedMainRebecDefinition", "orderSpecifications", "primary", "rebecaModel", 
			"packageDeclaration", "importDeclaration", "recordDeclaration", "mainDeclaration", 
			"mainRebecDefinition", "fieldDeclaration", "variableDeclarators", "variableDeclarator", 
			"variableInitializer", "arrayInitializer", "interfaceDeclaration", "reactiveClassDeclaration", 
			"methodDeclaration", "constructorDeclaration", "msgsrvDeclaration", "synchMethodDeclaration", 
			"formalParameters", "formalParametersDeclaration", "formalParameterDeclaration", 
			"block", "statement", "forInit", "switchBlock", "statementExpression", 
			"annotation", "type", "genericTypeParams", "dimensions", "expression", 
			"assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
			"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
			"andExpression", "equalityExpression", "instanceOfExpression", "relationalExpression", 
			"relationalOp", "shiftExpression", "shiftOp", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "unaryExpressionNotPlusMinus", "castExpression", "expressionList", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mailbox'", "'knownsenders'", "'orders'", "'after'", "'deadline'", 
			null, null, null, null, null, null, null, null, "'break'", "'case'", 
			"'class'", "'continue'", "'default'", "'else'", "'for'", "'goto'", "'if'", 
			"'import'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
			"'record'", "'return'", "'switch'", "'while'", "'env'", "'featurevar'", 
			"'instanceof'", "'reactiveclass'", "'interface'", "'abstract'", "'extends'", 
			"'implements'", "'msgsrv'", "'main'", "'statevars'", "'knownrebecs'", 
			"'this'", "'true'", "'false'", "'null'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'", "'='", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'&&'", "'||'", "'++'", "'--'", "'super'", "'+'", "'-'", "'*'", 
			"'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'^='", "'~='", "'%='", "'@'", "'!='", "'>'", "'<'", "'<<'", 
			"'<<='", "'>>'", "'>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAILBOX", "KNONWSENDERS", "ORDERS", "AFTER", "DEADLINE", "INTLITERAL", 
			"FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "WS", 
			"COMMENT", "LINE_COMMENT", "BREAK", "CASE", "CLASS", "CONTINUE", "DEFAULT", 
			"ELSE", "FOR", "GOTO", "IF", "IMPORT", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
			"PUBLIC", "RECORD", "RETURN", "SWITCH", "WHILE", "ENV", "FEATUREVAR", 
			"INSTANCEOF", "REACTIVECLASS", "INTERFACE", "ABSTRACT", "EXTENDS", "IMPLEMENTS", 
			"MSGSRV", "MAIN", "STATEVARS", "KNOWNREBECS", "THIS", "TRUE", "FALSE", 
			"NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
			"SEMI", "COMMA", "DOT", "EQ", "BANG", "TILDA", "QUES", "COLON", "EQEQ", 
			"AMPAMP", "BARBAR", "PLUSPLUS", "SUBSUB", "SUPER", "PLUS", "SUB", "STAR", 
			"SLASH", "AMP", "BAR", "CARET", "PERCENT", "PLUSEQ", "SUBEQ", "STAREQ", 
			"SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "TILDAEQ", "PERCENTEQ", "MONKEYS_AT", 
			"BANGEQ", "GT", "LT", "LTLT", "LTLTEQ", "GTGT", "GTGTEQ", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TimedRebecaComplete.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TimedRebecaCompleteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RebecaCodeContext extends ParserRuleContext {
		public TimedRebecaCode rc;
		public RecordDeclarationContext rd;
		public FieldDeclarationContext fd;
		public Token featureName;
		public MailboxDeclarationContext mbd;
		public ReactiveClassDeclarationContext rcd;
		public InterfaceDeclarationContext intd;
		public TimedMainDeclarationContext md;
		public TimedMainDeclarationContext timedMainDeclaration() {
			return getRuleContext(TimedMainDeclarationContext.class,0);
		}
		public List<RecordDeclarationContext> recordDeclaration() {
			return getRuleContexts(RecordDeclarationContext.class);
		}
		public RecordDeclarationContext recordDeclaration(int i) {
			return getRuleContext(RecordDeclarationContext.class,i);
		}
		public List<MailboxDeclarationContext> mailboxDeclaration() {
			return getRuleContexts(MailboxDeclarationContext.class);
		}
		public MailboxDeclarationContext mailboxDeclaration(int i) {
			return getRuleContext(MailboxDeclarationContext.class,i);
		}
		public List<ReactiveClassDeclarationContext> reactiveClassDeclaration() {
			return getRuleContexts(ReactiveClassDeclarationContext.class);
		}
		public ReactiveClassDeclarationContext reactiveClassDeclaration(int i) {
			return getRuleContext(ReactiveClassDeclarationContext.class,i);
		}
		public List<InterfaceDeclarationContext> interfaceDeclaration() {
			return getRuleContexts(InterfaceDeclarationContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration(int i) {
			return getRuleContext(InterfaceDeclarationContext.class,i);
		}
		public List<TerminalNode> ENV() { return getTokens(TimedRebecaCompleteParser.ENV); }
		public TerminalNode ENV(int i) {
			return getToken(TimedRebecaCompleteParser.ENV, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public List<TerminalNode> FEATUREVAR() { return getTokens(TimedRebecaCompleteParser.FEATUREVAR); }
		public TerminalNode FEATUREVAR(int i) {
			return getToken(TimedRebecaCompleteParser.FEATUREVAR, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaCompleteParser.IDENTIFIER, i);
		}
		public RebecaCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebecaCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRebecaCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRebecaCode(this);
		}
	}

	public final RebecaCodeContext rebecaCode() throws RecognitionException {
		RebecaCodeContext _localctx = new RebecaCodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rebecaCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaCodeContext)_localctx).rc =  new TimedRebecaCode();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(115);
				((RebecaCodeContext)_localctx).rd = recordDeclaration();
				_localctx.rc.getRecordDeclaration().add(((RebecaCodeContext)_localctx).rd.rd);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV || _la==FEATUREVAR) {
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENV:
					{
					{
					setState(123);
					match(ENV);
					setState(124);
					((RebecaCodeContext)_localctx).fd = fieldDeclaration();
					setState(125);
					match(SEMI);
					_localctx.rc.getEnvironmentVariables().add(((RebecaCodeContext)_localctx).fd.fd);
					}
					}
					break;
				case FEATUREVAR:
					{
					{
					setState(128);
					match(FEATUREVAR);
					setState(129);
					((RebecaCodeContext)_localctx).featureName = match(IDENTIFIER);
					setState(130);
					match(SEMI);

									VariableDeclarator vd = new VariableDeclarator();
									vd.setVariableName((((RebecaCodeContext)_localctx).featureName!=null?((RebecaCodeContext)_localctx).featureName.getText():null));
									vd.setLineNumber(((RebecaCodeContext)_localctx).featureName.getLine());
									vd.setCharacter(((RebecaCodeContext)_localctx).featureName.getCharPositionInLine());
									FieldDeclaration fd = new FieldDeclaration();
									fd.getVariableDeclarators().add(vd);
									fd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
					    			fd.setCharacter(((RebecaCodeContext)_localctx).featureName.getCharPositionInLine());
									fd.setLineNumber(((RebecaCodeContext)_localctx).featureName.getLine());
									_localctx.rc.getFeatureVariables().add(fd);
									
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(137);
					((RebecaCodeContext)_localctx).mbd = mailboxDeclaration();
					_localctx.rc.getMailboxDeclaration().add(((RebecaCodeContext)_localctx).mbd.mbd);
					}
					break;
				case 2:
					{
					setState(140);
					((RebecaCodeContext)_localctx).rcd = reactiveClassDeclaration();
					_localctx.rc.getReactiveClassDeclaration().add(((RebecaCodeContext)_localctx).rcd.rcd);
					}
					break;
				case 3:
					{
					setState(143);
					((RebecaCodeContext)_localctx).intd = interfaceDeclaration();
					_localctx.rc.getInterfaceDeclaration().add(((RebecaCodeContext)_localctx).intd.intd);
					}
					break;
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAILBOX) | (1L << REACTIVECLASS) | (1L << INTERFACE) | (1L << ABSTRACT))) != 0) || _la==MONKEYS_AT );
			setState(150);
			((RebecaCodeContext)_localctx).md = timedMainDeclaration();
			_localctx.rc.setMainDeclaration(((RebecaCodeContext)_localctx).md.md);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MailboxDeclarationContext extends ParserRuleContext {
		public MailboxDeclaration mbd;
		public Token mailboxName;
		public FieldDeclarationContext fd;
		public Token RBRACE;
		public OrderSpecificationsContext orders;
		public TerminalNode MAILBOX() { return getToken(TimedRebecaCompleteParser.MAILBOX, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(TimedRebecaCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(TimedRebecaCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACE, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode KNONWSENDERS() { return getToken(TimedRebecaCompleteParser.KNONWSENDERS, 0); }
		public TerminalNode ORDERS() { return getToken(TimedRebecaCompleteParser.ORDERS, 0); }
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<OrderSpecificationsContext> orderSpecifications() {
			return getRuleContexts(OrderSpecificationsContext.class);
		}
		public OrderSpecificationsContext orderSpecifications(int i) {
			return getRuleContext(OrderSpecificationsContext.class,i);
		}
		public MailboxDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mailboxDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMailboxDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMailboxDeclaration(this);
		}
	}

	public final MailboxDeclarationContext mailboxDeclaration() throws RecognitionException {
		MailboxDeclarationContext _localctx = new MailboxDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mailboxDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MailboxDeclarationContext)_localctx).mbd =  new MailboxDeclaration();
			setState(154);
			match(MAILBOX);
			setState(155);
			((MailboxDeclarationContext)_localctx).mailboxName = match(IDENTIFIER);
				_localctx.mbd.setName((((MailboxDeclarationContext)_localctx).mailboxName!=null?((MailboxDeclarationContext)_localctx).mailboxName.getText():null));
			        		_localctx.mbd.setLineNumber(((MailboxDeclarationContext)_localctx).mailboxName.getLine()); _localctx.mbd.setCharacter(((MailboxDeclarationContext)_localctx).mailboxName.getCharPositionInLine());
			        	
			setState(157);
			match(LBRACE);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KNONWSENDERS) {
				{
				setState(158);
				match(KNONWSENDERS);
				setState(159);
				match(LBRACE);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(160);
					((MailboxDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.mbd.getKnownSenders().add(((MailboxDeclarationContext)_localctx).fd.fd);
					setState(162);
					match(SEMI);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				((MailboxDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDERS) {
				{
				setState(172);
				match(ORDERS);
				setState(173);
				match(LBRACE);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(174);
					((MailboxDeclarationContext)_localctx).orders = orderSpecifications();
					_localctx.mbd.getOrders().addAll(((MailboxDeclarationContext)_localctx).orders.orders);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				((MailboxDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(185);
			((MailboxDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.mbd.setEndLineNumber(((MailboxDeclarationContext)_localctx).RBRACE.getLine());_localctx.mbd.setEndCharacter(((MailboxDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimedMainDeclarationContext extends ParserRuleContext {
		public TimedMainDeclaration md;
		public Token MAIN;
		public MainMailboxDefinitionContext mmbd;
		public TimedMainRebecDefinitionContext mrd;
		public Token RBRACE;
		public TerminalNode MAIN() { return getToken(TimedRebecaCompleteParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public List<MainMailboxDefinitionContext> mainMailboxDefinition() {
			return getRuleContexts(MainMailboxDefinitionContext.class);
		}
		public MainMailboxDefinitionContext mainMailboxDefinition(int i) {
			return getRuleContext(MainMailboxDefinitionContext.class,i);
		}
		public List<TimedMainRebecDefinitionContext> timedMainRebecDefinition() {
			return getRuleContexts(TimedMainRebecDefinitionContext.class);
		}
		public TimedMainRebecDefinitionContext timedMainRebecDefinition(int i) {
			return getRuleContext(TimedMainRebecDefinitionContext.class,i);
		}
		public TimedMainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timedMainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterTimedMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitTimedMainDeclaration(this);
		}
	}

	public final TimedMainDeclarationContext timedMainDeclaration() throws RecognitionException {
		TimedMainDeclarationContext _localctx = new TimedMainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_timedMainDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((TimedMainDeclarationContext)_localctx).md =  new TimedMainDeclaration();
			setState(189);
			((TimedMainDeclarationContext)_localctx).MAIN = match(MAIN);
			_localctx.md.setLineNumber(((TimedMainDeclarationContext)_localctx).MAIN.getLine());_localctx.md.setCharacter(((TimedMainDeclarationContext)_localctx).MAIN.getCharPositionInLine());
			setState(191);
			match(LBRACE);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					((TimedMainDeclarationContext)_localctx).mmbd = mainMailboxDefinition();
					_localctx.md.getMainMailboxDefinition().add(((TimedMainDeclarationContext)_localctx).mmbd.mmbd);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(200);
				((TimedMainDeclarationContext)_localctx).mrd = timedMainRebecDefinition();
				_localctx.md.getMainRebecDefinition().add(((TimedMainDeclarationContext)_localctx).mrd.mrd);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			((TimedMainDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.md.setEndLineNumber(((TimedMainDeclarationContext)_localctx).RBRACE.getLine());_localctx.md.setEndCharacter(((TimedMainDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainMailboxDefinitionContext extends ParserRuleContext {
		public MainMailboxDefinition mmbd;
		public TypeContext t;
		public Token mailboxName;
		public ExpressionListContext el;
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(TimedRebecaCompleteParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MainMailboxDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMailboxDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMainMailboxDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMainMailboxDefinition(this);
		}
	}

	public final MainMailboxDefinitionContext mainMailboxDefinition() throws RecognitionException {
		MainMailboxDefinitionContext _localctx = new MainMailboxDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainMailboxDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainMailboxDefinitionContext)_localctx).mmbd =  new MainMailboxDefinition();
			setState(212);
			((MainMailboxDefinitionContext)_localctx).t = type();
			setState(213);
			((MainMailboxDefinitionContext)_localctx).mailboxName = match(IDENTIFIER);
			_localctx.mmbd.setType(((MainMailboxDefinitionContext)_localctx).t.t);_localctx.mmbd.setName((((MainMailboxDefinitionContext)_localctx).mailboxName!=null?((MainMailboxDefinitionContext)_localctx).mailboxName.getText():null));
			            _localctx.mmbd.setLineNumber(((MainMailboxDefinitionContext)_localctx).mailboxName.getLine()); _localctx.mmbd.setCharacter(((MainMailboxDefinitionContext)_localctx).mailboxName.getCharPositionInLine());
			setState(215);
			match(LPAREN);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (MONKEYS_AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(216);
				((MainMailboxDefinitionContext)_localctx).el = expressionList();
				_localctx.mmbd.getBindings().addAll(((MainMailboxDefinitionContext)_localctx).el.el);
				}
			}

			setState(221);
			match(RPAREN);
			setState(222);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimedMainRebecDefinitionContext extends ParserRuleContext {
		public TimedMainRebecDefinition mrd;
		public AnnotationContext an;
		public TypeContext t;
		public Token rebecName;
		public ExpressionContext e;
		public ExpressionListContext el;
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(TimedRebecaCompleteParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LT() { return getToken(TimedRebecaCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(TimedRebecaCompleteParser.GT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public TimedMainRebecDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timedMainRebecDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterTimedMainRebecDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitTimedMainRebecDefinition(this);
		}
	}

	public final TimedMainRebecDefinitionContext timedMainRebecDefinition() throws RecognitionException {
		TimedMainRebecDefinitionContext _localctx = new TimedMainRebecDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_timedMainRebecDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TimedMainRebecDefinitionContext)_localctx).mrd =  new TimedMainRebecDefinition();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(225);
				((TimedMainRebecDefinitionContext)_localctx).an = annotation();
				_localctx.mrd.getAnnotations().add(((TimedMainRebecDefinitionContext)_localctx).an.an);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			((TimedMainRebecDefinitionContext)_localctx).t = type();
			setState(234);
			((TimedMainRebecDefinitionContext)_localctx).rebecName = match(IDENTIFIER);
			_localctx.mrd.setType(((TimedMainRebecDefinitionContext)_localctx).t.t);_localctx.mrd.setName((((TimedMainRebecDefinitionContext)_localctx).rebecName!=null?((TimedMainRebecDefinitionContext)_localctx).rebecName.getText():null));
						_localctx.mrd.setLineNumber(((TimedMainRebecDefinitionContext)_localctx).rebecName.getLine()); _localctx.mrd.setCharacter(((TimedMainRebecDefinitionContext)_localctx).rebecName.getCharPositionInLine());
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(236);
				match(LT);
				setState(237);
				((TimedMainRebecDefinitionContext)_localctx).e = expression();
				_localctx.mrd.setMailbox(((TimedMainRebecDefinitionContext)_localctx).e.e);
				setState(239);
				match(GT);
				}
			}

			setState(243);
			match(LPAREN);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (MONKEYS_AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(244);
				((TimedMainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getBindings().addAll(((TimedMainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(249);
			match(RPAREN);
			setState(250);
			match(COLON);
			setState(251);
			match(LPAREN);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (MONKEYS_AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(252);
				((TimedMainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getArguments().addAll(((TimedMainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(257);
			match(RPAREN);
			setState(258);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderSpecificationsContext extends ParserRuleContext {
		public List<Expression> orders;
		public ConditionalExpressionContext e;
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public OrderSpecificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderSpecifications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterOrderSpecifications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitOrderSpecifications(this);
		}
	}

	public final OrderSpecificationsContext orderSpecifications() throws RecognitionException {
		OrderSpecificationsContext _localctx = new OrderSpecificationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_orderSpecifications);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((OrderSpecificationsContext)_localctx).orders =  new LinkedList<Expression>();
			setState(261);
			((OrderSpecificationsContext)_localctx).e = conditionalExpression();
			_localctx.orders.add(((OrderSpecificationsContext)_localctx).e.e);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263);
				match(COMMA);
				setState(264);
				((OrderSpecificationsContext)_localctx).e = conditionalExpression();
				_localctx.orders.add(((OrderSpecificationsContext)_localctx).e.e);
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TermPrimary tp;
		public Token id1;
		public Token lp;
		public ExpressionListContext el;
		public ExpressionContext ef;
		public ExpressionContext ed;
		public ExpressionContext e2;
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(TimedRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(TimedRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AFTER() { return getToken(TimedRebecaCompleteParser.AFTER, 0); }
		public TerminalNode DEADLINE() { return getToken(TimedRebecaCompleteParser.DEADLINE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			((PrimaryContext)_localctx).id1 = match(IDENTIFIER);
			((PrimaryContext)_localctx).tp =  new TermPrimary(); _localctx.tp.setName((((PrimaryContext)_localctx).id1!=null?((PrimaryContext)_localctx).id1.getText():null));
								  _localctx.tp.setLineNumber(((PrimaryContext)_localctx).id1.getLine()); _localctx.tp.setCharacter(((PrimaryContext)_localctx).id1.getCharPositionInLine());
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(274);
				((PrimaryContext)_localctx).lp = match(LPAREN);
				TimedRebecaParentSuffixPrimary psp = new TimedRebecaParentSuffixPrimary(); 
				    	 psp.setLineNumber(((PrimaryContext)_localctx).lp.getLine()); psp.setCharacter(((PrimaryContext)_localctx).lp.getCharPositionInLine());
				    	 _localctx.tp.setParentSuffixPrimary(psp);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (MONKEYS_AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					setState(276);
					((PrimaryContext)_localctx).el = expressionList();
					_localctx.tp.getParentSuffixPrimary().getArguments().addAll(((PrimaryContext)_localctx).el.el);
					}
				}

				setState(281);
				match(RPAREN);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(282);
					match(AFTER);
					setState(283);
					match(LPAREN);
					setState(284);
					((PrimaryContext)_localctx).ef = expression();
					setState(285);
					match(RPAREN);
					psp.setAfterExpression(((PrimaryContext)_localctx).ef.e);
					}
				}

				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEADLINE) {
					{
					setState(290);
					match(DEADLINE);
					setState(291);
					match(LPAREN);
					setState(292);
					((PrimaryContext)_localctx).ed = expression();
					setState(293);
					match(RPAREN);
					psp.setDeadlineExpression(((PrimaryContext)_localctx).ed.e);
					}
				}

				}
				break;
			}
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(300);
				match(LBRACKET);
				setState(301);
				((PrimaryContext)_localctx).e2 = expression();
				setState(302);
				match(RBRACKET);
				_localctx.tp.getIndices().add(((PrimaryContext)_localctx).e2.e);
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RebecaModelContext extends ParserRuleContext {
		public RebecaModel r;
		public PackageDeclarationContext p;
		public ImportDeclarationContext i;
		public RebecaCodeContext t1;
		public RebecaCodeContext rebecaCode() {
			return getRuleContext(RebecaCodeContext.class,0);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public RebecaModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebecaModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRebecaModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRebecaModel(this);
		}
	}

	public final RebecaModelContext rebecaModel() throws RecognitionException {
		RebecaModelContext _localctx = new RebecaModelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rebecaModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaModelContext)_localctx).r =  new RebecaModel();
			        
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(311);
				((RebecaModelContext)_localctx).p = packageDeclaration();
				_localctx.r.setPackageDeclaration(((RebecaModelContext)_localctx).p.p);
				}
			}

			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(316);
				((RebecaModelContext)_localctx).i = importDeclaration();
				_localctx.r.getImportDeclaration().add(((RebecaModelContext)_localctx).i.i);
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(324);
			((RebecaModelContext)_localctx).t1 = rebecaCode();
			_localctx.r.setRebecaCode(((RebecaModelContext)_localctx).t1.rc);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public PackageDeclaration p;
		public TerminalNode PACKAGE() { return getToken(TimedRebecaCompleteParser.PACKAGE, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(PACKAGE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclaration i;
		public TerminalNode IMPORT() { return getToken(TimedRebecaCompleteParser.IMPORT, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(IMPORT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordDeclarationContext extends ParserRuleContext {
		public RecordDeclaration rd;
		public TerminalNode RECORD() { return getToken(TimedRebecaCompleteParser.RECORD, 0); }
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRecordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRecordDeclaration(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_recordDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(RECORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainDeclarationContext extends ParserRuleContext {
		public MainDeclaration md;
		public Token MAIN;
		public MainRebecDefinitionContext mrd;
		public Token RBRACE;
		public TerminalNode MAIN() { return getToken(TimedRebecaCompleteParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public List<MainRebecDefinitionContext> mainRebecDefinition() {
			return getRuleContexts(MainRebecDefinitionContext.class);
		}
		public MainRebecDefinitionContext mainRebecDefinition(int i) {
			return getRuleContext(MainRebecDefinitionContext.class,i);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMainDeclaration(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainDeclarationContext)_localctx).md =  new MainDeclaration();
			setState(334);
			((MainDeclarationContext)_localctx).MAIN = match(MAIN);
			_localctx.md.setLineNumber(((MainDeclarationContext)_localctx).MAIN.getLine());_localctx.md.setCharacter(((MainDeclarationContext)_localctx).MAIN.getCharPositionInLine());
			setState(336);
			match(LBRACE);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(337);
				((MainDeclarationContext)_localctx).mrd = mainRebecDefinition();
				_localctx.md.getMainRebecDefinition().add(((MainDeclarationContext)_localctx).mrd.mrd);
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			((MainDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.md.setEndLineNumber(((MainDeclarationContext)_localctx).RBRACE.getLine());_localctx.md.setEndCharacter(((MainDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainRebecDefinitionContext extends ParserRuleContext {
		public MainRebecDefinition mrd;
		public AnnotationContext an;
		public TypeContext t;
		public Token rebecName;
		public ExpressionListContext el;
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(TimedRebecaCompleteParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public MainRebecDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainRebecDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMainRebecDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMainRebecDefinition(this);
		}
	}

	public final MainRebecDefinitionContext mainRebecDefinition() throws RecognitionException {
		MainRebecDefinitionContext _localctx = new MainRebecDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mainRebecDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainRebecDefinitionContext)_localctx).mrd =  new MainRebecDefinition();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(349);
				((MainRebecDefinitionContext)_localctx).an = annotation();
				_localctx.mrd.getAnnotations().add(((MainRebecDefinitionContext)_localctx).an.an);
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			((MainRebecDefinitionContext)_localctx).t = type();
			setState(358);
			((MainRebecDefinitionContext)_localctx).rebecName = match(IDENTIFIER);
			_localctx.mrd.setType(((MainRebecDefinitionContext)_localctx).t.t);_localctx.mrd.setName((((MainRebecDefinitionContext)_localctx).rebecName!=null?((MainRebecDefinitionContext)_localctx).rebecName.getText():null));
						_localctx.mrd.setLineNumber(((MainRebecDefinitionContext)_localctx).rebecName.getLine()); _localctx.mrd.setCharacter(((MainRebecDefinitionContext)_localctx).rebecName.getCharPositionInLine());
			setState(360);
			match(LPAREN);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (MONKEYS_AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(361);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getBindings().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(366);
			match(RPAREN);
			setState(367);
			match(COLON);
			setState(368);
			match(LPAREN);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (MONKEYS_AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(369);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getArguments().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(374);
			match(RPAREN);
			setState(375);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclaration fd;
		public AnnotationContext an;
		public TypeContext t;
		public VariableDeclaratorsContext vds;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FieldDeclarationContext)_localctx).fd =  new FieldDeclaration();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(378);
				((FieldDeclarationContext)_localctx).an = annotation();
				_localctx.fd.getAnnotations().add(((FieldDeclarationContext)_localctx).an.an);
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			((FieldDeclarationContext)_localctx).t = type();
			setState(387);
			((FieldDeclarationContext)_localctx).vds = variableDeclarators();
			_localctx.fd.setType(((FieldDeclarationContext)_localctx).t.t);
					 _localctx.fd.getVariableDeclarators().addAll(((FieldDeclarationContext)_localctx).vds.vds);
			    	 _localctx.fd.setCharacter(((FieldDeclarationContext)_localctx).t.t.getCharacter());
					 _localctx.fd.setLineNumber(((FieldDeclarationContext)_localctx).t.t.getLineNumber());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclarator> vds;
		public VariableDeclaratorContext vd;
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorsContext)_localctx).vds =  new LinkedList<VariableDeclarator>();
			setState(391);
			((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
			_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(393);
				match(COMMA);
				setState(394);
				((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
				_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclarator vd;
		public Token name;
		public VariableInitializerContext vi;
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(TimedRebecaCompleteParser.EQ, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorContext)_localctx).vd =  new VariableDeclarator();
			setState(403);
			((VariableDeclaratorContext)_localctx).name = match(IDENTIFIER);
			_localctx.vd.setVariableName((((VariableDeclaratorContext)_localctx).name!=null?((VariableDeclaratorContext)_localctx).name.getText():null)); _localctx.vd.setLineNumber(((VariableDeclaratorContext)_localctx).name.getLine());_localctx.vd.setCharacter(((VariableDeclaratorContext)_localctx).name.getCharPositionInLine());
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(405);
				match(EQ);
				setState(406);
				((VariableDeclaratorContext)_localctx).vi = variableInitializer();
				_localctx.vd.setVariableInitializer(((VariableDeclaratorContext)_localctx).vi.vi);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public VariableInitializer vi;
		public ArrayInitializerContext ai;
		public ExpressionContext e;
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableInitializer);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				((VariableInitializerContext)_localctx).ai = arrayInitializer();
				((VariableInitializerContext)_localctx).vi =  ((VariableInitializerContext)_localctx).ai.avi;
				}
				break;
			case INTLITERAL:
			case FLOATLITERAL:
			case DOUBLELITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
			case NEW:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case BANG:
			case TILDA:
			case QUES:
			case PLUSPLUS:
			case SUBSUB:
			case PLUS:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				((VariableInitializerContext)_localctx).e = expression();
				if(((VariableInitializerContext)_localctx).e.e != null) {
				    						((VariableInitializerContext)_localctx).vi =  new OrdinaryVariableInitializer();
				    						((OrdinaryVariableInitializer)_localctx.vi).setValue(((VariableInitializerContext)_localctx).e.e);
				    						_localctx.vi.setLineNumber(((VariableInitializerContext)_localctx).e.e.getLineNumber());
				    						_localctx.vi.setCharacter(((VariableInitializerContext)_localctx).e.e.getCharacter());
				    					}
				    					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public ArrayVariableInitializer avi;
		public Token LBRACE;
		public VariableInitializerContext vi;
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayInitializerContext)_localctx).avi =  new ArrayVariableInitializer();
			setState(420);
			((ArrayInitializerContext)_localctx).LBRACE = match(LBRACE);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(421);
				((ArrayInitializerContext)_localctx).vi = variableInitializer();
				_localctx.avi.setCharacter(((ArrayInitializerContext)_localctx).LBRACE.getCharPositionInLine()); _localctx.avi.setLineNumber(((ArrayInitializerContext)_localctx).LBRACE.getLine());
				    		_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(423);
					match(COMMA);
					setState(424);
					((ArrayInitializerContext)_localctx).vi = variableInitializer();
					_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(434);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public InterfaceDeclaration intd;
		public AnnotationContext an;
		public Token interfaceName;
		public Token extendingInterfaceName;
		public Token name;
		public FormalParametersContext fps;
		public Token RBRACE;
		public TerminalNode INTERFACE() { return getToken(TimedRebecaCompleteParser.INTERFACE, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode EXTENDS() { return getToken(TimedRebecaCompleteParser.EXTENDS, 0); }
		public List<TerminalNode> MSGSRV() { return getTokens(TimedRebecaCompleteParser.MSGSRV); }
		public TerminalNode MSGSRV(int i) {
			return getToken(TimedRebecaCompleteParser.MSGSRV, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<FormalParametersContext> formalParameters() {
			return getRuleContexts(FormalParametersContext.class);
		}
		public FormalParametersContext formalParameters(int i) {
			return getRuleContext(FormalParametersContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InterfaceDeclarationContext)_localctx).intd =  new InterfaceDeclaration();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(437);
				((InterfaceDeclarationContext)_localctx).an = annotation();
				_localctx.intd.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			match(INTERFACE);
			setState(446);
			((InterfaceDeclarationContext)_localctx).interfaceName = match(IDENTIFIER);
				_localctx.intd.setName((((InterfaceDeclarationContext)_localctx).interfaceName!=null?((InterfaceDeclarationContext)_localctx).interfaceName.getText():null)); 
			        		_localctx.intd.setLineNumber(((InterfaceDeclarationContext)_localctx).interfaceName.getLine()); _localctx.intd.setCharacter(((InterfaceDeclarationContext)_localctx).interfaceName.getCharPositionInLine());
			        	
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(448);
				match(EXTENDS);
				setState(449);
				((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
				        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
				        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
				        		_localctx.intd.getExtends().add(opt);
				        	
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(451);
					match(COMMA);
					setState(452);
					((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
						        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
						        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
						        		_localctx.intd.getExtends().add(opt);
					        		
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(461);
			match(LBRACE);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGSRV || _la==MONKEYS_AT) {
				{
				{
				MethodDeclaration md = new MsgsrvDeclaration();md.setAbstract(true); _localctx.intd.getMsgsrvs().add((MsgsrvDeclaration)md);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(463);
					((InterfaceDeclarationContext)_localctx).an = annotation();
					md.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(471);
				match(MSGSRV);
				setState(472);
				((InterfaceDeclarationContext)_localctx).name = match(IDENTIFIER);
				md.setName((((InterfaceDeclarationContext)_localctx).name!=null?((InterfaceDeclarationContext)_localctx).name.getText():null)); md.setLineNumber(((InterfaceDeclarationContext)_localctx).name.getLine());md.setCharacter(((InterfaceDeclarationContext)_localctx).name.getCharPositionInLine());
				setState(474);
				((InterfaceDeclarationContext)_localctx).fps = formalParameters();
				md.getFormalParameters().addAll(((InterfaceDeclarationContext)_localctx).fps.fps);
				setState(476);
				match(SEMI);
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(483);
			((InterfaceDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.intd.setEndLineNumber(((InterfaceDeclarationContext)_localctx).RBRACE.getLine());_localctx.intd.setEndCharacter(((InterfaceDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReactiveClassDeclarationContext extends ParserRuleContext {
		public ReactiveClassDeclaration rcd;
		public AnnotationContext an;
		public Token reactiveClassName;
		public Token extendingReactiveClassName;
		public Token implementingInterfaceName;
		public Token queueSize;
		public FieldDeclarationContext fd;
		public Token RBRACE;
		public ConstructorDeclarationContext cd;
		public MsgsrvDeclarationContext md;
		public SynchMethodDeclarationContext smd;
		public TerminalNode REACTIVECLASS() { return getToken(TimedRebecaCompleteParser.REACTIVECLASS, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(TimedRebecaCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(TimedRebecaCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode INTLITERAL() { return getToken(TimedRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode ABSTRACT() { return getToken(TimedRebecaCompleteParser.ABSTRACT, 0); }
		public TerminalNode EXTENDS() { return getToken(TimedRebecaCompleteParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(TimedRebecaCompleteParser.IMPLEMENTS, 0); }
		public TerminalNode KNOWNREBECS() { return getToken(TimedRebecaCompleteParser.KNOWNREBECS, 0); }
		public TerminalNode STATEVARS() { return getToken(TimedRebecaCompleteParser.STATEVARS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<MsgsrvDeclarationContext> msgsrvDeclaration() {
			return getRuleContexts(MsgsrvDeclarationContext.class);
		}
		public MsgsrvDeclarationContext msgsrvDeclaration(int i) {
			return getRuleContext(MsgsrvDeclarationContext.class,i);
		}
		public List<SynchMethodDeclarationContext> synchMethodDeclaration() {
			return getRuleContexts(SynchMethodDeclarationContext.class);
		}
		public SynchMethodDeclarationContext synchMethodDeclaration(int i) {
			return getRuleContext(SynchMethodDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public ReactiveClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reactiveClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterReactiveClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitReactiveClassDeclaration(this);
		}
	}

	public final ReactiveClassDeclarationContext reactiveClassDeclaration() throws RecognitionException {
		ReactiveClassDeclarationContext _localctx = new ReactiveClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReactiveClassDeclarationContext)_localctx).rcd =  new ReactiveClassDeclaration();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(487);
				((ReactiveClassDeclarationContext)_localctx).an = annotation();
				_localctx.rcd.getAnnotations().add(((ReactiveClassDeclarationContext)_localctx).an.an);
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(495);
				match(ABSTRACT);
				_localctx.rcd.setAbstract(true);
				}
			}

			setState(499);
			match(REACTIVECLASS);
			setState(500);
			((ReactiveClassDeclarationContext)_localctx).reactiveClassName = match(IDENTIFIER);
				_localctx.rcd.setName((((ReactiveClassDeclarationContext)_localctx).reactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getText():null)); 
			        		_localctx.rcd.setLineNumber(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getLine()); _localctx.rcd.setCharacter(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getCharPositionInLine());
			        	
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(502);
				match(EXTENDS);
				setState(503);
				((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getCharPositionInLine());
				        		_localctx.rcd.setExtends(opt);
				        	
				}
			}

			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(507);
				match(IMPLEMENTS);
				setState(508);
				((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
				        		_localctx.rcd.getImplements().add(opt);
				        	
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(510);
					match(COMMA);
					setState(511);
					((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
						        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
						        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
						        		_localctx.rcd.getImplements().add(opt);
					        		
					}
					}
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(520);
			match(LPAREN);
			setState(521);
			((ReactiveClassDeclarationContext)_localctx).queueSize = match(INTLITERAL);
			if(!((ReactiveClassDeclarationContext)_localctx).queueSize.getText().equals("<missing INTLITERAL>")) _localctx.rcd.setQueueSize(Integer.parseInt((((ReactiveClassDeclarationContext)_localctx).queueSize!=null?((ReactiveClassDeclarationContext)_localctx).queueSize.getText():null)));
			setState(523);
			match(RPAREN);
			setState(524);
			match(LBRACE);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KNOWNREBECS) {
				{
				setState(525);
				match(KNOWNREBECS);
				setState(526);
				match(LBRACE);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(527);
					((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.rcd.getKnownRebecs().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
					setState(529);
					match(SEMI);
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
				((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEVARS) {
				{
				setState(539);
				match(STATEVARS);
				setState(540);
				match(LBRACE);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(541);
					((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.rcd.getStatevars().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
					setState(543);
					match(SEMI);
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(550);
				((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (ABSTRACT - 38)) | (1L << (MSGSRV - 38)) | (1L << (MONKEYS_AT - 38)) | (1L << (IDENTIFIER - 38)))) != 0)) {
				{
				setState(562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(553);
					((ReactiveClassDeclarationContext)_localctx).cd = constructorDeclaration();
					_localctx.rcd.getConstructors().add(((ReactiveClassDeclarationContext)_localctx).cd.cd);
					}
					break;
				case 2:
					{
					setState(556);
					((ReactiveClassDeclarationContext)_localctx).md = msgsrvDeclaration();
					_localctx.rcd.getMsgsrvs().add(((ReactiveClassDeclarationContext)_localctx).md.md);
					}
					break;
				case 3:
					{
					setState(559);
					((ReactiveClassDeclarationContext)_localctx).smd = synchMethodDeclaration();
					_localctx.rcd.getSynchMethods().add(((ReactiveClassDeclarationContext)_localctx).smd.smd);
					}
					break;
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.rcd.setEndLineNumber(((ReactiveClassDeclarationContext)_localctx).RBRACE.getLine());_localctx.rcd.setEndCharacter(((ReactiveClassDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclaration md;
		public Token name;
		public FormalParametersContext fps;
		public BlockContext b;
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TimedRebecaCompleteParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState, MethodDeclaration md) {
			super(parent, invokingState);
			this.md = md;
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration(MethodDeclaration md) throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState(), md);
		enterRule(_localctx, 40, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			((MethodDeclarationContext)_localctx).name = match(IDENTIFIER);
			_localctx.md.setName((((MethodDeclarationContext)_localctx).name!=null?((MethodDeclarationContext)_localctx).name.getText():null)); _localctx.md.setLineNumber(((MethodDeclarationContext)_localctx).name.getLine());_localctx.md.setCharacter(((MethodDeclarationContext)_localctx).name.getCharPositionInLine());
			setState(572);
			((MethodDeclarationContext)_localctx).fps = formalParameters();
			_localctx.md.getFormalParameters().addAll(((MethodDeclarationContext)_localctx).fps.fps);
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(574);
				((MethodDeclarationContext)_localctx).b = block();
				_localctx.md.setBlock(((MethodDeclarationContext)_localctx).b.bs);_localctx.md.setEndLineNumber(((MethodDeclarationContext)_localctx).b.bs.getEndLineNumber());_localctx.md.setEndCharacter(((MethodDeclarationContext)_localctx).b.bs.getEndCharacter());
				}
				break;
			case SEMI:
				{
				setState(577);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaration cd;
		public AnnotationContext an;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorDeclarationContext)_localctx).cd =  new ConstructorDeclaration();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(581);
				((ConstructorDeclarationContext)_localctx).an = annotation();
				_localctx.cd.getAnnotations().add(((ConstructorDeclarationContext)_localctx).an.an);
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(589);
			methodDeclaration(_localctx.cd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MsgsrvDeclarationContext extends ParserRuleContext {
		public MsgsrvDeclaration md;
		public AnnotationContext an;
		public TerminalNode MSGSRV() { return getToken(TimedRebecaCompleteParser.MSGSRV, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(TimedRebecaCompleteParser.ABSTRACT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MsgsrvDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgsrvDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMsgsrvDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMsgsrvDeclaration(this);
		}
	}

	public final MsgsrvDeclarationContext msgsrvDeclaration() throws RecognitionException {
		MsgsrvDeclarationContext _localctx = new MsgsrvDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_msgsrvDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MsgsrvDeclarationContext)_localctx).md =  new MsgsrvDeclaration();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(592);
				((MsgsrvDeclarationContext)_localctx).an = annotation();
				_localctx.md.getAnnotations().add(((MsgsrvDeclarationContext)_localctx).an.an);
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(600);
				match(ABSTRACT);
				_localctx.md.setAbstract(true);
				}
			}

			setState(604);
			match(MSGSRV);
			setState(605);
			methodDeclaration(_localctx.md);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchMethodDeclarationContext extends ParserRuleContext {
		public SynchMethodDeclaration smd;
		public AnnotationContext an;
		public TypeContext t;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(TimedRebecaCompleteParser.ABSTRACT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public SynchMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterSynchMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitSynchMethodDeclaration(this);
		}
	}

	public final SynchMethodDeclarationContext synchMethodDeclaration() throws RecognitionException {
		SynchMethodDeclarationContext _localctx = new SynchMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_synchMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SynchMethodDeclarationContext)_localctx).smd =  new SynchMethodDeclaration();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(608);
				((SynchMethodDeclarationContext)_localctx).an = annotation();
				_localctx.smd.getAnnotations().add(((SynchMethodDeclarationContext)_localctx).an.an);
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(616);
				match(ABSTRACT);
				_localctx.smd.setAbstract(true);
				}
			}

			setState(620);
			((SynchMethodDeclarationContext)_localctx).t = type();
			_localctx.smd.setReturnType(((SynchMethodDeclarationContext)_localctx).t.t);
			setState(622);
			methodDeclaration(_localctx.smd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterDeclaration> fps;
		public FormalParametersDeclarationContext fpds;
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public FormalParametersDeclarationContext formalParametersDeclaration() {
			return getRuleContext(FormalParametersDeclarationContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersContext)_localctx).fps =  new ArrayList<FormalParameterDeclaration>();
			setState(625);
			match(LPAREN);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(626);
				((FormalParametersContext)_localctx).fpds = formalParametersDeclaration();
				_localctx.fps.addAll(((FormalParametersContext)_localctx).fpds.fpds);
				}
			}

			setState(631);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersDeclarationContext extends ParserRuleContext {
		public List<FormalParameterDeclaration> fpds;
		public FormalParameterDeclarationContext fpd;
		public List<FormalParameterDeclarationContext> formalParameterDeclaration() {
			return getRuleContexts(FormalParameterDeclarationContext.class);
		}
		public FormalParameterDeclarationContext formalParameterDeclaration(int i) {
			return getRuleContext(FormalParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public FormalParametersDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParametersDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterFormalParametersDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitFormalParametersDeclaration(this);
		}
	}

	public final FormalParametersDeclarationContext formalParametersDeclaration() throws RecognitionException {
		FormalParametersDeclarationContext _localctx = new FormalParametersDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_formalParametersDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersDeclarationContext)_localctx).fpds =  new ArrayList<FormalParameterDeclaration>();
			setState(634);
			((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
			_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(636);
				match(COMMA);
				setState(637);
				((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
				_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclarationContext extends ParserRuleContext {
		public FormalParameterDeclaration fpd;
		public TypeContext t;
		public Token name;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterFormalParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitFormalParameterDeclaration(this);
		}
	}

	public final FormalParameterDeclarationContext formalParameterDeclaration() throws RecognitionException {
		FormalParameterDeclarationContext _localctx = new FormalParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_formalParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			((FormalParameterDeclarationContext)_localctx).t = type();
			setState(646);
			((FormalParameterDeclarationContext)_localctx).name = match(IDENTIFIER);

			            ((FormalParameterDeclarationContext)_localctx).fpd =  new FormalParameterDeclaration();
						_localctx.fpd.setLineNumber(((FormalParameterDeclarationContext)_localctx).name.getLine());
						_localctx.fpd.setCharacter(((FormalParameterDeclarationContext)_localctx).name.getCharPositionInLine());
			            _localctx.fpd.setName((((FormalParameterDeclarationContext)_localctx).name!=null?((FormalParameterDeclarationContext)_localctx).name.getText():null));
			            _localctx.fpd.setType(((FormalParameterDeclarationContext)_localctx).t.t);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStatement bs;
		public Token LBRACE;
		public AnnotationContext an;
		public StatementContext s;
		public Token RBRACE;
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).bs =  new BlockStatement();
			setState(650);
			((BlockContext)_localctx).LBRACE = match(LBRACE);
			_localctx.bs.setLineNumber(((BlockContext)_localctx).LBRACE.getLine());_localctx.bs.setCharacter(((BlockContext)_localctx).LBRACE.getCharPositionInLine());
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (MONKEYS_AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				ArrayList<Annotation> anns = new ArrayList<Annotation>();
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(653);
						((BlockContext)_localctx).an = annotation();
						anns.add(((BlockContext)_localctx).an.an);
						}
						} 
					}
					setState(660);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(661);
				((BlockContext)_localctx).s = statement();
				_localctx.bs.getStatements().add (((BlockContext)_localctx).s.s); ((BlockContext)_localctx).s.s.getAnnotations().addAll(anns);
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(669);
			((BlockContext)_localctx).RBRACE = match(RBRACE);
			_localctx.bs.setEndLineNumber(((BlockContext)_localctx).RBRACE.getLine());_localctx.bs.setEndCharacter(((BlockContext)_localctx).RBRACE.getCharPositionInLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement s;
		public StatementExpressionContext se;
		public FieldDeclarationContext fd;
		public BlockContext b;
		public Token IF;
		public ExpressionContext e;
		public StatementContext st;
		public StatementContext est;
		public Token WHILE;
		public Token FOR;
		public ForInitContext fi;
		public ExpressionListContext el;
		public Token SWITCH;
		public SwitchBlockContext sb;
		public Token RETURN;
		public Token BREAK;
		public Token CONTINUE;
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(TimedRebecaCompleteParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TimedRebecaCompleteParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(TimedRebecaCompleteParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(TimedRebecaCompleteParser.FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(TimedRebecaCompleteParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(TimedRebecaCompleteParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(TimedRebecaCompleteParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(TimedRebecaCompleteParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statement);
		int _la;
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				((StatementContext)_localctx).se = statementExpression();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).se.se;
				setState(674);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				((StatementContext)_localctx).fd = fieldDeclaration();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).fd.fd;
				setState(678);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(680);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).b.bs;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				((StatementContext)_localctx).IF = match(IF);
				((StatementContext)_localctx).s =  new ConditionalStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).IF.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).IF.getCharPositionInLine());
				setState(685);
				match(LPAREN);
				setState(686);
				((StatementContext)_localctx).e = expression();
				setState(687);
				match(RPAREN);
				setState(688);
				((StatementContext)_localctx).st = statement();
				((ConditionalStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((ConditionalStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				setState(694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(690);
					match(ELSE);
					setState(691);
					((StatementContext)_localctx).est = statement();
					((ConditionalStatement)_localctx.s).setElseStatement(((StatementContext)_localctx).est.s);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(696);
				((StatementContext)_localctx).WHILE = match(WHILE);
				((StatementContext)_localctx).s =  new WhileStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).WHILE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).WHILE.getCharPositionInLine());
				setState(698);
				match(LPAREN);
				setState(699);
				((StatementContext)_localctx).e = expression();
				setState(700);
				match(RPAREN);
				setState(701);
				((StatementContext)_localctx).st = statement();
				((WhileStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((WhileStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(704);
				((StatementContext)_localctx).FOR = match(FOR);
				((StatementContext)_localctx).s =  new ForStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).FOR.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).FOR.getCharPositionInLine());
				setState(706);
				match(LPAREN);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (MONKEYS_AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					setState(707);
					((StatementContext)_localctx).fi = forInit();
					((ForStatement)_localctx.s).setForInitializer(((StatementContext)_localctx).fi.fi);
					}
				}

				setState(712);
				match(SEMI);
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					setState(713);
					((StatementContext)_localctx).e = expression();
					((ForStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e);
					}
				}

				setState(718);
				match(SEMI);
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (MONKEYS_AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					setState(719);
					((StatementContext)_localctx).el = expressionList();
					((ForStatement)_localctx.s).getForIncrement().addAll(((StatementContext)_localctx).el.el); 
					}
				}

				setState(724);
				match(RPAREN);
				setState(725);
				((StatementContext)_localctx).st = statement();
				((ForStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(728);
				((StatementContext)_localctx).SWITCH = match(SWITCH);
				setState(729);
				match(LPAREN);
				setState(730);
				((StatementContext)_localctx).e = expression();
				setState(731);
				match(RPAREN);
				setState(732);
				match(LBRACE);
				setState(733);
				((StatementContext)_localctx).sb = switchBlock();
				setState(734);
				match(RBRACE);
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).sb.ss; ((SwitchStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).SWITCH.getLine()); _localctx.s.setCharacter(((StatementContext)_localctx).SWITCH.getCharPositionInLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(737);
				((StatementContext)_localctx).RETURN = match(RETURN);
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					setState(738);
					((StatementContext)_localctx).e = expression();
					}
				}

				setState(741);
				match(SEMI);
				((StatementContext)_localctx).s =  new ReturnStatement(); ((ReturnStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).RETURN.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).RETURN.getCharPositionInLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(743);
				((StatementContext)_localctx).BREAK = match(BREAK);
				setState(744);
				match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).BREAK.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).BREAK.getCharPositionInLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(746);
				((StatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(747);
				match(SEMI);
				((StatementContext)_localctx).s =  new ContinueStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).CONTINUE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).CONTINUE.getCharPositionInLine());
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(749);
				match(SEMI);
				((StatementContext)_localctx).s =  new Statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ForInitializer fi;
		public FieldDeclarationContext fd;
		public ExpressionListContext el;
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forInit);
		try {
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				((ForInitContext)_localctx).fd = fieldDeclaration();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.setFieldDeclaration(((ForInitContext)_localctx).fd.fd); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				((ForInitContext)_localctx).el = expressionList();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.getExpressions().addAll(((ForInitContext)_localctx).el.el);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public SwitchStatement ss;
		public AnnotationContext an;
		public ExpressionContext e;
		public StatementContext st;
		public Token DEFAULT;
		public List<TerminalNode> CASE() { return getTokens(TimedRebecaCompleteParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(TimedRebecaCompleteParser.CASE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(TimedRebecaCompleteParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TimedRebecaCompleteParser.COLON, i);
		}
		public TerminalNode DEFAULT() { return getToken(TimedRebecaCompleteParser.DEFAULT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((SwitchBlockContext)_localctx).ss =  new SwitchStatement();
			setState(791); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{

				    			_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				    		 	ArrayList<Annotation> anns = new ArrayList<Annotation>();
				    		
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(763);
					((SwitchBlockContext)_localctx).an = annotation();
					anns.add(((SwitchBlockContext)_localctx).an.an);
					}
					}
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(771);
				match(CASE);
				setState(772);
				((SwitchBlockContext)_localctx).e = expression();
				setState(773);
				match(COLON);

				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setExpression(((SwitchBlockContext)_localctx).e.e);
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).e.e.getLineNumber());
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).e.e.getCharacter());
								_localctx.ss.getAnnotations().addAll(anns); anns = new ArrayList<Annotation>();
							
				setState(788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(780);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(775);
								((SwitchBlockContext)_localctx).an = annotation();
								anns.add(((SwitchBlockContext)_localctx).an.an);
								}
								} 
							}
							setState(782);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
						}
						setState(783);
						((SwitchBlockContext)_localctx).st = statement();

											((SwitchBlockContext)_localctx).st.s.getAnnotations().addAll(anns);
											_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1)
												.getStatements().add(((SwitchBlockContext)_localctx).st.s);
										
						}
						} 
					}
					setState(790);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				}
				}
				setState(793); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==MONKEYS_AT );
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(795);
				((SwitchBlockContext)_localctx).DEFAULT = match(DEFAULT);
				setState(796);
				match(COLON);

				    			_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				    		 	ArrayList<Annotation> anns = new ArrayList<Annotation>();
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).DEFAULT.getCharPositionInLine());
				    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).DEFAULT.getLine());
								_localctx.ss.getAnnotations().addAll(anns); anns = new ArrayList<Annotation>();
							
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (MONKEYS_AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(803);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(798);
							((SwitchBlockContext)_localctx).an = annotation();
							anns.add(((SwitchBlockContext)_localctx).an.an);
							}
							} 
						}
						setState(805);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
					}
					setState(806);
					((SwitchBlockContext)_localctx).st = statement();
					((SwitchBlockContext)_localctx).st.s.getAnnotations().addAll(anns); _localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).getStatements().add(((SwitchBlockContext)_localctx).st.s);
					}
					}
					setState(813);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public Statement se;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			((StatementExpressionContext)_localctx).e = expression();
			((StatementExpressionContext)_localctx).se =  ((StatementExpressionContext)_localctx).e.e;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public Annotation an;
		public Token annotationName;
		public ExpressionContext exp;
		public TerminalNode MONKEYS_AT() { return getToken(TimedRebecaCompleteParser.MONKEYS_AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AnnotationContext)_localctx).an =  new Annotation();
			setState(820);
			match(MONKEYS_AT);
			setState(821);
			((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			    	 _localctx.an.setLineNumber(((AnnotationContext)_localctx).annotationName.getLine());
			    	 _localctx.an.setCharacter(((AnnotationContext)_localctx).annotationName.getCharPositionInLine());
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(823);
				match(LPAREN);
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					setState(824);
					((AnnotationContext)_localctx).exp = expression();
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(829);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public Token typeName;
		public GenericTypeParamsContext gts;
		public DimensionsContext ds;
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public GenericTypeParamsContext genericTypeParams() {
			return getRuleContext(GenericTypeParamsContext.class,0);
		}
		public DimensionsContext dimensions() {
			return getRuleContext(DimensionsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(834);
				((TypeContext)_localctx).gts = genericTypeParams();
				GenericType gt = new GenericType(); gt.setName(((OrdinaryPrimitiveType)_localctx.t).getName()); gt.setNumberOfParameters(((TypeContext)_localctx).gts.gts.size());
							GenericTypeInstance gti = new GenericTypeInstance(); gti.setBase(gt); gti.getParameters().addAll(((TypeContext)_localctx).gts.gts); ((TypeContext)_localctx).t =  gti;
							_localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
				}
				break;
			}
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(839);
				((TypeContext)_localctx).ds = dimensions();
				OrdinaryPrimitiveType newpt = (OrdinaryPrimitiveType)_localctx.t; ((TypeContext)_localctx).t =  new ArrayType(); ((ArrayType)_localctx.t).setOrdinaryPrimitiveType(newpt); ((ArrayType)_localctx.t).getDimensions().addAll(((TypeContext)_localctx).ds.ds);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericTypeParamsContext extends ParserRuleContext {
		public List<Type> gts;
		public TypeContext t;
		public TerminalNode LT() { return getToken(TimedRebecaCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(TimedRebecaCompleteParser.GT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public GenericTypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterGenericTypeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitGenericTypeParams(this);
		}
	}

	public final GenericTypeParamsContext genericTypeParams() throws RecognitionException {
		GenericTypeParamsContext _localctx = new GenericTypeParamsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(LT);
			((GenericTypeParamsContext)_localctx).gts =  new LinkedList<Type>();
			setState(846);
			((GenericTypeParamsContext)_localctx).t = type();
			_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(848);
				match(COMMA);
				setState(849);
				((GenericTypeParamsContext)_localctx).t = type();
				_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
				}
				}
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(857);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionsContext extends ParserRuleContext {
		public List<Integer> ds;
		public Token i;
		public List<TerminalNode> LBRACKET() { return getTokens(TimedRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(TimedRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(TimedRebecaCompleteParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(TimedRebecaCompleteParser.INTLITERAL, i);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitDimensions(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(864); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(860);
				match(LBRACKET);
				setState(861);
				((DimensionsContext)_localctx).i = match(INTLITERAL);
				setState(862);
				match(RBRACKET);
				_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
				}
				}
				setState(866); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression e;
		public ConditionalExpressionContext e1;
		public AssignmentOperatorContext ao;
		public ExpressionContext e2;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			((ExpressionContext)_localctx).e1 = conditionalExpression();
			((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).e1.e;
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(870);
				((ExpressionContext)_localctx).ao = assignmentOperator();
				setState(871);
				((ExpressionContext)_localctx).e2 = expression();
				BinaryExpression e3 = new BinaryExpression();
							e3.setOperator(((ExpressionContext)_localctx).ao.ao); e3.setLeft(((ExpressionContext)_localctx).e1.e); e3.setRight(((ExpressionContext)_localctx).e2.e);
							e3.setLineNumber(((ExpressionContext)_localctx).e1.e.getLineNumber());e3.setCharacter(((ExpressionContext)_localctx).e1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3;
							
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public String ao;
		public Token EQ;
		public Token PLUSEQ;
		public Token SUBEQ;
		public Token STAREQ;
		public Token SLASHEQ;
		public Token AMPEQ;
		public Token BAREQ;
		public Token CARETEQ;
		public Token TILDAEQ;
		public Token PERCENTEQ;
		public Token LTLTEQ;
		public Token GTGTEQ;
		public TerminalNode EQ() { return getToken(TimedRebecaCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(TimedRebecaCompleteParser.PLUSEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(TimedRebecaCompleteParser.SUBEQ, 0); }
		public TerminalNode STAREQ() { return getToken(TimedRebecaCompleteParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(TimedRebecaCompleteParser.SLASHEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(TimedRebecaCompleteParser.AMPEQ, 0); }
		public TerminalNode BAREQ() { return getToken(TimedRebecaCompleteParser.BAREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(TimedRebecaCompleteParser.CARETEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(TimedRebecaCompleteParser.TILDAEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(TimedRebecaCompleteParser.PERCENTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(TimedRebecaCompleteParser.LTLTEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(TimedRebecaCompleteParser.GTGTEQ, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignmentOperator);
		try {
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(878);
				((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(880);
				((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(882);
				((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(884);
				((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(886);
				((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(888);
				((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(890);
				((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(892);
				((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(894);
				((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(896);
				((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(898);
				((AssignmentOperatorContext)_localctx).GTGTEQ = match(GTGTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).GTGTEQ!=null?((AssignmentOperatorContext)_localctx).GTGTEQ.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public Expression e;
		public ConditionalOrExpressionContext e1;
		public ExpressionContext e2;
		public ConditionalExpressionContext e3;
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUES() { return getToken(TimedRebecaCompleteParser.QUES, 0); }
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			((ConditionalExpressionContext)_localctx).e1 = conditionalOrExpression();
			((ConditionalExpressionContext)_localctx).e =  ((ConditionalExpressionContext)_localctx).e1.e;
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(904);
				match(QUES);
				setState(905);
				((ConditionalExpressionContext)_localctx).e2 = expression();
				setState(906);
				match(COLON);
				setState(907);
				((ConditionalExpressionContext)_localctx).e3 = conditionalExpression();
				TernaryExpression e4 = new TernaryExpression();
							e4.setCondition(((ConditionalExpressionContext)_localctx).e1.e); e4.setLeft(((ConditionalExpressionContext)_localctx).e2.e); e4.setRight(((ConditionalExpressionContext)_localctx).e3.e);
							e4.setLineNumber(((ConditionalExpressionContext)_localctx).e1.e.getLineNumber());e4.setCharacter(((ConditionalExpressionContext)_localctx).e1.e.getCharacter()); ((ConditionalExpressionContext)_localctx).e =  e4;
							
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public Expression e;
		public ConditionalAndExpressionContext e1;
		public Token BARBAR;
		public ConditionalAndExpressionContext e2;
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<TerminalNode> BARBAR() { return getTokens(TimedRebecaCompleteParser.BARBAR); }
		public TerminalNode BARBAR(int i) {
			return getToken(TimedRebecaCompleteParser.BARBAR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_conditionalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			((ConditionalOrExpressionContext)_localctx).e1 = conditionalAndExpression();
			((ConditionalOrExpressionContext)_localctx).e =  ((ConditionalOrExpressionContext)_localctx).e1.e;
			setState(920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(914);
					((ConditionalOrExpressionContext)_localctx).BARBAR = match(BARBAR);
					setState(915);
					((ConditionalOrExpressionContext)_localctx).e2 = conditionalAndExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalOrExpressionContext)_localctx).BARBAR!=null?((ConditionalOrExpressionContext)_localctx).BARBAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public Expression e;
		public InclusiveOrExpressionContext e1;
		public Token AMPAMP;
		public InclusiveOrExpressionContext e2;
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AMPAMP() { return getTokens(TimedRebecaCompleteParser.AMPAMP); }
		public TerminalNode AMPAMP(int i) {
			return getToken(TimedRebecaCompleteParser.AMPAMP, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditionalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			((ConditionalAndExpressionContext)_localctx).e1 = inclusiveOrExpression();
			((ConditionalAndExpressionContext)_localctx).e =  ((ConditionalAndExpressionContext)_localctx).e1.e;
			setState(931);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(925);
					((ConditionalAndExpressionContext)_localctx).AMPAMP = match(AMPAMP);
					setState(926);
					((ConditionalAndExpressionContext)_localctx).e2 = inclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalAndExpressionContext)_localctx).AMPAMP!=null?((ConditionalAndExpressionContext)_localctx).AMPAMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalAndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalAndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(933);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public Expression e;
		public ExclusiveOrExpressionContext e1;
		public Token BAR;
		public ExclusiveOrExpressionContext e2;
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> BAR() { return getTokens(TimedRebecaCompleteParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(TimedRebecaCompleteParser.BAR, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			((InclusiveOrExpressionContext)_localctx).e1 = exclusiveOrExpression();
			((InclusiveOrExpressionContext)_localctx).e =  ((InclusiveOrExpressionContext)_localctx).e1.e;
			setState(942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(936);
					((InclusiveOrExpressionContext)_localctx).BAR = match(BAR);
					setState(937);
					((InclusiveOrExpressionContext)_localctx).e2 = exclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((InclusiveOrExpressionContext)_localctx).BAR!=null?((InclusiveOrExpressionContext)_localctx).BAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((InclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((InclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public Expression e;
		public AndExpressionContext e1;
		public Token CARET;
		public AndExpressionContext e2;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(TimedRebecaCompleteParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(TimedRebecaCompleteParser.CARET, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			((ExclusiveOrExpressionContext)_localctx).e1 = andExpression();
			((ExclusiveOrExpressionContext)_localctx).e =  ((ExclusiveOrExpressionContext)_localctx).e1.e;
			setState(953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(947);
					((ExclusiveOrExpressionContext)_localctx).CARET = match(CARET);
					setState(948);
					((ExclusiveOrExpressionContext)_localctx).e2 = andExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ExclusiveOrExpressionContext)_localctx).CARET!=null?((ExclusiveOrExpressionContext)_localctx).CARET.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ExclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ExclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression e;
		public EqualityExpressionContext e1;
		public Token AMP;
		public EqualityExpressionContext e2;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(TimedRebecaCompleteParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(TimedRebecaCompleteParser.AMP, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			((AndExpressionContext)_localctx).e1 = equalityExpression();
			((AndExpressionContext)_localctx).e =  ((AndExpressionContext)_localctx).e1.e;
			setState(964);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(958);
					((AndExpressionContext)_localctx).AMP = match(AMP);
					setState(959);
					((AndExpressionContext)_localctx).e2 = equalityExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((AndExpressionContext)_localctx).AMP!=null?((AndExpressionContext)_localctx).AMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((AndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((AndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(966);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression e;
		public InstanceOfExpressionContext e1;
		public Token EQEQ;
		public Token BANGEQ;
		public InstanceOfExpressionContext e2;
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public TerminalNode EQEQ() { return getToken(TimedRebecaCompleteParser.EQEQ, 0); }
		public TerminalNode BANGEQ() { return getToken(TimedRebecaCompleteParser.BANGEQ, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_equalityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			((EqualityExpressionContext)_localctx).e1 = instanceOfExpression();
			((EqualityExpressionContext)_localctx).e =  ((EqualityExpressionContext)_localctx).e1.e;
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				((EqualityExpressionContext)_localctx).e =  new BinaryExpression(); ((BinaryExpression)_localctx.e).setLeft(((EqualityExpressionContext)_localctx).e1.e); _localctx.e.setLineNumber(((EqualityExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((EqualityExpressionContext)_localctx).e1.e.getCharacter());
				setState(974);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQEQ:
					{
					setState(970);
					((EqualityExpressionContext)_localctx).EQEQ = match(EQEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).EQEQ!=null?((EqualityExpressionContext)_localctx).EQEQ.getText():null));
					}
					break;
				case BANGEQ:
					{
					setState(972);
					((EqualityExpressionContext)_localctx).BANGEQ = match(BANGEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).BANGEQ!=null?((EqualityExpressionContext)_localctx).BANGEQ.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(976);
				((EqualityExpressionContext)_localctx).e2 = instanceOfExpression();
				((BinaryExpression)_localctx.e).setRight(((EqualityExpressionContext)_localctx).e2.e);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceOfExpressionContext extends ParserRuleContext {
		public Expression e;
		public RelationalExpressionContext e1;
		public TypeContext t;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(TimedRebecaCompleteParser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitInstanceOfExpression(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_instanceOfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			((InstanceOfExpressionContext)_localctx).e1 = relationalExpression();
			((InstanceOfExpressionContext)_localctx).e =  ((InstanceOfExpressionContext)_localctx).e1.e;
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(983);
				match(INSTANCEOF);
				setState(984);
				((InstanceOfExpressionContext)_localctx).t = type();
				((InstanceOfExpressionContext)_localctx).e =  new InstanceofExpression(); 
				        					((InstanceofExpression)_localctx.e).setValue(((InstanceOfExpressionContext)_localctx).e1.e); 
				        					((InstanceofExpression)_localctx.e).setEvaluationType(((InstanceOfExpressionContext)_localctx).t.t);
				        					_localctx.e.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				        					_localctx.e.setLineNumber(((InstanceOfExpressionContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((InstanceOfExpressionContext)_localctx).t.t.getCharacter());
				        					
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression e;
		public ShiftExpressionContext e1;
		public RelationalOpContext ro;
		public ShiftExpressionContext e2;
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			((RelationalExpressionContext)_localctx).e1 = shiftExpression();
			((RelationalExpressionContext)_localctx).e =  ((RelationalExpressionContext)_localctx).e1.e;
			setState(997);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(991);
					((RelationalExpressionContext)_localctx).ro = relationalOp();
					setState(992);
					((RelationalExpressionContext)_localctx).e2 = shiftExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((RelationalExpressionContext)_localctx).ro.ro); e3.setLeft(_localctx.e); e3.setRight(((RelationalExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((RelationalExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOpContext extends ParserRuleContext {
		public String ro;
		public Token LT;
		public Token EQ;
		public Token GT;
		public TerminalNode LT() { return getToken(TimedRebecaCompleteParser.LT, 0); }
		public TerminalNode EQ() { return getToken(TimedRebecaCompleteParser.EQ, 0); }
		public TerminalNode GT() { return getToken(TimedRebecaCompleteParser.GT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRelationalOp(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_relationalOp);
		try {
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				((RelationalOpContext)_localctx).LT = match(LT);
				setState(1001);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				((RelationalOpContext)_localctx).GT = match(GT);
				setState(1004);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1006);
				((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				((RelationalOpContext)_localctx).GT = match(GT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public Expression e;
		public AdditiveExpressionContext e1;
		public ShiftOpContext so;
		public AdditiveExpressionContext e2;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			((ShiftExpressionContext)_localctx).e1 = additiveExpression();
			((ShiftExpressionContext)_localctx).e =  ((ShiftExpressionContext)_localctx).e1.e;
			setState(1020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1014);
					((ShiftExpressionContext)_localctx).so = shiftOp();
					setState(1015);
					((ShiftExpressionContext)_localctx).e2 = additiveExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((ShiftExpressionContext)_localctx).so.so); e3.setLeft(_localctx.e); e3.setRight(((ShiftExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter()); ((ShiftExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftOpContext extends ParserRuleContext {
		public String so;
		public List<TerminalNode> LT() { return getTokens(TimedRebecaCompleteParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(TimedRebecaCompleteParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(TimedRebecaCompleteParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(TimedRebecaCompleteParser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitShiftOp(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_shiftOp);
		try {
			setState(1029);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				match(LT);
				setState(1024);
				match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026);
				match(GT);
				setState(1027);
				match(GT);
				((ShiftOpContext)_localctx).so =  ">>";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression e;
		public MultiplicativeExpressionContext e1;
		public Token PLUS;
		public Token SUB;
		public MultiplicativeExpressionContext e2;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(TimedRebecaCompleteParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(TimedRebecaCompleteParser.PLUS, i);
		}
		public List<TerminalNode> SUB() { return getTokens(TimedRebecaCompleteParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(TimedRebecaCompleteParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			((AdditiveExpressionContext)_localctx).e1 = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).e =  ((AdditiveExpressionContext)_localctx).e1.e;
			setState(1045);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(1038);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(1034);
						((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
						e3.setOperator((((AdditiveExpressionContext)_localctx).PLUS!=null?((AdditiveExpressionContext)_localctx).PLUS.getText():null));
						}
						break;
					case SUB:
						{
						setState(1036);
						((AdditiveExpressionContext)_localctx).SUB = match(SUB);
						e3.setOperator((((AdditiveExpressionContext)_localctx).SUB!=null?((AdditiveExpressionContext)_localctx).SUB.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1040);
					((AdditiveExpressionContext)_localctx).e2 = multiplicativeExpression();
					e3.setRight(((AdditiveExpressionContext)_localctx).e2.e); ((AdditiveExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(1047);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression e;
		public UnaryExpressionContext e1;
		public Token STAR;
		public Token SLASH;
		public Token PERCENT;
		public UnaryExpressionContext e2;
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(TimedRebecaCompleteParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(TimedRebecaCompleteParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(TimedRebecaCompleteParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(TimedRebecaCompleteParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(TimedRebecaCompleteParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(TimedRebecaCompleteParser.PERCENT, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			((MultiplicativeExpressionContext)_localctx).e1 = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).e =  ((MultiplicativeExpressionContext)_localctx).e1.e;
			setState(1064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(1057);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(1051);
						((MultiplicativeExpressionContext)_localctx).STAR = match(STAR);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).STAR!=null?((MultiplicativeExpressionContext)_localctx).STAR.getText():null));
						}
						break;
					case SLASH:
						{
						setState(1053);
						((MultiplicativeExpressionContext)_localctx).SLASH = match(SLASH);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).SLASH!=null?((MultiplicativeExpressionContext)_localctx).SLASH.getText():null));
						}
						break;
					case PERCENT:
						{
						setState(1055);
						((MultiplicativeExpressionContext)_localctx).PERCENT = match(PERCENT);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).PERCENT!=null?((MultiplicativeExpressionContext)_localctx).PERCENT.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1059);
					((MultiplicativeExpressionContext)_localctx).e2 = unaryExpression();
					e3.setRight(((MultiplicativeExpressionContext)_localctx).e2.e); ((MultiplicativeExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(1066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Expression e;
		public UnaryExpressionContext ep;
		public Token SUB;
		public UnaryExpressionContext es;
		public Token PLUSPLUS;
		public UnaryExpressionContext epp;
		public Token SUBSUB;
		public UnaryExpressionContext ess;
		public UnaryExpressionNotPlusMinusContext eu;
		public TerminalNode PLUS() { return getToken(TimedRebecaCompleteParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(TimedRebecaCompleteParser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(TimedRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(TimedRebecaCompleteParser.SUBSUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unaryExpression);
		try {
			setState(1086);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				match(PLUS);
				setState(1068);
				((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(1072);
				((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1075);
				((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(1076);
				((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1079);
				((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(1080);
				((UnaryExpressionContext)_localctx).ess = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUBSUB!=null?((UnaryExpressionContext)_localctx).SUBSUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).ess.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).ess.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).ess.e.getCharacter());
				}
				break;
			case INTLITERAL:
			case FLOATLITERAL:
			case DOUBLELITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
			case NEW:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case BANG:
			case TILDA:
			case QUES:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1083);
				((UnaryExpressionContext)_localctx).eu = unaryExpressionNotPlusMinus();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).eu.e;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public Expression e;
		public Token TILDA;
		public UnaryExpressionContext e1;
		public Token BANG;
		public CastExpressionContext ec;
		public ExpressionContext ep;
		public PrimaryContext p;
		public LiteralContext l;
		public Token QUES;
		public ExpressionListContext el;
		public TypeContext t;
		public Token DOT;
		public PrimaryContext p2;
		public Token PLUSPLUS;
		public Token SUBSUB;
		public TerminalNode TILDA() { return getToken(TimedRebecaCompleteParser.TILDA, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(TimedRebecaCompleteParser.BANG, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode QUES() { return getToken(TimedRebecaCompleteParser.QUES, 0); }
		public TerminalNode NEW() { return getToken(TimedRebecaCompleteParser.NEW, 0); }
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(TimedRebecaCompleteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TimedRebecaCompleteParser.DOT, i);
		}
		public TerminalNode PLUSPLUS() { return getToken(TimedRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(TimedRebecaCompleteParser.SUBSUB, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			int _alt;
			setState(1152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TILDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				((UnaryExpressionNotPlusMinusContext)_localctx).TILDA = match(TILDA);
				setState(1089);
				((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionNotPlusMinusContext)_localctx).TILDA!=null?((UnaryExpressionNotPlusMinusContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e); _localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				((UnaryExpressionNotPlusMinusContext)_localctx).BANG = match(BANG);
				setState(1093);
				((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionNotPlusMinusContext)_localctx).BANG!=null?((UnaryExpressionNotPlusMinusContext)_localctx).BANG.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e); _localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getCharacter());
				}
				break;
			case INTLITERAL:
			case FLOATLITERAL:
			case DOUBLELITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
			case NEW:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case QUES:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1096);
					((UnaryExpressionNotPlusMinusContext)_localctx).ec = castExpression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ec.e;
					}
					break;
				case 2:
					{
					setState(1099);
					match(LPAREN);
					setState(1100);
					((UnaryExpressionNotPlusMinusContext)_localctx).ep = expression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ep.e;
					setState(1102);
					match(RPAREN);
					}
					break;
				case 3:
					{
					setState(1104);
					((UnaryExpressionNotPlusMinusContext)_localctx).p = primary();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).p.tp;
					}
					break;
				case 4:
					{
					setState(1107);
					((UnaryExpressionNotPlusMinusContext)_localctx).l = literal();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).l.l;
					}
					break;
				case 5:
					{
					setState(1110);
					((UnaryExpressionNotPlusMinusContext)_localctx).QUES = match(QUES);
					setState(1111);
					match(LPAREN);
					setState(1112);
					((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
					setState(1113);
					match(RPAREN);
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						    	_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getCharPositionInLine());
					}
					break;
				case 6:
					{
					setState(1116);
					match(NEW);
					setState(1117);
					((UnaryExpressionNotPlusMinusContext)_localctx).t = type();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new RebecInstantiationPrimary();
									_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((UnaryExpressionNotPlusMinusContext)_localctx).t.t);
					setState(1119);
					match(LPAREN);
					setState(1123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (MONKEYS_AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
						{
						setState(1120);
						((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(1125);
					match(RPAREN);
					setState(1126);
					match(COLON);
					setState(1127);
					match(LPAREN);
					setState(1131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (MONKEYS_AT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
						{
						setState(1128);
						((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(1133);
					match(RPAREN);
					}
					break;
				}
				setState(1143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1137);
						((UnaryExpressionNotPlusMinusContext)_localctx).DOT = match(DOT);
						setState(1138);
						((UnaryExpressionNotPlusMinusContext)_localctx).p2 = primary();

						        	DotPrimary de = new DotPrimary(); de.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).DOT.getLine()); de.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).DOT.getCharPositionInLine());
						        	if (_localctx.e instanceof DotPrimary) {
						        		DotPrimary temp = (DotPrimary)_localctx.e;
						        		while(temp.getRight() instanceof DotPrimary)
						        			temp = (DotPrimary)temp.getRight();
						        		de.setLeft(temp.getRight());
						        		temp.setRight(de);
						        		de.setRight(((UnaryExpressionNotPlusMinusContext)_localctx).p2.tp);
						        	} else {
						        		de.setLeft(_localctx.e); de.setRight(((UnaryExpressionNotPlusMinusContext)_localctx).p2.tp);
							        	((UnaryExpressionNotPlusMinusContext)_localctx).e =  de;
						        	}
						        	
						}
						} 
					}
					setState(1145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				setState(1150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1146);
					((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS = match(PLUSPLUS);
					PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((UnaryExpressionNotPlusMinusContext)_localctx).e = pse;
					        		pse.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getCharPositionInLine());
					}
					break;
				case 2:
					{
					setState(1148);
					((UnaryExpressionNotPlusMinusContext)_localctx).SUBSUB = match(SUBSUB);
					PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("--");((UnaryExpressionNotPlusMinusContext)_localctx).e = pse;
					        		pse.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).SUBSUB.getLine()); pse.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).SUBSUB.getCharPositionInLine());
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public Expression e;
		public TypeContext t;
		public ExpressionContext e1;
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			match(LPAREN);
			setState(1155);
			((CastExpressionContext)_localctx).t = type();
			setState(1156);
			match(RPAREN);
			setState(1157);
			((CastExpressionContext)_localctx).e1 = expression();
			((CastExpressionContext)_localctx).e =  new CastExpression();
			    	((CastExpression)_localctx.e).setExpression(((CastExpressionContext)_localctx).e1.e); ((CastExpression)_localctx.e).setType(((CastExpressionContext)_localctx).t.t);
					_localctx.e.setLineNumber(((CastExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((CastExpressionContext)_localctx).e1.e.getCharacter());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<Expression> el;
		public AnnotationContext a;
		public ExpressionContext e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>(); LinkedList<Annotation> ans = new LinkedList<Annotation>();
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(1161);
				((ExpressionListContext)_localctx).a = annotation();
				ans.add(((ExpressionListContext)_localctx).a.an);
				}
				}
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1169);
			((ExpressionListContext)_localctx).e = expression();
			((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1171);
				match(COMMA);
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(1172);
					((ExpressionListContext)_localctx).a = annotation();
					ans.add(((ExpressionListContext)_localctx).a.an);
					}
					}
					setState(1179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1180);
				((ExpressionListContext)_localctx).e = expression();
				((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Literal l;
		public Token INTLITERAL;
		public Token FLOATLITERAL;
		public Token DOUBLELITERAL;
		public Token CHARLITERAL;
		public Token STRINGLITERAL;
		public Token TRUE;
		public Token FALSE;
		public Token NULL;
		public TerminalNode INTLITERAL() { return getToken(TimedRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(TimedRebecaCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(TimedRebecaCompleteParser.DOUBLELITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(TimedRebecaCompleteParser.CHARLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(TimedRebecaCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(TimedRebecaCompleteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TimedRebecaCompleteParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(TimedRebecaCompleteParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_literal);
		try {
			setState(1204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
				((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(CoreRebecaTypeSystem.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1192);
				((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1194);
				((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1196);
				((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1198);
				((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1200);
				((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1202);
				((LiteralContext)_localctx).NULL = match(NULL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("null");
				    	_localctx.l.setType(CoreRebecaTypeSystem.NULL_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).NULL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).NULL.getCharPositionInLine());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3`\u04b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\7"+
		"\2y\n\2\f\2\16\2|\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u0087\n"+
		"\2\f\2\16\2\u008a\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\u0095\n"+
		"\2\r\2\16\2\u0096\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\u00a7\n\3\f\3\16\3\u00aa\13\3\3\3\5\3\u00ad\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3\u00b4\n\3\f\3\16\3\u00b7\13\3\3\3\5\3\u00ba\n\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00c6\n\4\f\4\16\4\u00c9\13\4\3\4\3\4"+
		"\3\4\7\4\u00ce\n\4\f\4\16\4\u00d1\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u00de\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00e7\n\6\f"+
		"\6\16\6\u00ea\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00f4\n\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00fa\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0102\n\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u010e\n\7\f\7\16\7\u0111\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u011a\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0123\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u012b\n\b\5\b\u012d\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u0134\n\b\f\b\16\b\u0137\13\b\3\t\3\t\3\t\3\t\5\t\u013d"+
		"\n\t\3\t\3\t\3\t\7\t\u0142\n\t\f\t\16\t\u0145\13\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0157\n\r\f\r\16\r"+
		"\u015a\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0163\n\16\f\16\16\16"+
		"\u0166\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u016f\n\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0177\n\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\7\17\u0180\n\17\f\17\16\17\u0183\13\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0190\n\20\f\20\16\20\u0193\13\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u019c\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u01a4\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u01ae\n\23\f\23\16\23\u01b1\13\23\5\23\u01b3\n\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\7\24\u01bb\n\24\f\24\16\24\u01be\13\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u01c9\n\24\f\24\16\24\u01cc\13\24\5\24"+
		"\u01ce\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u01d5\n\24\f\24\16\24\u01d8"+
		"\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01e1\n\24\f\24\16\24\u01e4"+
		"\13\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u01ed\n\25\f\25\16\25\u01f0"+
		"\13\25\3\25\3\25\5\25\u01f4\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01fc"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0204\n\25\f\25\16\25\u0207\13"+
		"\25\5\25\u0209\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0216\n\25\f\25\16\25\u0219\13\25\3\25\5\25\u021c\n\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u0224\n\25\f\25\16\25\u0227\13\25\3\25"+
		"\5\25\u022a\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0235"+
		"\n\25\f\25\16\25\u0238\13\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u0245\n\26\3\27\3\27\3\27\3\27\7\27\u024b\n\27\f\27"+
		"\16\27\u024e\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0256\n\30\f\30"+
		"\16\30\u0259\13\30\3\30\3\30\5\30\u025d\n\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\7\31\u0266\n\31\f\31\16\31\u0269\13\31\3\31\3\31\5\31\u026d"+
		"\n\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u0278\n\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0283\n\33\f\33\16\33\u0286"+
		"\13\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0293"+
		"\n\35\f\35\16\35\u0296\13\35\3\35\3\35\3\35\7\35\u029b\n\35\f\35\16\35"+
		"\u029e\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u02b9\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u02c9\n\36\3\36\3\36\3\36\3\36\5\36\u02cf\n\36\3"+
		"\36\3\36\3\36\3\36\5\36\u02d5\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u02e6\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u02f2\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u02fa\n\37\3 \3 \3 \3 \3 \7 \u0301\n \f \16 \u0304\13"+
		" \3 \3 \3 \3 \3 \3 \3 \7 \u030d\n \f \16 \u0310\13 \3 \3 \3 \7 \u0315"+
		"\n \f \16 \u0318\13 \6 \u031a\n \r \16 \u031b\3 \3 \3 \3 \3 \3 \7 \u0324"+
		"\n \f \16 \u0327\13 \3 \3 \3 \7 \u032c\n \f \16 \u032f\13 \5 \u0331\n"+
		" \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u033e\n\"\3\"\5\"\u0341"+
		"\n\"\3#\3#\3#\3#\3#\5#\u0348\n#\3#\3#\3#\5#\u034d\n#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\7$\u0357\n$\f$\16$\u035a\13$\3$\3$\3%\3%\3%\3%\3%\6%\u0363\n%"+
		"\r%\16%\u0364\3&\3&\3&\3&\3&\3&\5&\u036d\n&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u0387\n\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0391\n(\3)\3)\3)\3)\3)\3)\7"+
		")\u0399\n)\f)\16)\u039c\13)\3*\3*\3*\3*\3*\3*\7*\u03a4\n*\f*\16*\u03a7"+
		"\13*\3+\3+\3+\3+\3+\3+\7+\u03af\n+\f+\16+\u03b2\13+\3,\3,\3,\3,\3,\3,"+
		"\7,\u03ba\n,\f,\16,\u03bd\13,\3-\3-\3-\3-\3-\3-\7-\u03c5\n-\f-\16-\u03c8"+
		"\13-\3.\3.\3.\3.\3.\3.\3.\5.\u03d1\n.\3.\3.\3.\5.\u03d6\n.\3/\3/\3/\3"+
		"/\3/\3/\5/\u03de\n/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u03e6\n\60\f\60"+
		"\16\60\u03e9\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5"+
		"\61\u03f5\n\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u03fd\n\62\f\62\16\62"+
		"\u0400\13\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0408\n\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u0411\n\64\3\64\3\64\3\64\7\64\u0416\n\64"+
		"\f\64\16\64\u0419\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5"+
		"\65\u0424\n\65\3\65\3\65\3\65\7\65\u0429\n\65\f\65\16\65\u042c\13\65\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\5\66\u0441\n\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u0466\n\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u046e\n\67\3"+
		"\67\3\67\5\67\u0472\n\67\3\67\3\67\3\67\3\67\7\67\u0478\n\67\f\67\16\67"+
		"\u047b\13\67\3\67\3\67\3\67\3\67\5\67\u0481\n\67\5\67\u0483\n\67\38\3"+
		"8\38\38\38\38\39\39\39\39\79\u048f\n9\f9\169\u0492\139\39\39\39\39\39"+
		"\39\79\u049a\n9\f9\169\u049d\139\39\39\39\79\u04a2\n9\f9\169\u04a5\13"+
		"9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u04b7\n:\3:\2\2;"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnpr\2\2\2\u0514\2t\3\2\2\2\4\u009b\3\2\2\2\6\u00be"+
		"\3\2\2\2\b\u00d5\3\2\2\2\n\u00e2\3\2\2\2\f\u0106\3\2\2\2\16\u0112\3\2"+
		"\2\2\20\u0138\3\2\2\2\22\u0149\3\2\2\2\24\u014b\3\2\2\2\26\u014d\3\2\2"+
		"\2\30\u014f\3\2\2\2\32\u015e\3\2\2\2\34\u017b\3\2\2\2\36\u0188\3\2\2\2"+
		" \u0194\3\2\2\2\"\u01a3\3\2\2\2$\u01a5\3\2\2\2&\u01b6\3\2\2\2(\u01e8\3"+
		"\2\2\2*\u023c\3\2\2\2,\u0246\3\2\2\2.\u0251\3\2\2\2\60\u0261\3\2\2\2\62"+
		"\u0272\3\2\2\2\64\u027b\3\2\2\2\66\u0287\3\2\2\28\u028b\3\2\2\2:\u02f1"+
		"\3\2\2\2<\u02f9\3\2\2\2>\u02fb\3\2\2\2@\u0332\3\2\2\2B\u0335\3\2\2\2D"+
		"\u0342\3\2\2\2F\u034e\3\2\2\2H\u035d\3\2\2\2J\u0366\3\2\2\2L\u0386\3\2"+
		"\2\2N\u0388\3\2\2\2P\u0392\3\2\2\2R\u039d\3\2\2\2T\u03a8\3\2\2\2V\u03b3"+
		"\3\2\2\2X\u03be\3\2\2\2Z\u03c9\3\2\2\2\\\u03d7\3\2\2\2^\u03df\3\2\2\2"+
		"`\u03f4\3\2\2\2b\u03f6\3\2\2\2d\u0407\3\2\2\2f\u0409\3\2\2\2h\u041a\3"+
		"\2\2\2j\u0440\3\2\2\2l\u0482\3\2\2\2n\u0484\3\2\2\2p\u048a\3\2\2\2r\u04b6"+
		"\3\2\2\2tz\b\2\1\2uv\5\26\f\2vw\b\2\1\2wy\3\2\2\2xu\3\2\2\2y|\3\2\2\2"+
		"zx\3\2\2\2z{\3\2\2\2{\u0088\3\2\2\2|z\3\2\2\2}~\7#\2\2~\177\5\34\17\2"+
		"\177\u0080\79\2\2\u0080\u0081\b\2\1\2\u0081\u0087\3\2\2\2\u0082\u0083"+
		"\7$\2\2\u0083\u0084\7`\2\2\u0084\u0085\79\2\2\u0085\u0087\b\2\1\2\u0086"+
		"}\3\2\2\2\u0086\u0082\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u0094\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c"+
		"\5\4\3\2\u008c\u008d\b\2\1\2\u008d\u0095\3\2\2\2\u008e\u008f\5(\25\2\u008f"+
		"\u0090\b\2\1\2\u0090\u0095\3\2\2\2\u0091\u0092\5&\24\2\u0092\u0093\b\2"+
		"\1\2\u0093\u0095\3\2\2\2\u0094\u008b\3\2\2\2\u0094\u008e\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\5\6\4\2\u0099\u009a\b\2\1\2\u009a"+
		"\3\3\2\2\2\u009b\u009c\b\3\1\2\u009c\u009d\7\3\2\2\u009d\u009e\7`\2\2"+
		"\u009e\u009f\b\3\1\2\u009f\u00ac\7\65\2\2\u00a0\u00a1\7\4\2\2\u00a1\u00a8"+
		"\7\65\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a4\b\3\1\2\u00a4\u00a5\79\2\2"+
		"\u00a5\u00a7\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ad\7\66\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b9\3"+
		"\2\2\2\u00ae\u00af\7\5\2\2\u00af\u00b5\7\65\2\2\u00b0\u00b1\5\f\7\2\u00b1"+
		"\u00b2\b\3\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00ba\7\66\2\2\u00b9\u00ae\3\2\2\2\u00b9\u00ba\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\66\2\2\u00bc\u00bd\b\3\1\2\u00bd"+
		"\5\3\2\2\2\u00be\u00bf\b\4\1\2\u00bf\u00c0\7,\2\2\u00c0\u00c1\b\4\1\2"+
		"\u00c1\u00c7\7\65\2\2\u00c2\u00c3\5\b\5\2\u00c3\u00c4\b\4\1\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00cf\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\5\n"+
		"\6\2\u00cb\u00cc\b\4\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\66\2\2\u00d3\u00d4\b\4\1\2\u00d4"+
		"\7\3\2\2\2\u00d5\u00d6\b\5\1\2\u00d6\u00d7\5D#\2\u00d7\u00d8\7`\2\2\u00d8"+
		"\u00d9\b\5\1\2\u00d9\u00dd\7\63\2\2\u00da\u00db\5p9\2\u00db\u00dc\b\5"+
		"\1\2\u00dc\u00de\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\7\64\2\2\u00e0\u00e1\79\2\2\u00e1\t\3\2\2\2"+
		"\u00e2\u00e8\b\6\1\2\u00e3\u00e4\5B\"\2\u00e4\u00e5\b\6\1\2\u00e5\u00e7"+
		"\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\5D"+
		"#\2\u00ec\u00ed\7`\2\2\u00ed\u00f3\b\6\1\2\u00ee\u00ef\7[\2\2\u00ef\u00f0"+
		"\5J&\2\u00f0\u00f1\b\6\1\2\u00f1\u00f2\7Z\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00ee\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f9\7\63"+
		"\2\2\u00f6\u00f7\5p9\2\u00f7\u00f8\b\6\1\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\64\2\2"+
		"\u00fc\u00fd\7@\2\2\u00fd\u0101\7\63\2\2\u00fe\u00ff\5p9\2\u00ff\u0100"+
		"\b\6\1\2\u0100\u0102\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0104\7\64\2\2\u0104\u0105\79\2\2\u0105\13\3\2\2"+
		"\2\u0106\u0107\b\7\1\2\u0107\u0108\5N(\2\u0108\u010f\b\7\1\2\u0109\u010a"+
		"\7:\2\2\u010a\u010b\5N(\2\u010b\u010c\b\7\1\2\u010c\u010e\3\2\2\2\u010d"+
		"\u0109\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\r\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7`\2\2\u0113\u012c"+
		"\b\b\1\2\u0114\u0115\7\63\2\2\u0115\u0119\b\b\1\2\u0116\u0117\5p9\2\u0117"+
		"\u0118\b\b\1\2\u0118\u011a\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u0122\7\64\2\2\u011c\u011d\7\6\2\2\u011d"+
		"\u011e\7\63\2\2\u011e\u011f\5J&\2\u011f\u0120\7\64\2\2\u0120\u0121\b\b"+
		"\1\2\u0121\u0123\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u012a\3\2\2\2\u0124\u0125\7\7\2\2\u0125\u0126\7\63\2\2\u0126\u0127\5"+
		"J&\2\u0127\u0128\7\64\2\2\u0128\u0129\b\b\1\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0124\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u0114\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u0135\3\2\2\2\u012e\u012f\7\67\2\2\u012f"+
		"\u0130\5J&\2\u0130\u0131\78\2\2\u0131\u0132\b\b\1\2\u0132\u0134\3\2\2"+
		"\2\u0133\u012e\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\17\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013c\b\t\1\2\u0139"+
		"\u013a\5\22\n\2\u013a\u013b\b\t\1\2\u013b\u013d\3\2\2\2\u013c\u0139\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\u0143\3\2\2\2\u013e\u013f\5\24\13\2\u013f"+
		"\u0140\b\t\1\2\u0140\u0142\3\2\2\2\u0141\u013e\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\5\2\2\2\u0147\u0148\b\t\1\2\u0148\21\3\2\2"+
		"\2\u0149\u014a\7\33\2\2\u014a\23\3\2\2\2\u014b\u014c\7\31\2\2\u014c\25"+
		"\3\2\2\2\u014d\u014e\7\37\2\2\u014e\27\3\2\2\2\u014f\u0150\b\r\1\2\u0150"+
		"\u0151\7,\2\2\u0151\u0152\b\r\1\2\u0152\u0158\7\65\2\2\u0153\u0154\5\32"+
		"\16\2\u0154\u0155\b\r\1\2\u0155\u0157\3\2\2\2\u0156\u0153\3\2\2\2\u0157"+
		"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\66\2\2\u015c\u015d\b\r\1\2\u015d"+
		"\31\3\2\2\2\u015e\u0164\b\16\1\2\u015f\u0160\5B\"\2\u0160\u0161\b\16\1"+
		"\2\u0161\u0163\3\2\2\2\u0162\u015f\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u0168\5D#\2\u0168\u0169\7`\2\2\u0169\u016a\b\16\1\2\u016a\u016e\7\63"+
		"\2\2\u016b\u016c\5p9\2\u016c\u016d\b\16\1\2\u016d\u016f\3\2\2\2\u016e"+
		"\u016b\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\64"+
		"\2\2\u0171\u0172\7@\2\2\u0172\u0176\7\63\2\2\u0173\u0174\5p9\2\u0174\u0175"+
		"\b\16\1\2\u0175\u0177\3\2\2\2\u0176\u0173\3\2\2\2\u0176\u0177\3\2\2\2"+
		"\u0177\u0178\3\2\2\2\u0178\u0179\7\64\2\2\u0179\u017a\79\2\2\u017a\33"+
		"\3\2\2\2\u017b\u0181\b\17\1\2\u017c\u017d\5B\"\2\u017d\u017e\b\17\1\2"+
		"\u017e\u0180\3\2\2\2\u017f\u017c\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184"+
		"\u0185\5D#\2\u0185\u0186\5\36\20\2\u0186\u0187\b\17\1\2\u0187\35\3\2\2"+
		"\2\u0188\u0189\b\20\1\2\u0189\u018a\5 \21\2\u018a\u0191\b\20\1\2\u018b"+
		"\u018c\7:\2\2\u018c\u018d\5 \21\2\u018d\u018e\b\20\1\2\u018e\u0190\3\2"+
		"\2\2\u018f\u018b\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\37\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\b\21\1"+
		"\2\u0195\u0196\7`\2\2\u0196\u019b\b\21\1\2\u0197\u0198\7<\2\2\u0198\u0199"+
		"\5\"\22\2\u0199\u019a\b\21\1\2\u019a\u019c\3\2\2\2\u019b\u0197\3\2\2\2"+
		"\u019b\u019c\3\2\2\2\u019c!\3\2\2\2\u019d\u019e\5$\23\2\u019e\u019f\b"+
		"\22\1\2\u019f\u01a4\3\2\2\2\u01a0\u01a1\5J&\2\u01a1\u01a2\b\22\1\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a4#\3\2\2\2"+
		"\u01a5\u01a6\b\23\1\2\u01a6\u01b2\7\65\2\2\u01a7\u01a8\5\"\22\2\u01a8"+
		"\u01af\b\23\1\2\u01a9\u01aa\7:\2\2\u01aa\u01ab\5\"\22\2\u01ab\u01ac\b"+
		"\23\1\2\u01ac\u01ae\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b2\u01a7\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b5\7\66\2\2\u01b5%\3\2\2\2\u01b6\u01bc\b\24\1\2\u01b7\u01b8\5B\"\2"+
		"\u01b8\u01b9\b\24\1\2\u01b9\u01bb\3\2\2\2\u01ba\u01b7\3\2\2\2\u01bb\u01be"+
		"\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01bf\u01c0\7\'\2\2\u01c0\u01c1\7`\2\2\u01c1\u01cd\b\24"+
		"\1\2\u01c2\u01c3\7)\2\2\u01c3\u01c4\7`\2\2\u01c4\u01ca\b\24\1\2\u01c5"+
		"\u01c6\7:\2\2\u01c6\u01c7\7`\2\2\u01c7\u01c9\b\24\1\2\u01c8\u01c5\3\2"+
		"\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01c2\3\2\2\2\u01cd\u01ce\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01e2\7\65\2\2\u01d0\u01d6\b\24\1\2\u01d1"+
		"\u01d2\5B\"\2\u01d2\u01d3\b\24\1\2\u01d3\u01d5\3\2\2\2\u01d4\u01d1\3\2"+
		"\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7+\2\2\u01da\u01db\7`\2"+
		"\2\u01db\u01dc\b\24\1\2\u01dc\u01dd\5\62\32\2\u01dd\u01de\b\24\1\2\u01de"+
		"\u01df\79\2\2\u01df\u01e1\3\2\2\2\u01e0\u01d0\3\2\2\2\u01e1\u01e4\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e5\u01e6\7\66\2\2\u01e6\u01e7\b\24\1\2\u01e7\'\3\2\2"+
		"\2\u01e8\u01ee\b\25\1\2\u01e9\u01ea\5B\"\2\u01ea\u01eb\b\25\1\2\u01eb"+
		"\u01ed\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f3\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1"+
		"\u01f2\7(\2\2\u01f2\u01f4\b\25\1\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\7&\2\2\u01f6\u01f7\7`\2\2\u01f7\u01fb"+
		"\b\25\1\2\u01f8\u01f9\7)\2\2\u01f9\u01fa\7`\2\2\u01fa\u01fc\b\25\1\2\u01fb"+
		"\u01f8\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0208\3\2\2\2\u01fd\u01fe\7*"+
		"\2\2\u01fe\u01ff\7`\2\2\u01ff\u0205\b\25\1\2\u0200\u0201\7:\2\2\u0201"+
		"\u0202\7`\2\2\u0202\u0204\b\25\1\2\u0203\u0200\3\2\2\2\u0204\u0207\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0208\u01fd\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020a\u020b\7\63\2\2\u020b\u020c\7\b\2\2\u020c\u020d\b\25\1\2\u020d"+
		"\u020e\7\64\2\2\u020e\u021b\7\65\2\2\u020f\u0210\7.\2\2\u0210\u0217\7"+
		"\65\2\2\u0211\u0212\5\34\17\2\u0212\u0213\b\25\1\2\u0213\u0214\79\2\2"+
		"\u0214\u0216\3\2\2\2\u0215\u0211\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a"+
		"\u021c\7\66\2\2\u021b\u020f\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u0229\3"+
		"\2\2\2\u021d\u021e\7-\2\2\u021e\u0225\7\65\2\2\u021f\u0220\5\34\17\2\u0220"+
		"\u0221\b\25\1\2\u0221\u0222\79\2\2\u0222\u0224\3\2\2\2\u0223\u021f\3\2"+
		"\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u022a\7\66\2\2\u0229\u021d\3"+
		"\2\2\2\u0229\u022a\3\2\2\2\u022a\u0236\3\2\2\2\u022b\u022c\5,\27\2\u022c"+
		"\u022d\b\25\1\2\u022d\u0235\3\2\2\2\u022e\u022f\5.\30\2\u022f\u0230\b"+
		"\25\1\2\u0230\u0235\3\2\2\2\u0231\u0232\5\60\31\2\u0232\u0233\b\25\1\2"+
		"\u0233\u0235\3\2\2\2\u0234\u022b\3\2\2\2\u0234\u022e\3\2\2\2\u0234\u0231"+
		"\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\7\66\2\2\u023a\u023b\b"+
		"\25\1\2\u023b)\3\2\2\2\u023c\u023d\7`\2\2\u023d\u023e\b\26\1\2\u023e\u023f"+
		"\5\62\32\2\u023f\u0244\b\26\1\2\u0240\u0241\58\35\2\u0241\u0242\b\26\1"+
		"\2\u0242\u0245\3\2\2\2\u0243\u0245\79\2\2\u0244\u0240\3\2\2\2\u0244\u0243"+
		"\3\2\2\2\u0245+\3\2\2\2\u0246\u024c\b\27\1\2\u0247\u0248\5B\"\2\u0248"+
		"\u0249\b\27\1\2\u0249\u024b\3\2\2\2\u024a\u0247\3\2\2\2\u024b\u024e\3"+
		"\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024f\u0250\5*\26\2\u0250-\3\2\2\2\u0251\u0257\b\30\1\2"+
		"\u0252\u0253\5B\"\2\u0253\u0254\b\30\1\2\u0254\u0256\3\2\2\2\u0255\u0252"+
		"\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u025c\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\7(\2\2\u025b\u025d\b\30"+
		"\1\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u025f\7+\2\2\u025f\u0260\5*\26\2\u0260/\3\2\2\2\u0261\u0267\b\31\1\2"+
		"\u0262\u0263\5B\"\2\u0263\u0264\b\31\1\2\u0264\u0266\3\2\2\2\u0265\u0262"+
		"\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u026c\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026b\7(\2\2\u026b\u026d\b\31"+
		"\1\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u026f\5D#\2\u026f\u0270\b\31\1\2\u0270\u0271\5*\26\2\u0271\61\3\2\2\2"+
		"\u0272\u0273\b\32\1\2\u0273\u0277\7\63\2\2\u0274\u0275\5\64\33\2\u0275"+
		"\u0276\b\32\1\2\u0276\u0278\3\2\2\2\u0277\u0274\3\2\2\2\u0277\u0278\3"+
		"\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\7\64\2\2\u027a\63\3\2\2\2\u027b"+
		"\u027c\b\33\1\2\u027c\u027d\5\66\34\2\u027d\u0284\b\33\1\2\u027e\u027f"+
		"\7:\2\2\u027f\u0280\5\66\34\2\u0280\u0281\b\33\1\2\u0281\u0283\3\2\2\2"+
		"\u0282\u027e\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285"+
		"\3\2\2\2\u0285\65\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288\5D#\2\u0288"+
		"\u0289\7`\2\2\u0289\u028a\b\34\1\2\u028a\67\3\2\2\2\u028b\u028c\b\35\1"+
		"\2\u028c\u028d\7\65\2\2\u028d\u029c\b\35\1\2\u028e\u0294\b\35\1\2\u028f"+
		"\u0290\5B\"\2\u0290\u0291\b\35\1\2\u0291\u0293\3\2\2\2\u0292\u028f\3\2"+
		"\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0297\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0298\5:\36\2\u0298\u0299\b\35"+
		"\1\2\u0299\u029b\3\2\2\2\u029a\u028e\3\2\2\2\u029b\u029e\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u029c\3\2"+
		"\2\2\u029f\u02a0\7\66\2\2\u02a0\u02a1\b\35\1\2\u02a19\3\2\2\2\u02a2\u02a3"+
		"\5@!\2\u02a3\u02a4\b\36\1\2\u02a4\u02a5\79\2\2\u02a5\u02f2\3\2\2\2\u02a6"+
		"\u02a7\5\34\17\2\u02a7\u02a8\b\36\1\2\u02a8\u02a9\79\2\2\u02a9\u02f2\3"+
		"\2\2\2\u02aa\u02ab\58\35\2\u02ab\u02ac\b\36\1\2\u02ac\u02f2\3\2\2\2\u02ad"+
		"\u02ae\7\30\2\2\u02ae\u02af\b\36\1\2\u02af\u02b0\7\63\2\2\u02b0\u02b1"+
		"\5J&\2\u02b1\u02b2\7\64\2\2\u02b2\u02b3\5:\36\2\u02b3\u02b8\b\36\1\2\u02b4"+
		"\u02b5\7\25\2\2\u02b5\u02b6\5:\36\2\u02b6\u02b7\b\36\1\2\u02b7\u02b9\3"+
		"\2\2\2\u02b8\u02b4\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02f2\3\2\2\2\u02ba"+
		"\u02bb\7\"\2\2\u02bb\u02bc\b\36\1\2\u02bc\u02bd\7\63\2\2\u02bd\u02be\5"+
		"J&\2\u02be\u02bf\7\64\2\2\u02bf\u02c0\5:\36\2\u02c0\u02c1\b\36\1\2\u02c1"+
		"\u02f2\3\2\2\2\u02c2\u02c3\7\26\2\2\u02c3\u02c4\b\36\1\2\u02c4\u02c8\7"+
		"\63\2\2\u02c5\u02c6\5<\37\2\u02c6\u02c7\b\36\1\2\u02c7\u02c9\3\2\2\2\u02c8"+
		"\u02c5\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02ce\79"+
		"\2\2\u02cb\u02cc\5J&\2\u02cc\u02cd\b\36\1\2\u02cd\u02cf\3\2\2\2\u02ce"+
		"\u02cb\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d4\79"+
		"\2\2\u02d1\u02d2\5p9\2\u02d2\u02d3\b\36\1\2\u02d3\u02d5\3\2\2\2\u02d4"+
		"\u02d1\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\7\64"+
		"\2\2\u02d7\u02d8\5:\36\2\u02d8\u02d9\b\36\1\2\u02d9\u02f2\3\2\2\2\u02da"+
		"\u02db\7!\2\2\u02db\u02dc\7\63\2\2\u02dc\u02dd\5J&\2\u02dd\u02de\7\64"+
		"\2\2\u02de\u02df\7\65\2\2\u02df\u02e0\5> \2\u02e0\u02e1\7\66\2\2\u02e1"+
		"\u02e2\b\36\1\2\u02e2\u02f2\3\2\2\2\u02e3\u02e5\7 \2\2\u02e4\u02e6\5J"+
		"&\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02e8\79\2\2\u02e8\u02f2\b\36\1\2\u02e9\u02ea\7\20\2\2\u02ea\u02eb\7"+
		"9\2\2\u02eb\u02f2\b\36\1\2\u02ec\u02ed\7\23\2\2\u02ed\u02ee\79\2\2\u02ee"+
		"\u02f2\b\36\1\2\u02ef\u02f0\79\2\2\u02f0\u02f2\b\36\1\2\u02f1\u02a2\3"+
		"\2\2\2\u02f1\u02a6\3\2\2\2\u02f1\u02aa\3\2\2\2\u02f1\u02ad\3\2\2\2\u02f1"+
		"\u02ba\3\2\2\2\u02f1\u02c2\3\2\2\2\u02f1\u02da\3\2\2\2\u02f1\u02e3\3\2"+
		"\2\2\u02f1\u02e9\3\2\2\2\u02f1\u02ec\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2"+
		";\3\2\2\2\u02f3\u02f4\5\34\17\2\u02f4\u02f5\b\37\1\2\u02f5\u02fa\3\2\2"+
		"\2\u02f6\u02f7\5p9\2\u02f7\u02f8\b\37\1\2\u02f8\u02fa\3\2\2\2\u02f9\u02f3"+
		"\3\2\2\2\u02f9\u02f6\3\2\2\2\u02fa=\3\2\2\2\u02fb\u0319\b \1\2\u02fc\u0302"+
		"\b \1\2\u02fd\u02fe\5B\"\2\u02fe\u02ff\b \1\2\u02ff\u0301\3\2\2\2\u0300"+
		"\u02fd\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2"+
		"\2\2\u0303\u0305\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0306\7\21\2\2\u0306"+
		"\u0307\5J&\2\u0307\u0308\7@\2\2\u0308\u0316\b \1\2\u0309\u030a\5B\"\2"+
		"\u030a\u030b\b \1\2\u030b\u030d\3\2\2\2\u030c\u0309\3\2\2\2\u030d\u0310"+
		"\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310"+
		"\u030e\3\2\2\2\u0311\u0312\5:\36\2\u0312\u0313\b \1\2\u0313\u0315\3\2"+
		"\2\2\u0314\u030e\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316"+
		"\u0317\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u02fc\3\2"+
		"\2\2\u031a\u031b\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"\u0330\3\2\2\2\u031d\u031e\7\24\2\2\u031e\u031f\7@\2\2\u031f\u032d\b "+
		"\1\2\u0320\u0321\5B\"\2\u0321\u0322\b \1\2\u0322\u0324\3\2\2\2\u0323\u0320"+
		"\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0328\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u0329\5:\36\2\u0329\u032a\b "+
		"\1\2\u032a\u032c\3\2\2\2\u032b\u0325\3\2\2\2\u032c\u032f\3\2\2\2\u032d"+
		"\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2"+
		"\2\2\u0330\u031d\3\2\2\2\u0330\u0331\3\2\2\2\u0331?\3\2\2\2\u0332\u0333"+
		"\5J&\2\u0333\u0334\b!\1\2\u0334A\3\2\2\2\u0335\u0336\b\"\1\2\u0336\u0337"+
		"\7X\2\2\u0337\u0338\7`\2\2\u0338\u0340\b\"\1\2\u0339\u033d\7\63\2\2\u033a"+
		"\u033b\5J&\2\u033b\u033c\b\"\1\2\u033c\u033e\3\2\2\2\u033d\u033a\3\2\2"+
		"\2\u033d\u033e\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341\7\64\2\2\u0340"+
		"\u0339\3\2\2\2\u0340\u0341\3\2\2\2\u0341C\3\2\2\2\u0342\u0343\7`\2\2\u0343"+
		"\u0347\b#\1\2\u0344\u0345\5F$\2\u0345\u0346\b#\1\2\u0346\u0348\3\2\2\2"+
		"\u0347\u0344\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034c\3\2\2\2\u0349\u034a"+
		"\5H%\2\u034a\u034b\b#\1\2\u034b\u034d\3\2\2\2\u034c\u0349\3\2\2\2\u034c"+
		"\u034d\3\2\2\2\u034dE\3\2\2\2\u034e\u034f\7[\2\2\u034f\u0350\b$\1\2\u0350"+
		"\u0351\5D#\2\u0351\u0358\b$\1\2\u0352\u0353\7:\2\2\u0353\u0354\5D#\2\u0354"+
		"\u0355\b$\1\2\u0355\u0357\3\2\2\2\u0356\u0352\3\2\2\2\u0357\u035a\3\2"+
		"\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035b\3\2\2\2\u035a"+
		"\u0358\3\2\2\2\u035b\u035c\7Z\2\2\u035cG\3\2\2\2\u035d\u0362\b%\1\2\u035e"+
		"\u035f\7\67\2\2\u035f\u0360\7\b\2\2\u0360\u0361\78\2\2\u0361\u0363\b%"+
		"\1\2\u0362\u035e\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0362\3\2\2\2\u0364"+
		"\u0365\3\2\2\2\u0365I\3\2\2\2\u0366\u0367\5N(\2\u0367\u036c\b&\1\2\u0368"+
		"\u0369\5L\'\2\u0369\u036a\5J&\2\u036a\u036b\b&\1\2\u036b\u036d\3\2\2\2"+
		"\u036c\u0368\3\2\2\2\u036c\u036d\3\2\2\2\u036dK\3\2\2\2\u036e\u036f\7"+
		"<\2\2\u036f\u0387\b\'\1\2\u0370\u0371\7O\2\2\u0371\u0387\b\'\1\2\u0372"+
		"\u0373\7P\2\2\u0373\u0387\b\'\1\2\u0374\u0375\7Q\2\2\u0375\u0387\b\'\1"+
		"\2\u0376\u0377\7R\2\2\u0377\u0387\b\'\1\2\u0378\u0379\7S\2\2\u0379\u0387"+
		"\b\'\1\2\u037a\u037b\7T\2\2\u037b\u0387\b\'\1\2\u037c\u037d\7U\2\2\u037d"+
		"\u0387\b\'\1\2\u037e\u037f\7V\2\2\u037f\u0387\b\'\1\2\u0380\u0381\7W\2"+
		"\2\u0381\u0387\b\'\1\2\u0382\u0383\7]\2\2\u0383\u0387\b\'\1\2\u0384\u0385"+
		"\7_\2\2\u0385\u0387\b\'\1\2\u0386\u036e\3\2\2\2\u0386\u0370\3\2\2\2\u0386"+
		"\u0372\3\2\2\2\u0386\u0374\3\2\2\2\u0386\u0376\3\2\2\2\u0386\u0378\3\2"+
		"\2\2\u0386\u037a\3\2\2\2\u0386\u037c\3\2\2\2\u0386\u037e\3\2\2\2\u0386"+
		"\u0380\3\2\2\2\u0386\u0382\3\2\2\2\u0386\u0384\3\2\2\2\u0387M\3\2\2\2"+
		"\u0388\u0389\5P)\2\u0389\u0390\b(\1\2\u038a\u038b\7?\2\2\u038b\u038c\5"+
		"J&\2\u038c\u038d\7@\2\2\u038d\u038e\5N(\2\u038e\u038f\b(\1\2\u038f\u0391"+
		"\3\2\2\2\u0390\u038a\3\2\2\2\u0390\u0391\3\2\2\2\u0391O\3\2\2\2\u0392"+
		"\u0393\5R*\2\u0393\u039a\b)\1\2\u0394\u0395\7C\2\2\u0395\u0396\5R*\2\u0396"+
		"\u0397\b)\1\2\u0397\u0399\3\2\2\2\u0398\u0394\3\2\2\2\u0399\u039c\3\2"+
		"\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039bQ\3\2\2\2\u039c\u039a"+
		"\3\2\2\2\u039d\u039e\5T+\2\u039e\u03a5\b*\1\2\u039f\u03a0\7B\2\2\u03a0"+
		"\u03a1\5T+\2\u03a1\u03a2\b*\1\2\u03a2\u03a4\3\2\2\2\u03a3\u039f\3\2\2"+
		"\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6S"+
		"\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03a9\5V,\2\u03a9\u03b0\b+\1\2\u03aa"+
		"\u03ab\7L\2\2\u03ab\u03ac\5V,\2\u03ac\u03ad\b+\1\2\u03ad\u03af\3\2\2\2"+
		"\u03ae\u03aa\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1"+
		"\3\2\2\2\u03b1U\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b4\5X-\2\u03b4\u03bb"+
		"\b,\1\2\u03b5\u03b6\7M\2\2\u03b6\u03b7\5X-\2\u03b7\u03b8\b,\1\2\u03b8"+
		"\u03ba\3\2\2\2\u03b9\u03b5\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2"+
		"\2\2\u03bb\u03bc\3\2\2\2\u03bcW\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03bf"+
		"\5Z.\2\u03bf\u03c6\b-\1\2\u03c0\u03c1\7K\2\2\u03c1\u03c2\5Z.\2\u03c2\u03c3"+
		"\b-\1\2\u03c3\u03c5\3\2\2\2\u03c4\u03c0\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6"+
		"\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7Y\3\2\2\2\u03c8\u03c6\3\2\2\2"+
		"\u03c9\u03ca\5\\/\2\u03ca\u03d5\b.\1\2\u03cb\u03d0\b.\1\2\u03cc\u03cd"+
		"\7A\2\2\u03cd\u03d1\b.\1\2\u03ce\u03cf\7Y\2\2\u03cf\u03d1\b.\1\2\u03d0"+
		"\u03cc\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\5\\"+
		"/\2\u03d3\u03d4\b.\1\2\u03d4\u03d6\3\2\2\2\u03d5\u03cb\3\2\2\2\u03d5\u03d6"+
		"\3\2\2\2\u03d6[\3\2\2\2\u03d7\u03d8\5^\60\2\u03d8\u03dd\b/\1\2\u03d9\u03da"+
		"\7%\2\2\u03da\u03db\5D#\2\u03db\u03dc\b/\1\2\u03dc\u03de\3\2\2\2\u03dd"+
		"\u03d9\3\2\2\2\u03dd\u03de\3\2\2\2\u03de]\3\2\2\2\u03df\u03e0\5b\62\2"+
		"\u03e0\u03e7\b\60\1\2\u03e1\u03e2\5`\61\2\u03e2\u03e3\5b\62\2\u03e3\u03e4"+
		"\b\60\1\2\u03e4\u03e6\3\2\2\2\u03e5\u03e1\3\2\2\2\u03e6\u03e9\3\2\2\2"+
		"\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8_\3\2\2\2\u03e9\u03e7\3"+
		"\2\2\2\u03ea\u03eb\7[\2\2\u03eb\u03ec\7<\2\2\u03ec\u03f5\b\61\1\2\u03ed"+
		"\u03ee\7Z\2\2\u03ee\u03ef\7<\2\2\u03ef\u03f5\b\61\1\2\u03f0\u03f1\7[\2"+
		"\2\u03f1\u03f5\b\61\1\2\u03f2\u03f3\7Z\2\2\u03f3\u03f5\b\61\1\2\u03f4"+
		"\u03ea\3\2\2\2\u03f4\u03ed\3\2\2\2\u03f4\u03f0\3\2\2\2\u03f4\u03f2\3\2"+
		"\2\2\u03f5a\3\2\2\2\u03f6\u03f7\5f\64\2\u03f7\u03fe\b\62\1\2\u03f8\u03f9"+
		"\5d\63\2\u03f9\u03fa\5f\64\2\u03fa\u03fb\b\62\1\2\u03fb\u03fd\3\2\2\2"+
		"\u03fc\u03f8\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff"+
		"\3\2\2\2\u03ffc\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0402\7[\2\2\u0402\u0403"+
		"\7[\2\2\u0403\u0408\b\63\1\2\u0404\u0405\7Z\2\2\u0405\u0406\7Z\2\2\u0406"+
		"\u0408\b\63\1\2\u0407\u0401\3\2\2\2\u0407\u0404\3\2\2\2\u0408e\3\2\2\2"+
		"\u0409\u040a\5h\65\2\u040a\u0417\b\64\1\2\u040b\u0410\b\64\1\2\u040c\u040d"+
		"\7G\2\2\u040d\u0411\b\64\1\2\u040e\u040f\7H\2\2\u040f\u0411\b\64\1\2\u0410"+
		"\u040c\3\2\2\2\u0410\u040e\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\5h"+
		"\65\2\u0413\u0414\b\64\1\2\u0414\u0416\3\2\2\2\u0415\u040b\3\2\2\2\u0416"+
		"\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418g\3\2\2\2"+
		"\u0419\u0417\3\2\2\2\u041a\u041b\5j\66\2\u041b\u042a\b\65\1\2\u041c\u0423"+
		"\b\65\1\2\u041d\u041e\7I\2\2\u041e\u0424\b\65\1\2\u041f\u0420\7J\2\2\u0420"+
		"\u0424\b\65\1\2\u0421\u0422\7N\2\2\u0422\u0424\b\65\1\2\u0423\u041d\3"+
		"\2\2\2\u0423\u041f\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"\u0426\5j\66\2\u0426\u0427\b\65\1\2\u0427\u0429\3\2\2\2\u0428\u041c\3"+
		"\2\2\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b"+
		"i\3\2\2\2\u042c\u042a\3\2\2\2\u042d\u042e\7G\2\2\u042e\u042f\5j\66\2\u042f"+
		"\u0430\b\66\1\2\u0430\u0441\3\2\2\2\u0431\u0432\7H\2\2\u0432\u0433\5j"+
		"\66\2\u0433\u0434\b\66\1\2\u0434\u0441\3\2\2\2\u0435\u0436\7D\2\2\u0436"+
		"\u0437\5j\66\2\u0437\u0438\b\66\1\2\u0438\u0441\3\2\2\2\u0439\u043a\7"+
		"E\2\2\u043a\u043b\5j\66\2\u043b\u043c\b\66\1\2\u043c\u0441\3\2\2\2\u043d"+
		"\u043e\5l\67\2\u043e\u043f\b\66\1\2\u043f\u0441\3\2\2\2\u0440\u042d\3"+
		"\2\2\2\u0440\u0431\3\2\2\2\u0440\u0435\3\2\2\2\u0440\u0439\3\2\2\2\u0440"+
		"\u043d\3\2\2\2\u0441k\3\2\2\2\u0442\u0443\7>\2\2\u0443\u0444\5j\66\2\u0444"+
		"\u0445\b\67\1\2\u0445\u0483\3\2\2\2\u0446\u0447\7=\2\2\u0447\u0448\5j"+
		"\66\2\u0448\u0449\b\67\1\2\u0449\u0483\3\2\2\2\u044a\u044b\5n8\2\u044b"+
		"\u044c\b\67\1\2\u044c\u0472\3\2\2\2\u044d\u044e\7\63\2\2\u044e\u044f\5"+
		"J&\2\u044f\u0450\b\67\1\2\u0450\u0451\7\64\2\2\u0451\u0472\3\2\2\2\u0452"+
		"\u0453\5\16\b\2\u0453\u0454\b\67\1\2\u0454\u0472\3\2\2\2\u0455\u0456\5"+
		"r:\2\u0456\u0457\b\67\1\2\u0457\u0472\3\2\2\2\u0458\u0459\7?\2\2\u0459"+
		"\u045a\7\63\2\2\u045a\u045b\5p9\2\u045b\u045c\7\64\2\2\u045c\u045d\b\67"+
		"\1\2\u045d\u0472\3\2\2\2\u045e\u045f\7\32\2\2\u045f\u0460\5D#\2\u0460"+
		"\u0461\b\67\1\2\u0461\u0465\7\63\2\2\u0462\u0463\5p9\2\u0463\u0464\b\67"+
		"\1\2\u0464\u0466\3\2\2\2\u0465\u0462\3\2\2\2\u0465\u0466\3\2\2\2\u0466"+
		"\u0467\3\2\2\2\u0467\u0468\7\64\2\2\u0468\u0469\7@\2\2\u0469\u046d\7\63"+
		"\2\2\u046a\u046b\5p9\2\u046b\u046c\b\67\1\2\u046c\u046e\3\2\2\2\u046d"+
		"\u046a\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\7\64"+
		"\2\2\u0470\u0472\3\2\2\2\u0471\u044a\3\2\2\2\u0471\u044d\3\2\2\2\u0471"+
		"\u0452\3\2\2\2\u0471\u0455\3\2\2\2\u0471\u0458\3\2\2\2\u0471\u045e\3\2"+
		"\2\2\u0472\u0479\3\2\2\2\u0473\u0474\7;\2\2\u0474\u0475\5\16\b\2\u0475"+
		"\u0476\b\67\1\2\u0476\u0478\3\2\2\2\u0477\u0473\3\2\2\2\u0478\u047b\3"+
		"\2\2\2\u0479\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u0480\3\2\2\2\u047b"+
		"\u0479\3\2\2\2\u047c\u047d\7D\2\2\u047d\u0481\b\67\1\2\u047e\u047f\7E"+
		"\2\2\u047f\u0481\b\67\1\2\u0480\u047c\3\2\2\2\u0480\u047e\3\2\2\2\u0480"+
		"\u0481\3\2\2\2\u0481\u0483\3\2\2\2\u0482\u0442\3\2\2\2\u0482\u0446\3\2"+
		"\2\2\u0482\u0471\3\2\2\2\u0483m\3\2\2\2\u0484\u0485\7\63\2\2\u0485\u0486"+
		"\5D#\2\u0486\u0487\7\64\2\2\u0487\u0488\5J&\2\u0488\u0489\b8\1\2\u0489"+
		"o\3\2\2\2\u048a\u0490\b9\1\2\u048b\u048c\5B\"\2\u048c\u048d\b9\1\2\u048d"+
		"\u048f\3\2\2\2\u048e\u048b\3\2\2\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2"+
		"\2\2\u0490\u0491\3\2\2\2\u0491\u0493\3\2\2\2\u0492\u0490\3\2\2\2\u0493"+
		"\u0494\5J&\2\u0494\u04a3\b9\1\2\u0495\u049b\7:\2\2\u0496\u0497\5B\"\2"+
		"\u0497\u0498\b9\1\2\u0498\u049a\3\2\2\2\u0499\u0496\3\2\2\2\u049a\u049d"+
		"\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049e\3\2\2\2\u049d"+
		"\u049b\3\2\2\2\u049e\u049f\5J&\2\u049f\u04a0\b9\1\2\u04a0\u04a2\3\2\2"+
		"\2\u04a1\u0495\3\2\2\2\u04a2\u04a5\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a3\u04a4"+
		"\3\2\2\2\u04a4q\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a6\u04a7\7\b\2\2\u04a7"+
		"\u04b7\b:\1\2\u04a8\u04a9\7\t\2\2\u04a9\u04b7\b:\1\2\u04aa\u04ab\7\n\2"+
		"\2\u04ab\u04b7\b:\1\2\u04ac\u04ad\7\13\2\2\u04ad\u04b7\b:\1\2\u04ae\u04af"+
		"\7\f\2\2\u04af\u04b7\b:\1\2\u04b0\u04b1\7\60\2\2\u04b1\u04b7\b:\1\2\u04b2"+
		"\u04b3\7\61\2\2\u04b3\u04b7\b:\1\2\u04b4\u04b5\7\62\2\2\u04b5\u04b7\b"+
		":\1\2\u04b6\u04a6\3\2\2\2\u04b6\u04a8\3\2\2\2\u04b6\u04aa\3\2\2\2\u04b6"+
		"\u04ac\3\2\2\2\u04b6\u04ae\3\2\2\2\u04b6\u04b0\3\2\2\2\u04b6\u04b2\3\2"+
		"\2\2\u04b6\u04b4\3\2\2\2\u04b7s\3\2\2\2pz\u0086\u0088\u0094\u0096\u00a8"+
		"\u00ac\u00b5\u00b9\u00c7\u00cf\u00dd\u00e8\u00f3\u00f9\u0101\u010f\u0119"+
		"\u0122\u012a\u012c\u0135\u013c\u0143\u0158\u0164\u016e\u0176\u0181\u0191"+
		"\u019b\u01a3\u01af\u01b2\u01bc\u01ca\u01cd\u01d6\u01e2\u01ee\u01f3\u01fb"+
		"\u0205\u0208\u0217\u021b\u0225\u0229\u0234\u0236\u0244\u024c\u0257\u025c"+
		"\u0267\u026c\u0277\u0284\u0294\u029c\u02b8\u02c8\u02ce\u02d4\u02e5\u02f1"+
		"\u02f9\u0302\u030e\u0316\u031b\u0325\u032d\u0330\u033d\u0340\u0347\u034c"+
		"\u0358\u0364\u036c\u0386\u0390\u039a\u03a5\u03b0\u03bb\u03c6\u03d0\u03d5"+
		"\u03dd\u03e7\u03f4\u03fe\u0407\u0410\u0417\u0423\u042a\u0440\u0465\u046d"+
		"\u0471\u0479\u0480\u0482\u0490\u049b\u04a3\u04b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}