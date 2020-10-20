package classes_teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ex1.Produto;
import ex1.Estoque;

public class EstoqueTest {

	@Test
	public void naoDeveAceitarProdutosComMesmoNome(){
		Produto camiseta = new Produto("Camiseta", 7.0, 5.0, 100.0);
		Produto camiseta2 = new Produto("Camiseta", 13.0, 5.0, 100.0);
		
		/*
		Estoque estoque = new Estoque("Magazine Luzia");
		estoque.armazena(camiseta);
		estoque.armazena(camiseta2);
		*/
		Estoque estoque = new CriadorDeEstoque()
				.para("Magazine Luzia")
				.produto(camiseta)
				.produto(camiseta2)
				.cria();

		assertEquals(1, estoque.getProdutos().size());
		assertEquals(7.0, estoque.getProdutos().get(0).getQuantidade(), 0.0001);
		
	}
}
