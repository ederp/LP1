package ex4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conjunto conjunto = new Conjunto();
		int opcao = -1;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("\nPrograma de manipulação de conjunto de produtos. Digite uma das seguintes opções:");
			System.out.println("1 para inserir produtos no primeiro conjunto"+
								"\n2 para inserir produtos no segundo conjunto"+
								"\n3 para consultar todos os produtos dos dois conjuntos"+
								"\n4 para consultar apenas produtos em comum nos dois conjuntos"+
								"\n5 para consultar produtos do primeiro conjunto que não existem no segundo conjunto"+
								"\n6 para consultar se o primeiro conjunto está contido no segundo conjunto"+
								"\n0 para encerrar");
			
			try {
				opcao = entrada.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println();
			}
			
			TreeSet<String> produtos = new TreeSet<String>();
			int qtde = 0;
						
			entrada.nextLine();
			
			switch (opcao) {
			case 0:
				System.out.println("Programa encerrado!");
				entrada.close();
				break;
				
			case 1:
				System.out.println("Digite a quantidade de produtos (em número): ");
				try {
					qtde = entrada.nextInt();
					entrada.nextLine();
				}
				catch(InputMismatchException e) {
					System.out.println("Entrada inválida!");
				}
				for(int i = 1; i <= qtde; i++) {
					System.out.println("Digite o nome do produto "+i+": ");
					String prod = entrada.nextLine();
					produtos.add(prod);
				}
				conjunto.inserirConjunto1(produtos);
				break;
				
			case 2:
				System.out.println("Digite a quantidade de produtos (em número): ");
				try {
					qtde = entrada.nextInt();
					entrada.nextLine();
				}
				catch(InputMismatchException e) {
					System.out.println("Entrada inválida!");
				}
				for(int i = 1; i <= qtde; i++) {
					System.out.println("Digite o nome do produto "+i+": ");
					String prod = entrada.nextLine();
					produtos.add(prod);
				}
				conjunto.inserirConjunto2(produtos);
				break;
				
			case 3:
				conjunto.consultaTodosProdutos();
				break;
				
			case 4:
				conjunto.consultaProdutosEmComum();
				break;
				
			case 5:
				conjunto.consultaDiferencaProdutos();
				break;
				
			case 6:
				if(! conjunto.produtosContidos())
					System.out.println("O conjunto 1 não está contido no conjunto 2");
				else
					System.out.println("O conjunto 1 está contido no conjunto 2");
				break;

			default:
				System.out.println("Operação inválida!\n");
				break;
			}
			
		}while(opcao != 0);
	}

}
