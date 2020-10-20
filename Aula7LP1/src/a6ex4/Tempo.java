package a6ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Tempo {

	private Calendar dataHoraInicial;
	private Calendar dataHoraFinal;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");

	public Calendar getDataHoraInicial() {
		return dataHoraInicial;
	}
	public void setDataHoraInicial(String dhi) {
		this.dataHoraInicial = Calendar.getInstance();
		try {
			this.dataHoraInicial.setTime(sdf.parse(dhi));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Entrada inválida!");
		}
	}
	public Calendar getDataHoraFinal() {
		return dataHoraFinal;
	}
	public void setDataHoraFinal(String dhf) {
		this.dataHoraFinal = Calendar.getInstance();
		try {
			this.dataHoraFinal.setTime(sdf.parse(dhf));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Entrada inválida!");
		}
	}

	protected abstract double calcularTempo();

}
