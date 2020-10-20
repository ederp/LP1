package ex3;

public class PesquisaInicio extends Pesquisa{

	@Override
	public final boolean buscarString(String cadeiaCaracteres) {
		// TODO Auto-generated method stub
		return getTexto().startsWith(cadeiaCaracteres);
	}
}
