package ex2;

import java.util.LinkedList;

public class Fila {
	private LinkedList<String> fila = new LinkedList<String>();
	
	public void inserirPessoa(String nome) {
		fila.addLast(nome);
	}

	public String removerPessoa() {
		return fila.pollFirst();
	}
	
	public void imprimirFila() {
		for(String pessoa: fila) {
			System.out.println(pessoa.toString());
		}
	}
}
