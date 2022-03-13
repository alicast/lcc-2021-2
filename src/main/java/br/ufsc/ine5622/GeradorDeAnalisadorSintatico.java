package br.ufsc.ine5622;

import org.antlr.v4.Tool;

public class GeradorDeAnalisadorSintatico {

	private static final String SAIDA_ANTLR = "src/main/java/br/ufsc/ine5622/antlr/sintatico";

	public static void main(String[] args) throws Exception {
		new UtilitarioDeArquivos().removerRecursivamente(SAIDA_ANTLR);
		Tool.main(new String[] {
				"-o", SAIDA_ANTLR,
				"-package", "br.ufsc.ine5622.antlr.sintatico",
				"-Xexact-output-dir",
				"-visitor",
				"src/main/resources/Sintatica.g4" });
	}

}
