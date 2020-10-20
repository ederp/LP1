package a6ex4;

public class Hora extends Tempo{
	

	public Hora(String dhi, String dhf) {
		setDataHoraInicial(dhi);
		setDataHoraFinal(dhf);
	}
	
	@Override
	protected double calcularTempo() {
		// TODO Auto-generated method stub
		Long diferenca = getDataHoraFinal().getTimeInMillis() - getDataHoraInicial().getTimeInMillis();
		double dif2 = (double)diferenca;
		dif2 /= (60 * 60 * 1000);
		return dif2;
	}

}
