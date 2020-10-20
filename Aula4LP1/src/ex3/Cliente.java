package ex3;

public class Cliente {
	private int codigo = 0;
	private String nome;
	private String cpf;
	
	void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	boolean setNome(String nome) {
		if(nome.contains(" "))
			return true;
		return false;
	}
	boolean setCpf(String cpf) {
		if(cpf.length() == 11)
			return true;
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
