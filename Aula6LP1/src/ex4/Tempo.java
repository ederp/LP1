package ex4;

import java.util.Calendar;

public abstract class Tempo {

	private Calendar dataHoraInicial;
	private Calendar dataHoraFinal;
	
	public Calendar getDataHoraInicial() {
		return dataHoraInicial;
	}
	public void setDataHoraInicial(String dhi) {
		this.dataHoraInicial = Calendar.getInstance();
		int year, month, date, hourOfDay, minute;
		year = Integer.parseInt(dhi.substring(6, 8));
		month = Integer.parseInt(dhi.substring(3, 5)) - 1;
		date = Integer.parseInt(dhi.substring(0, 2));
		hourOfDay = Integer.parseInt(dhi.substring(9, 11));
		minute = Integer.parseInt(dhi.substring(12));
		this.dataHoraInicial.set(year, month, date, hourOfDay, minute);
	}
	public Calendar getDataHoraFinal() {
		return dataHoraFinal;
	}
	public void setDataHoraFinal(String dhf) {
		this.dataHoraFinal = Calendar.getInstance();
		int year, month, date, hourOfDay, minute;
		year = Integer.parseInt(dhf.substring(6, 8));
		month = Integer.parseInt(dhf.substring(3, 5)) - 1;
		date = Integer.parseInt(dhf.substring(0, 2));
		hourOfDay = Integer.parseInt(dhf.substring(9, 11));
		minute = Integer.parseInt(dhf.substring(12));
		this.dataHoraFinal.set(year, month, date, hourOfDay, minute);
	}
	
	protected abstract double calcularTempo();

}
