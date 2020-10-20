package ex2;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Programa de c�lculo de valores. Digite uma das seguintes op��es:");
			System.out.println("1 para calcular raiz quadrada");
			System.out.println("2 para calcular uma pot�ncia");
			System.out.println("3 para calcular um fatorial");
			System.out.println("0 para encerrar ");
			opcao = entrada.nextInt();
			entrada.nextLine();
						
			switch (opcao) {
			case 0:
				entrada.close();
				break;
			
			case 1:
				System.out.println("Digite o valor desejado da raiz: ");
				double raiz = entrada.nextDouble();
				System.out.println("A raiz de "+raiz+" � igual a "+Calculo.ExecutarCalculo(raiz));
				break;
				
			case 2:
				System.out.println("Digite o valor da base: ");
				double base = entrada.nextDouble();
				System.out.println("Digite o valor do expoente: ");
				double expoente = entrada.nextDouble();
				System.out.println("Pot�ncia igual a "+Calculo.ExecutarCalculo(base, expoente));
				break;
				
			case 3:
				System.out.println("Digite o valor desejado do fatorial: ");
				int fatorial = entrada.nextInt();
				System.out.println("O fatorial de "+fatorial+" � igual a "+Calculo.ExecutarCalculo(fatorial));
				break;

			default:
				System.out.println("Opera��o inv�lida!\n");
				break;
			}
			
		}while(opcao != 0);
		
		System.out.println("Programa encerrado!");
	}

}
