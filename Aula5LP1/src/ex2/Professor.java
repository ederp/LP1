package ex2;

public class Professor {
	private String nome;
	private int matricula;
	private String endereco;
	
	public Professor() {
		
	}
	
	public void setProfessor(String nome, int matricula, String endereco) {
		this.nome = nome;
		this.matricula = matricula;
		this.endereco = endereco;
	}
	
	public String getProfessor() {
		return ("\n Nome: "+ this.nome +
				"\n Matricula: "+ this.matricula +
				"\n Endereco: "+ this.endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
