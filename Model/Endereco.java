package Model;

public class Endereco
{
  private String bairro;
  private String rua;
  private int numRes;
  private int telefone;
  
  public Endereco(String b, String r, int n, int t)
  {
	  bairro = b;
	  rua = r;
	  numRes = n;
	  telefone = t;
  }
  


  public String getBairro() { return bairro; }
  
  public String getRua() { return rua; }
  
  public int getNumRes() { return numRes; }
  
  public int getTelefone() { return telefone; }
  


  public void setBairro(String b) { bairro = b; }
  
  public void setRua(String r) { rua = r; }
  
  public void setNumRes(int n) { numRes = n; }
  
  public void setTelefone(int t) { telefone = t; }
}
