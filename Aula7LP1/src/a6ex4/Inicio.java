package a6ex4;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao = -1;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Programa de calculo de diferença de tempo. Digite uma das seguintes opções:");
			System.out.println("1 para diferença de dias");
			System.out.println("2 para diferença de horas");
			System.out.println("0 para encerrar ");

			String dataHoraInicial, dataHoraFinal;
			DecimalFormat df = new DecimalFormat("##0.00");
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
				System.out.println("Programa encerrado!");
				break;
				
			case 1:
				System.out.println("Entre com a data inicial no formato dd/mm/yy HH:mm: ");
				dataHoraInicial = entrada.nextLine();
				System.out.println("Entre com a data final no formato dd/mm/yy HH:mm: ");
				dataHoraFinal = entrada.nextLine();
				Dia dia = new Dia(dataHoraInicial, dataHoraFinal);
				System.out.println("A diferença equivale a "+df.format(dia.calcularTempo())+" dias");
				break;
				
			case 2:
				System.out.println("Entre com a data inicial no formato dd/mm/yy HH:mm: ");
				dataHoraInicial = entrada.nextLine();
				System.out.println("Entre com a data final no formato dd/mm/yy HH:mm: ");
				dataHoraFinal = entrada.nextLine();
				Hora hora = new Hora(dataHoraInicial, dataHoraFinal);
				System.out.println("A diferença equivale a "+df.format(hora.calcularTempo())+" horas");
				break;

			default:
				System.out.println("Operação inválida!\n");
				break;
			}			
		}while(opcao != 0);		
	}

}
