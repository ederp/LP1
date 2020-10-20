package a4ex3;

public class Cliente {
	private int codigo;
	private String nome;
	private String cpf;
	
	void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	boolean setNome(String nome) {
		if(nome.contains(" ")) {
			this.nome = nome;
			return true;
		}
			
		return false;
	}
	boolean setCpf(String cpf) {
		if(cpf.length() == 11) {
			this.cpf = cpf;
			return true;
		}
		return false;
	}
	int getCodigo() {
		return codigo;
	}
	String getNome() {
		return nome;
	}
	String getCpf() {
		return cpf;
	}
}
