package a4ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Digite a descri��o do produto: ");
		produto.setDescricao(sc.nextLine());
		try {
			System.out.println("Digite o c�digo do produto: ");
			produto.setCodigo(sc.nextInt());
			sc.nextLine();
			System.out.println("Digite o pre�o do produto: ");
			produto.setPreco(sc.nextFloat());
		}
		catch(InputMismatchException e) {
			System.out.println("Tipo de entrada inv�lido!");
		}
		finally {
			System.out.println("Dados do produto: \nC�digo: "+produto.getCodigo()+
					"\nDescri��o: "+produto.getDescricao()+
					"\nPre�o: R$ "+produto.getPreco()+
					"\nStatus de atividade: "+produto.isAtivo());
					sc.close();
		}
	}

}
