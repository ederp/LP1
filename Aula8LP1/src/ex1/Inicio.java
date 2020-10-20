package ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista lista = new Lista();
		int opcao = -1;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("\nPrograma de manipula��o de lista de produtos. Digite uma das seguintes op��es:");
			System.out.println("1 para inserir um produto por nome");
			System.out.println("2 para inserir um produto pelo nome e posi��o desejada");
			System.out.println("3 para consultar um produto pelo nome");
			System.out.println("4 para consultar um produto pela posi��o");
			System.out.println("5 para substituir um produto");
			System.out.println("6 para remover um produto pelo nome");
			System.out.println("7 para remover um produto pela posi��o");
			System.out.println("0 para encerrar ");
			
			String nome;
			int posicao;
			
			try {
				opcao = entrada.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println();
			}
			
			entrada.nextLine();
			
			switch (opcao) {
			case 0:
				System.out.println("Programa encerrado!");
				entrada.close();
				break;
			case 1:
				System.out.println("Digite o nome do produto: ");
				nome = entrada.nextLine();
				lista.inserirProduto(nome);
				System.out.println("Produto inserido na lista!");
				break;
			case 2:
				try {
					System.out.println("Digite o nome do produto: ");
					nome = entrada.nextLine();
					System.out.println("Digite a posi��o do produto: ");
					posicao = entrada.nextInt();
					lista.inserirProduto(nome, posicao);
					System.out.println("Produto inserido na lista!");
				}
				catch(InputMismatchException | IndexOutOfBoundsException e) {
					if(e.getClass().toString().equals("class java.util.InputMismatchException"))
						System.out.println("Entrada inv�lida de posi��o!");
					else if(e.getClass().toString().equals("class java.lang.IndexOutOfBoundsException"))
						System.out.println("A posi��o informada n�o existe na lista!");
				}
				break;
			case 3:
				System.out.println("Digite o nome do produto: ");
				nome = entrada.nextLine();
				if(! lista.consultarProduto(nome))
					System.out.println("O produto n�o est� na lista!");
				else if(lista.consultarProduto(nome))
					System.out.println("O produto est� na lista!");
				break;
			case 4:
				try {
					System.out.println("Digite a posi��o do produto: ");
					posicao = entrada.nextInt();
					System.out.println("Produto na posi��o "+posicao+": "+lista.consultarProduto(posicao));
				}
				catch(InputMismatchException | IndexOutOfBoundsException e) {
					if(e.getClass().toString().equals("class java.util.InputMismatchException"))
						System.out.println("Entrada inv�lida de posi��o!");
					else if(e.getClass().toString().equals("class java.lang.IndexOutOfBoundsException"))
						System.out.println("A posi��o informada n�o existe na lista!");
				}
				break;
			case 5:
				try {
					System.out.println("Digite o nome do produto: ");
					nome = entrada.nextLine();
					System.out.println("Digite a posi��o do produto: ");
					posicao = entrada.nextInt();
					lista.substituirProduto(nome, posicao);
					System.out.println("Produto substitu�do com sucesso!");
				}
				catch(InputMismatchException | IndexOutOfBoundsException e) {
					if(e.getClass().toString().equals("class java.util.InputMismatchException"))
						System.out.println("Entrada inv�lida de posi��o!");
					else if(e.getClass().toString().equals("class java.lang.IndexOutOfBoundsException"))
						System.out.println("A posi��o informada n�o existe na lista!");
				}
				break;
			case 6:
				System.out.println("Digite o nome do produto: ");
				nome = entrada.nextLine();
				if(! lista.removerProduto(nome))
					System.out.println("O produto n�o pode ser removido!");
				else if(lista.removerProduto(nome))
					System.out.println("Produto removido com sucesso!");
				break;
			case 7:
				try {
					System.out.println("Digite a posi��o do produto: ");
					posicao = entrada.nextInt();
					System.out.println("Produto "+lista.removerProduto(posicao)+" removido com sucesso!");
				}
				catch(InputMismatchException | IndexOutOfBoundsException e) {
					if(e.getClass().toString().equals("class java.util.InputMismatchException"))
						System.out.println("Entrada inv�lida de posi��o!");
					else if(e.getClass().toString().equals("class java.lang.IndexOutOfBoundsException"))
						System.out.println("A posi��o informada n�o existe na lista!");
				}
				break;

			default:
				System.out.println("Opera��o inv�lida!\n");
				break;
			}
			
		}while(opcao != 0);
		
	}

}
