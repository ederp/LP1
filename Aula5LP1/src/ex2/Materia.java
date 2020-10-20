package ex2;

public class Materia {
	private int idMateria;
	private String nome;
	private String curso;
	private String periodo;
	private Professor professor;
	
	public Materia() {
		this.professor = new Professor();
	}
	
	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getProfessor() {
		return professor.getProfessor();
	}
	public void setProfessor(String nome, int matricula, String endereco) {
		this.professor.setProfessor(nome, matricula, endereco);
	}
	
}
