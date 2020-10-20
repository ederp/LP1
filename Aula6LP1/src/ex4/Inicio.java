package ex4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Programa de calculo de diferen�a de tempo. Digite uma das seguintes op��es:");
			System.out.println("1 para diferen�a de dias");
			System.out.println("2 para diferen�a de horas");
			System.out.println("0 para encerrar ");
			
			String dataHoraInicial, dataHoraFinal;
			DecimalFormat df = new DecimalFormat("##0.00");
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch (opcao) {
			case 0:
				entrada.close();
				break;
			case 1:
				System.out.println("Entre com a data inicial no formato dd/mm/yy HH:mm: ");
				dataHoraInicial = entrada.nextLine();
				System.out.println("Entre com a data final no formato dd/mm/yy HH:mm: ");
				dataHoraFinal = entrada.nextLine();
				Dia dia = new Dia(dataHoraInicial, dataHoraFinal);
				System.out.println("A diferen�a equivale a "+df.format(dia.calcularTempo())+" dias");
				break;
			case 2:
				System.out.println("Entre com a data inicial no formato dd/mm/yy HH:mm: ");
				dataHoraInicial = entrada.nextLine();
				System.out.println("Entre com a data final no formato dd/mm/yy HH:mm: ");
				dataHoraFinal = entrada.nextLine();
				Hora hora = new Hora(dataHoraInicial, dataHoraFinal);
				System.out.println("A diferen�a equivale a "+df.format(hora.calcularTempo())+" horas");
				break;

			default:
				System.out.println("Opera��o inv�lida!\n");
				break;
			}
			
		}while(opcao != 0);
		
		System.out.println("Programa encerrado!");
	}

}
