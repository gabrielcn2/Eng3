package Model;


public class Brincadeira {
	
	private String nome;
	private int qtdCriancas;
	private String descricao;
	
	public Brincadeira(String n, int q, String d){
		
		this.nome = n;
		this.qtdCriancas = q;
		this.descricao = d;
	}
	
	//GETS
	public String getNome(){
		return this.nome;
	}
    public int getQtdCriancas(){
    	return this.qtdCriancas;
    }
    public String getDescricao(){
    	return this.descricao;
    }


    //SETs
    public void setNome(String n){
    	this.nome = n;
    }
    public void setQtdCriancas(int q){
    	this.qtdCriancas = q;
    }
    public void setDescricao(String d){
    	this.descricao = d;
    }

}
