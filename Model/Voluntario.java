package Model;

import java.util.Date;

public class Voluntario
{
  private int whatsapp;
  private String nome;
  private Date dtNasc;
  private String sexo;
  private int rg;
  private String end;
  private int telefone;
  private String probl;
  private String usr;
  private String snh;
  private Date dataInscricao;
  
  public Voluntario(int w, String n, Date dn, String s, int r, String en, int t, String p, String u, String sn, Date di) {
    whatsapp = w;
    nome = n;
    dtNasc = dn;
    sexo = s;
    rg = r;
    end = en;
    telefone = t;
    probl = p;
    usr = u;
    snh = sn;
    dataInscricao = di;
  }
  


  public int getWhatsapp() { return whatsapp; }
  
  public String getNome() { return nome; }
  
  public Date getDtNasc() { return dtNasc; }
  
  public String getSexo() { return sexo; }
  
  public int getRg() { return rg; }
  
  public String getEnd() { return end; }
  
  public int getTelefone() { return telefone; }
  
  public String getProbl() { return probl; }
  
  public String getUsr() { return usr; }
  
  public String getSnh() { return snh; }
  
  public Date getDataInscricao() { return dataInscricao; }
  


  public void setWhatsapp(int w) { whatsapp = w; }
  
  public void setNome(String n) { nome = n; }
  
  public void setDtData(Date dn) { dtNasc = dn; }
  
  public void setSexo(String s) { sexo = s; }
  
  public void setRg(int r) { rg = r; }
  
  public void setEnd(String e) { end = e; }
  
  public void setTelefone(int t) { telefone = t; }
  
  public void setProbl(String p) { probl = p; }
  
  public void setUsr(String u) { usr = u; }
  
  public void setSnh(String sn) { snh = sn; }
  
  public void set(Date di) { dataInscricao = di; }
}
