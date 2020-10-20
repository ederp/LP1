package ex1;

import java.util.ArrayList;

public class Lista {
	
	private ArrayList<String> produtos = new ArrayList<String>();
	
	public void inserirProduto(String nome) {
		produtos.add(nome);
	}
	
	// pode retornar uma exceção do tipo IndexOutOfBoundsException se a posição não for do tamanho da lista
	public void inserirProduto(String nome, int posicao) {
		produtos.add(posicao, nome);
	}
	
	public boolean consultarProduto(String nome) {
		return produtos.contains(nome);
	}
	
	// pode retornar uma exceção do tipo IndexOutOfBoundsException se a posição não for do tamanho da lista
	public String consultarProduto(int posicao) {
		return produtos.get(posicao);
	}

	// pode retornar uma exceção do tipo IndexOutOfBoundsException se a posição não for do tamanho da lista
	public void substituirProduto(String nome, int posicao) {
		produtos.set(posicao, nome);
	}
	
	
	public boolean removerProduto(String nome) {
		return produtos.remove(nome);
	}
	
	// pode retornar uma exceção do tipo IndexOutOfBoundsException se a posição não for do tamanho da lista
	public String removerProduto(int posicao) {
		return produtos.remove(posicao);
	}
}
