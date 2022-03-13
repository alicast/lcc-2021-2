package br.ufsc.ine5622;

public class GeradorDeAnalisadorLexico {

	public static void main(String[] args) throws Exception {
		org.antlr.v4.Tool.main(new String[] {
				"-o", "src/main/generated/br/ufsc/ine5622/antlr",
				"-package", "br.ufsc.ine5622.antlr",
				"-Xexact-output-dir",
				"src/main/resources/Lexica.g4" });
	}

}
