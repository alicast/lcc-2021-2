package br.ufsc.ine5622;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;

import br.ufsc.ine5622.antlr.lexico.Lexica;
import br.ufsc.ine5622.antlr.sintatico.SintaticaParser;
import br.ufsc.ine5622.antlr.sintatico.SintaticaParser.ProgramContext;

public class AnalisadorSintatico {

	public static void main(String[] args) throws IOException {
		List<File> exemplos = new UtilitarioDeArquivos().listar("src/main/resources/exemplos/sintatico");

		for (File exemplo : exemplos) {
			System.out.println(String.format("--- %s ---", exemplo.getName()));
			CharStream charStream = CharStreams.fromFileName(exemplo.getAbsolutePath());
			Lexica lexica = new Lexica(charStream);
			lexica.removeErrorListeners();
			lexica.addErrorListener(ConsoleErrorListener.INSTANCE);
			CommonTokenStream tokens = new CommonTokenStream(lexica);
			SintaticaParser sintatica = new SintaticaParser(tokens);
			ProgramContext arvore = sintatica.program();
			System.out.println(arvore.toStringTree());
			System.out.println(arvore.toStringTree(sintatica));
		}
	}

}
