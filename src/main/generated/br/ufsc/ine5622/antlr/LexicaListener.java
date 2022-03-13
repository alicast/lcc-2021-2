// Generated from src/main/resources/Lexica.g4 by ANTLR 4.9.3
package br.ufsc.ine5622.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexicaParser}.
 */
public interface LexicaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexicaParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(LexicaParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicaParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(LexicaParser.RContext ctx);
}