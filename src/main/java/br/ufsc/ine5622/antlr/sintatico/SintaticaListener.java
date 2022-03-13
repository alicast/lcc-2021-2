// Generated from src/main/resources/Sintatica.g4 by ANTLR 4.9.3
package br.ufsc.ine5622.antlr.sintatico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SintaticaParser}.
 */
public interface SintaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SintaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SintaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#functionList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionList(SintaticaParser.FunctionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#functionList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionList(SintaticaParser.FunctionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(SintaticaParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(SintaticaParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SintaticaParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SintaticaParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(SintaticaParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(SintaticaParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SintaticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SintaticaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SintaticaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SintaticaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#arrayDefinitionList}.
	 * @param ctx the parse tree
	 */
	void enterArrayDefinitionList(SintaticaParser.ArrayDefinitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#arrayDefinitionList}.
	 * @param ctx the parse tree
	 */
	void exitArrayDefinitionList(SintaticaParser.ArrayDefinitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#arrayDefinition}.
	 * @param ctx the parse tree
	 */
	void enterArrayDefinition(SintaticaParser.ArrayDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#arrayDefinition}.
	 * @param ctx the parse tree
	 */
	void exitArrayDefinition(SintaticaParser.ArrayDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#attributionStatement}.
	 * @param ctx the parse tree
	 */
	void enterAttributionStatement(SintaticaParser.AttributionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#attributionStatement}.
	 * @param ctx the parse tree
	 */
	void exitAttributionStatement(SintaticaParser.AttributionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#arrayReferenceList}.
	 * @param ctx the parse tree
	 */
	void enterArrayReferenceList(SintaticaParser.ArrayReferenceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#arrayReferenceList}.
	 * @param ctx the parse tree
	 */
	void exitArrayReferenceList(SintaticaParser.ArrayReferenceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#arrayReference}.
	 * @param ctx the parse tree
	 */
	void enterArrayReference(SintaticaParser.ArrayReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#arrayReference}.
	 * @param ctx the parse tree
	 */
	void exitArrayReference(SintaticaParser.ArrayReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SintaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SintaticaParser.FactorContext ctx);
}