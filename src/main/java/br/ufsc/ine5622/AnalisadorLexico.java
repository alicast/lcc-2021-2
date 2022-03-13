package br.ufsc.ine5622;

import java.io.File;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.Token;

import br.ufsc.ine5622.antlr.Lexica;

public class AnalisadorLexico {

	public static void main(String[] args) throws Exception {
		List<File> exemplos = new UtilitarioDeArquivos().listar("src/main/resources/exemplos");

		for (File exemplo : exemplos) {
			System.out.println(String.format("--- %s ---", exemplo));
			CharStream charStream = CharStreams.fromFileName(exemplo.getAbsolutePath());
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
