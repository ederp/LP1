package ex1e2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arquivo arq = new Arquivo();
		int opcao = -1;
		Scanner entrada = new Scanner(System.in);
		String caminhoArquivo, caminhoDiretorio, diretorio, diretorioNovo;
		
		do {
			System.out.println("\nPrograma de manipula��o de arquivos e diret�rios."
								+"Digite uma das seguintes op��es:");
			System.out.println("1 para criar um arquivo"+
								"\n2 para excluir um arquivo"+
								"\n3 para renomear um arquivo"+
								"\n4 para mover um arquivo"+
								"\n5 para criar um diret�rio"+
								"\n6 para excluir um diret�rio"+
								"\n7 para renomear um diret�rio"+
								"\n8 para mover um diret�rio"+
								"\n9 para criar um arquivo e escrever um texto nesse mesmo arquivo"+
								"\n10 para ler um arquivo"+
								"\n11 para exibir informa��es sobre um arquivo"+
								"\n12 para exibir informa��es sobre um diret�rio"+
								"\n13 para exibir todos os arquivos e subdiret�rios de um diret�rio"+
								"\n0 para encerrar");
			try {
				opcao = entrada.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println();
			}
						
			entrada.nextLine();
			
			switch (opcao) {
			case 0:
				System.out.println("Programa encerrado!");
				entrada.close();
				break;
				
			case 1:
				System.out.println("Digite o nome e o caminho do arquivo: ");
				caminhoArquivo = entrada.nextLine();
				arq.criarArquivo(caminhoArquivo);
				break;
				
			case 2:
				System.out.println("Digite o nome e o caminho do arquivo: ");
				caminhoArquivo = entrada.nextLine();
				arq.excluirArquivo(caminhoArquivo);
				break;
				
			case 3:
				System.out.println("Digite o nome e o caminho do arquivo: ");
				caminhoArquivo = entrada.nextLine();
				System.out.println("Digite o novo nome do arquivo: ");
				String novoNome = entrada.nextLine();
				arq.renomearArquivo(caminhoArquivo, novoNome);
				break;
				
			case 4:
				System.out.println("Digite o nome e o caminho do arquivo: ");
				caminhoArquivo = entrada.nextLine();
				System.out.println("Digite o novo destino do arquivo: ");
				String novoCaminho = entrada.nextLine();
				arq.moverArquivo(caminhoArquivo, novoCaminho);
				break;
				
			case 5:
				System.out.println("Digite o caminho do diret�rio: ");
				diretorio = entrada.nextLine();
				arq.criarDiretorio(diretorio);
				break;
				
			case 6:
				System.out.println("Digite o caminho do diret�rio: ");
				diretorio = entrada.nextLine();
				arq.excluirDiretorio(diretorio);
				break;
				
			case 7:
				System.out.println("Digite o caminho atual do diret�rio: ");
				diretorio = entrada.nextLine();
				System.out.println("Digite o caminho novo do diret�rio: ");
				diretorioNovo = entrada.nextLine();
				arq.renomearDiretorio(diretorio, diretorioNovo);
				break;
				
			case 8:
				System.out.println("Digite o caminho atual do diret�rio: ");
				diretorio = entrada.nextLine();
				System.out.println("Digite o caminho novo do diret�rio: ");
				diretorioNovo = entrada.nextLine();
				arq.moverDiretorio(diretorio, diretorioNovo);
				break;
				
			case 9:
				System.out.println("Digite o nome e o caminho do arquivo: ");
				caminhoArquivo = entrada.nextLine();
				System.out.println("Escreva o texto a ser inclu�do no arquivo: ");
				String texto = entrada.nextLine();
				arq.criaEEscreveNoArquivo(caminhoArquivo, texto);
				break;
				
			case 10:
				System.out.println("Digite o nome e o caminho do arquivo: ");
				caminhoArquivo = entrada.nextLine();
				System.out.println("Digite 't' para ler todas as linhas do arquivo e"
									+" 'p' para selecionar as linhas do arquivo a serem lidas: ");
				char lerLinhas = entrada.next().charAt(0);
				if(lerLinhas == 't')
					arq.lerArquivo(caminhoArquivo);
				else if(lerLinhas == 'p') {
					try {
						System.out.println("Digite a linha inicial a ser lida: ");
						int linhaIni = entrada.nextInt();
						System.out.println("Digite a linha final a ser lida: ");
						int linhaFinal = entrada.nextInt();
						arq.lerArquivo(caminhoArquivo, linhaIni, linhaFinal);
					}
					catch(InputMismatchException e) {
						System.out.println("Entrada inv�lida!");
					}
				}
				else
					System.out.println("Op��o inv�lida!");
				break;
				
			case 11:
				System.out.println("Digite o nome e o caminho do arquivo: ");
				caminhoArquivo = entrada.nextLine();
				arq.infosDoArquivo(caminhoArquivo);
				break;
				
			case 12:
				System.out.println("Digite o nome e o caminho do diret�rio: ");
				caminhoDiretorio = entrada.nextLine();
				arq.infosDoDiretorio(caminhoDiretorio);
				break;
				
			case 13:
				System.out.println("Digite o nome e o caminho do diret�rio: ");
				caminhoDiretorio = entrada.nextLine();
				arq.infosArqESubdirDoDiretorio(caminhoDiretorio);
				break;
			default:
				System.out.println("Opera��o inv�lida!\n");
				break;
			}
			
			
		}while(opcao != 0);
	}

}
