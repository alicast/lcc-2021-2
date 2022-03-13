package br.ufsc.ine5622;

import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.Token;

import br.ufsc.ine5622.antlr.Lexica;

public class AnalisadorLexico {

	public static void main(String[] args) throws Exception {
		String[] exemplos = new String[] {
			"src/main/resources/exemplo-1.lcc",
			"src/main/resources/exemplo-2.lcc",
		};

		for (String exemplo : exemplos) {
			System.out.println(String.format("--- %s ---", exemplo));
			CharStream charStream = CharStreams.fromFileName(exemplo);
			Lexica lexica = new Lexica(charStream);
			lexica.removeErrorListeners();
			lexica.addErrorListener(ConsoleErrorListener.INSTANCE);
			List<? extends Token> tokens = lexica.getAllTokens();
			for (Token token : tokens) {
				System.out.println(token);
			}
			System.out.println();
		}
	}

}
