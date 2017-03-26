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

	public String retornarDiaDaSemana(){
		try {
			String diaSemana = null;
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(this.dataDeConclusao.mostrarData()));
			int semana = calendar.get(Calendar.DAY_OF_WEEK);
			if (semana == 1){
				diaSemana = "Domingo";
			}else if (semana == 2){
				diaSemana = "Segunda";
			}else if (semana == 3){
				diaSemana = "Terça";
			}else if (semana == 4){
				diaSemana = "Quarta";
			}else if (semana == 5){
				diaSemana = "Quinta";
			}else if (semana == 6){
				diaSemana = "Sexta";
			}else if (semana == 7){
				diaSemana = "Sábado";
			}

			return diaSemana;
		}catch (ParseException e){
			e.printStackTrace();
			return null;
		}

	}

	public int retornarNumeroDaSemana(){
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(this.dataDeConclusao.mostrarData()));
			int numeroSemana = calendar.get(Calendar.WEEK_OF_MONTH);
			return numeroSemana;

		}catch (ParseException e){
			e.printStackTrace();
			return 0;
		}

	}

	public int retornarNumeroDoDiaDoAno(){
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(this.dataDeConclusao.mostrarData()));
			int numeroDoDiaDoAno = calendar.get(Calendar.DAY_OF_YEAR);
			return numeroDoDiaDoAno;

		}catch (ParseException e){
			e.printStackTrace();
			return 0;
		}

	}

	public int retornarNumeroMes(){
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(this.dataDeConclusao.mostrarData()));
			int mes = calendar.get(Calendar.MONTH);
			return mes;

		}catch (ParseException e){
			e.printStackTrace();
			return 0;
		}

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
