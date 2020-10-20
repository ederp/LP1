package ex4;

import java.util.TreeSet;

public class Conjunto {
	
	private TreeSet<String> conjunto1 = new TreeSet<String>();
	private TreeSet<String> conjunto2 = new TreeSet<String>();
	
	public void inserirConjunto1(TreeSet<String> produtos) {
		conjunto1.addAll(produtos);
	}
	
	public void inserirConjunto2(TreeSet<String> produtos) {
		conjunto2.addAll(produtos);
	}
	
	public void consultaTodosProdutos() {
		TreeSet<String> uniao = new TreeSet<String>();
		uniao.addAll(conjunto1);
		uniao.addAll(conjunto2);
		for(String produtos: uniao) {
			System.out.println(produtos.toString());
		}
	}
	
	public void consultaProdutosEmComum() {
		TreeSet<String> interseccao = new TreeSet<String>();
		interseccao.addAll(conjunto1);
		interseccao.retainAll(conjunto2);
		for(String produtos: interseccao) {
			System.out.println(produtos.toString());
		}
	}
	
	public void consultaDiferencaProdutos() {
		TreeSet<String> diferenca = new TreeSet<String>();
		diferenca.addAll(conjunto1);
		diferenca.removeAll(conjunto2);
		for(String produtos: diferenca) {
			System.out.println(produtos.toString());
		}
	}
	
	public boolean produtosContidos() {
		return conjunto2.containsAll(conjunto1);
	}
}
