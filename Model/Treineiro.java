package Model;
import java.util.Date;


public class Treineiro extends Voluntario{
  
	private Date dataInicTrein;
	private Voluntario voluntario;
  
	public Treineiro(int w, String n, Date dn, String s, int r, String en, int t, String p, String u, String sn, Date di, Date dataInicTrein, Voluntario voluntario) {
		super(w, n, dn, s, r, en, t, p, u, sn, di);
		this.dataInicTrein = dataInicTrein;
		this.voluntario = voluntario;
	}
	
	
	public Date getDataInicTrein() {
		return dataInicTrein;
	}
	
	public void setDataInicTrein(Date dataInicTrein) {
		this.dataInicTrein = dataInicTrein;
	}
	
	public Voluntario getVoluntario() {
		return voluntario;
	}
	
	public void setVoluntario(Voluntario voluntario) {
		this.voluntario = voluntario;
	}
	  
}
