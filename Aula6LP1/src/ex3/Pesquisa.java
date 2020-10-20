package ex3;

public class Pesquisa {
	private static String texto;
		
	
	public Pesquisa() {

	}

	public void setTexto(String textoEntrada){
		texto = textoEntrada;
	}
	
	public String getTexto() {
		return texto;
	}

	public boolean buscarString(String cadeiaCaracteres) {
		return texto.contains(cadeiaCaracteres);
	}
}
