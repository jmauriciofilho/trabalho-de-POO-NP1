package br.com.models;

<<<<<<< HEAD
/**
 * Created by mauricio on 11/03/17.
 */
public class Tarefas {

	private int codigo;
	private String descricao;
=======
public class Tarefas {

	private int codigo;
    private String descricao;
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
	private int prioridade;
	private String dataDeConclusao;
	private boolean concluida;

<<<<<<< HEAD
	public Tarefas(int codigo){
		this.codigo = codigo;
	}

	public Tarefas(int codigo, String descricao, int prioridade, String dataDeConclusao, boolean concluida) {
		this.codigo = codigo;
=======
	public Tarefas(String descricao, int prioridade, String dataDeConclusao, boolean concluida) {
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.dataDeConclusao = dataDeConclusao;
		this.concluida = concluida;
	}

<<<<<<< HEAD
	public void completarTarefa(){
		this.concluida = true;
	}

	public void mostrar(){
		System.out.println("=Código: " + getCodigo());
		System.out.println("=Descrição: " + getDescricao());
		System.out.println("=Prioridade: " + getPrioridade());
		System.out.println("=Data de Conclusão: " + getDataDeConclusao());
		System.out.println("=Concluida: " + isConcluida());
		System.out.println("======================================");
=======
	public void mostrar(){
		System.out.println("=Tarefa");
		System.out.println("=Descrição: " + getDescricao());
		System.out.println("=Data de Conclusão: " + getDataDeConclusao());

>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
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

	public String getDataDeConclusao() {
		return dataDeConclusao;
	}

	public void setDataDeConclusao(String dataDeConclusao) {
		this.dataDeConclusao = dataDeConclusao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
