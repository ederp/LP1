package ex3;

public class PesquisaFim extends Pesquisa{
	
	@Override
	public final boolean buscarString(String cadeiaCaracteres) {
		// TODO Auto-generated method stub
		return getTexto().endsWith(cadeiaCaracteres);
	}

}
