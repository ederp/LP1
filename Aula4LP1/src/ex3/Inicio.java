package ex3;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cliente[] clientes = new Cliente[10];
		int opcao, i = 0;
		
		do {
			System.out.println("Escolha uma das seguintes opções: "+
					"\n0: Sair"+
					"\n1: Inserir cliente"+
					"\n2: Consultar cliente específico"+
					"\n3: Consultar clientes");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 0:
				System.out.println("Programa encerrado!");
				break;
			case 1:
				//gera automaticamente o código
				clientes[i].setCodigo(clientes[i].getCodigo() + 1);
				System.out.println("Digite o nome do cliente : ");
				if(! clientes[i].setNome(sc.nextLine())) {
					System.out.println("Nome inválido! Deve ser informado o nome e sobrenome do cliente");
					System.out.println("Digite o nome do cliente : ");
					clientes[i].setNome(sc.nextLine());
				}
				System.out.println("Digite o cpf do cliente : ");
				if(! clientes[i].setCpf(sc.nextLine())) {
					System.out.println("Cpf inválido! O Cpf deve ter exatamente 11 dígitos");
					System.out.println("Digite o cpf do cliente : ");
					clientes[i].setCpf(sc.nextLine());
				}
				i++;
				break;
			case 2:
				System.out.println("Digite o código do cliente: ");
				int entrada = sc.nextInt() - 1;
				System.out.println("Código: "+clientes[entrada].getCodigo()+
						"\nNome: "+clientes[entrada].getNome()+
						"\nCPF"+clientes[entrada].getCpf());
				break;
			case 3:
				for(Cliente c: clientes) {
					System.out.println("Código: "+c.getCodigo()+
							"\nNome: "+c.getNome()+
							"\nCPF"+c.getCpf());
				}
				break;

			default:
				System.out.println("Opção inválida!");
				System.out.println();
				break;
			}
			
		}while(opcao != 0);
		sc.close();
	}

}
