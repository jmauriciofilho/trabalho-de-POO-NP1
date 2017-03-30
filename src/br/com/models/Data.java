package br.com.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by mauricio on 24/03/17.
 */
public class Data {

	private String dia;
	private String diaDaSemana;
	private String mes;
	private int ano;
	private String hora;

	public Data(String  dia, String mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(String  dia, String mes, int ano, String hora){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
	}

	public Data(String  dia, String diaDaSemana, String mes, int ano){
		this.dia = dia;
		this.diaDaSemana = diaDaSemana;
		this.mes = mes;
		this.ano = ano;

	}

	public Data(String dia, String diaDaSemana, String mes, int ano, String hora){
		this.dia = dia;
		this.diaDaSemana = diaDaSemana;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
	}

	public String mostrarData(){
		return dia + "/" + mes + "/" + ano;
	}

	public String mostrarDataHora(){
		return dia + "/" + mes + "/" + ano + " " + hora + "h";
	}

	public String retornarDiaDaSemana(Data data) {
		try {
			String diaDaSemana = null;
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(data.mostrarData()));
			int semana = calendar.get(Calendar.DAY_OF_WEEK);
			if (semana == 1) {
				diaDaSemana = "Domingo";
			} else if (semana == 2) {
				diaDaSemana = "Segunda";
			} else if (semana == 3) {
				diaDaSemana = "Terça";
			} else if (semana == 4) {
				diaDaSemana = "Quarta";
			} else if (semana == 5) {
				diaDaSemana = "Quinta";
			} else if (semana == 6) {
				diaDaSemana = "Sexta";
			} else if (semana == 7) {
				diaDaSemana = "Sábado";
			}

			return diaDaSemana;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public int retornarNumeroDaSemana(Data data){
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(data.mostrarData()));
			int numeroSemana = calendar.get(Calendar.WEEK_OF_MONTH);
			return numeroSemana;

		}catch (ParseException e){
			e.printStackTrace();
			return 0;
		}

	}

	public int retornarNumeroDoDiaDoAno(Data data){
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(data.mostrarData()));
			int numeroDoDiaDoAno = calendar.get(Calendar.DAY_OF_YEAR);
			return numeroDoDiaDoAno;

		}catch (ParseException e){
			e.printStackTrace();
			return 0;
		}

	}

	public int retornarNumeroMes(Data data){
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(data.mostrarData()));
			int mes = calendar.get(Calendar.MONTH);
			return mes;

		}catch (ParseException e){
			e.printStackTrace();
			return 0;
		}

	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}
}
