// Generated from src/main/resources/Sintatica.g4 by ANTLR 4.9.3
package br.ufsc.ine5622.antlr.sintatico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SintaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, ABRE_PARENTESES=2, FECHA_PARENTESES=3, ABRE_CHAVES=4, FECHA_CHAVES=5, 
		ABRE_COLCHETES=6, FECHA_COLCHETES=7, INT=8, FLOAT=9, STRING=10, BREAK=11, 
		VIRGULA=12, PONTO_VIRGULA=13, PRINT=14, READ=15, RETURN=16, IF=17, ELSE=18, 
		FOR=19, NEW=20, MENOR=21, MAIOR=22, MAIOR_IGUAL=23, MENOR_IGUAL=24, ATRIBUICAO=25, 
		IGUAL=26, DIFERENTE=27, MAIS=28, MENOS=29, MULTIPLICACAO=30, DIVISAO=31, 
		PORCENTAGEM=32, IDENT=33, INT_CONSTANT=34, FLOAT_CONSTANT=35, TABULACAO=36, 
		STRING_CONSTANT=37, NULL=38;
	public static final int
		RULE_program = 0, RULE_functionList = 1, RULE_functionDefinition = 2, 
		RULE_parameterList = 3, RULE_statementList = 4, RULE_statement = 5, RULE_variableDeclaration = 6, 
		RULE_arrayDefinitionList = 7, RULE_arrayDefinition = 8, RULE_attributionStatement = 9, 
		RULE_arrayReferenceList = 10, RULE_arrayReference = 11, RULE_factor = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionList", "functionDefinition", "parameterList", "statementList", 
			"statement", "variableDeclaration", "arrayDefinitionList", "arrayDefinition", 
			"attributionStatement", "arrayReferenceList", "arrayReference", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'int'", "'float'", 
			"'string'", "'break'", "','", "';'", "'print '", "'read'", "'return'", 
			"'if'", "'else'", "'for'", "'new'", "'<'", "'>'", "'<='", "'>='", "'='", 
			"'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'%'", null, null, null, 
			null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_CHAVES", "FECHA_CHAVES", 
			"ABRE_COLCHETES", "FECHA_COLCHETES", "INT", "FLOAT", "STRING", "BREAK", 
			"VIRGULA", "PONTO_VIRGULA", "PRINT", "READ", "RETURN", "IF", "ELSE", 
			"FOR", "NEW", "MENOR", "MAIOR", "MAIOR_IGUAL", "MENOR_IGUAL", "ATRIBUICAO", 
			"IGUAL", "DIFERENTE", "MAIS", "MENOS", "MULTIPLICACAO", "DIVISAO", "PORCENTAGEM", 
			"IDENT", "INT_CONSTANT", "FLOAT_CONSTANT", "TABULACAO", "STRING_CONSTANT", 
			"NULL"
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
	public String getGrammarFileName() { return "Sintatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SintaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			functionList();
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

	public static class FunctionListContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
		}
		public FunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitFunctionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitFunctionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionListContext functionList() throws RecognitionException {
		FunctionListContext _localctx = new FunctionListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			functionDefinition();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF) {
				{
				setState(29);
				functionList();
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(SintaticaParser.DEF, 0); }
		public TerminalNode IDENT() { return getToken(SintaticaParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(SintaticaParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(SintaticaParser.FECHA_PARENTESES, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(SintaticaParser.ABRE_CHAVES, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(SintaticaParser.FECHA_CHAVES, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(DEF);
			setState(33);
			match(IDENT);
			setState(34);
			match(ABRE_PARENTESES);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(35);
				parameterList();
				}
			}

			setState(38);
			match(FECHA_PARENTESES);
			setState(39);
			match(ABRE_CHAVES);
			setState(40);
			statementList();
			setState(41);
			match(FECHA_CHAVES);
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

	public static class ParameterListContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SintaticaParser.IDENT, 0); }
		public TerminalNode INT() { return getToken(SintaticaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SintaticaParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(SintaticaParser.STRING, 0); }
		public TerminalNode VIRGULA() { return getToken(SintaticaParser.VIRGULA, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(44);
			match(IDENT);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(45);
				match(VIRGULA);
				setState(46);
				parameterList();
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

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			statement();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BREAK) | (1L << PONTO_VIRGULA) | (1L << IDENT))) != 0)) {
				{
				setState(50);
				statementList();
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

	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(SintaticaParser.PONTO_VIRGULA, 0); }
		public AttributionStatementContext attributionStatement() {
			return getRuleContext(AttributionStatementContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(SintaticaParser.BREAK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				variableDeclaration();
				setState(54);
				match(PONTO_VIRGULA);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				attributionStatement();
				setState(57);
				match(PONTO_VIRGULA);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(BREAK);
				setState(60);
				match(PONTO_VIRGULA);
				}
				break;
			case PONTO_VIRGULA:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				match(PONTO_VIRGULA);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SintaticaParser.IDENT, 0); }
		public TerminalNode INT() { return getToken(SintaticaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SintaticaParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(SintaticaParser.STRING, 0); }
		public ArrayDefinitionListContext arrayDefinitionList() {
			return getRuleContext(ArrayDefinitionListContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			match(IDENT);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABRE_COLCHETES) {
				{
				setState(66);
				arrayDefinitionList();
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

	public static class ArrayDefinitionListContext extends ParserRuleContext {
		public ArrayDefinitionContext arrayDefinition() {
			return getRuleContext(ArrayDefinitionContext.class,0);
		}
		public ArrayDefinitionListContext arrayDefinitionList() {
			return getRuleContext(ArrayDefinitionListContext.class,0);
		}
		public ArrayDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterArrayDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitArrayDefinitionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitArrayDefinitionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDefinitionListContext arrayDefinitionList() throws RecognitionException {
		ArrayDefinitionListContext _localctx = new ArrayDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayDefinitionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			arrayDefinition();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABRE_COLCHETES) {
				{
				setState(70);
				arrayDefinitionList();
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

	public static class ArrayDefinitionContext extends ParserRuleContext {
		public TerminalNode ABRE_COLCHETES() { return getToken(SintaticaParser.ABRE_COLCHETES, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(SintaticaParser.INT_CONSTANT, 0); }
		public TerminalNode FECHA_COLCHETES() { return getToken(SintaticaParser.FECHA_COLCHETES, 0); }
		public ArrayDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterArrayDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitArrayDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitArrayDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDefinitionContext arrayDefinition() throws RecognitionException {
		ArrayDefinitionContext _localctx = new ArrayDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(73);
			match(ABRE_COLCHETES);
			setState(74);
			match(INT_CONSTANT);
			setState(75);
			match(FECHA_COLCHETES);
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

	public static class AttributionStatementContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SintaticaParser.IDENT, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(SintaticaParser.ATRIBUICAO, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ArrayReferenceListContext arrayReferenceList() {
			return getRuleContext(ArrayReferenceListContext.class,0);
		}
		public AttributionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterAttributionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitAttributionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitAttributionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionStatementContext attributionStatement() throws RecognitionException {
		AttributionStatementContext _localctx = new AttributionStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attributionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(IDENT);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABRE_COLCHETES) {
				{
				setState(78);
				arrayReferenceList();
				}
			}

			setState(81);
			match(ATRIBUICAO);
			setState(82);
			factor();
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

	public static class ArrayReferenceListContext extends ParserRuleContext {
		public ArrayReferenceContext arrayReference() {
			return getRuleContext(ArrayReferenceContext.class,0);
		}
		public ArrayReferenceListContext arrayReferenceList() {
			return getRuleContext(ArrayReferenceListContext.class,0);
		}
		public ArrayReferenceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayReferenceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterArrayReferenceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitArrayReferenceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitArrayReferenceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayReferenceListContext arrayReferenceList() throws RecognitionException {
		ArrayReferenceListContext _localctx = new ArrayReferenceListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayReferenceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			arrayReference();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABRE_COLCHETES) {
				{
				setState(85);
				arrayReferenceList();
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

	public static class ArrayReferenceContext extends ParserRuleContext {
		public TerminalNode ABRE_COLCHETES() { return getToken(SintaticaParser.ABRE_COLCHETES, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(SintaticaParser.INT_CONSTANT, 0); }
		public TerminalNode FECHA_COLCHETES() { return getToken(SintaticaParser.FECHA_COLCHETES, 0); }
		public ArrayReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterArrayReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitArrayReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitArrayReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayReferenceContext arrayReference() throws RecognitionException {
		ArrayReferenceContext _localctx = new ArrayReferenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(88);
			match(ABRE_COLCHETES);
			setState(89);
			match(INT_CONSTANT);
			setState(90);
			match(FECHA_COLCHETES);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(SintaticaParser.INT_CONSTANT, 0); }
		public TerminalNode FLOAT_CONSTANT() { return getToken(SintaticaParser.FLOAT_CONSTANT, 0); }
		public TerminalNode STRING_CONSTANT() { return getToken(SintaticaParser.STRING_CONSTANT, 0); }
		public TerminalNode NULL() { return getToken(SintaticaParser.NULL, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintaticaListener ) ((SintaticaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintaticaVisitor ) return ((SintaticaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_CONSTANT) | (1L << FLOAT_CONSTANT) | (1L << STRING_CONSTANT) | (1L << NULL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(a\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4\5\4\'"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\62\n\5\3\6\3\6\5\6\66\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\b\5\bF\n\b\3\t"+
		"\3\t\5\tJ\n\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13R\n\13\3\13\3\13\3\13\3\f"+
		"\3\f\5\fY\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\2\4\3\2\n\f\4\2$%\'(\2^\2\34\3\2\2\2\4\36\3\2\2\2\6\""+
		"\3\2\2\2\b-\3\2\2\2\n\63\3\2\2\2\f@\3\2\2\2\16B\3\2\2\2\20G\3\2\2\2\22"+
		"K\3\2\2\2\24O\3\2\2\2\26V\3\2\2\2\30Z\3\2\2\2\32^\3\2\2\2\34\35\5\4\3"+
		"\2\35\3\3\2\2\2\36 \5\6\4\2\37!\5\4\3\2 \37\3\2\2\2 !\3\2\2\2!\5\3\2\2"+
		"\2\"#\7\3\2\2#$\7#\2\2$&\7\4\2\2%\'\5\b\5\2&%\3\2\2\2&\'\3\2\2\2\'(\3"+
		"\2\2\2()\7\5\2\2)*\7\6\2\2*+\5\n\6\2+,\7\7\2\2,\7\3\2\2\2-.\t\2\2\2.\61"+
		"\7#\2\2/\60\7\16\2\2\60\62\5\b\5\2\61/\3\2\2\2\61\62\3\2\2\2\62\t\3\2"+
		"\2\2\63\65\5\f\7\2\64\66\5\n\6\2\65\64\3\2\2\2\65\66\3\2\2\2\66\13\3\2"+
		"\2\2\678\5\16\b\289\7\17\2\29A\3\2\2\2:;\5\24\13\2;<\7\17\2\2<A\3\2\2"+
		"\2=>\7\r\2\2>A\7\17\2\2?A\7\17\2\2@\67\3\2\2\2@:\3\2\2\2@=\3\2\2\2@?\3"+
		"\2\2\2A\r\3\2\2\2BC\t\2\2\2CE\7#\2\2DF\5\20\t\2ED\3\2\2\2EF\3\2\2\2F\17"+
		"\3\2\2\2GI\5\22\n\2HJ\5\20\t\2IH\3\2\2\2IJ\3\2\2\2J\21\3\2\2\2KL\7\b\2"+
		"\2LM\7$\2\2MN\7\t\2\2N\23\3\2\2\2OQ\7#\2\2PR\5\26\f\2QP\3\2\2\2QR\3\2"+
		"\2\2RS\3\2\2\2ST\7\33\2\2TU\5\32\16\2U\25\3\2\2\2VX\5\30\r\2WY\5\26\f"+
		"\2XW\3\2\2\2XY\3\2\2\2Y\27\3\2\2\2Z[\7\b\2\2[\\\7$\2\2\\]\7\t\2\2]\31"+
		"\3\2\2\2^_\t\3\2\2_\33\3\2\2\2\13 &\61\65@EIQX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}