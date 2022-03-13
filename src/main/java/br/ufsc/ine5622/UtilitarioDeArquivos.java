package br.ufsc.ine5622;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilitarioDeArquivos {

	public List<File> listar(String caminho) {
		File pasta = new File(caminho);
		List<File> arquivos = Arrays.asList(pasta.listFiles());
		Collections.sort(arquivos, new Comparator<File>() {

			@Override
			public int compare(File primeiro, File segundo) {
				return primeiro.getName().compareTo(segundo.getName());
			}

		});
		return arquivos;
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
