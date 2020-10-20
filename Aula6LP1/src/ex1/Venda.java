package ex1;

public class Venda {
	/* 1. Faça um programa em Java que leia os valores das vendas de uma loja nos últimos seis
meses e acumule o valor total em um atributo estático por meio de um método dinâmico,
o qual será chamado por uma instância v1 do tipo Venda. Ao final, apresente o valor total
das vendas ao usuário por meio de outro método dinâmico, o qual será chamado por uma
instância v2, também do tipo Venda. Transforme o atributo estático em dinâmico, execute
novamente o programa e veja se o resultado foi alterado. */
	
	private static double venda = 0;
	
	public Venda() {

	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double valor) {
		venda += valor;
	}
	
}
