package Model;

import java.util.Date;



public class Evento{
	
	private Date data;
	private int horaInicio;
	private int horaFim;
	private String brincadeiras;
	private String localDeEvento;
	private Economia economia;
	
	public Evento(Date data, int horaInicio, int horaFim, String brincadeiras, String localDeEvento, Economia economia){
		
		this.data = data;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.brincadeiras = brincadeiras;
		this.localDeEvento = localDeEvento;
		this.economia = economia;
	}
	
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(int horaFim) {
		this.horaFim = horaFim;
	}
	public String getBrincadeiras() {
		return brincadeiras;
	}
	public void setBrincadeiras(String brincadeiras) {
		this.brincadeiras = brincadeiras;
	}
	public String getLocalDeEvento() {
		return localDeEvento;
	}
	public void setLocalEvento(String localDeEvento) {
		this.localDeEvento = localDeEvento;
	}
	public Economia getEconomia() {
		return economia;
	}
	public void setEconomia(Economia economia) {
		this.economia = economia;
	}
}
