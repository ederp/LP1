package ex1;

public class Venda {
	/* 1. Fa�a um programa em Java que leia os valores das vendas de uma loja nos �ltimos seis
meses e acumule o valor total em um atributo est�tico por meio de um m�todo din�mico,
o qual ser� chamado por uma inst�ncia v1 do tipo Venda. Ao final, apresente o valor total
das vendas ao usu�rio por meio de outro m�todo din�mico, o qual ser� chamado por uma
inst�ncia v2, tamb�m do tipo Venda. Transforme o atributo est�tico em din�mico, execute
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
