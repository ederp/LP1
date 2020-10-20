package ex5;

import java.util.Calendar;

public class Dia implements ITempo{
	
	private Calendar dataHoraInicial;
	private Calendar dataHoraFinal;
	
	public Dia(String dhi, String dhf) {
		this.dataHoraInicial = Calendar.getInstance();
		int year, month, date, hourOfDay, minute;
		year = Integer.parseInt(dhi.substring(6, 8));
		month = Integer.parseInt(dhi.substring(3, 5)) - 1;
		date = Integer.parseInt(dhi.substring(0, 2));
		hourOfDay = Integer.parseInt(dhi.substring(9, 11));
		minute = Integer.parseInt(dhi.substring(12));
		this.dataHoraInicial.set(year, month, date, hourOfDay, minute);
		
		this.dataHoraFinal = Calendar.getInstance();
		year = Integer.parseInt(dhf.substring(6, 8));
		month = Integer.parseInt(dhf.substring(3, 5)) - 1;
		date = Integer.parseInt(dhf.substring(0, 2));
		hourOfDay = Integer.parseInt(dhf.substring(9, 11));
		minute = Integer.parseInt(dhf.substring(12));
		this.dataHoraFinal.set(year, month, date, hourOfDay, minute);
	}
	
	@Override
	public double calcularTempo() {
		// TODO Auto-generated method stub
		Long diferenca = dataHoraFinal.getTimeInMillis() - dataHoraInicial.getTimeInMillis();
		double dif2 = (double)diferenca;
		dif2 /= (24 * 60 * 60 * 1000);
		return dif2;
	}

}
