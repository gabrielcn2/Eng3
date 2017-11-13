package Model;

import java.util.Date;

public class Formacao
{
  private Date data;
  private int horaInicio;
  private int horaFim;
  private int qtdPresente;
  
  public Formacao(Date d, int i, int f, int q) {
	  data = d;
	  horaInicio = i;
	  horaFim = f;
	  qtdPresente = q;
  }
  



  public Date getData() { return data; }
  
  public int getHoraInicio() { return horaInicio; }
  
  public int getHoraFim() { return horaFim; }
  
  public int getqtdPresente() { return qtdPresente; }
  


  public void setData(Date d) { data = d; }
  
  public void setHoraInicio(int i) { horaInicio = i; }
  
  public void setHoraFim(int f) { horaFim = f; }
  
  public void setQtdPresente(int q) { qtdPresente = q; }
}
