package ex1;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	private String loja;
	private List<Produto> produtos;
	
	public Estoque(String loja) {
		super();
		this.loja = loja;
		produtos = new ArrayList<Produto>();
	}
	public String getLoja() {
		return loja;
	}
	public void setLoja(String loja) {
		this.loja = loja;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void armazena(Produto produto) {
		//não armazena produto com nome repetido
		if(this.produtos.isEmpty() || (! contains(produto)))
			this.produtos.add(produto);		
	}
	
	public void retira(Produto produto) {
		this.produtos.remove(produto);
	}

	//método auxiliar para verificar se existem produtos repetidos
	boolean contains(Produto produto) {
		for(Produto p: this.produtos) {
			if(p.getNome().compareTo(produto.getNome()) == 0)
				return true;
		}
		return false;
	}
	
}
