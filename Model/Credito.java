package Model;

import java.util.Date;

public class Credito {
	
	private double valorCredito;
	private Date dataCredito;
	private String descCredito;
	
	public Credito(double v, Date d, String c){
		this.valorCredito = v;
		this.dataCredito = d;
		this.descCredito = c;
	}
	
	//GETs
	
	public double getValorCredito(){
		return this.valorCredito;
	}
	public Date getDataCredito(){
		return this.dataCredito;
	}
	public String getDescCredito(){
		return this.descCredito;
	}
	
	//SETs
	public void setValorCredito(double v){
		this.valorCredito = v;
	}
	public void setDataCredito(Date d){
		this.dataCredito = d;
	}
	public void setDescCredito(String c){
		this.descCredito = c;
	}

}
