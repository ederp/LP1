package ex1;

import java.util.ArrayList;
import java.util.List;

public class Controle {

	private List<Produto> produtosComEstoqueInsuficiente;
	private List<Produto> produtosComEstoqueExcedente;
	private List<Produto> produtosComEstoqueZerado;
	private List<Produto> produtosComEstoqueAdequado;
	
	public void controlaEstoques(Estoque estoque) {
		produtosComEstoqueInsuficiente = new ArrayList<Produto>();
		produtosComEstoqueExcedente = new ArrayList<Produto>();
		produtosComEstoqueZerado = new ArrayList<Produto>();
		produtosComEstoqueAdequado = new ArrayList<Produto>();
		
		for(Produto p: estoque.getProdutos()) {
			if(p.getQuantidade() > 0.0 && p.getQuantidade() < 5.0)
				produtosComEstoqueInsuficiente.add(p);
			else if(p.getQuantidade() > 100.0)
				produtosComEstoqueExcedente.add(p);
			else if(p.getQuantidade() == 0.0)
				produtosComEstoqueZerado.add(p);
			else
				produtosComEstoqueAdequado.add(p);
		}
		
		if(produtosComEstoqueInsuficiente.isEmpty() && 
				produtosComEstoqueAdequado.isEmpty() &&
				produtosComEstoqueExcedente.isEmpty() &&
				produtosComEstoqueZerado.isEmpty())
			throw new RuntimeException("O estoque não possui nenhum produto!");
	}
	
	public List<Produto> getProdutosComEstoqueInsuficiente() {
		return produtosComEstoqueInsuficiente;
	}
	public List<Produto> getProdutosComEstoqueExcedente() {
		return produtosComEstoqueExcedente;
	}
	public List<Produto> getProdutosComEstoqueZerado() {
		return produtosComEstoqueZerado;
	}
	public List<Produto> getProdutosComEstoqueAdequado() {
		return produtosComEstoqueAdequado;
	}	
}
