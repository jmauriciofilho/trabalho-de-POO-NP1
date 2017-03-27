package br.com.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by mauricio on 11/03/17.
 */
public class Feriados {

	private String nome;
	private Data data;
	private boolean nacional;

	public Feriados(String nome, Data data, boolean nacional) {
		this.nome = nome;
		this.data = data;
		this.nacional = nacional;
	}

	public void mostrar(){
		System.out.println("=Nome: " + getNome());
		System.out.println("=Data: " + data.mostrarData());
		if (isNacional()){
			System.out.println("=Feriado Nacional.");
		}
		System.out.println("==========================");
	}

	public String retornarDiaDaSemana(){
		try {
			String diaDaSemana = null;
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(this.data.mostrarData()));
			int semana = calendar.get(Calendar.DAY_OF_WEEK);
			if (semana == 1){
				diaDaSemana = "Domingo";
			}else if (semana == 2){
				diaDaSemana = "Segunda";
			}else if (semana == 3){
				diaDaSemana = "Terça";
			}else if (semana == 4){
				diaDaSemana = "Quarta";
			}else if (semana == 5){
				diaDaSemana = "Quinta";
			}else if (semana == 6){
				diaDaSemana = "Sexta";
			}else if (semana == 7){
				diaDaSemana = "Sábado";
			}

			return diaDaSemana;
		}catch (ParseException e){
			e.printStackTrace();
			return null;
		}

	}

	public int retornarNumeroDaSemana(){
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(this.data.mostrarData()));
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
			calendar.setTime(simpleFormat.parse(this.data.mostrarData()));
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
			calendar.setTime(simpleFormat.parse(this.data.mostrarData()));
			int mes = calendar.get(Calendar.MONTH);
			return mes;

		}catch (ParseException e){
			e.printStackTrace();
			return 0;
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public boolean isNacional() {
		return nacional;
	}

	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}
}
