package br.com.models;

/**
 * Created by mauricio  and zeky on 11/03/17.
 */
public class Tarefas {

	private int codigo;
	private String descricao;
	private int prioridade;
	private PadraoData dataDeConclusao = new PadraoData();
	private boolean concluida;

	public Tarefas(int codigo){
		this.codigo = codigo;
	}

	public Tarefas(int codigo, String descricao, int prioridade, String dataDeConclusao, boolean concluida) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.dataDeConclusao.setApenasData(dataDeConclusao);
		this.concluida = concluida;
	}

	public void completarTarefa(){
		this.concluida = true;
	}

	public void mostrar(){
		System.out.println("=Código: " + getCodigo());
		System.out.println("=Descrição: " + getDescricao());
		System.out.println("=Prioridade: " + getPrioridade());
		System.out.println("=Data de Conclusão: " + dataDeConclusao.getApenasData());
		System.out.println("=Concluida: " + isConcluida());
		System.out.println("======================================");
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	public PadraoData getDataDeConclusao() {
		return dataDeConclusao;
	}

	public void setDataDeConclusao(PadraoData dataDeConclusao) {
		this.dataDeConclusao = dataDeConclusao;
	}
}
