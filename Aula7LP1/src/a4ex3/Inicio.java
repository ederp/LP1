package a4ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cliente[] clientes = new Cliente[10];
		int opcao = -1, i = 0;
		
		do {
			System.out.println("Escolha uma das seguintes opções: "+
					"\n0: Sair"+
					"\n1: Inserir cliente"+
					"\n2: Consultar cliente específico"+
					"\n3: Consultar clientes");
			try {
				opcao = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println();
			}
			
			sc.nextLine();
			
			switch (opcao) {
			case 0:
				sc.close();
				System.out.println("Programa encerrado!");
				break;
			case 1:
				Cliente cliente = new Cliente();
				boolean ent;
				do {
					System.out.println("Digite o nome do cliente: ");
					ent  = cliente.setNome(sc.nextLine());
				}while(ent == false);
				do {
					System.out.println("Digite o cpf do cliente: ");
					ent = cliente.setCpf(sc.next());
				}while(ent == false);
				//gera automaticamente o código
				cliente.setCodigo(i + 1);
				clientes[i] = cliente;
				i++;
				break;
			case 2:
				System.out.println("Digite o código do cliente: ");	
				try {
					int entrada = sc.nextInt() - 1;
					System.out.println("Código: "+clientes[entrada].getCodigo()+
							"\nNome: "+clientes[entrada].getNome()+
							"\nCPF: "+clientes[entrada].getCpf());
				}catch(NullPointerException | InputMismatchException e) {
					if(e.getClass().toString().equals("class java.Lang.NullPointerException"))
						System.out.println("Código inexistente!");
					else if(e.getClass().toString().equals("class java.util.InputMismatchException"))
						System.out.println("Código inválido!");
				}
				break;
			case 3:
				for(Cliente c: clientes) {
					if (c != null)
						System.out.println("Código: "+c.getCodigo()+
							"\nNome: "+c.getNome()+
							"\nCPF: "+c.getCpf());
				}
				break;

			default:
				System.out.println("Opção inválida!\n");
				break;
			}
			
		}while(opcao != 0);
	}

}
