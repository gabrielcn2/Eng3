package Model;

public class Telefone
{
  private int telefonePai;
  private int telefoneMae;
  private int telefoneOutros;
  
  public Telefone(int p, int m, int o)
  {
	  telefonePai = p;
	  telefoneMae = m;
	  telefoneOutros = o;
  }
  



  public int getTelefonPai() { return telefonePai; }
  
  public int getTelefoneMae() { return telefoneMae; }
  
  public int getTelefoneOutros() { return telefoneOutros; }
  


  public void setTelefonePai(int p) { telefonePai = p; }
  
  public void setTelefoneMae(int m) { telefoneMae = m; }
  
  public void setTelefoneOutros(int o) { telefoneOutros = o; }
}
