package br.ufsc.ine5622;

import java.io.File;
import java.util.List;

import org.antlr.v4.gui.TestRig;

public class AnalisadorSintaticoGrafico {

	public static void main(String[] args) throws Exception {
		List<File> exemplos = new UtilitarioDeArquivos().listar("src/main/resources/exemplos/sintatico");

		for (File exemplo : exemplos) {
			TestRig.main(new String[] {
					"br.ufsc.ine5622.antlr.sintatico.Sintatica",
					"program",
					"-gui",
					exemplo.getAbsolutePath()
			});
		}
	}

}
