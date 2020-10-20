package ex1;

public class Produto {
	
	private String nome;
	private double quantidade;
	private double estoqueMinimo;
	private double estoqueMaximo;
	
	public Produto(String nome, double quantidade, double estoqueMinimo, double estoqueMaximo) {
		super();
		if(quantidade < 5.0)
			throw new RuntimeException("O estoque deve ser maior do que 5");
		if(quantidade > 100.0)
			throw new RuntimeException("O estoque deve ser menor do que 100");
		this.nome = nome;
		this.quantidade = quantidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public void setEstoqueMinimo(double estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	public double getEstoqueMaximo() {
		return estoqueMaximo;
	}
	public void setEstoqueMaximo(double estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}
	
}
