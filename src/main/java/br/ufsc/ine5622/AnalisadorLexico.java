package br.ufsc.ine5622;

import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import br.ufsc.ine5622.antlr.Lexica;

public class AnalisadorLexico {

	public static void main(String[] args) throws IOException {
		CharStream charStream = CharStreams.fromFileName("src/main/resources/exemplo-1.lcc");
		List<? extends Token> tokens = new Lexica(charStream).getAllTokens();
		tokens.forEach(token -> {
			System.out.println(token);
		});
	}

}
