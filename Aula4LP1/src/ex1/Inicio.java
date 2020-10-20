package ex1;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("Digite o código do produto: ");
		produto.setCodigo(sc.nextInt());
		sc.nextLine();
		System.out.println("Digite a descrição do produto: ");
		produto.setDescricao(sc.nextLine());
		System.out.println("Digite o preço do produto: ");
		produto.setPreco(sc.nextFloat());

		System.out.println("Dados do produto: \nCódigo: "+produto.getCodigo()+
		"\nDescrição: "+produto.getDescricao()+
		"\nPreço: R$ "+produto.getPreco()+
		"\nStatus de atividade: "+produto.isAtivo());
		sc.close();
	}

}
