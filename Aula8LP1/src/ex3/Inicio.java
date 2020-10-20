package ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pilha pilha = new Pilha();
		int opcao = -1;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("\nPrograma de manipulação de pilha de livros. Digite uma das seguintes opções:");
			System.out.println("1 para inserir um livro na pilha"+
								"\n2 para remover um livro da pilha"+
								"\n3 para imprimir a pilha completa"+
								"\n0 para encerrar");
			
			try {
				opcao = entrada.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println();
			}
			
			String nome;
			
			entrada.nextLine();
			
			switch (opcao) {
			case 0:
				System.out.println("Programa encerrado!");
				entrada.close();
				break;
				
			case 1:
				System.out.println("Digite o nome do livro: ");
				nome = entrada.nextLine();
				pilha.inserirLivro(nome);
				System.out.println("Livro inserido na pilha com sucesso!");
				break;
				
			case 2:
				nome = pilha.removerLivro();
				if(nome != null)
					System.out.println("Livro "+nome+" saiu da pilha!");
				else
					System.out.println("Pilha vazia!");
				break;
				
			case 3:
				pilha.imprimirPilha();
				break;

			default:
				System.out.println("Operação inválida!\n");
				break;
			}
			
		}while(opcao != 0);
	}

}
