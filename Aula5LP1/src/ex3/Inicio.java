package ex3;

import java.util.Scanner;

public class Inicio {
	
	static PessoaFisica[] pf = new PessoaFisica[10];
	static PessoaJuridica[] pj = new PessoaJuridica[10];
	
	//método auxiliar na remoção de pessoa física ou jurídica buscando o cliente pelo código
	public static Cliente buscaCliente(int cod) {
		if (pf[cod - 1].getCodigo() == cod)
			return pf[cod - 1];
		if (pj[cod - 1].getCodigo() == cod)
			return pj[cod - 1];
		return null;
	}
	
	//método auxiliar na impressão da lista de pessoas físicas
	public static void imprimeListaPessoasFisicas() {
		for(PessoaFisica pes: pf) {
			if(pes != null)
				System.out.println(pes.getCodigo()+" "+pes.getNome()+" "+
		pes.getCpf()+" "+pes.getEndereco()+" "+pes.getTelefone());
		}
	}
	
	//método auxiliar na impressão da lista de pessoas jurídicas
	public static void imprimeListaPessoasJuridicas() {
		for(PessoaJuridica pes: pj) {
			if(pes != null)
				System.out.println(pes.getCodigo()+" "+pes.getRazaoSocial()+" "+
		pes.getCnpj()+" "+pes.getEndereco()+" "+pes.getTelefone());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao = -1, codigoPf = 0, codigoPj = 0, codigoCli = 0;
		char cli;
		
		while(opcao != 0) {
			System.out.println("Programa de operação de clientes. Digite uma das seguintes opções:");
			System.out.println("1 para inserir clientes");
			System.out.println("2 para remover clientes");
			System.out.println("3 para consultar clientes");
			System.out.println("0 para encerrar ");
			Scanner entrada = new Scanner(System.in);
			opcao = entrada.nextInt();
			entrada.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("Digite uma das seguintes opções:\nf para pessoa física\nj para pessoa juridica ");
				cli = entrada.next().charAt(0);
				entrada.nextLine();
				if(cli == 'f' || cli == 'F') {
					PessoaFisica pessoaf = new PessoaFisica();
					System.out.println("Digite o nome do cliente: ");
					String nome = entrada.nextLine();
					pessoaf.setNome(nome);
					//entrada.nextLine();
					System.out.println("Digite o CPF do cliente: ");
					String cpf = entrada.next();
					pessoaf.setCpf(cpf);
					entrada.nextLine();
					System.out.println("Digite o endereço do cliente: ");
					String endereco = entrada.nextLine();
					pessoaf.setEndereco(endereco);
					//entrada.nextLine();
					System.out.println("Digite o telefone do cliente: ");
					String telefone = entrada.next();
					pessoaf.setTelefone(telefone);
					entrada.nextLine();
					codigoCli++;
					pessoaf.setCodigo(codigoCli);
					pf[codigoPf] = pessoaf;
					codigoPf++;
					System.out.println("Pessoa física cadastrada com sucesso!");
				}
				else if(cli == 'j' || cli == 'J') {
					PessoaJuridica pessoaj = new PessoaJuridica();
					System.out.println("Digite a razão social do cliente: ");
					String rs = entrada.nextLine();
					pessoaj.setRazaoSocial(rs);
					//entrada.nextLine();
					System.out.println("Digite o CNPJ do cliente: ");
					String cnpj = entrada.next();
					pessoaj.setCnpj(cnpj);
					entrada.nextLine();
					System.out.println("Digite o endereço do cliente: ");
					String endereco = entrada.nextLine();
					pessoaj.setEndereco(endereco);
					//entrada.nextLine();
					System.out.println("Digite o telefone do cliente: ");
					String telefone = entrada.next();
					pessoaj.setTelefone(telefone);
					entrada.nextLine();
					codigoCli++;
					pessoaj.setCodigo(codigoCli);
					pj[codigoPj] = pessoaj;
					codigoPj++;
					System.out.println("Pessoa jurídica cadastrada com sucesso!");
				}
				else System.out.println("Opção inválida!");
				break;
				
			case 2:
				System.out.println("Digite uma das seguintes opções:\nf para pessoa física\nj para pessoa juridica ");
				cli = entrada.next().charAt(0);
				if(cli == 'f' || cli == 'F') {
					System.out.println("Insira o código do cliente: ");
					int codigo = entrada.nextInt();
					if (buscaCliente(codigo) == null)
						System.out.println("Cliente ou código inexistente!");
					else {
						pf[buscaCliente(codigo).getCodigo() - 1] = null;
						System.out.println("Remoção realizada com sucesso!");
					}
				}
				else if(cli == 'j' || cli == 'J') {
					System.out.println("Insira o código do cliente: ");
					int codigo = entrada.nextInt();
					if (buscaCliente(codigo) == null)
						System.out.println("Cliente ou código inexistente!");
					else {
						pj[buscaCliente(codigo).getCodigo() - 1] = null;
						System.out.println("Remoção realizada com sucesso!");
					}
				}
				else System.out.println("Opção inválida!");
				break;
				
			case 3:
				System.out.println("Lista de pessoas físicas: ");
				imprimeListaPessoasFisicas();
				System.out.println("Lista de pessoas jurídicas: ");
				imprimeListaPessoasJuridicas();
				break;
				
			case 0:
				entrada.close();
				break;

			default:
				System.out.println("Operação inválida!\n");
				break;
			}
		}
		
		System.out.println("Programa encerrado!\n");
		
	}

}
