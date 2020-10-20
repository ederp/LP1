package ex1e2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Arquivo {
	private File arq, dir;
	
	//op��o 1
	public void criarArquivo(String caminhoNome) {
		arq = new File(caminhoNome);
		if(! arq.exists()) {
			try {
				if(arq.createNewFile())
					System.out.println("Arquivo criado com sucesso!");
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
		else
			System.out.println("O arquivo j� existe!");
	}
	
	//op��o 2
	public void excluirArquivo(String caminhoNome) {
		arq = new File(caminhoNome);
		if(arq.exists()) {
			if(arq.delete())
				System.out.println("Arquivo exclu�do com sucesso!");
		}
		else
			System.out.println("O arquivo n�o existe!");
	}
	
	//op��o 3
	public void renomearArquivo(String nomeAntigo, String nomeNovo) {
		arq = new File(nomeAntigo);
		File arq2 = new File(nomeNovo);
		if(arq.exists()) {
			if(arq.renameTo(arq2))
				System.out.println("Arquivo renomeado!");
		}
		else
			System.out.println("O arquivo n�o existe!");
	}
	
	//op��o 4
	public void moverArquivo(String localAtual, String novoDestino) {
		arq = new File(localAtual);
		File arq2 = new File(novoDestino);
		if(arq.exists()) {
			if(arq.renameTo(arq2))
				System.out.println("Arquivo movido!");
		}
		else
			System.out.println("O arquivo n�o existe!");
	}
	
	//op��o 5
	public void criarDiretorio(String diretorio) {
		dir = new File(diretorio);
		if(! dir.exists()) {
			if(dir.mkdirs())
				System.out.println("Diret�rio criado!");
		}
		else
			System.out.println("O diret�rio j� existe!");
	}
	
	//op��o 6
	public void excluirDiretorio(String diretorio) {
		dir = new File(diretorio);
		if(dir.exists()) {
			if(dir.delete())
				System.out.println("Diret�rio exclu�do!");
			else
				System.out.println("O diret�rio n�o est� vazio!");
		}
		else
			System.out.println("O caminho ou diret�rio n�o existe!");
	}
	
	//op��o 7
	public void renomearDiretorio(String nomeAtual, String nomeNovo) {
		dir = new File(nomeAtual);
		File dir2 = new File(nomeNovo);
		if(dir.exists()) {
			if(dir.renameTo(dir2))
				System.out.println("Diret�rio renomeado!");
			else
				System.out.println("O caminho de destino n�o existe ou "+
								"o diret�rio de origem est� vazio!");
		}
		else
			System.out.println("O caminho ou diret�rio de origem n�o existe!");
	}
	
	//op��o 8
	public void moverDiretorio(String localAtual, String novoDestino) {
		dir = new File(localAtual);
		File dir2 = new File(novoDestino);
		if(dir.exists()) {
			if(dir.renameTo(dir2))
				System.out.println("Diret�rio movido!");
			else
				System.out.println("O caminho de destino n�o existe ou "+
								"o diret�rio de origem est� vazio!");
		}
		else
			System.out.println("O caminho ou diret�rio de origem n�o existe!");
	}
	
	//op��o 9
	public void criaEEscreveNoArquivo(String caminhoArquivo, String texto) {
		try {
			FileWriter fw = new FileWriter(caminhoArquivo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(texto);
			bw.append(" ");
			bw.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//op��o 10 (ler todas as linhas)
	public void lerArquivo(String caminhoArquivo) {
		try {
			FileReader fr = new FileReader(caminhoArquivo);
			BufferedReader br = new BufferedReader(fr);
			String linha;
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			br.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//op��o 10 (ler linhas informadas pelo usuario)
	public void lerArquivo(String caminhoArquivo, int inicio, int fim) {
		try {
			FileReader fr = new FileReader(caminhoArquivo);
			BufferedReader br = new BufferedReader(fr);
			String linha;
			int cont = 0;
			while(cont <= fim) {
				if((linha = br.readLine()) != null && cont >= inicio - 1)
					System.out.println(linha);
				cont++;
			}
			br.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//op��o 11
	public void infosDoArquivo(String caminhoArquivo) {
		arq = new File(caminhoArquivo);
		if(arq.exists()) {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(arq.lastModified());
			String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:ss").format(cal.getTime());
			
			System.out.println("�ltima modifica��o: "+dataHora
								+"\nCaminho: "+arq.getPath()
								+"\nDiret�rio pai: "+arq.getParent()
								+"\nTamanho: "+arq.length()+" bytes");
		}
		else
			System.out.println("O arquivo n�o existe!");
	}
	
	//op��o 12
	public void infosDoDiretorio(String caminhoDiretorio) {
		dir = new File(caminhoDiretorio);
		if(dir.exists()) {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(dir.lastModified());
			String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:ss").format(cal.getTime());
			
			System.out.println("�ltima modifica��o: "+dataHora
								+"\nCaminho: "+dir.getPath()
								+"\nDiret�rio pai: "+dir.getParent()
								+"\nTamanho: "+dir.length()+" bytes");
		}
		else
			System.out.println("O diret�rio n�o existe!");
	}
	
	//op��o 13
	public void infosArqESubdirDoDiretorio(String caminhoDiretorio) {
		dir = new File(caminhoDiretorio);
		if(dir.exists()) {

			for(String a: dir.list()) {
				System.out.println(a);
			}
			
			System.out.println("Arquivos e diret�rios existentes\n(com caminho): ");
			for(File a: dir.listFiles()) {
				System.out.println(a);
			}			
		}
		else
			System.out.println("O diret�rio n�o existe!");
	}

}
