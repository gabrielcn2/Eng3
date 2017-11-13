package Model;

import java.util.List;

public class Economia {
	private Credito credito;
	private Debito debito;
	private double valorNaConta;
	private double resultado1 = 0;
	private double resultado2 = 0;
	
	public Economia(Credito c, Debito d, double v){
		this.credito = c;
		this.debito = d;
		this.valorNaConta = v;
	}
	
	//GETs
	
	public Credito getCredito(){
		return this.credito;
	}
	
	public Debito getDebito(){
		return this.debito;
	}
	public double getValorConta(){
		return this.valorNaConta;
	}
	
	//SETs
	
	public void setCredito(Credito c){
		this.credito = c;
	}
	public void setDebito(Debito d){
		this.debito = d;
	}
	public void setValorNaConta(double v){
		this.valorNaConta = v;
	}
	
	//METODOS
	
	public double calcularEconomia(List<Credito> listaCredito, List<Debito> listaDebito){
		for(Credito credito: listaCredito){ resultado1 += credito.getValorCredito();}
		for(Debito debito: listaDebito ){resultado2 = resultado1 - debito.getValorDebito();}
		return resultado2;
	}
}