package Model;
import java.util.LinkedList;
import java.util.Date;

public class Coordenador extends Treineiro{
	
	private Date dataInicCord;
	
	public Coordenador(int w, String n, Date dn, String s, int r, String en, int t, String p, String u, String sn, Date di, Date dataInicTrein, Voluntario voluntario, Date dataInicCord){
		super(w, n, dn, s, r, en, t, p, u, sn, di, dataInicTrein, voluntario);
		this.dataInicCord = dataInicCord;
	}
	
	LinkedList<Voluntario> listaVoluntario = new LinkedList<Voluntario>();
	LinkedList<Treineiro> listaTreineiro = new LinkedList<Treineiro>();
	LinkedList<Brincadeira> listaBrincadeira = new LinkedList<Brincadeira>();
	LinkedList<LocalDeEvento> listaLocalDeEvento = new LinkedList<LocalDeEvento>();
	LinkedList<Produto> listaProduto = new LinkedList<Produto>();
	LinkedList<Evento> listaEvento = new LinkedList<Evento>();
	LinkedList<Formacao> listaFormacao = new LinkedList<Formacao>();
	LinkedList<Debito> listaDebito = new LinkedList<Debito>();
	LinkedList<Credito> listaCredito = new LinkedList<Credito>();
	
	//GETS AND SETS
	public Date getDataInicCord() {
		return dataInicCord;
	}

	public void setDataInicCord(Date dataInicCord) {
		this.dataInicCord = dataInicCord;
	}
	
//METODOS
	
	
	//CADASTRAR
	
	public void cadastrarVoluntario(Voluntario voluntario){
		listaVoluntario.add(voluntario);
		
	}
	public void cadastrarTreineiro(Treineiro treineiro){
		listaTreineiro.add(treineiro);
	}
	public void cadastrarBrincadeira(Brincadeira brincadeira){
		listaBrincadeira.add(brincadeira);
	}
	public void cadastrarLocalDeEvento(LocalDeEvento localDeEvento){
		listaLocalDeEvento.add(localDeEvento);
	}
	public void cadastrarProduto(Produto produto){
		listaProduto.add(produto);
	}
	public void cadastrarEvento(Evento evento){
		listaEvento.add(evento);
	}
	public void cadastrarFormacao(Formacao formacao){
		listaFormacao.add(formacao);
	}
	public void cadastrarDebito(Debito debito){
		listaDebito.add(debito);
	}
	public void cadastrarCredito(Credito credito){
		listaCredito.add(credito);
	}
	
	
	
	//EXCLUIR
	
	public void excluirVoluntario(Voluntario voluntario){
		listaVoluntario.remove(voluntario);
	}
	public void excluirBrincadeira(Brincadeira brincadeira){
		listaBrincadeira.remove(brincadeira);
	}
	public void excluirLocalDeEvento(LocalDeEvento localDeEvento){
		listaLocalDeEvento.remove(localDeEvento);
	}
	public void excluirProduto(Produto produto){
		listaProduto.remove(produto);
	}
	public void excluirEvento(Evento evento){
		listaEvento.remove(evento);
	}
	public void excluirFormacao(Formacao formacao){
		listaFormacao.remove(formacao);
	}
	public void excluirDebito(Debito debito){
		listaDebito.remove(debito);
	}
	public void excluirCredito(Credito credito){
		listaCredito.remove(credito);
	}
	
	
}