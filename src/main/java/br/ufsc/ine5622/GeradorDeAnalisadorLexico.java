package br.ufsc.ine5622;

import org.antlr.v4.Tool;

public class GeradorDeAnalisadorLexico {

	private static final String SAIDA_ANTLR = "src/main/java/br/ufsc/ine5622/antlr/lexico";

	public static void main(String[] args) throws Exception {
		new UtilitarioDeArquivos().removerRecursivamente(SAIDA_ANTLR);
		Tool.main(new String[] {
				"-o", SAIDA_ANTLR,
				"-package", "br.ufsc.ine5622.antlr.lexico",
				"-Xexact-output-dir",
				"src/main/resources/Lexica.g4" });
	}

}
