package classes_teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ex1.*;

public class ControleTest {
	private Estoque estoque;
	private Controle controle;
	
	@Before
	public void executaAntesDeCadaMetodo() {
		this.estoque = new Estoque("Magazine Luzia");
		this.controle = new Controle();
		System.out.println("Início do teste");
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueInsuficiente() {
		Produto camiseta = new Produto("Camiseta", 30.0, 5.0, 100.0);
		Produto blusa = new Produto("Blusa", 13.0, 5.0, 100.0);
		Produto jaqueta = new Produto("Jaqueta", 30.0, 5.0, 100.0);
				
		camiseta.setQuantidade(3.0);
		
		estoque.armazena(camiseta);
		estoque.armazena(blusa);
		estoque.armazena(jaqueta);
				
		controle.controlaEstoques(estoque);
		
		assertEquals(camiseta, controle.getProdutosComEstoqueInsuficiente().get(0));
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueExcedente() {
		Produto camiseta = new Produto("Camiseta", 30.0, 5.0, 100.0);
		Produto blusa = new Produto("Blusa", 13.0, 5.0, 100.0);
		Produto jaqueta = new Produto("Jaqueta", 30.0, 5.0, 100.0);
				
		camiseta.setQuantidade(300.0);
		
		estoque.armazena(camiseta);
		estoque.armazena(blusa);
		estoque.armazena(jaqueta);
				
		controle.controlaEstoques(estoque);
		
		assertEquals(camiseta, controle.getProdutosComEstoqueExcedente().get(0));
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueZerado() {
		Produto camiseta = new Produto("Camiseta", 30.0, 5.0, 100.0);
		Produto blusa = new Produto("Blusa", 13.0, 5.0, 100.0);
		Produto jaqueta = new Produto("Jaqueta", 30.0, 5.0, 100.0);
				
		camiseta.setQuantidade(0.0);
		
		estoque.armazena(camiseta);
		estoque.armazena(blusa);
		estoque.armazena(jaqueta);
				
		controle.controlaEstoques(estoque);
		
		assertEquals(camiseta, controle.getProdutosComEstoqueZerado().get(0));
	}
	
	@Test
	public void deveRetornarProdutosComEstoqueAdequado() {
		Produto camiseta = new Produto("Camiseta", 30.0, 5.0, 100.0);
		Produto blusa = new Produto("Blusa", 13.0, 5.0, 100.0);
		Produto jaqueta = new Produto("Jaqueta", 30.0, 5.0, 100.0);
				
		estoque.armazena(camiseta);
		estoque.armazena(blusa);
		estoque.armazena(jaqueta);
				
		controle.controlaEstoques(estoque);
		
		assertEquals(camiseta, controle.getProdutosComEstoqueAdequado().get(0));
		assertEquals(blusa, controle.getProdutosComEstoqueAdequado().get(1));
		assertEquals(jaqueta, controle.getProdutosComEstoqueAdequado().get(2));
	}
	
	@Test
	public void deveRetornarListaVaziaParaEstoqueSemProdutos() {
		Produto camiseta = new Produto("Camiseta", 30.0, 5.0, 100.0);
				
		estoque.armazena(camiseta);
		estoque.retira(camiseta);
				
		controle.controlaEstoques(estoque);
		
		assertEquals(true, controle.getProdutosComEstoqueAdequado().isEmpty());
		assertEquals(true, controle.getProdutosComEstoqueExcedente().isEmpty());
		assertEquals(true, controle.getProdutosComEstoqueInsuficiente().isEmpty());
		assertEquals(true, controle.getProdutosComEstoqueZerado().isEmpty());
	}
	
	@Test
	public void deveRetornarListaVaziaParaEstoqueSemProdutosComEstoqueZerado() {
		Produto camiseta = new Produto("Camiseta", 30.0, 5.0, 100.0);
		Produto blusa = new Produto("Blusa", 13.0, 5.0, 100.0);
		Produto jaqueta = new Produto("Jaqueta", 30.0, 5.0, 100.0);
				
		estoque.armazena(camiseta);
		estoque.armazena(blusa);
		estoque.armazena(jaqueta);
				
		controle.controlaEstoques(estoque);
		
		assertEquals(true, controle.getProdutosComEstoqueZerado().isEmpty());
	}
	
	@Test(expected=RuntimeException.class)
	public void naoDeveControlarEstoquesSemNenhumProduto() {
				
		controle.controlaEstoques(estoque);
	}
}
