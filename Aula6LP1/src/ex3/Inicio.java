package ex3;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao;
		Pesquisa pesquisa = new Pesquisa();
		PesquisaInicio pi = new PesquisaInicio();
		PesquisaFim pf = new PesquisaFim();
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Programa de manipula��o de textos. Digite uma das seguintes op��es:");
			System.out.println("1 para inserir um texto");
			System.out.println("2 para buscar um subtexto");
			System.out.println("3 para buscar um subtexto no come�o");
			System.out.println("4 para buscar um subtexto no final");
			System.out.println("0 para encerrar ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch (opcao) {
			case 0:
				entrada.close();
				break;
			
			case 1:
				System.out.println("Digite o texto: ");
				String texto = entrada.nextLine();
				pesquisa.setTexto(texto);
				System.out.println("Texto inserido!");
				break;
				
			case 2:
				System.out.println("Digite o subtexto a ser buscado: ");
				texto = entrada.nextLine();
				if(pesquisa.buscarString(texto) == true)
					System.out.println("O subtexto est� contido no texto!");
				else
					System.out.println("O subtexto n�o est� contido no texto!");
				break;
				
			case 3:
				System.out.println("Digite o subtexto a ser buscado: ");
				texto = entrada.nextLine();
				if(pi.buscarString(texto) == true)
					System.out.println("O subtexto est� contido no come�o do texto!");
				else
					System.out.println("O subtexto n�o est� contido no come�o do texto!");
				break;
				
			case 4:
				System.out.println("Digite o subtexto a ser buscado: ");
				texto = entrada.nextLine();
				if(pf.buscarString(texto) == true)
					System.out.println("O subtexto est� contido no final do texto!");
				else
					System.out.println("O subtexto n�o est� contido no final do texto!");
				break;

			default:
				System.out.println("Opera��o inv�lida!\n");
				break;
			}
			
		}while(opcao != 0);
		
		System.out.println("Programa encerrado!");
	}

}
