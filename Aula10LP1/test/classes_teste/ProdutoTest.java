package classes_teste;

import org.junit.Test;

import ex1.Produto;

public class ProdutoTest {

	@Test(expected=RuntimeException.class)
	public void naoDeveAceitarProdutosComEstoqueMinimoMenorQueCinco() {
		new Produto("Camiseta", 3.0, 5.0, 100.0);
	}
	
	@Test(expected=RuntimeException.class)
	public void naoDeveAceitarProdutosComEstoqueMaximoMaiorQueCem() {
		new Produto("Camiseta", 300.0, 5.0, 100.0);
	}
}
