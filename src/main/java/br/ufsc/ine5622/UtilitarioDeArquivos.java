package br.ufsc.ine5622;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class UtilitarioDeArquivos {

	public List<File> listar(String caminho) {
		File pasta = new File(caminho);
		return Arrays.asList(pasta.listFiles());
	}

	public void removerRecursivamente(String caminho) {
		File pasta = new File(caminho);
		remover(pasta);
	}

	private void remover(File pastaOuArquivo) {
		if (pastaOuArquivo.isDirectory()) {
			for (File filho : pastaOuArquivo.listFiles()) {
				remover(filho);
			}
		}
		pastaOuArquivo.delete();
	}

}
