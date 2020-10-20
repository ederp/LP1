package ex3;

import java.util.LinkedList;

public class Pilha {

	private LinkedList<String> pilha = new LinkedList<String>();
	
	public void inserirLivro(String nome) {
		pilha.addLast(nome);
	}
	
	public String removerLivro() {
		return pilha.pollLast();
	}
	
	public void imprimirPilha() {
		for(String livro: pilha) {
			System.out.println(livro.toString());
		}
	}
}
