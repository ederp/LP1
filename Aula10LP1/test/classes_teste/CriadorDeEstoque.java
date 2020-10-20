package classes_teste;

import ex1.Estoque;
import ex1.Produto;

public class CriadorDeEstoque {

	private Estoque estoque;
	
	public CriadorDeEstoque para(String descricao) {
		this.estoque = new Estoque(descricao);
		return this;
	}
	
	public CriadorDeEstoque produto(Produto produto) {
		estoque.armazena(produto);
		return this;
	}
	
	public Estoque cria() {
		return estoque;
	}
}
