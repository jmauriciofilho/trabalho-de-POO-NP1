package br.com.models;

<<<<<<< HEAD
public class Tarefas {

	private int codigo;
    private String descricao;
=======

/**
 * Created by mauricio on 11/03/17.
 */
public class Tarefas {

	private int codigo;
	private String descricao;
>>>>>>> 15b88e62077950ed4c7b89a6eccaf2096c00f147
	private int prioridade;
	private String dataDeConclusao;
	private boolean concluida;

<<<<<<< HEAD
	public Tarefas(String descricao, int prioridade, String dataDeConclusao, boolean concluida) {
=======

	public Tarefas(int codigo){
		this.codigo = codigo;
	}

	public Tarefas(int codigo, String descricao, int prioridade, String dataDeConclusao, boolean concluida) {
		this.codigo = codigo;
>>>>>>> 15b88e62077950ed4c7b89a6eccaf2096c00f147
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.dataDeConclusao = dataDeConclusao;
		this.concluida = concluida;
	}

<<<<<<< HEAD
	public void mostrar(){
		System.out.println("=Tarefa");
		System.out.println("=Descrição: " + getDescricao());
		System.out.println("=Data de Conclusão: " + getDataDeConclusao());

=======
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
>>>>>>> 15b88e62077950ed4c7b89a6eccaf2096c00f147
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
>>>>>>> 15b88e62077950ed4c7b89a6eccaf2096c00f147
