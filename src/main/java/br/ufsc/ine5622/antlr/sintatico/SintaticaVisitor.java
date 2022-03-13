// Generated from src/main/resources/Sintatica.g4 by ANTLR 4.9.3
package br.ufsc.ine5622.antlr.sintatico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SintaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SintaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SintaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#functionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionList(SintaticaParser.FunctionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(SintaticaParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SintaticaParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(SintaticaParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SintaticaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SintaticaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#arrayDefinitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDefinitionList(SintaticaParser.ArrayDefinitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#arrayDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDefinition(SintaticaParser.ArrayDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#attributionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributionStatement(SintaticaParser.AttributionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#arrayReferenceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayReferenceList(SintaticaParser.ArrayReferenceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#arrayReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayReference(SintaticaParser.ArrayReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SintaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SintaticaParser.FactorContext ctx);
}