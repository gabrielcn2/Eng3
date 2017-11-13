package Model;

public class LocalDeEvento {
	
	private String cidade;
	private String bairro;
	private String rua;
	private String pontoEncontro;
	
	public LocalDeEvento(String cidade, String bairro, String rua, String pontoEncontro){
		
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.pontoEncontro = pontoEncontro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getPontoEncontro() {
		return pontoEncontro;
	}

	public void setPontoEncontro(String pontoEncontro) {
		this.pontoEncontro = pontoEncontro;
	}
	

}
