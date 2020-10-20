package ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fila fila = new Fila();
		int opcao = -1;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("\nPrograma de manipulação de fila de pessoas. Digite uma das seguintes opções:");
			System.out.println("1 para inserir uma pessoa na fila"+
								"\n2 para remover uma pessoa da fila"+
								"\n3 para imprimir a fila completa"+
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
				System.out.println("Digite o nome da pessoa: ");
				nome = entrada.nextLine();
				fila.inserirPessoa(nome);
				System.out.println("Pessoa inserida com sucesso!");
				break;
				
			case 2:
				nome = fila.removerPessoa();
				if(nome != null)
					System.out.println(nome+" saiu da fila!");
				else
					System.out.println("Fila vazia!");
				break;
				
			case 3:
				fila.imprimirFila();
				break;

			default:
				System.out.println("Operação inválida!\n");
				break;
			}
			
		}while(opcao != 0);
	}

}
