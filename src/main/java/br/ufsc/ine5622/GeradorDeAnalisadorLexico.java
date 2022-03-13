package br.ufsc.ine5622;

public class GeradorDeAnalisadorLexico {

	private static final String SAIDA_ANTLR = "src/main/java/br/ufsc/ine5622/antlr";

	public static void main(String[] args) throws Exception {
		new UtilitarioDeArquivos().removerRecursivamente(SAIDA_ANTLR);
		org.antlr.v4.Tool.main(new String[] {
				"-o", SAIDA_ANTLR,
				"-lib", "src/main/resources",
				"-package", "br.ufsc.ine5622.antlr",
				"-Xexact-output-dir",
				"src/main/resources/Lexica.g4" });
	}

}
