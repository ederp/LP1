package a6ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = -1;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Programa de c�lculo de valores. Digite uma das seguintes op��es:");
			System.out.println("1 para calcular raiz quadrada");
			System.out.println("2 para calcular uma pot�ncia");
			System.out.println("3 para calcular um fatorial");
			System.out.println("0 para encerrar ");
			
			try {
				opcao = entrada.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println();
			}
			entrada.nextLine();
						
			switch (opcao) {
			case 0:
				entrada.close();
				break;
			
			case 1:
				System.out.println("Digite o valor desejado da raiz: ");
				try {
					double raiz = entrada.nextDouble();
					System.out.println("A raiz de "+raiz+" � igual a "+Calculo.ExecutarCalculo(raiz));
				}
				catch(InputMismatchException e) {
					System.out.println("Entrada inv�lida!");
					entrada.nextLine();
				}
				break;
				
			case 2:
				System.out.println("Digite o valor da base: ");
				try {
					double base = entrada.nextDouble();
					System.out.println("Digite o valor do expoente: ");
					double expoente = entrada.nextDouble();
					System.out.println("Pot�ncia igual a "+Calculo.ExecutarCalculo(base, expoente));
				}
				catch(InputMismatchException e) {
					System.out.println("Entrada inv�lida!");
					entrada.nextLine();
				}
				break;
				
			case 3:
				System.out.println("Digite o valor desejado do fatorial: ");
				try {
					int fatorial = entrada.nextInt();
					if(fatorial < 0)
						System.out.println("N�o existe fatorial de n�mero negativo!");
					else
						System.out.println("O fatorial de "+fatorial+" � igual a "+Calculo.ExecutarCalculo(fatorial));
				}
				catch(InputMismatchException e) {
					System.out.println("Entrada inv�lida!");
					entrada.nextLine();
				}
				break;

			default:
				System.out.println("Opera��o inv�lida!\n");
				break;
			}
			
		}while(opcao != 0);
		
		System.out.println("Programa encerrado!");
	}

}
