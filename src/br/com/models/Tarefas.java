package br.com.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by mauricio on 11/03/17.
 */
public class Tarefas {

	private int codigo;
	private String descricao;
	private int prioridade;
	private Data dataDeConclusao;
	private boolean concluida;

	public Tarefas(int codigo){
		this.codigo = codigo;
	}

	public Tarefas(int codigo, String descricao, int prioridade, Data dataDeConclusao, boolean concluida) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.dataDeConclusao = dataDeConclusao;
		this.concluida = concluida;
	}

	public void completarTarefa(){
		this.concluida = true;
	}

	public void mostrar(){
		System.out.println("=Código: " + getCodigo());
		System.out.println("=Descrição: " + getDescricao());
		System.out.println("=Prioridade: " + getPrioridade());
		System.out.println("=Data de Conclusão: " + dataDeConclusao.mostrarData());
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

	public Data getDataDeConclusao() {
		return dataDeConclusao;
	}

	public void setDataDeConclusao(Data dataDeConclusao) {
		this.dataDeConclusao = dataDeConclusao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
}
