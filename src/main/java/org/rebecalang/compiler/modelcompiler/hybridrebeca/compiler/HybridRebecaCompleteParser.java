// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/HybridRebecaComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.hybridrebeca.HybridrebecaUtils;
	
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
public class HybridRebecaCompleteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODE=1, PHYSICALCLASS=2, INV=3, GUARD=4, PRIORITIES=5, PRIME=6, AFTER=7, 
		DEADLINE=8, INTLITERAL=9, FLOATLITERAL=10, DOUBLELITERAL=11, CHARLITERAL=12, 
		STRINGLITERAL=13, WS=14, COMMENT=15, LINE_COMMENT=16, BREAK=17, CASE=18, 
		CLASS=19, CONTINUE=20, DEFAULT=21, ELSE=22, FOR=23, GOTO=24, IF=25, IMPORT=26, 
		NEW=27, PACKAGE=28, PRIVATE=29, PROTECTED=30, PUBLIC=31, RECORD=32, RETURN=33, 
		SWITCH=34, WHILE=35, ENV=36, FEATURE=37, INSTANCEOF=38, REACTIVECLASS=39, 
		INTERFACE=40, ABSTRACT=41, EXTENDS=42, IMPLEMENTS=43, MSGSRV=44, MAIN=45, 
		STATEVARS=46, KNOWNREBECS=47, THIS=48, TRUE=49, FALSE=50, NULL=51, LPAREN=52, 
		RPAREN=53, LBRACE=54, RBRACE=55, LBRACKET=56, RBRACKET=57, SEMI=58, COMMA=59, 
		DOT=60, EQ=61, BANG=62, TILDA=63, QUES=64, COLON=65, EQEQ=66, AMPAMP=67, 
		BARBAR=68, PLUSPLUS=69, SUBSUB=70, SUPER=71, PLUS=72, SUB=73, STAR=74, 
		SLASH=75, AMP=76, BAR=77, CARET=78, PERCENT=79, PLUSEQ=80, SUBEQ=81, STAREQ=82, 
		SLASHEQ=83, AMPEQ=84, BAREQ=85, CARETEQ=86, TILDAEQ=87, PERCENTEQ=88, 
		MONKEYS_AT=89, BANGEQ=90, GT=91, LT=92, LTLT=93, LTLTEQ=94, GTGT=95, GTGTEQ=96, 
		IDENTIFIER=97;
	public static final int
		RULE_rebecaCode = 0, RULE_physicalClassDeclaration = 1, RULE_modeDeclaration = 2, 
		RULE_primary = 3, RULE_rebecaModel = 4, RULE_packageDeclaration = 5, RULE_importDeclaration = 6, 
		RULE_recordDeclaration = 7, RULE_mainDeclaration = 8, RULE_mainRebecDefinition = 9, 
		RULE_fieldDeclaration = 10, RULE_variableDeclarators = 11, RULE_variableDeclarator = 12, 
		RULE_variableInitializer = 13, RULE_arrayInitializer = 14, RULE_interfaceDeclaration = 15, 
		RULE_reactiveClassDeclaration = 16, RULE_methodDeclaration = 17, RULE_constructorDeclaration = 18, 
		RULE_msgsrvDeclaration = 19, RULE_synchMethodDeclaration = 20, RULE_formalParameters = 21, 
		RULE_formalParametersDeclaration = 22, RULE_formalParameterDeclaration = 23, 
		RULE_block = 24, RULE_statement = 25, RULE_forInit = 26, RULE_switchBlock = 27, 
		RULE_statementExpression = 28, RULE_annotation = 29, RULE_type = 30, RULE_genericTypeParams = 31, 
		RULE_dimensions = 32, RULE_expression = 33, RULE_assignmentOperator = 34, 
		RULE_conditionalExpression = 35, RULE_conditionalOrExpression = 36, RULE_conditionalAndExpression = 37, 
		RULE_inclusiveOrExpression = 38, RULE_exclusiveOrExpression = 39, RULE_andExpression = 40, 
		RULE_equalityExpression = 41, RULE_instanceOfExpression = 42, RULE_relationalExpression = 43, 
		RULE_relationalOp = 44, RULE_shiftExpression = 45, RULE_shiftOp = 46, 
		RULE_additiveExpression = 47, RULE_multiplicativeExpression = 48, RULE_unaryExpression = 49, 
		RULE_unaryExpressionNotPlusMinus = 50, RULE_castExpression = 51, RULE_expressionList = 52, 
		RULE_literal = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"rebecaCode", "physicalClassDeclaration", "modeDeclaration", "primary", 
			"rebecaModel", "packageDeclaration", "importDeclaration", "recordDeclaration", 
			"mainDeclaration", "mainRebecDefinition", "fieldDeclaration", "variableDeclarators", 
			"variableDeclarator", "variableInitializer", "arrayInitializer", "interfaceDeclaration", 
			"reactiveClassDeclaration", "methodDeclaration", "constructorDeclaration", 
			"msgsrvDeclaration", "synchMethodDeclaration", "formalParameters", "formalParametersDeclaration", 
			"formalParameterDeclaration", "block", "statement", "forInit", "switchBlock", 
			"statementExpression", "annotation", "type", "genericTypeParams", "dimensions", 
			"expression", "assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
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
			null, "'mode'", "'physicalclass'", "'inv'", "'guard'", "'priorities'", 
			"'''", "'after'", "'deadline'", null, null, null, null, null, null, null, 
			null, "'break'", "'case'", "'class'", "'continue'", "'default'", "'else'", 
			"'for'", "'goto'", "'if'", "'import'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'record'", "'return'", "'switch'", "'while'", 
			"'env'", "'feature'", "'instanceof'", "'reactiveclass'", "'interface'", 
			"'abstract'", "'extends'", "'implements'", "'msgsrv'", "'main'", "'statevars'", 
			"'knownrebecs'", "'this'", "'true'", "'false'", "'null'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'!'", "'~'", 
			"'?'", "':'", "'=='", "'&&'", "'||'", "'++'", "'--'", "'super'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'~='", "'%='", "'@'", "'!='", "'>'", 
			"'<'", "'<<'", "'<<='", "'>>'", "'>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODE", "PHYSICALCLASS", "INV", "GUARD", "PRIORITIES", "PRIME", 
			"AFTER", "DEADLINE", "INTLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", 
			"STRINGLITERAL", "WS", "COMMENT", "LINE_COMMENT", "BREAK", "CASE", "CLASS", 
			"CONTINUE", "DEFAULT", "ELSE", "FOR", "GOTO", "IF", "IMPORT", "NEW", 
			"PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RECORD", "RETURN", "SWITCH", 
			"WHILE", "ENV", "FEATURE", "INSTANCEOF", "REACTIVECLASS", "INTERFACE", 
			"ABSTRACT", "EXTENDS", "IMPLEMENTS", "MSGSRV", "MAIN", "STATEVARS", "KNOWNREBECS", 
			"THIS", "TRUE", "FALSE", "NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "EQ", "BANG", "TILDA", 
			"QUES", "COLON", "EQEQ", "AMPAMP", "BARBAR", "PLUSPLUS", "SUBSUB", "SUPER", 
			"PLUS", "SUB", "STAR", "SLASH", "AMP", "BAR", "CARET", "PERCENT", "PLUSEQ", 
			"SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "TILDAEQ", 
			"PERCENTEQ", "MONKEYS_AT", "BANGEQ", "GT", "LT", "LTLT", "LTLTEQ", "GTGT", 
			"GTGTEQ", "IDENTIFIER"
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
	public String getGrammarFileName() { return "HybridRebecaComplete.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HybridRebecaCompleteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RebecaCodeContext extends ParserRuleContext {
		public HybridRebecaCode rc;
		public RecordDeclarationContext rd;
		public FieldDeclarationContext fd;
		public ReactiveClassDeclarationContext rcd;
		public InterfaceDeclarationContext intd;
		public PhysicalClassDeclarationContext pcd;
		public MainDeclarationContext md;
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public List<TerminalNode> ENV() { return getTokens(HybridRebecaCompleteParser.ENV); }
		public TerminalNode ENV(int i) {
			return getToken(HybridRebecaCompleteParser.ENV, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(HybridRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HybridRebecaCompleteParser.SEMI, i);
		}
		public List<TerminalNode> FEATURE() { return getTokens(HybridRebecaCompleteParser.FEATURE); }
		public TerminalNode FEATURE(int i) {
			return getToken(HybridRebecaCompleteParser.FEATURE, i);
		}
		public List<RecordDeclarationContext> recordDeclaration() {
			return getRuleContexts(RecordDeclarationContext.class);
		}
		public RecordDeclarationContext recordDeclaration(int i) {
			return getRuleContext(RecordDeclarationContext.class,i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
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
		public List<PhysicalClassDeclarationContext> physicalClassDeclaration() {
			return getRuleContexts(PhysicalClassDeclarationContext.class);
		}
		public PhysicalClassDeclarationContext physicalClassDeclaration(int i) {
			return getRuleContext(PhysicalClassDeclarationContext.class,i);
		}
		public RebecaCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebecaCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterRebecaCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitRebecaCode(this);
		}
	}

	public final RebecaCodeContext rebecaCode() throws RecognitionException {
		RebecaCodeContext _localctx = new RebecaCodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rebecaCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaCodeContext)_localctx).rc =  new HybridRebecaCode();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(109);
				((RebecaCodeContext)_localctx).rd = recordDeclaration();
				_localctx.rc.getRecordDeclaration().add(((RebecaCodeContext)_localctx).rd.rd);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV || _la==FEATURE) {
				{
				setState(127);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENV:
					{
					setState(117);
					match(ENV);
					setState(118);
					((RebecaCodeContext)_localctx).fd = fieldDeclaration();
					setState(119);
					match(SEMI);
					_localctx.rc.getEnvironmentVariables().add(((RebecaCodeContext)_localctx).fd.fd);
					}
					break;
				case FEATURE:
					{
					setState(122);
					match(FEATURE);
					setState(123);
					((RebecaCodeContext)_localctx).fd = fieldDeclaration();
					setState(124);
					match(SEMI);
					_localctx.rc.getFeatureVariables().add(((RebecaCodeContext)_localctx).fd.fd);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(132);
					((RebecaCodeContext)_localctx).rcd = reactiveClassDeclaration();
					_localctx.rc.getReactiveClassDeclaration().add(((RebecaCodeContext)_localctx).rcd.rcd);
					}
					break;
				case 2:
					{
					setState(135);
					((RebecaCodeContext)_localctx).intd = interfaceDeclaration();
					_localctx.rc.getInterfaceDeclaration().add(((RebecaCodeContext)_localctx).intd.intd);
					}
					break;
				case 3:
					{
					setState(138);
					((RebecaCodeContext)_localctx).pcd = physicalClassDeclaration();
					_localctx.rc.getPhysicalClassDeclaration().add(((RebecaCodeContext)_localctx).pcd.pcd);
					}
					break;
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PHYSICALCLASS) | (1L << REACTIVECLASS) | (1L << INTERFACE) | (1L << ABSTRACT))) != 0) || _la==MONKEYS_AT );
			setState(145);
			((RebecaCodeContext)_localctx).md = mainDeclaration();
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

	public static class PhysicalClassDeclarationContext extends ParserRuleContext {
		public PhysicalClassDeclaration pcd;
		public AnnotationContext an;
		public Token physicalClassName;
		public Token queueSize;
		public FieldDeclarationContext fd;
		public Token RBRACE;
		public ConstructorDeclarationContext cd;
		public MsgsrvDeclarationContext mgd;
		public SynchMethodDeclarationContext smd;
		public ModeDeclarationContext md;
		public TerminalNode PHYSICALCLASS() { return getToken(HybridRebecaCompleteParser.PHYSICALCLASS, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(HybridRebecaCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(HybridRebecaCompleteParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(HybridRebecaCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(HybridRebecaCompleteParser.RBRACE, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode INTLITERAL() { return getToken(HybridRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode KNOWNREBECS() { return getToken(HybridRebecaCompleteParser.KNOWNREBECS, 0); }
		public TerminalNode STATEVARS() { return getToken(HybridRebecaCompleteParser.STATEVARS, 0); }
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
		public List<ModeDeclarationContext> modeDeclaration() {
			return getRuleContexts(ModeDeclarationContext.class);
		}
		public ModeDeclarationContext modeDeclaration(int i) {
			return getRuleContext(ModeDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(HybridRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HybridRebecaCompleteParser.SEMI, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public PhysicalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physicalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterPhysicalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitPhysicalClassDeclaration(this);
		}
	}

	public final PhysicalClassDeclarationContext physicalClassDeclaration() throws RecognitionException {
		PhysicalClassDeclarationContext _localctx = new PhysicalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_physicalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((PhysicalClassDeclarationContext)_localctx).pcd =  new PhysicalClassDeclaration();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(149);
				((PhysicalClassDeclarationContext)_localctx).an = annotation();
				_localctx.pcd.getAnnotations().add(((PhysicalClassDeclarationContext)_localctx).an.an);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(PHYSICALCLASS);
			setState(158);
			((PhysicalClassDeclarationContext)_localctx).physicalClassName = match(IDENTIFIER);
				_localctx.pcd.setName((((PhysicalClassDeclarationContext)_localctx).physicalClassName!=null?((PhysicalClassDeclarationContext)_localctx).physicalClassName.getText():null)); 
			        		_localctx.pcd.setLineNumber(((PhysicalClassDeclarationContext)_localctx).physicalClassName.getLine()); _localctx.pcd.setCharacter(((PhysicalClassDeclarationContext)_localctx).physicalClassName.getCharPositionInLine());
			        	
			setState(160);
			match(LPAREN);
			setState(161);
			((PhysicalClassDeclarationContext)_localctx).queueSize = match(INTLITERAL);
			if(!((PhysicalClassDeclarationContext)_localctx).queueSize.getText().equals("<missing INTLITERAL>")) _localctx.pcd.setQueueSize(Integer.parseInt((((PhysicalClassDeclarationContext)_localctx).queueSize!=null?((PhysicalClassDeclarationContext)_localctx).queueSize.getText():null)));
			setState(163);
			match(RPAREN);
			setState(164);
			match(LBRACE);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KNOWNREBECS) {
				{
				setState(165);
				match(KNOWNREBECS);
				setState(166);
				match(LBRACE);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(167);
					((PhysicalClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.pcd.getKnownRebecs().add(((PhysicalClassDeclarationContext)_localctx).fd.fd);
					setState(169);
					match(SEMI);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				((PhysicalClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEVARS) {
				{
				setState(179);
				match(STATEVARS);
				setState(180);
				match(LBRACE);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(181);
					((PhysicalClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.pcd.getStatevars().add(((PhysicalClassDeclarationContext)_localctx).fd.fd);
					setState(183);
					match(SEMI);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				((PhysicalClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODE) | (1L << ABSTRACT) | (1L << MSGSRV))) != 0) || _la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(193);
					((PhysicalClassDeclarationContext)_localctx).cd = constructorDeclaration();
					_localctx.pcd.getConstructors().add(((PhysicalClassDeclarationContext)_localctx).cd.cd);
					}
					break;
				case 2:
					{
					setState(196);
					((PhysicalClassDeclarationContext)_localctx).mgd = msgsrvDeclaration();
					_localctx.pcd.getMsgsrvs().add(((PhysicalClassDeclarationContext)_localctx).mgd.md);
					}
					break;
				case 3:
					{
					setState(199);
					((PhysicalClassDeclarationContext)_localctx).smd = synchMethodDeclaration();
					_localctx.pcd.getSynchMethods().add(((PhysicalClassDeclarationContext)_localctx).smd.smd);
					}
					break;
				case 4:
					{
					setState(202);
					((PhysicalClassDeclarationContext)_localctx).md = modeDeclaration();
					_localctx.pcd.getModeDeclarations().add(((PhysicalClassDeclarationContext)_localctx).md.md);
					}
					break;
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			((PhysicalClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.pcd.setEndLineNumber(((PhysicalClassDeclarationContext)_localctx).RBRACE.getLine());_localctx.pcd.setEndCharacter(((PhysicalClassDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
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

	public static class ModeDeclarationContext extends ParserRuleContext {
		public ModeDeclaration md;
		public Token MODE;
		public Token modeName;
		public Token INV;
		public ExpressionContext e;
		public BlockContext b;
		public Token GUARD;
		public ExpressionContext e2;
		public TerminalNode MODE() { return getToken(HybridRebecaCompleteParser.MODE, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode INV() { return getToken(HybridRebecaCompleteParser.INV, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(HybridRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HybridRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode GUARD() { return getToken(HybridRebecaCompleteParser.GUARD, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ModeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterModeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitModeDeclaration(this);
		}
	}

	public final ModeDeclarationContext modeDeclaration() throws RecognitionException {
		ModeDeclarationContext _localctx = new ModeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ModeDeclarationContext)_localctx).md =  new ModeDeclaration(); 
				 GuardDeclaration gd = new GuardDeclaration(); _localctx.md.setGuardDeclaration(gd);
				 InvariantDeclaration id = new InvariantDeclaration(); _localctx.md.setInvariantDeclaration(id);
			setState(214);
			((ModeDeclarationContext)_localctx).MODE = match(MODE);
			setState(215);
			((ModeDeclarationContext)_localctx).modeName = match(IDENTIFIER);
				_localctx.md.setName((((ModeDeclarationContext)_localctx).modeName!=null?((ModeDeclarationContext)_localctx).modeName.getText():null)); 
					_localctx.md.setLineNumber(((ModeDeclarationContext)_localctx).MODE.getLine()); _localctx.md.setCharacter(((ModeDeclarationContext)_localctx).MODE.getCharPositionInLine());
				
			setState(217);
			match(LBRACE);
			setState(218);
			((ModeDeclarationContext)_localctx).INV = match(INV);
			setState(219);
			match(LPAREN);
			{
			setState(220);
			((ModeDeclarationContext)_localctx).e = expression();
			id.setCondition(((ModeDeclarationContext)_localctx).e.e);
			}
			setState(223);
			match(RPAREN);
			setState(224);
			((ModeDeclarationContext)_localctx).b = block();
			id.setBlock(((ModeDeclarationContext)_localctx).b.bs);id.setCharacter(((ModeDeclarationContext)_localctx).INV.getCharPositionInLine());id.setLineNumber(((ModeDeclarationContext)_localctx).INV.getLine());
			setState(226);
			((ModeDeclarationContext)_localctx).GUARD = match(GUARD);
			setState(227);
			match(LPAREN);
			{
			setState(228);
			((ModeDeclarationContext)_localctx).e2 = expression();
			gd.setCondition(((ModeDeclarationContext)_localctx).e2.e);
			}
			setState(231);
			match(RPAREN);
			setState(232);
			((ModeDeclarationContext)_localctx).b = block();
			gd.setBlock(((ModeDeclarationContext)_localctx).b.bs);gd.setCharacter(((ModeDeclarationContext)_localctx).GUARD.getCharPositionInLine());gd.setLineNumber(((ModeDeclarationContext)_localctx).GUARD.getLine());
			setState(234);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TermPrimary tp;
		public Token id1;
		public Token lp;
		public ExpressionListContext el;
		public ExpressionContext ef;
		public ExpressionContext ed;
		public ExpressionContext e2;
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(HybridRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(HybridRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(HybridRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(HybridRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(HybridRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> PRIME() { return getTokens(HybridRebecaCompleteParser.PRIME); }
		public TerminalNode PRIME(int i) {
			return getToken(HybridRebecaCompleteParser.PRIME, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(HybridRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AFTER() { return getToken(HybridRebecaCompleteParser.AFTER, 0); }
		public TerminalNode DEADLINE() { return getToken(HybridRebecaCompleteParser.DEADLINE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			((PrimaryContext)_localctx).id1 = match(IDENTIFIER);
			((PrimaryContext)_localctx).tp =  new TermPrimary(); _localctx.tp.setName((((PrimaryContext)_localctx).id1!=null?((PrimaryContext)_localctx).id1.getText():null));
								  _localctx.tp.setLineNumber(((PrimaryContext)_localctx).id1.getLine()); _localctx.tp.setCharacter(((PrimaryContext)_localctx).id1.getCharPositionInLine());
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(238);
				((PrimaryContext)_localctx).lp = match(LPAREN);
				TimedRebecaParentSuffixPrimary psp = new TimedRebecaParentSuffixPrimary(); 
				    	 psp.setLineNumber(((PrimaryContext)_localctx).lp.getLine()); psp.setCharacter(((PrimaryContext)_localctx).lp.getCharPositionInLine());
				    	 _localctx.tp.setParentSuffixPrimary(psp);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(240);
					((PrimaryContext)_localctx).el = expressionList();
					_localctx.tp.getParentSuffixPrimary().getArguments().addAll(((PrimaryContext)_localctx).el.el);
					}
				}

				setState(245);
				match(RPAREN);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(246);
					match(AFTER);
					setState(247);
					match(LPAREN);
					setState(248);
					((PrimaryContext)_localctx).ef = expression();
					setState(249);
					match(RPAREN);
					psp.setAfterExpression(((PrimaryContext)_localctx).ef.e);
					}
				}

				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEADLINE) {
					{
					setState(254);
					match(DEADLINE);
					setState(255);
					match(LPAREN);
					setState(256);
					((PrimaryContext)_localctx).ed = expression();
					setState(257);
					match(RPAREN);
					psp.setDeadlineExpression(((PrimaryContext)_localctx).ed.e);
					}
				}

				}
			}

			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(264);
				match(LBRACKET);
				setState(265);
				((PrimaryContext)_localctx).e2 = expression();
				setState(266);
				match(RBRACKET);
				_localctx.tp.getIndices().add(((PrimaryContext)_localctx).e2.e);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIME) {
				{
				{
				setState(274);
				match(PRIME);
				if (!(_localctx.tp instanceof HybridTermPrimary)) ((PrimaryContext)_localctx).tp =  HybridrebecaUtils.transformTermPrimaryToHybridTermPrimary(_localctx.tp);
					  	 ((HybridTermPrimary)_localctx.tp).setDerivativeOrder(((HybridTermPrimary)_localctx.tp).getDerivativeOrder() + 1);
				}
				}
				setState(280);
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterRebecaModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitRebecaModel(this);
		}
	}

	public final RebecaModelContext rebecaModel() throws RecognitionException {
		RebecaModelContext _localctx = new RebecaModelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rebecaModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaModelContext)_localctx).r =  new RebecaModel();
			        
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(282);
				((RebecaModelContext)_localctx).p = packageDeclaration();
				_localctx.r.setPackageDeclaration(((RebecaModelContext)_localctx).p.p);
				}
			}

			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(287);
				((RebecaModelContext)_localctx).i = importDeclaration();
				_localctx.r.getImportDeclaration().add(((RebecaModelContext)_localctx).i.i);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(295);
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
		public TerminalNode PACKAGE() { return getToken(HybridRebecaCompleteParser.PACKAGE, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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
		public TerminalNode IMPORT() { return getToken(HybridRebecaCompleteParser.IMPORT, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		public TerminalNode RECORD() { return getToken(HybridRebecaCompleteParser.RECORD, 0); }
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterRecordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitRecordDeclaration(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_recordDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		public TerminalNode MAIN() { return getToken(HybridRebecaCompleteParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitMainDeclaration(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainDeclarationContext)_localctx).md =  new MainDeclaration();
			setState(305);
			((MainDeclarationContext)_localctx).MAIN = match(MAIN);
			_localctx.md.setLineNumber(((MainDeclarationContext)_localctx).MAIN.getLine());_localctx.md.setCharacter(((MainDeclarationContext)_localctx).MAIN.getCharPositionInLine());
			setState(307);
			match(LBRACE);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT || _la==IDENTIFIER) {
				{
				{
				setState(308);
				((MainDeclarationContext)_localctx).mrd = mainRebecDefinition();
				_localctx.md.getMainRebecDefinition().add(((MainDeclarationContext)_localctx).mrd.mrd);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
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
		public List<TerminalNode> LPAREN() { return getTokens(HybridRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HybridRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(HybridRebecaCompleteParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(HybridRebecaCompleteParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterMainRebecDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitMainRebecDefinition(this);
		}
	}

	public final MainRebecDefinitionContext mainRebecDefinition() throws RecognitionException {
		MainRebecDefinitionContext _localctx = new MainRebecDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mainRebecDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainRebecDefinitionContext)_localctx).mrd =  new MainRebecDefinition();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(320);
				((MainRebecDefinitionContext)_localctx).an = annotation();
				_localctx.mrd.getAnnotations().add(((MainRebecDefinitionContext)_localctx).an.an);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			((MainRebecDefinitionContext)_localctx).t = type();
			setState(329);
			((MainRebecDefinitionContext)_localctx).rebecName = match(IDENTIFIER);
			_localctx.mrd.setType(((MainRebecDefinitionContext)_localctx).t.t);_localctx.mrd.setName((((MainRebecDefinitionContext)_localctx).rebecName!=null?((MainRebecDefinitionContext)_localctx).rebecName.getText():null));
						_localctx.mrd.setLineNumber(((MainRebecDefinitionContext)_localctx).rebecName.getLine()); _localctx.mrd.setCharacter(((MainRebecDefinitionContext)_localctx).rebecName.getCharPositionInLine());
			setState(331);
			match(LPAREN);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(332);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getBindings().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(337);
			match(RPAREN);
			setState(338);
			match(COLON);
			setState(339);
			match(LPAREN);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(340);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getArguments().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(345);
			match(RPAREN);
			setState(346);
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FieldDeclarationContext)_localctx).fd =  new FieldDeclaration();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(349);
				((FieldDeclarationContext)_localctx).an = annotation();
				_localctx.fd.getAnnotations().add(((FieldDeclarationContext)_localctx).an.an);
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			((FieldDeclarationContext)_localctx).t = type();
			setState(358);
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
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorsContext)_localctx).vds =  new LinkedList<VariableDeclarator>();
			setState(362);
			((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
			_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(364);
				match(COMMA);
				setState(365);
				((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
				_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
				}
				}
				setState(372);
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
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(HybridRebecaCompleteParser.EQ, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorContext)_localctx).vd =  new VariableDeclarator();
			setState(374);
			((VariableDeclaratorContext)_localctx).name = match(IDENTIFIER);
			_localctx.vd.setVariableName((((VariableDeclaratorContext)_localctx).name!=null?((VariableDeclaratorContext)_localctx).name.getText():null)); _localctx.vd.setLineNumber(((VariableDeclaratorContext)_localctx).name.getLine());_localctx.vd.setCharacter(((VariableDeclaratorContext)_localctx).name.getCharPositionInLine());
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(376);
				match(EQ);
				setState(377);
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableInitializer);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
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
				setState(385);
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
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayInitializerContext)_localctx).avi =  new ArrayVariableInitializer();
			setState(391);
			((ArrayInitializerContext)_localctx).LBRACE = match(LBRACE);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(392);
				((ArrayInitializerContext)_localctx).vi = variableInitializer();
				_localctx.avi.setCharacter(((ArrayInitializerContext)_localctx).LBRACE.getCharPositionInLine()); _localctx.avi.setLineNumber(((ArrayInitializerContext)_localctx).LBRACE.getLine());
				    		_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(394);
					match(COMMA);
					setState(395);
					((ArrayInitializerContext)_localctx).vi = variableInitializer();
					_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(405);
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
		public TerminalNode INTERFACE() { return getToken(HybridRebecaCompleteParser.INTERFACE, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(HybridRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HybridRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode EXTENDS() { return getToken(HybridRebecaCompleteParser.EXTENDS, 0); }
		public List<TerminalNode> MSGSRV() { return getTokens(HybridRebecaCompleteParser.MSGSRV); }
		public TerminalNode MSGSRV(int i) {
			return getToken(HybridRebecaCompleteParser.MSGSRV, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(HybridRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HybridRebecaCompleteParser.SEMI, i);
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
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InterfaceDeclarationContext)_localctx).intd =  new InterfaceDeclaration();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(408);
				((InterfaceDeclarationContext)_localctx).an = annotation();
				_localctx.intd.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			match(INTERFACE);
			setState(417);
			((InterfaceDeclarationContext)_localctx).interfaceName = match(IDENTIFIER);
				_localctx.intd.setName((((InterfaceDeclarationContext)_localctx).interfaceName!=null?((InterfaceDeclarationContext)_localctx).interfaceName.getText():null)); 
			        		_localctx.intd.setLineNumber(((InterfaceDeclarationContext)_localctx).interfaceName.getLine()); _localctx.intd.setCharacter(((InterfaceDeclarationContext)_localctx).interfaceName.getCharPositionInLine());
			        	
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(419);
				match(EXTENDS);
				setState(420);
				((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
				        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
				        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
				        		_localctx.intd.getExtends().add(opt);
				        	
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(422);
					match(COMMA);
					setState(423);
					((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
						        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
						        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
						        		_localctx.intd.getExtends().add(opt);
					        		
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(432);
			match(LBRACE);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGSRV || _la==MONKEYS_AT) {
				{
				{
				MethodDeclaration md = new MsgsrvDeclaration();md.setAbstract(true); _localctx.intd.getMsgsrvs().add((MsgsrvDeclaration)md);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(434);
					((InterfaceDeclarationContext)_localctx).an = annotation();
					md.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(442);
				match(MSGSRV);
				setState(443);
				((InterfaceDeclarationContext)_localctx).name = match(IDENTIFIER);
				md.setName((((InterfaceDeclarationContext)_localctx).name!=null?((InterfaceDeclarationContext)_localctx).name.getText():null)); md.setLineNumber(((InterfaceDeclarationContext)_localctx).name.getLine());md.setCharacter(((InterfaceDeclarationContext)_localctx).name.getCharPositionInLine());
				setState(445);
				((InterfaceDeclarationContext)_localctx).fps = formalParameters();
				md.getFormalParameters().addAll(((InterfaceDeclarationContext)_localctx).fps.fps);
				setState(447);
				match(SEMI);
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
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
		public TerminalNode REACTIVECLASS() { return getToken(HybridRebecaCompleteParser.REACTIVECLASS, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(HybridRebecaCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(HybridRebecaCompleteParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(HybridRebecaCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(HybridRebecaCompleteParser.RBRACE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(HybridRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HybridRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode INTLITERAL() { return getToken(HybridRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode ABSTRACT() { return getToken(HybridRebecaCompleteParser.ABSTRACT, 0); }
		public TerminalNode EXTENDS() { return getToken(HybridRebecaCompleteParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(HybridRebecaCompleteParser.IMPLEMENTS, 0); }
		public TerminalNode KNOWNREBECS() { return getToken(HybridRebecaCompleteParser.KNOWNREBECS, 0); }
		public TerminalNode STATEVARS() { return getToken(HybridRebecaCompleteParser.STATEVARS, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(HybridRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HybridRebecaCompleteParser.SEMI, i);
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterReactiveClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitReactiveClassDeclaration(this);
		}
	}

	public final ReactiveClassDeclarationContext reactiveClassDeclaration() throws RecognitionException {
		ReactiveClassDeclarationContext _localctx = new ReactiveClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReactiveClassDeclarationContext)_localctx).rcd =  new ReactiveClassDeclaration();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(458);
				((ReactiveClassDeclarationContext)_localctx).an = annotation();
				_localctx.rcd.getAnnotations().add(((ReactiveClassDeclarationContext)_localctx).an.an);
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(466);
				match(ABSTRACT);
				_localctx.rcd.setAbstract(true);
				}
			}

			setState(470);
			match(REACTIVECLASS);
			setState(471);
			((ReactiveClassDeclarationContext)_localctx).reactiveClassName = match(IDENTIFIER);
				_localctx.rcd.setName((((ReactiveClassDeclarationContext)_localctx).reactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getText():null)); 
			        		_localctx.rcd.setLineNumber(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getLine()); _localctx.rcd.setCharacter(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getCharPositionInLine());
			        	
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(473);
				match(EXTENDS);
				setState(474);
				((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getCharPositionInLine());
				        		_localctx.rcd.setExtends(opt);
				        	
				}
			}

			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(478);
				match(IMPLEMENTS);
				setState(479);
				((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
				        		_localctx.rcd.getImplements().add(opt);
				        	
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(481);
					match(COMMA);
					setState(482);
					((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
						        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
						        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
						        		_localctx.rcd.getImplements().add(opt);
					        		
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(491);
			match(LPAREN);
			setState(492);
			((ReactiveClassDeclarationContext)_localctx).queueSize = match(INTLITERAL);
			if(!((ReactiveClassDeclarationContext)_localctx).queueSize.getText().equals("<missing INTLITERAL>")) _localctx.rcd.setQueueSize(Integer.parseInt((((ReactiveClassDeclarationContext)_localctx).queueSize!=null?((ReactiveClassDeclarationContext)_localctx).queueSize.getText():null)));
			setState(494);
			match(RPAREN);
			setState(495);
			match(LBRACE);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KNOWNREBECS) {
				{
				setState(496);
				match(KNOWNREBECS);
				setState(497);
				match(LBRACE);
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(498);
					((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.rcd.getKnownRebecs().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
					setState(500);
					match(SEMI);
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(507);
				((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEVARS) {
				{
				setState(510);
				match(STATEVARS);
				setState(511);
				match(LBRACE);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(512);
					((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.rcd.getStatevars().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
					setState(514);
					match(SEMI);
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(521);
				((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (ABSTRACT - 41)) | (1L << (MSGSRV - 41)) | (1L << (MONKEYS_AT - 41)) | (1L << (IDENTIFIER - 41)))) != 0)) {
				{
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(524);
					((ReactiveClassDeclarationContext)_localctx).cd = constructorDeclaration();
					_localctx.rcd.getConstructors().add(((ReactiveClassDeclarationContext)_localctx).cd.cd);
					}
					break;
				case 2:
					{
					setState(527);
					((ReactiveClassDeclarationContext)_localctx).md = msgsrvDeclaration();
					_localctx.rcd.getMsgsrvs().add(((ReactiveClassDeclarationContext)_localctx).md.md);
					}
					break;
				case 3:
					{
					setState(530);
					((ReactiveClassDeclarationContext)_localctx).smd = synchMethodDeclaration();
					_localctx.rcd.getSynchMethods().add(((ReactiveClassDeclarationContext)_localctx).smd.smd);
					}
					break;
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(538);
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
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HybridRebecaCompleteParser.SEMI, 0); }
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration(MethodDeclaration md) throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState(), md);
		enterRule(_localctx, 34, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			((MethodDeclarationContext)_localctx).name = match(IDENTIFIER);
			_localctx.md.setName((((MethodDeclarationContext)_localctx).name!=null?((MethodDeclarationContext)_localctx).name.getText():null)); _localctx.md.setLineNumber(((MethodDeclarationContext)_localctx).name.getLine());_localctx.md.setCharacter(((MethodDeclarationContext)_localctx).name.getCharPositionInLine());
			setState(543);
			((MethodDeclarationContext)_localctx).fps = formalParameters();
			_localctx.md.getFormalParameters().addAll(((MethodDeclarationContext)_localctx).fps.fps);
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(545);
				((MethodDeclarationContext)_localctx).b = block();
				_localctx.md.setBlock(((MethodDeclarationContext)_localctx).b.bs);_localctx.md.setEndLineNumber(((MethodDeclarationContext)_localctx).b.bs.getEndLineNumber());_localctx.md.setEndCharacter(((MethodDeclarationContext)_localctx).b.bs.getEndCharacter());
				}
				break;
			case SEMI:
				{
				setState(548);
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorDeclarationContext)_localctx).cd =  new ConstructorDeclaration();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(552);
				((ConstructorDeclarationContext)_localctx).an = annotation();
				_localctx.cd.getAnnotations().add(((ConstructorDeclarationContext)_localctx).an.an);
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(560);
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
		public TerminalNode MSGSRV() { return getToken(HybridRebecaCompleteParser.MSGSRV, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(HybridRebecaCompleteParser.ABSTRACT, 0); }
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterMsgsrvDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitMsgsrvDeclaration(this);
		}
	}

	public final MsgsrvDeclarationContext msgsrvDeclaration() throws RecognitionException {
		MsgsrvDeclarationContext _localctx = new MsgsrvDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_msgsrvDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MsgsrvDeclarationContext)_localctx).md =  new MsgsrvDeclaration();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(563);
				((MsgsrvDeclarationContext)_localctx).an = annotation();
				_localctx.md.getAnnotations().add(((MsgsrvDeclarationContext)_localctx).an.an);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(571);
				match(ABSTRACT);
				_localctx.md.setAbstract(true);
				}
			}

			setState(575);
			match(MSGSRV);
			setState(576);
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
		public TerminalNode ABSTRACT() { return getToken(HybridRebecaCompleteParser.ABSTRACT, 0); }
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterSynchMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitSynchMethodDeclaration(this);
		}
	}

	public final SynchMethodDeclarationContext synchMethodDeclaration() throws RecognitionException {
		SynchMethodDeclarationContext _localctx = new SynchMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_synchMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SynchMethodDeclarationContext)_localctx).smd =  new SynchMethodDeclaration();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(579);
				((SynchMethodDeclarationContext)_localctx).an = annotation();
				_localctx.smd.getAnnotations().add(((SynchMethodDeclarationContext)_localctx).an.an);
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(587);
				match(ABSTRACT);
				_localctx.smd.setAbstract(true);
				}
			}

			setState(591);
			((SynchMethodDeclarationContext)_localctx).t = type();
			_localctx.smd.setReturnType(((SynchMethodDeclarationContext)_localctx).t.t);
			setState(593);
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
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public FormalParametersDeclarationContext formalParametersDeclaration() {
			return getRuleContext(FormalParametersDeclarationContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersContext)_localctx).fps =  new ArrayList<FormalParameterDeclaration>();
			setState(596);
			match(LPAREN);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(597);
				((FormalParametersContext)_localctx).fpds = formalParametersDeclaration();
				_localctx.fps.addAll(((FormalParametersContext)_localctx).fpds.fpds);
				}
			}

			setState(602);
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
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public FormalParametersDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParametersDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterFormalParametersDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitFormalParametersDeclaration(this);
		}
	}

	public final FormalParametersDeclarationContext formalParametersDeclaration() throws RecognitionException {
		FormalParametersDeclarationContext _localctx = new FormalParametersDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formalParametersDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersDeclarationContext)_localctx).fpds =  new ArrayList<FormalParameterDeclaration>();
			setState(605);
			((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
			_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(607);
				match(COMMA);
				setState(608);
				((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
				_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
				}
				}
				setState(615);
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
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterFormalParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitFormalParameterDeclaration(this);
		}
	}

	public final FormalParameterDeclarationContext formalParameterDeclaration() throws RecognitionException {
		FormalParameterDeclarationContext _localctx = new FormalParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formalParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			((FormalParameterDeclarationContext)_localctx).t = type();
			setState(617);
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
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).bs =  new BlockStatement();
			setState(621);
			((BlockContext)_localctx).LBRACE = match(LBRACE);
			_localctx.bs.setLineNumber(((BlockContext)_localctx).LBRACE.getLine());_localctx.bs.setCharacter(((BlockContext)_localctx).LBRACE.getCharPositionInLine());
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				ArrayList<Annotation> anns = new ArrayList<Annotation>();
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						((BlockContext)_localctx).an = annotation();
						anns.add(((BlockContext)_localctx).an.an);
						}
						} 
					}
					setState(631);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(632);
				((BlockContext)_localctx).s = statement();
				_localctx.bs.getStatements().add (((BlockContext)_localctx).s.s); ((BlockContext)_localctx).s.s.getAnnotations().addAll(anns);
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(640);
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
		public List<TerminalNode> SEMI() { return getTokens(HybridRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HybridRebecaCompleteParser.SEMI, i);
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
		public TerminalNode IF() { return getToken(HybridRebecaCompleteParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HybridRebecaCompleteParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(HybridRebecaCompleteParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(HybridRebecaCompleteParser.FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(HybridRebecaCompleteParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(HybridRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HybridRebecaCompleteParser.RBRACE, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(HybridRebecaCompleteParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(HybridRebecaCompleteParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(HybridRebecaCompleteParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		int _la;
		try {
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				((StatementContext)_localctx).se = statementExpression();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).se.se;
				setState(645);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				((StatementContext)_localctx).fd = fieldDeclaration();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).fd.fd;
				setState(649);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).b.bs;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(654);
				((StatementContext)_localctx).IF = match(IF);
				((StatementContext)_localctx).s =  new ConditionalStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).IF.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).IF.getCharPositionInLine());
				setState(656);
				match(LPAREN);
				setState(657);
				((StatementContext)_localctx).e = expression();
				setState(658);
				match(RPAREN);
				setState(659);
				((StatementContext)_localctx).st = statement();
				((ConditionalStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((ConditionalStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				setState(665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(661);
					match(ELSE);
					setState(662);
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
				setState(667);
				((StatementContext)_localctx).WHILE = match(WHILE);
				((StatementContext)_localctx).s =  new WhileStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).WHILE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).WHILE.getCharPositionInLine());
				setState(669);
				match(LPAREN);
				setState(670);
				((StatementContext)_localctx).e = expression();
				setState(671);
				match(RPAREN);
				setState(672);
				((StatementContext)_localctx).st = statement();
				((WhileStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((WhileStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(675);
				((StatementContext)_localctx).FOR = match(FOR);
				((StatementContext)_localctx).s =  new ForStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).FOR.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).FOR.getCharPositionInLine());
				setState(677);
				match(LPAREN);
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(678);
					((StatementContext)_localctx).fi = forInit();
					((ForStatement)_localctx.s).setForInitializer(((StatementContext)_localctx).fi.fi);
					}
				}

				setState(683);
				match(SEMI);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(684);
					((StatementContext)_localctx).e = expression();
					((ForStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e);
					}
				}

				setState(689);
				match(SEMI);
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(690);
					((StatementContext)_localctx).el = expressionList();
					((ForStatement)_localctx.s).getForIncrement().addAll(((StatementContext)_localctx).el.el); 
					}
				}

				setState(695);
				match(RPAREN);
				setState(696);
				((StatementContext)_localctx).st = statement();
				((ForStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(699);
				((StatementContext)_localctx).SWITCH = match(SWITCH);
				setState(700);
				match(LPAREN);
				setState(701);
				((StatementContext)_localctx).e = expression();
				setState(702);
				match(RPAREN);
				setState(703);
				match(LBRACE);
				setState(704);
				((StatementContext)_localctx).sb = switchBlock();
				setState(705);
				match(RBRACE);
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).sb.ss; ((SwitchStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).SWITCH.getLine()); _localctx.s.setCharacter(((StatementContext)_localctx).SWITCH.getCharPositionInLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(708);
				((StatementContext)_localctx).RETURN = match(RETURN);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(709);
					((StatementContext)_localctx).e = expression();
					}
				}

				setState(712);
				match(SEMI);
				((StatementContext)_localctx).s =  new ReturnStatement(); ((ReturnStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).RETURN.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).RETURN.getCharPositionInLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(714);
				((StatementContext)_localctx).BREAK = match(BREAK);
				setState(715);
				match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).BREAK.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).BREAK.getCharPositionInLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(717);
				((StatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(718);
				match(SEMI);
				((StatementContext)_localctx).s =  new ContinueStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).CONTINUE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).CONTINUE.getCharPositionInLine());
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(720);
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forInit);
		try {
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				((ForInitContext)_localctx).fd = fieldDeclaration();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.setFieldDeclaration(((ForInitContext)_localctx).fd.fd); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
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
		public ExpressionContext e;
		public Token DEFAULT;
		public StatementContext st;
		public List<TerminalNode> COLON() { return getTokens(HybridRebecaCompleteParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HybridRebecaCompleteParser.COLON, i);
		}
		public List<TerminalNode> CASE() { return getTokens(HybridRebecaCompleteParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(HybridRebecaCompleteParser.CASE, i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(HybridRebecaCompleteParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(HybridRebecaCompleteParser.DEFAULT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SwitchBlockContext)_localctx).ss =  new SwitchStatement();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				setState(740);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
					{
					setState(734);
					match(CASE);
					setState(735);
					((SwitchBlockContext)_localctx).e = expression();

					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setExpression(((SwitchBlockContext)_localctx).e.e);
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).e.e.getLineNumber());
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).e.e.getCharacter());
					    			
					}
					break;
				case DEFAULT:
					{
					setState(738);
					((SwitchBlockContext)_localctx).DEFAULT = match(DEFAULT);

					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).DEFAULT.getCharPositionInLine());
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).DEFAULT.getLine());
					    			
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(742);
				match(COLON);
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					{
					setState(743);
					((SwitchBlockContext)_localctx).st = statement();
					_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).getStatements().add(((SwitchBlockContext)_localctx).st.s);
					}
					}
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(755);
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
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
		public TerminalNode MONKEYS_AT() { return getToken(HybridRebecaCompleteParser.MONKEYS_AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AnnotationContext)_localctx).an =  new Annotation();
			setState(760);
			match(MONKEYS_AT);
			setState(761);
			((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			    	 _localctx.an.setLineNumber(((AnnotationContext)_localctx).annotationName.getLine());
			    	 _localctx.an.setCharacter(((AnnotationContext)_localctx).annotationName.getCharPositionInLine());
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(763);
				match(LPAREN);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(764);
					((AnnotationContext)_localctx).exp = expression();
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(769);
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
		public TerminalNode IDENTIFIER() { return getToken(HybridRebecaCompleteParser.IDENTIFIER, 0); }
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(774);
				((TypeContext)_localctx).gts = genericTypeParams();
				GenericType gt = new GenericType(); gt.setName(((OrdinaryPrimitiveType)_localctx.t).getName()); gt.setNumberOfParameters(((TypeContext)_localctx).gts.gts.size());
							GenericTypeInstance gti = new GenericTypeInstance(); gti.setBase(gt); gti.getParameters().addAll(((TypeContext)_localctx).gts.gts); ((TypeContext)_localctx).t =  gti;
							_localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
				}
				break;
			}
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(779);
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
		public TerminalNode LT() { return getToken(HybridRebecaCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(HybridRebecaCompleteParser.GT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
		}
		public GenericTypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterGenericTypeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitGenericTypeParams(this);
		}
	}

	public final GenericTypeParamsContext genericTypeParams() throws RecognitionException {
		GenericTypeParamsContext _localctx = new GenericTypeParamsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(LT);
			((GenericTypeParamsContext)_localctx).gts =  new LinkedList<Type>();
			setState(786);
			((GenericTypeParamsContext)_localctx).t = type();
			_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(788);
				match(COMMA);
				setState(789);
				((GenericTypeParamsContext)_localctx).t = type();
				_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
				}
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(797);
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
		public List<TerminalNode> LBRACKET() { return getTokens(HybridRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(HybridRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(HybridRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(HybridRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(HybridRebecaCompleteParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(HybridRebecaCompleteParser.INTLITERAL, i);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitDimensions(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(804); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(800);
				match(LBRACKET);
				setState(801);
				((DimensionsContext)_localctx).i = match(INTLITERAL);
				setState(802);
				match(RBRACKET);
				_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
				}
				}
				setState(806); 
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			((ExpressionContext)_localctx).e1 = conditionalExpression();
			((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).e1.e;
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(810);
				((ExpressionContext)_localctx).ao = assignmentOperator();
				setState(811);
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
		public TerminalNode EQ() { return getToken(HybridRebecaCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(HybridRebecaCompleteParser.PLUSEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(HybridRebecaCompleteParser.SUBEQ, 0); }
		public TerminalNode STAREQ() { return getToken(HybridRebecaCompleteParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(HybridRebecaCompleteParser.SLASHEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(HybridRebecaCompleteParser.AMPEQ, 0); }
		public TerminalNode BAREQ() { return getToken(HybridRebecaCompleteParser.BAREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(HybridRebecaCompleteParser.CARETEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(HybridRebecaCompleteParser.TILDAEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(HybridRebecaCompleteParser.PERCENTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(HybridRebecaCompleteParser.LTLTEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(HybridRebecaCompleteParser.GTGTEQ, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignmentOperator);
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(822);
				((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(824);
				((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(826);
				((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(828);
				((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(830);
				((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(832);
				((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(834);
				((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(836);
				((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(838);
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
		public TerminalNode QUES() { return getToken(HybridRebecaCompleteParser.QUES, 0); }
		public TerminalNode COLON() { return getToken(HybridRebecaCompleteParser.COLON, 0); }
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			((ConditionalExpressionContext)_localctx).e1 = conditionalOrExpression();
			((ConditionalExpressionContext)_localctx).e =  ((ConditionalExpressionContext)_localctx).e1.e;
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(844);
				match(QUES);
				setState(845);
				((ConditionalExpressionContext)_localctx).e2 = expression();
				setState(846);
				match(COLON);
				setState(847);
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
		public List<TerminalNode> BARBAR() { return getTokens(HybridRebecaCompleteParser.BARBAR); }
		public TerminalNode BARBAR(int i) {
			return getToken(HybridRebecaCompleteParser.BARBAR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_conditionalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			((ConditionalOrExpressionContext)_localctx).e1 = conditionalAndExpression();
			((ConditionalOrExpressionContext)_localctx).e =  ((ConditionalOrExpressionContext)_localctx).e1.e;
			setState(860);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(854);
					((ConditionalOrExpressionContext)_localctx).BARBAR = match(BARBAR);
					setState(855);
					((ConditionalOrExpressionContext)_localctx).e2 = conditionalAndExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalOrExpressionContext)_localctx).BARBAR!=null?((ConditionalOrExpressionContext)_localctx).BARBAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		public List<TerminalNode> AMPAMP() { return getTokens(HybridRebecaCompleteParser.AMPAMP); }
		public TerminalNode AMPAMP(int i) {
			return getToken(HybridRebecaCompleteParser.AMPAMP, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_conditionalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			((ConditionalAndExpressionContext)_localctx).e1 = inclusiveOrExpression();
			((ConditionalAndExpressionContext)_localctx).e =  ((ConditionalAndExpressionContext)_localctx).e1.e;
			setState(871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(865);
					((ConditionalAndExpressionContext)_localctx).AMPAMP = match(AMPAMP);
					setState(866);
					((ConditionalAndExpressionContext)_localctx).e2 = inclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalAndExpressionContext)_localctx).AMPAMP!=null?((ConditionalAndExpressionContext)_localctx).AMPAMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalAndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalAndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
		public List<TerminalNode> BAR() { return getTokens(HybridRebecaCompleteParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(HybridRebecaCompleteParser.BAR, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			((InclusiveOrExpressionContext)_localctx).e1 = exclusiveOrExpression();
			((InclusiveOrExpressionContext)_localctx).e =  ((InclusiveOrExpressionContext)_localctx).e1.e;
			setState(882);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(876);
					((InclusiveOrExpressionContext)_localctx).BAR = match(BAR);
					setState(877);
					((InclusiveOrExpressionContext)_localctx).e2 = exclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((InclusiveOrExpressionContext)_localctx).BAR!=null?((InclusiveOrExpressionContext)_localctx).BAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((InclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((InclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		public List<TerminalNode> CARET() { return getTokens(HybridRebecaCompleteParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(HybridRebecaCompleteParser.CARET, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_exclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			((ExclusiveOrExpressionContext)_localctx).e1 = andExpression();
			((ExclusiveOrExpressionContext)_localctx).e =  ((ExclusiveOrExpressionContext)_localctx).e1.e;
			setState(893);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(887);
					((ExclusiveOrExpressionContext)_localctx).CARET = match(CARET);
					setState(888);
					((ExclusiveOrExpressionContext)_localctx).e2 = andExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ExclusiveOrExpressionContext)_localctx).CARET!=null?((ExclusiveOrExpressionContext)_localctx).CARET.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ExclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ExclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(895);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		public List<TerminalNode> AMP() { return getTokens(HybridRebecaCompleteParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(HybridRebecaCompleteParser.AMP, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			((AndExpressionContext)_localctx).e1 = equalityExpression();
			((AndExpressionContext)_localctx).e =  ((AndExpressionContext)_localctx).e1.e;
			setState(904);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(898);
					((AndExpressionContext)_localctx).AMP = match(AMP);
					setState(899);
					((AndExpressionContext)_localctx).e2 = equalityExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((AndExpressionContext)_localctx).AMP!=null?((AndExpressionContext)_localctx).AMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((AndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((AndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(906);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		public TerminalNode EQEQ() { return getToken(HybridRebecaCompleteParser.EQEQ, 0); }
		public TerminalNode BANGEQ() { return getToken(HybridRebecaCompleteParser.BANGEQ, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_equalityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			((EqualityExpressionContext)_localctx).e1 = instanceOfExpression();
			((EqualityExpressionContext)_localctx).e =  ((EqualityExpressionContext)_localctx).e1.e;
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				((EqualityExpressionContext)_localctx).e =  new BinaryExpression(); ((BinaryExpression)_localctx.e).setLeft(((EqualityExpressionContext)_localctx).e1.e); _localctx.e.setLineNumber(((EqualityExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((EqualityExpressionContext)_localctx).e1.e.getCharacter());
				setState(914);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQEQ:
					{
					setState(910);
					((EqualityExpressionContext)_localctx).EQEQ = match(EQEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).EQEQ!=null?((EqualityExpressionContext)_localctx).EQEQ.getText():null));
					}
					break;
				case BANGEQ:
					{
					setState(912);
					((EqualityExpressionContext)_localctx).BANGEQ = match(BANGEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).BANGEQ!=null?((EqualityExpressionContext)_localctx).BANGEQ.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(916);
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
		public TerminalNode INSTANCEOF() { return getToken(HybridRebecaCompleteParser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitInstanceOfExpression(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_instanceOfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			((InstanceOfExpressionContext)_localctx).e1 = relationalExpression();
			((InstanceOfExpressionContext)_localctx).e =  ((InstanceOfExpressionContext)_localctx).e1.e;
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(923);
				match(INSTANCEOF);
				setState(924);
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			((RelationalExpressionContext)_localctx).e1 = shiftExpression();
			((RelationalExpressionContext)_localctx).e =  ((RelationalExpressionContext)_localctx).e1.e;
			setState(937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(931);
					((RelationalExpressionContext)_localctx).ro = relationalOp();
					setState(932);
					((RelationalExpressionContext)_localctx).e2 = shiftExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((RelationalExpressionContext)_localctx).ro.ro); e3.setLeft(_localctx.e); e3.setRight(((RelationalExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((RelationalExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(939);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public String ro;
		public Token LT;
		public Token EQ;
		public Token GT;
		public TerminalNode LT() { return getToken(HybridRebecaCompleteParser.LT, 0); }
		public TerminalNode EQ() { return getToken(HybridRebecaCompleteParser.EQ, 0); }
		public TerminalNode GT() { return getToken(HybridRebecaCompleteParser.GT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitRelationalOp(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_relationalOp);
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				((RelationalOpContext)_localctx).LT = match(LT);
				setState(941);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				((RelationalOpContext)_localctx).GT = match(GT);
				setState(944);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(946);
				((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(948);
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			((ShiftExpressionContext)_localctx).e1 = additiveExpression();
			((ShiftExpressionContext)_localctx).e =  ((ShiftExpressionContext)_localctx).e1.e;
			setState(960);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(954);
					((ShiftExpressionContext)_localctx).so = shiftOp();
					setState(955);
					((ShiftExpressionContext)_localctx).e2 = additiveExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((ShiftExpressionContext)_localctx).so.so); e3.setLeft(_localctx.e); e3.setRight(((ShiftExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter()); ((ShiftExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(962);
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

	public static class ShiftOpContext extends ParserRuleContext {
		public String so;
		public List<TerminalNode> LT() { return getTokens(HybridRebecaCompleteParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(HybridRebecaCompleteParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(HybridRebecaCompleteParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(HybridRebecaCompleteParser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitShiftOp(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_shiftOp);
		try {
			setState(969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				match(LT);
				setState(964);
				match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				match(GT);
				setState(967);
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
		public List<TerminalNode> PLUS() { return getTokens(HybridRebecaCompleteParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HybridRebecaCompleteParser.PLUS, i);
		}
		public List<TerminalNode> SUB() { return getTokens(HybridRebecaCompleteParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(HybridRebecaCompleteParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			((AdditiveExpressionContext)_localctx).e1 = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).e =  ((AdditiveExpressionContext)_localctx).e1.e;
			setState(985);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(978);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(974);
						((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
						e3.setOperator((((AdditiveExpressionContext)_localctx).PLUS!=null?((AdditiveExpressionContext)_localctx).PLUS.getText():null));
						}
						break;
					case SUB:
						{
						setState(976);
						((AdditiveExpressionContext)_localctx).SUB = match(SUB);
						e3.setOperator((((AdditiveExpressionContext)_localctx).SUB!=null?((AdditiveExpressionContext)_localctx).SUB.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(980);
					((AdditiveExpressionContext)_localctx).e2 = multiplicativeExpression();
					e3.setRight(((AdditiveExpressionContext)_localctx).e2.e); ((AdditiveExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(987);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
		public List<TerminalNode> STAR() { return getTokens(HybridRebecaCompleteParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(HybridRebecaCompleteParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(HybridRebecaCompleteParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(HybridRebecaCompleteParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(HybridRebecaCompleteParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(HybridRebecaCompleteParser.PERCENT, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			((MultiplicativeExpressionContext)_localctx).e1 = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).e =  ((MultiplicativeExpressionContext)_localctx).e1.e;
			setState(1004);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(997);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(991);
						((MultiplicativeExpressionContext)_localctx).STAR = match(STAR);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).STAR!=null?((MultiplicativeExpressionContext)_localctx).STAR.getText():null));
						}
						break;
					case SLASH:
						{
						setState(993);
						((MultiplicativeExpressionContext)_localctx).SLASH = match(SLASH);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).SLASH!=null?((MultiplicativeExpressionContext)_localctx).SLASH.getText():null));
						}
						break;
					case PERCENT:
						{
						setState(995);
						((MultiplicativeExpressionContext)_localctx).PERCENT = match(PERCENT);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).PERCENT!=null?((MultiplicativeExpressionContext)_localctx).PERCENT.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(999);
					((MultiplicativeExpressionContext)_localctx).e2 = unaryExpression();
					e3.setRight(((MultiplicativeExpressionContext)_localctx).e2.e); ((MultiplicativeExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(1006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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
		public TerminalNode PLUS() { return getToken(HybridRebecaCompleteParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(HybridRebecaCompleteParser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(HybridRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(HybridRebecaCompleteParser.SUBSUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_unaryExpression);
		try {
			setState(1026);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				match(PLUS);
				setState(1008);
				((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(1012);
				((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1015);
				((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(1016);
				((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1019);
				((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(1020);
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
				setState(1023);
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
		public TerminalNode TILDA() { return getToken(HybridRebecaCompleteParser.TILDA, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(HybridRebecaCompleteParser.BANG, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(HybridRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HybridRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HybridRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode QUES() { return getToken(HybridRebecaCompleteParser.QUES, 0); }
		public TerminalNode NEW() { return getToken(HybridRebecaCompleteParser.NEW, 0); }
		public TerminalNode COLON() { return getToken(HybridRebecaCompleteParser.COLON, 0); }
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
		public List<TerminalNode> DOT() { return getTokens(HybridRebecaCompleteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HybridRebecaCompleteParser.DOT, i);
		}
		public TerminalNode PLUSPLUS() { return getToken(HybridRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(HybridRebecaCompleteParser.SUBSUB, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			int _alt;
			setState(1092);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TILDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028);
				((UnaryExpressionNotPlusMinusContext)_localctx).TILDA = match(TILDA);
				setState(1029);
				((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionNotPlusMinusContext)_localctx).TILDA!=null?((UnaryExpressionNotPlusMinusContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e); _localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(1032);
				((UnaryExpressionNotPlusMinusContext)_localctx).BANG = match(BANG);
				setState(1033);
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
				setState(1075);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(1036);
					((UnaryExpressionNotPlusMinusContext)_localctx).ec = castExpression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ec.e;
					}
					break;
				case 2:
					{
					setState(1039);
					match(LPAREN);
					setState(1040);
					((UnaryExpressionNotPlusMinusContext)_localctx).ep = expression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ep.e;
					setState(1042);
					match(RPAREN);
					}
					break;
				case 3:
					{
					setState(1044);
					((UnaryExpressionNotPlusMinusContext)_localctx).p = primary();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).p.tp;
					}
					break;
				case 4:
					{
					setState(1047);
					((UnaryExpressionNotPlusMinusContext)_localctx).l = literal();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).l.l;
					}
					break;
				case 5:
					{
					setState(1050);
					((UnaryExpressionNotPlusMinusContext)_localctx).QUES = match(QUES);
					setState(1051);
					match(LPAREN);
					setState(1052);
					((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
					setState(1053);
					match(RPAREN);
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						    	_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getCharPositionInLine());
					}
					break;
				case 6:
					{
					setState(1056);
					match(NEW);
					setState(1057);
					((UnaryExpressionNotPlusMinusContext)_localctx).t = type();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new RebecInstantiationPrimary();
									_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((UnaryExpressionNotPlusMinusContext)_localctx).t.t);
					setState(1059);
					match(LPAREN);
					setState(1063);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
						{
						setState(1060);
						((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(1065);
					match(RPAREN);
					setState(1066);
					match(COLON);
					setState(1067);
					match(LPAREN);
					setState(1071);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (QUES - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
						{
						setState(1068);
						((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(1073);
					match(RPAREN);
					}
					break;
				}
				setState(1083);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1077);
						((UnaryExpressionNotPlusMinusContext)_localctx).DOT = match(DOT);
						setState(1078);
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
					setState(1085);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				setState(1090);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(1086);
					((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS = match(PLUSPLUS);
					PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((UnaryExpressionNotPlusMinusContext)_localctx).e = pse;
					        		pse.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getCharPositionInLine());
					}
					break;
				case 2:
					{
					setState(1088);
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
		public TerminalNode LPAREN() { return getToken(HybridRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HybridRebecaCompleteParser.RPAREN, 0); }
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(LPAREN);
			setState(1095);
			((CastExpressionContext)_localctx).t = type();
			setState(1096);
			match(RPAREN);
			setState(1097);
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
		public List<TerminalNode> COMMA() { return getTokens(HybridRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HybridRebecaCompleteParser.COMMA, i);
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
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>(); LinkedList<Annotation> ans = new LinkedList<Annotation>();
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(1101);
				((ExpressionListContext)_localctx).a = annotation();
				ans.add(((ExpressionListContext)_localctx).a.an);
				}
				}
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1109);
			((ExpressionListContext)_localctx).e = expression();
			((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1111);
				match(COMMA);
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(1112);
					((ExpressionListContext)_localctx).a = annotation();
					ans.add(((ExpressionListContext)_localctx).a.an);
					}
					}
					setState(1119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1120);
				((ExpressionListContext)_localctx).e = expression();
				((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(1127);
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
		public TerminalNode INTLITERAL() { return getToken(HybridRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(HybridRebecaCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(HybridRebecaCompleteParser.DOUBLELITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(HybridRebecaCompleteParser.CHARLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(HybridRebecaCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(HybridRebecaCompleteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HybridRebecaCompleteParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(HybridRebecaCompleteParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HybridRebecaCompleteListener ) ((HybridRebecaCompleteListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_literal);
		try {
			setState(1144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(CoreRebecaTypeSystem.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1132);
				((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1134);
				((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1136);
				((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(CoreRebecaTypeSystem.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1138);
				((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1140);
				((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1142);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3c\u047d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\7\2s\n\2\f\2\16\2v\13"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u0082\n\2\f\2\16\2\u0085"+
		"\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\u0090\n\2\r\2\16\2\u0091"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u009b\n\3\f\3\16\3\u009e\13\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00ae\n\3\f\3\16"+
		"\3\u00b1\13\3\3\3\5\3\u00b4\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00bc\n\3"+
		"\f\3\16\3\u00bf\13\3\3\3\5\3\u00c2\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3\u00d0\n\3\f\3\16\3\u00d3\13\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f6\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u00ff\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0107\n\5\5\5"+
		"\u0109\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u0110\n\5\f\5\16\5\u0113\13\5\3\5\3"+
		"\5\7\5\u0117\n\5\f\5\16\5\u011a\13\5\3\6\3\6\3\6\3\6\5\6\u0120\n\6\3\6"+
		"\3\6\3\6\7\6\u0125\n\6\f\6\16\6\u0128\13\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u013a\n\n\f\n\16\n\u013d\13\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0146\n\13\f\13\16\13\u0149\13\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0152\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u015a\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0163\n"+
		"\f\f\f\16\f\u0166\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u0173\n\r\f\r\16\r\u0176\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u017f\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0187\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u0191\n\20\f\20\16\20\u0194\13\20\5"+
		"\20\u0196\n\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u019e\n\21\f\21\16\21"+
		"\u01a1\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01ac\n"+
		"\21\f\21\16\21\u01af\13\21\5\21\u01b1\n\21\3\21\3\21\3\21\3\21\3\21\7"+
		"\21\u01b8\n\21\f\21\16\21\u01bb\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\7\21\u01c4\n\21\f\21\16\21\u01c7\13\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\7\22\u01d0\n\22\f\22\16\22\u01d3\13\22\3\22\3\22\5\22\u01d7\n"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01df\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u01e7\n\22\f\22\16\22\u01ea\13\22\5\22\u01ec\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01f9\n\22\f\22"+
		"\16\22\u01fc\13\22\3\22\5\22\u01ff\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u0207\n\22\f\22\16\22\u020a\13\22\3\22\5\22\u020d\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0218\n\22\f\22\16\22\u021b\13"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0228"+
		"\n\23\3\24\3\24\3\24\3\24\7\24\u022e\n\24\f\24\16\24\u0231\13\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\7\25\u0239\n\25\f\25\16\25\u023c\13\25\3\25"+
		"\3\25\5\25\u0240\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0249\n"+
		"\26\f\26\16\26\u024c\13\26\3\26\3\26\5\26\u0250\n\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\5\27\u025b\n\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u0266\n\30\f\30\16\30\u0269\13\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0276\n\32\f\32\16"+
		"\32\u0279\13\32\3\32\3\32\3\32\7\32\u027e\n\32\f\32\16\32\u0281\13\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u029c\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u02ac\n\33\3\33\3\33\3\33\3\33\5\33\u02b2\n\33\3\33\3\33\3\33\3"+
		"\33\5\33\u02b8\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u02c9\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u02d5\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u02dd\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02e7\n\35\3"+
		"\35\3\35\3\35\3\35\7\35\u02ed\n\35\f\35\16\35\u02f0\13\35\7\35\u02f2\n"+
		"\35\f\35\16\35\u02f5\13\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0302\n\37\3\37\5\37\u0305\n\37\3 \3 \3 \3 \3 \5 \u030c"+
		"\n \3 \3 \3 \5 \u0311\n \3!\3!\3!\3!\3!\3!\3!\3!\7!\u031b\n!\f!\16!\u031e"+
		"\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\6\"\u0327\n\"\r\"\16\"\u0328\3#\3#\3#\3"+
		"#\3#\3#\5#\u0331\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u034b\n$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0355\n"+
		"%\3&\3&\3&\3&\3&\3&\7&\u035d\n&\f&\16&\u0360\13&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\7\'\u0368\n\'\f\'\16\'\u036b\13\'\3(\3(\3(\3(\3(\3(\7(\u0373\n(\f("+
		"\16(\u0376\13(\3)\3)\3)\3)\3)\3)\7)\u037e\n)\f)\16)\u0381\13)\3*\3*\3"+
		"*\3*\3*\3*\7*\u0389\n*\f*\16*\u038c\13*\3+\3+\3+\3+\3+\3+\3+\5+\u0395"+
		"\n+\3+\3+\3+\5+\u039a\n+\3,\3,\3,\3,\3,\3,\5,\u03a2\n,\3-\3-\3-\3-\3-"+
		"\3-\7-\u03aa\n-\f-\16-\u03ad\13-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u03b9"+
		"\n.\3/\3/\3/\3/\3/\3/\7/\u03c1\n/\f/\16/\u03c4\13/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u03cc\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u03d5"+
		"\n\61\3\61\3\61\3\61\7\61\u03da\n\61\f\61\16\61\u03dd\13\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03e8\n\62\3\62\3\62\3\62\7\62"+
		"\u03ed\n\62\f\62\16\62\u03f0\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0405"+
		"\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u042a\n\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u0432\n\64\3\64\3\64\5\64\u0436\n\64\3\64\3\64\3"+
		"\64\3\64\7\64\u043c\n\64\f\64\16\64\u043f\13\64\3\64\3\64\3\64\3\64\5"+
		"\64\u0445\n\64\5\64\u0447\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\7\66\u0453\n\66\f\66\16\66\u0456\13\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\7\66\u045e\n\66\f\66\16\66\u0461\13\66\3\66\3\66\3\66\7\66"+
		"\u0466\n\66\f\66\16\66\u0469\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u047b\n\67\3\67\2\2"+
		"8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjl\2\2\2\u04d5\2n\3\2\2\2\4\u0096\3\2\2\2\6\u00d7\3"+
		"\2\2\2\b\u00ee\3\2\2\2\n\u011b\3\2\2\2\f\u012c\3\2\2\2\16\u012e\3\2\2"+
		"\2\20\u0130\3\2\2\2\22\u0132\3\2\2\2\24\u0141\3\2\2\2\26\u015e\3\2\2\2"+
		"\30\u016b\3\2\2\2\32\u0177\3\2\2\2\34\u0186\3\2\2\2\36\u0188\3\2\2\2 "+
		"\u0199\3\2\2\2\"\u01cb\3\2\2\2$\u021f\3\2\2\2&\u0229\3\2\2\2(\u0234\3"+
		"\2\2\2*\u0244\3\2\2\2,\u0255\3\2\2\2.\u025e\3\2\2\2\60\u026a\3\2\2\2\62"+
		"\u026e\3\2\2\2\64\u02d4\3\2\2\2\66\u02dc\3\2\2\28\u02de\3\2\2\2:\u02f6"+
		"\3\2\2\2<\u02f9\3\2\2\2>\u0306\3\2\2\2@\u0312\3\2\2\2B\u0321\3\2\2\2D"+
		"\u032a\3\2\2\2F\u034a\3\2\2\2H\u034c\3\2\2\2J\u0356\3\2\2\2L\u0361\3\2"+
		"\2\2N\u036c\3\2\2\2P\u0377\3\2\2\2R\u0382\3\2\2\2T\u038d\3\2\2\2V\u039b"+
		"\3\2\2\2X\u03a3\3\2\2\2Z\u03b8\3\2\2\2\\\u03ba\3\2\2\2^\u03cb\3\2\2\2"+
		"`\u03cd\3\2\2\2b\u03de\3\2\2\2d\u0404\3\2\2\2f\u0446\3\2\2\2h\u0448\3"+
		"\2\2\2j\u044e\3\2\2\2l\u047a\3\2\2\2nt\b\2\1\2op\5\20\t\2pq\b\2\1\2qs"+
		"\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\u0083\3\2\2\2vt\3\2"+
		"\2\2wx\7&\2\2xy\5\26\f\2yz\7<\2\2z{\b\2\1\2{\u0082\3\2\2\2|}\7\'\2\2}"+
		"~\5\26\f\2~\177\7<\2\2\177\u0080\b\2\1\2\u0080\u0082\3\2\2\2\u0081w\3"+
		"\2\2\2\u0081|\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u008f\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5\"\22\2"+
		"\u0087\u0088\b\2\1\2\u0088\u0090\3\2\2\2\u0089\u008a\5 \21\2\u008a\u008b"+
		"\b\2\1\2\u008b\u0090\3\2\2\2\u008c\u008d\5\4\3\2\u008d\u008e\b\2\1\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008c\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\5\22\n\2\u0094\u0095\b\2\1\2\u0095\3\3\2\2"+
		"\2\u0096\u009c\b\3\1\2\u0097\u0098\5<\37\2\u0098\u0099\b\3\1\2\u0099\u009b"+
		"\3\2\2\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\4"+
		"\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\b\3\1\2\u00a2\u00a3\7\66\2\2\u00a3"+
		"\u00a4\7\13\2\2\u00a4\u00a5\b\3\1\2\u00a5\u00a6\7\67\2\2\u00a6\u00b3\7"+
		"8\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00af\78\2\2\u00a9\u00aa\5\26\f\2\u00aa"+
		"\u00ab\b\3\1\2\u00ab\u00ac\7<\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a9\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\79\2\2\u00b3\u00a7\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00c1\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b6"+
		"\u00bd\78\2\2\u00b7\u00b8\5\26\f\2\u00b8\u00b9\b\3\1\2\u00b9\u00ba\7<"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c2\79\2\2\u00c1\u00b5\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00d1\3\2\2\2\u00c3\u00c4\5&\24\2\u00c4\u00c5\b\3\1\2\u00c5\u00d0\3\2"+
		"\2\2\u00c6\u00c7\5(\25\2\u00c7\u00c8\b\3\1\2\u00c8\u00d0\3\2\2\2\u00c9"+
		"\u00ca\5*\26\2\u00ca\u00cb\b\3\1\2\u00cb\u00d0\3\2\2\2\u00cc\u00cd\5\6"+
		"\4\2\u00cd\u00ce\b\3\1\2\u00ce\u00d0\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf"+
		"\u00c6\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d5\79\2\2\u00d5\u00d6\b\3\1\2\u00d6\5\3\2\2\2"+
		"\u00d7\u00d8\b\4\1\2\u00d8\u00d9\7\3\2\2\u00d9\u00da\7c\2\2\u00da\u00db"+
		"\b\4\1\2\u00db\u00dc\78\2\2\u00dc\u00dd\7\5\2\2\u00dd\u00de\7\66\2\2\u00de"+
		"\u00df\5D#\2\u00df\u00e0\b\4\1\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\67"+
		"\2\2\u00e2\u00e3\5\62\32\2\u00e3\u00e4\b\4\1\2\u00e4\u00e5\7\6\2\2\u00e5"+
		"\u00e6\7\66\2\2\u00e6\u00e7\5D#\2\u00e7\u00e8\b\4\1\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00ea\7\67\2\2\u00ea\u00eb\5\62\32\2\u00eb\u00ec\b\4\1\2\u00ec"+
		"\u00ed\79\2\2\u00ed\7\3\2\2\2\u00ee\u00ef\7c\2\2\u00ef\u0108\b\5\1\2\u00f0"+
		"\u00f1\7\66\2\2\u00f1\u00f5\b\5\1\2\u00f2\u00f3\5j\66\2\u00f3\u00f4\b"+
		"\5\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00fe\7\67\2\2\u00f8\u00f9\7\t\2\2\u00f9\u00fa\7"+
		"\66\2\2\u00fa\u00fb\5D#\2\u00fb\u00fc\7\67\2\2\u00fc\u00fd\b\5\1\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0106\3\2"+
		"\2\2\u0100\u0101\7\n\2\2\u0101\u0102\7\66\2\2\u0102\u0103\5D#\2\u0103"+
		"\u0104\7\67\2\2\u0104\u0105\b\5\1\2\u0105\u0107\3\2\2\2\u0106\u0100\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u00f0\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u0111\3\2\2\2\u010a\u010b\7:\2\2\u010b\u010c\5D#"+
		"\2\u010c\u010d\7;\2\2\u010d\u010e\b\5\1\2\u010e\u0110\3\2\2\2\u010f\u010a"+
		"\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0118\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\b\2\2\u0115\u0117\b\5"+
		"\1\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\t\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011f\b\6\1\2"+
		"\u011c\u011d\5\f\7\2\u011d\u011e\b\6\1\2\u011e\u0120\3\2\2\2\u011f\u011c"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0126\3\2\2\2\u0121\u0122\5\16\b\2"+
		"\u0122\u0123\b\6\1\2\u0123\u0125\3\2\2\2\u0124\u0121\3\2\2\2\u0125\u0128"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012a\5\2\2\2\u012a\u012b\b\6\1\2\u012b\13\3\2\2"+
		"\2\u012c\u012d\7\36\2\2\u012d\r\3\2\2\2\u012e\u012f\7\34\2\2\u012f\17"+
		"\3\2\2\2\u0130\u0131\7\"\2\2\u0131\21\3\2\2\2\u0132\u0133\b\n\1\2\u0133"+
		"\u0134\7/\2\2\u0134\u0135\b\n\1\2\u0135\u013b\78\2\2\u0136\u0137\5\24"+
		"\13\2\u0137\u0138\b\n\1\2\u0138\u013a\3\2\2\2\u0139\u0136\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013e\u013f\79\2\2\u013f\u0140\b\n\1\2\u0140"+
		"\23\3\2\2\2\u0141\u0147\b\13\1\2\u0142\u0143\5<\37\2\u0143\u0144\b\13"+
		"\1\2\u0144\u0146\3\2\2\2\u0145\u0142\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u014a\u014b\5> \2\u014b\u014c\7c\2\2\u014c\u014d\b\13\1\2\u014d\u0151"+
		"\7\66\2\2\u014e\u014f\5j\66\2\u014f\u0150\b\13\1\2\u0150\u0152\3\2\2\2"+
		"\u0151\u014e\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154"+
		"\7\67\2\2\u0154\u0155\7C\2\2\u0155\u0159\7\66\2\2\u0156\u0157\5j\66\2"+
		"\u0157\u0158\b\13\1\2\u0158\u015a\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\67\2\2\u015c\u015d\7<\2\2\u015d"+
		"\25\3\2\2\2\u015e\u0164\b\f\1\2\u015f\u0160\5<\37\2\u0160\u0161\b\f\1"+
		"\2\u0161\u0163\3\2\2\2\u0162\u015f\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u0168\5> \2\u0168\u0169\5\30\r\2\u0169\u016a\b\f\1\2\u016a\27\3\2\2\2"+
		"\u016b\u016c\b\r\1\2\u016c\u016d\5\32\16\2\u016d\u0174\b\r\1\2\u016e\u016f"+
		"\7=\2\2\u016f\u0170\5\32\16\2\u0170\u0171\b\r\1\2\u0171\u0173\3\2\2\2"+
		"\u0172\u016e\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\31\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\b\16\1\2\u0178"+
		"\u0179\7c\2\2\u0179\u017e\b\16\1\2\u017a\u017b\7?\2\2\u017b\u017c\5\34"+
		"\17\2\u017c\u017d\b\16\1\2\u017d\u017f\3\2\2\2\u017e\u017a\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\33\3\2\2\2\u0180\u0181\5\36\20\2\u0181\u0182\b\17"+
		"\1\2\u0182\u0187\3\2\2\2\u0183\u0184\5D#\2\u0184\u0185\b\17\1\2\u0185"+
		"\u0187\3\2\2\2\u0186\u0180\3\2\2\2\u0186\u0183\3\2\2\2\u0187\35\3\2\2"+
		"\2\u0188\u0189\b\20\1\2\u0189\u0195\78\2\2\u018a\u018b\5\34\17\2\u018b"+
		"\u0192\b\20\1\2\u018c\u018d\7=\2\2\u018d\u018e\5\34\17\2\u018e\u018f\b"+
		"\20\1\2\u018f\u0191\3\2\2\2\u0190\u018c\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0195\u018a\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\79\2\2\u0198\37\3\2\2\2\u0199\u019f\b\21\1\2\u019a\u019b\5<\37"+
		"\2\u019b\u019c\b\21\1\2\u019c\u019e\3\2\2\2\u019d\u019a\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2"+
		"\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7*\2\2\u01a3\u01a4\7c\2\2\u01a4\u01b0"+
		"\b\21\1\2\u01a5\u01a6\7,\2\2\u01a6\u01a7\7c\2\2\u01a7\u01ad\b\21\1\2\u01a8"+
		"\u01a9\7=\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ac\b\21\1\2\u01ab\u01a8\3\2"+
		"\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01a5\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01c5\78\2\2\u01b3\u01b9\b\21\1\2\u01b4"+
		"\u01b5\5<\37\2\u01b5\u01b6\b\21\1\2\u01b6\u01b8\3\2\2\2\u01b7\u01b4\3"+
		"\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7.\2\2\u01bd\u01be\7c\2"+
		"\2\u01be\u01bf\b\21\1\2\u01bf\u01c0\5,\27\2\u01c0\u01c1\b\21\1\2\u01c1"+
		"\u01c2\7<\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01b3\3\2\2\2\u01c4\u01c7\3\2"+
		"\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c8\u01c9\79\2\2\u01c9\u01ca\b\21\1\2\u01ca!\3\2\2\2"+
		"\u01cb\u01d1\b\22\1\2\u01cc\u01cd\5<\37\2\u01cd\u01ce\b\22\1\2\u01ce\u01d0"+
		"\3\2\2\2\u01cf\u01cc\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d6\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\7+"+
		"\2\2\u01d5\u01d7\b\22\1\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d9\7)\2\2\u01d9\u01da\7c\2\2\u01da\u01de\b\22"+
		"\1\2\u01db\u01dc\7,\2\2\u01dc\u01dd\7c\2\2\u01dd\u01df\b\22\1\2\u01de"+
		"\u01db\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01eb\3\2\2\2\u01e0\u01e1\7-"+
		"\2\2\u01e1\u01e2\7c\2\2\u01e2\u01e8\b\22\1\2\u01e3\u01e4\7=\2\2\u01e4"+
		"\u01e5\7c\2\2\u01e5\u01e7\b\22\1\2\u01e6\u01e3\3\2\2\2\u01e7\u01ea\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01eb\u01e0\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed\u01ee\7\66\2\2\u01ee\u01ef\7\13\2\2\u01ef\u01f0\b\22\1\2\u01f0"+
		"\u01f1\7\67\2\2\u01f1\u01fe\78\2\2\u01f2\u01f3\7\61\2\2\u01f3\u01fa\7"+
		"8\2\2\u01f4\u01f5\5\26\f\2\u01f5\u01f6\b\22\1\2\u01f6\u01f7\7<\2\2\u01f7"+
		"\u01f9\3\2\2\2\u01f8\u01f4\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd"+
		"\u01ff\79\2\2\u01fe\u01f2\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u020c\3\2"+
		"\2\2\u0200\u0201\7\60\2\2\u0201\u0208\78\2\2\u0202\u0203\5\26\f\2\u0203"+
		"\u0204\b\22\1\2\u0204\u0205\7<\2\2\u0205\u0207\3\2\2\2\u0206\u0202\3\2"+
		"\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020d\79\2\2\u020c\u0200\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u0219\3\2\2\2\u020e\u020f\5&\24\2\u020f"+
		"\u0210\b\22\1\2\u0210\u0218\3\2\2\2\u0211\u0212\5(\25\2\u0212\u0213\b"+
		"\22\1\2\u0213\u0218\3\2\2\2\u0214\u0215\5*\26\2\u0215\u0216\b\22\1\2\u0216"+
		"\u0218\3\2\2\2\u0217\u020e\3\2\2\2\u0217\u0211\3\2\2\2\u0217\u0214\3\2"+
		"\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\79\2\2\u021d\u021e\b\22"+
		"\1\2\u021e#\3\2\2\2\u021f\u0220\7c\2\2\u0220\u0221\b\23\1\2\u0221\u0222"+
		"\5,\27\2\u0222\u0227\b\23\1\2\u0223\u0224\5\62\32\2\u0224\u0225\b\23\1"+
		"\2\u0225\u0228\3\2\2\2\u0226\u0228\7<\2\2\u0227\u0223\3\2\2\2\u0227\u0226"+
		"\3\2\2\2\u0228%\3\2\2\2\u0229\u022f\b\24\1\2\u022a\u022b\5<\37\2\u022b"+
		"\u022c\b\24\1\2\u022c\u022e\3\2\2\2\u022d\u022a\3\2\2\2\u022e\u0231\3"+
		"\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0232\u0233\5$\23\2\u0233\'\3\2\2\2\u0234\u023a\b\25\1"+
		"\2\u0235\u0236\5<\37\2\u0236\u0237\b\25\1\2\u0237\u0239\3\2\2\2\u0238"+
		"\u0235\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023b\u023f\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\7+\2\2\u023e"+
		"\u0240\b\25\1\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3"+
		"\2\2\2\u0241\u0242\7.\2\2\u0242\u0243\5$\23\2\u0243)\3\2\2\2\u0244\u024a"+
		"\b\26\1\2\u0245\u0246\5<\37\2\u0246\u0247\b\26\1\2\u0247\u0249\3\2\2\2"+
		"\u0248\u0245\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b"+
		"\3\2\2\2\u024b\u024f\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024e\7+\2\2\u024e"+
		"\u0250\b\26\1\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3"+
		"\2\2\2\u0251\u0252\5> \2\u0252\u0253\b\26\1\2\u0253\u0254\5$\23\2\u0254"+
		"+\3\2\2\2\u0255\u0256\b\27\1\2\u0256\u025a\7\66\2\2\u0257\u0258\5.\30"+
		"\2\u0258\u0259\b\27\1\2\u0259\u025b\3\2\2\2\u025a\u0257\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\7\67\2\2\u025d-\3\2\2\2"+
		"\u025e\u025f\b\30\1\2\u025f\u0260\5\60\31\2\u0260\u0267\b\30\1\2\u0261"+
		"\u0262\7=\2\2\u0262\u0263\5\60\31\2\u0263\u0264\b\30\1\2\u0264\u0266\3"+
		"\2\2\2\u0265\u0261\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268/\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026b\5> \2\u026b"+
		"\u026c\7c\2\2\u026c\u026d\b\31\1\2\u026d\61\3\2\2\2\u026e\u026f\b\32\1"+
		"\2\u026f\u0270\78\2\2\u0270\u027f\b\32\1\2\u0271\u0277\b\32\1\2\u0272"+
		"\u0273\5<\37\2\u0273\u0274\b\32\1\2\u0274\u0276\3\2\2\2\u0275\u0272\3"+
		"\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u027a\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027b\5\64\33\2\u027b\u027c\b"+
		"\32\1\2\u027c\u027e\3\2\2\2\u027d\u0271\3\2\2\2\u027e\u0281\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u027f\3\2"+
		"\2\2\u0282\u0283\79\2\2\u0283\u0284\b\32\1\2\u0284\63\3\2\2\2\u0285\u0286"+
		"\5:\36\2\u0286\u0287\b\33\1\2\u0287\u0288\7<\2\2\u0288\u02d5\3\2\2\2\u0289"+
		"\u028a\5\26\f\2\u028a\u028b\b\33\1\2\u028b\u028c\7<\2\2\u028c\u02d5\3"+
		"\2\2\2\u028d\u028e\5\62\32\2\u028e\u028f\b\33\1\2\u028f\u02d5\3\2\2\2"+
		"\u0290\u0291\7\33\2\2\u0291\u0292\b\33\1\2\u0292\u0293\7\66\2\2\u0293"+
		"\u0294\5D#\2\u0294\u0295\7\67\2\2\u0295\u0296\5\64\33\2\u0296\u029b\b"+
		"\33\1\2\u0297\u0298\7\30\2\2\u0298\u0299\5\64\33\2\u0299\u029a\b\33\1"+
		"\2\u029a\u029c\3\2\2\2\u029b\u0297\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02d5"+
		"\3\2\2\2\u029d\u029e\7%\2\2\u029e\u029f\b\33\1\2\u029f\u02a0\7\66\2\2"+
		"\u02a0\u02a1\5D#\2\u02a1\u02a2\7\67\2\2\u02a2\u02a3\5\64\33\2\u02a3\u02a4"+
		"\b\33\1\2\u02a4\u02d5\3\2\2\2\u02a5\u02a6\7\31\2\2\u02a6\u02a7\b\33\1"+
		"\2\u02a7\u02ab\7\66\2\2\u02a8\u02a9\5\66\34\2\u02a9\u02aa\b\33\1\2\u02aa"+
		"\u02ac\3\2\2\2\u02ab\u02a8\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2"+
		"\2\2\u02ad\u02b1\7<\2\2\u02ae\u02af\5D#\2\u02af\u02b0\b\33\1\2\u02b0\u02b2"+
		"\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"\u02b7\7<\2\2\u02b4\u02b5\5j\66\2\u02b5\u02b6\b\33\1\2\u02b6\u02b8\3\2"+
		"\2\2\u02b7\u02b4\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"\u02ba\7\67\2\2\u02ba\u02bb\5\64\33\2\u02bb\u02bc\b\33\1\2\u02bc\u02d5"+
		"\3\2\2\2\u02bd\u02be\7$\2\2\u02be\u02bf\7\66\2\2\u02bf\u02c0\5D#\2\u02c0"+
		"\u02c1\7\67\2\2\u02c1\u02c2\78\2\2\u02c2\u02c3\58\35\2\u02c3\u02c4\79"+
		"\2\2\u02c4\u02c5\b\33\1\2\u02c5\u02d5\3\2\2\2\u02c6\u02c8\7#\2\2\u02c7"+
		"\u02c9\5D#\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2"+
		"\2\u02ca\u02cb\7<\2\2\u02cb\u02d5\b\33\1\2\u02cc\u02cd\7\23\2\2\u02cd"+
		"\u02ce\7<\2\2\u02ce\u02d5\b\33\1\2\u02cf\u02d0\7\26\2\2\u02d0\u02d1\7"+
		"<\2\2\u02d1\u02d5\b\33\1\2\u02d2\u02d3\7<\2\2\u02d3\u02d5\b\33\1\2\u02d4"+
		"\u0285\3\2\2\2\u02d4\u0289\3\2\2\2\u02d4\u028d\3\2\2\2\u02d4\u0290\3\2"+
		"\2\2\u02d4\u029d\3\2\2\2\u02d4\u02a5\3\2\2\2\u02d4\u02bd\3\2\2\2\u02d4"+
		"\u02c6\3\2\2\2\u02d4\u02cc\3\2\2\2\u02d4\u02cf\3\2\2\2\u02d4\u02d2\3\2"+
		"\2\2\u02d5\65\3\2\2\2\u02d6\u02d7\5\26\f\2\u02d7\u02d8\b\34\1\2\u02d8"+
		"\u02dd\3\2\2\2\u02d9\u02da\5j\66\2\u02da\u02db\b\34\1\2\u02db\u02dd\3"+
		"\2\2\2\u02dc\u02d6\3\2\2\2\u02dc\u02d9\3\2\2\2\u02dd\67\3\2\2\2\u02de"+
		"\u02f3\b\35\1\2\u02df\u02e6\b\35\1\2\u02e0\u02e1\7\24\2\2\u02e1\u02e2"+
		"\5D#\2\u02e2\u02e3\b\35\1\2\u02e3\u02e7\3\2\2\2\u02e4\u02e5\7\27\2\2\u02e5"+
		"\u02e7\b\35\1\2\u02e6\u02e0\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02e8\3"+
		"\2\2\2\u02e8\u02ee\7C\2\2\u02e9\u02ea\5\64\33\2\u02ea\u02eb\b\35\1\2\u02eb"+
		"\u02ed\3\2\2\2\u02ec\u02e9\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2"+
		"\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1"+
		"\u02df\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2"+
		"\2\2\u02f49\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f7\5D#\2\u02f7\u02f8"+
		"\b\36\1\2\u02f8;\3\2\2\2\u02f9\u02fa\b\37\1\2\u02fa\u02fb\7[\2\2\u02fb"+
		"\u02fc\7c\2\2\u02fc\u0304\b\37\1\2\u02fd\u0301\7\66\2\2\u02fe\u02ff\5"+
		"D#\2\u02ff\u0300\b\37\1\2\u0300\u0302\3\2\2\2\u0301\u02fe\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0305\7\67\2\2\u0304\u02fd\3"+
		"\2\2\2\u0304\u0305\3\2\2\2\u0305=\3\2\2\2\u0306\u0307\7c\2\2\u0307\u030b"+
		"\b \1\2\u0308\u0309\5@!\2\u0309\u030a\b \1\2\u030a\u030c\3\2\2\2\u030b"+
		"\u0308\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u0310\3\2\2\2\u030d\u030e\5B"+
		"\"\2\u030e\u030f\b \1\2\u030f\u0311\3\2\2\2\u0310\u030d\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311?\3\2\2\2\u0312\u0313\7^\2\2\u0313\u0314\b!\1\2\u0314"+
		"\u0315\5> \2\u0315\u031c\b!\1\2\u0316\u0317\7=\2\2\u0317\u0318\5> \2\u0318"+
		"\u0319\b!\1\2\u0319\u031b\3\2\2\2\u031a\u0316\3\2\2\2\u031b\u031e\3\2"+
		"\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e"+
		"\u031c\3\2\2\2\u031f\u0320\7]\2\2\u0320A\3\2\2\2\u0321\u0326\b\"\1\2\u0322"+
		"\u0323\7:\2\2\u0323\u0324\7\13\2\2\u0324\u0325\7;\2\2\u0325\u0327\b\""+
		"\1\2\u0326\u0322\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0326\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329C\3\2\2\2\u032a\u032b\5H%\2\u032b\u0330\b#\1\2\u032c"+
		"\u032d\5F$\2\u032d\u032e\5D#\2\u032e\u032f\b#\1\2\u032f\u0331\3\2\2\2"+
		"\u0330\u032c\3\2\2\2\u0330\u0331\3\2\2\2\u0331E\3\2\2\2\u0332\u0333\7"+
		"?\2\2\u0333\u034b\b$\1\2\u0334\u0335\7R\2\2\u0335\u034b\b$\1\2\u0336\u0337"+
		"\7S\2\2\u0337\u034b\b$\1\2\u0338\u0339\7T\2\2\u0339\u034b\b$\1\2\u033a"+
		"\u033b\7U\2\2\u033b\u034b\b$\1\2\u033c\u033d\7V\2\2\u033d\u034b\b$\1\2"+
		"\u033e\u033f\7W\2\2\u033f\u034b\b$\1\2\u0340\u0341\7X\2\2\u0341\u034b"+
		"\b$\1\2\u0342\u0343\7Y\2\2\u0343\u034b\b$\1\2\u0344\u0345\7Z\2\2\u0345"+
		"\u034b\b$\1\2\u0346\u0347\7`\2\2\u0347\u034b\b$\1\2\u0348\u0349\7b\2\2"+
		"\u0349\u034b\b$\1\2\u034a\u0332\3\2\2\2\u034a\u0334\3\2\2\2\u034a\u0336"+
		"\3\2\2\2\u034a\u0338\3\2\2\2\u034a\u033a\3\2\2\2\u034a\u033c\3\2\2\2\u034a"+
		"\u033e\3\2\2\2\u034a\u0340\3\2\2\2\u034a\u0342\3\2\2\2\u034a\u0344\3\2"+
		"\2\2\u034a\u0346\3\2\2\2\u034a\u0348\3\2\2\2\u034bG\3\2\2\2\u034c\u034d"+
		"\5J&\2\u034d\u0354\b%\1\2\u034e\u034f\7B\2\2\u034f\u0350\5D#\2\u0350\u0351"+
		"\7C\2\2\u0351\u0352\5H%\2\u0352\u0353\b%\1\2\u0353\u0355\3\2\2\2\u0354"+
		"\u034e\3\2\2\2\u0354\u0355\3\2\2\2\u0355I\3\2\2\2\u0356\u0357\5L\'\2\u0357"+
		"\u035e\b&\1\2\u0358\u0359\7F\2\2\u0359\u035a\5L\'\2\u035a\u035b\b&\1\2"+
		"\u035b\u035d\3\2\2\2\u035c\u0358\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c"+
		"\3\2\2\2\u035e\u035f\3\2\2\2\u035fK\3\2\2\2\u0360\u035e\3\2\2\2\u0361"+
		"\u0362\5N(\2\u0362\u0369\b\'\1\2\u0363\u0364\7E\2\2\u0364\u0365\5N(\2"+
		"\u0365\u0366\b\'\1\2\u0366\u0368\3\2\2\2\u0367\u0363\3\2\2\2\u0368\u036b"+
		"\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036aM\3\2\2\2\u036b"+
		"\u0369\3\2\2\2\u036c\u036d\5P)\2\u036d\u0374\b(\1\2\u036e\u036f\7O\2\2"+
		"\u036f\u0370\5P)\2\u0370\u0371\b(\1\2\u0371\u0373\3\2\2\2\u0372\u036e"+
		"\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375"+
		"O\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0378\5R*\2\u0378\u037f\b)\1\2\u0379"+
		"\u037a\7P\2\2\u037a\u037b\5R*\2\u037b\u037c\b)\1\2\u037c\u037e\3\2\2\2"+
		"\u037d\u0379\3\2\2\2\u037e\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380"+
		"\3\2\2\2\u0380Q\3\2\2\2\u0381\u037f\3\2\2\2\u0382\u0383\5T+\2\u0383\u038a"+
		"\b*\1\2\u0384\u0385\7N\2\2\u0385\u0386\5T+\2\u0386\u0387\b*\1\2\u0387"+
		"\u0389\3\2\2\2\u0388\u0384\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2"+
		"\2\2\u038a\u038b\3\2\2\2\u038bS\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u038e"+
		"\5V,\2\u038e\u0399\b+\1\2\u038f\u0394\b+\1\2\u0390\u0391\7D\2\2\u0391"+
		"\u0395\b+\1\2\u0392\u0393\7\\\2\2\u0393\u0395\b+\1\2\u0394\u0390\3\2\2"+
		"\2\u0394\u0392\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\5V,\2\u0397\u0398"+
		"\b+\1\2\u0398\u039a\3\2\2\2\u0399\u038f\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"U\3\2\2\2\u039b\u039c\5X-\2\u039c\u03a1\b,\1\2\u039d\u039e\7(\2\2\u039e"+
		"\u039f\5> \2\u039f\u03a0\b,\1\2\u03a0\u03a2\3\2\2\2\u03a1\u039d\3\2\2"+
		"\2\u03a1\u03a2\3\2\2\2\u03a2W\3\2\2\2\u03a3\u03a4\5\\/\2\u03a4\u03ab\b"+
		"-\1\2\u03a5\u03a6\5Z.\2\u03a6\u03a7\5\\/\2\u03a7\u03a8\b-\1\2\u03a8\u03aa"+
		"\3\2\2\2\u03a9\u03a5\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab"+
		"\u03ac\3\2\2\2\u03acY\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03af\7^\2\2\u03af"+
		"\u03b0\7?\2\2\u03b0\u03b9\b.\1\2\u03b1\u03b2\7]\2\2\u03b2\u03b3\7?\2\2"+
		"\u03b3\u03b9\b.\1\2\u03b4\u03b5\7^\2\2\u03b5\u03b9\b.\1\2\u03b6\u03b7"+
		"\7]\2\2\u03b7\u03b9\b.\1\2\u03b8\u03ae\3\2\2\2\u03b8\u03b1\3\2\2\2\u03b8"+
		"\u03b4\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9[\3\2\2\2\u03ba\u03bb\5`\61\2"+
		"\u03bb\u03c2\b/\1\2\u03bc\u03bd\5^\60\2\u03bd\u03be\5`\61\2\u03be\u03bf"+
		"\b/\1\2\u03bf\u03c1\3\2\2\2\u03c0\u03bc\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2"+
		"\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3]\3\2\2\2\u03c4\u03c2\3\2\2\2"+
		"\u03c5\u03c6\7^\2\2\u03c6\u03c7\7^\2\2\u03c7\u03cc\b\60\1\2\u03c8\u03c9"+
		"\7]\2\2\u03c9\u03ca\7]\2\2\u03ca\u03cc\b\60\1\2\u03cb\u03c5\3\2\2\2\u03cb"+
		"\u03c8\3\2\2\2\u03cc_\3\2\2\2\u03cd\u03ce\5b\62\2\u03ce\u03db\b\61\1\2"+
		"\u03cf\u03d4\b\61\1\2\u03d0\u03d1\7J\2\2\u03d1\u03d5\b\61\1\2\u03d2\u03d3"+
		"\7K\2\2\u03d3\u03d5\b\61\1\2\u03d4\u03d0\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5"+
		"\u03d6\3\2\2\2\u03d6\u03d7\5b\62\2\u03d7\u03d8\b\61\1\2\u03d8\u03da\3"+
		"\2\2\2\u03d9\u03cf\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dca\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03df\5d\63\2"+
		"\u03df\u03ee\b\62\1\2\u03e0\u03e7\b\62\1\2\u03e1\u03e2\7L\2\2\u03e2\u03e8"+
		"\b\62\1\2\u03e3\u03e4\7M\2\2\u03e4\u03e8\b\62\1\2\u03e5\u03e6\7Q\2\2\u03e6"+
		"\u03e8\b\62\1\2\u03e7\u03e1\3\2\2\2\u03e7\u03e3\3\2\2\2\u03e7\u03e5\3"+
		"\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\5d\63\2\u03ea\u03eb\b\62\1\2\u03eb"+
		"\u03ed\3\2\2\2\u03ec\u03e0\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2"+
		"\2\2\u03ee\u03ef\3\2\2\2\u03efc\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f2"+
		"\7J\2\2\u03f2\u03f3\5d\63\2\u03f3\u03f4\b\63\1\2\u03f4\u0405\3\2\2\2\u03f5"+
		"\u03f6\7K\2\2\u03f6\u03f7\5d\63\2\u03f7\u03f8\b\63\1\2\u03f8\u0405\3\2"+
		"\2\2\u03f9\u03fa\7G\2\2\u03fa\u03fb\5d\63\2\u03fb\u03fc\b\63\1\2\u03fc"+
		"\u0405\3\2\2\2\u03fd\u03fe\7H\2\2\u03fe\u03ff\5d\63\2\u03ff\u0400\b\63"+
		"\1\2\u0400\u0405\3\2\2\2\u0401\u0402\5f\64\2\u0402\u0403\b\63\1\2\u0403"+
		"\u0405\3\2\2\2\u0404\u03f1\3\2\2\2\u0404\u03f5\3\2\2\2\u0404\u03f9\3\2"+
		"\2\2\u0404\u03fd\3\2\2\2\u0404\u0401\3\2\2\2\u0405e\3\2\2\2\u0406\u0407"+
		"\7A\2\2\u0407\u0408\5d\63\2\u0408\u0409\b\64\1\2\u0409\u0447\3\2\2\2\u040a"+
		"\u040b\7@\2\2\u040b\u040c\5d\63\2\u040c\u040d\b\64\1\2\u040d\u0447\3\2"+
		"\2\2\u040e\u040f\5h\65\2\u040f\u0410\b\64\1\2\u0410\u0436\3\2\2\2\u0411"+
		"\u0412\7\66\2\2\u0412\u0413\5D#\2\u0413\u0414\b\64\1\2\u0414\u0415\7\67"+
		"\2\2\u0415\u0436\3\2\2\2\u0416\u0417\5\b\5\2\u0417\u0418\b\64\1\2\u0418"+
		"\u0436\3\2\2\2\u0419\u041a\5l\67\2\u041a\u041b\b\64\1\2\u041b\u0436\3"+
		"\2\2\2\u041c\u041d\7B\2\2\u041d\u041e\7\66\2\2\u041e\u041f\5j\66\2\u041f"+
		"\u0420\7\67\2\2\u0420\u0421\b\64\1\2\u0421\u0436\3\2\2\2\u0422\u0423\7"+
		"\35\2\2\u0423\u0424\5> \2\u0424\u0425\b\64\1\2\u0425\u0429\7\66\2\2\u0426"+
		"\u0427\5j\66\2\u0427\u0428\b\64\1\2\u0428\u042a\3\2\2\2\u0429\u0426\3"+
		"\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\7\67\2\2\u042c"+
		"\u042d\7C\2\2\u042d\u0431\7\66\2\2\u042e\u042f\5j\66\2\u042f\u0430\b\64"+
		"\1\2\u0430\u0432\3\2\2\2\u0431\u042e\3\2\2\2\u0431\u0432\3\2\2\2\u0432"+
		"\u0433\3\2\2\2\u0433\u0434\7\67\2\2\u0434\u0436\3\2\2\2\u0435\u040e\3"+
		"\2\2\2\u0435\u0411\3\2\2\2\u0435\u0416\3\2\2\2\u0435\u0419\3\2\2\2\u0435"+
		"\u041c\3\2\2\2\u0435\u0422\3\2\2\2\u0436\u043d\3\2\2\2\u0437\u0438\7>"+
		"\2\2\u0438\u0439\5\b\5\2\u0439\u043a\b\64\1\2\u043a\u043c\3\2\2\2\u043b"+
		"\u0437\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2"+
		"\2\2\u043e\u0444\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0441\7G\2\2\u0441"+
		"\u0445\b\64\1\2\u0442\u0443\7H\2\2\u0443\u0445\b\64\1\2\u0444\u0440\3"+
		"\2\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0447\3\2\2\2\u0446"+
		"\u0406\3\2\2\2\u0446\u040a\3\2\2\2\u0446\u0435\3\2\2\2\u0447g\3\2\2\2"+
		"\u0448\u0449\7\66\2\2\u0449\u044a\5> \2\u044a\u044b\7\67\2\2\u044b\u044c"+
		"\5D#\2\u044c\u044d\b\65\1\2\u044di\3\2\2\2\u044e\u0454\b\66\1\2\u044f"+
		"\u0450\5<\37\2\u0450\u0451\b\66\1\2\u0451\u0453\3\2\2\2\u0452\u044f\3"+
		"\2\2\2\u0453\u0456\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u0457\3\2\2\2\u0456\u0454\3\2\2\2\u0457\u0458\5D#\2\u0458\u0467\b\66"+
		"\1\2\u0459\u045f\7=\2\2\u045a\u045b\5<\37\2\u045b\u045c\b\66\1\2\u045c"+
		"\u045e\3\2\2\2\u045d\u045a\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2"+
		"\2\2\u045f\u0460\3\2\2\2\u0460\u0462\3\2\2\2\u0461\u045f\3\2\2\2\u0462"+
		"\u0463\5D#\2\u0463\u0464\b\66\1\2\u0464\u0466\3\2\2\2\u0465\u0459\3\2"+
		"\2\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468"+
		"k\3\2\2\2\u0469\u0467\3\2\2\2\u046a\u046b\7\13\2\2\u046b\u047b\b\67\1"+
		"\2\u046c\u046d\7\f\2\2\u046d\u047b\b\67\1\2\u046e\u046f\7\r\2\2\u046f"+
		"\u047b\b\67\1\2\u0470\u0471\7\16\2\2\u0471\u047b\b\67\1\2\u0472\u0473"+
		"\7\17\2\2\u0473\u047b\b\67\1\2\u0474\u0475\7\63\2\2\u0475\u047b\b\67\1"+
		"\2\u0476\u0477\7\64\2\2\u0477\u047b\b\67\1\2\u0478\u0479\7\65\2\2\u0479"+
		"\u047b\b\67\1\2\u047a\u046a\3\2\2\2\u047a\u046c\3\2\2\2\u047a\u046e\3"+
		"\2\2\2\u047a\u0470\3\2\2\2\u047a\u0472\3\2\2\2\u047a\u0474\3\2\2\2\u047a"+
		"\u0476\3\2\2\2\u047a\u0478\3\2\2\2\u047bm\3\2\2\2ht\u0081\u0083\u008f"+
		"\u0091\u009c\u00af\u00b3\u00bd\u00c1\u00cf\u00d1\u00f5\u00fe\u0106\u0108"+
		"\u0111\u0118\u011f\u0126\u013b\u0147\u0151\u0159\u0164\u0174\u017e\u0186"+
		"\u0192\u0195\u019f\u01ad\u01b0\u01b9\u01c5\u01d1\u01d6\u01de\u01e8\u01eb"+
		"\u01fa\u01fe\u0208\u020c\u0217\u0219\u0227\u022f\u023a\u023f\u024a\u024f"+
		"\u025a\u0267\u0277\u027f\u029b\u02ab\u02b1\u02b7\u02c8\u02d4\u02dc\u02e6"+
		"\u02ee\u02f3\u0301\u0304\u030b\u0310\u031c\u0328\u0330\u034a\u0354\u035e"+
		"\u0369\u0374\u037f\u038a\u0394\u0399\u03a1\u03ab\u03b8\u03c2\u03cb\u03d4"+
		"\u03db\u03e7\u03ee\u0404\u0429\u0431\u0435\u043d\u0444\u0446\u0454\u045f"+
		"\u0467\u047a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}