package br.ufsc.ine5622;

import java.io.File;

public class RemovedorRecursivoDePasta {

	public void remover(String caminho) {
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
