package ex4;

public class Dia extends Tempo{
	
	public Dia(String dhi, String dhf) {
		setDataHoraInicial(dhi);
		setDataHoraFinal(dhf);
	}
	
	@Override
	protected double calcularTempo() {
		// TODO Auto-generated method stub
		Long diferenca = getDataHoraFinal().getTimeInMillis() - getDataHoraInicial().getTimeInMillis();
		double dif2 = (double)diferenca;
		dif2 /= (24 * 60 * 60 * 1000);
		return dif2;
	}

}
