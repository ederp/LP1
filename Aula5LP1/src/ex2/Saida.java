package ex2;

public class Saida {
	public static void main(String[] args) {
		Materia materia = new Materia();
		materia.setIdMateria(5555555);
		materia.setNome("Linguagem de Programa��o I");
		materia.setCurso("Tecnologia em Analise e Desenvolvimento de Sistemas");
		materia.setPeriodo("Noturno");
		materia.setProfessor("Jos� da Silva", 555555, "Rua Vitoria, 123");
		
		System.out.println("Dados da materia: ");
		System.out.println("C�digo: "+materia.getIdMateria());
		System.out.println("Nome: "+materia.getNome());
		System.out.println("Curso: "+materia.getCurso());
		System.out.println("Periodo: "+materia.getPeriodo());
		System.out.println("\nDados do professor: "+materia.getProfessor());
	}
}
