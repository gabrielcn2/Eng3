package Model;
import java.util.Date; 

public class Debito {
	private double valorDebito;
	private Date dataDebito;
	private String descDebito;
	//private Produto produto;
	
	public Debito(double v, Date d, String s/*, Produto p*/){
		this.valorDebito = v;
		this.dataDebito = d;
		this.descDebito = s;
		//this.produto = p;
	}
	
	//GETs
	
	public double getValorDebito(){
		return this.valorDebito;
	}
	
	public Date getDataDebito(){
		return this.dataDebito;
	}
	public String getDescDebito(){
		return this.descDebito;
	}
	/*public Produto getProduto(){
		return this.produto;
	}*/
	
	//SETs
	
	public void setValorDebito(double v){
		this.valorDebito = v;
	}
	
	public void setDataDebito(Date d){
		this.dataDebito = d;
	}
	public void setDescDebito(String s){
		this.descDebito = s;
	}
	/*public void setProduto(Produto p){
		this.produto = p;
	 */
}
