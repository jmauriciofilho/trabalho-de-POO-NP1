package br.com.models;

/**
 * Created by mauricio on 24/03/17.
 */
public class Data {

	private String dia;
	private String diaDaSemana;
	private String mes;
	private int ano;
	private int hora;

	public Data(String  dia, String mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(String  dia, String mes, int ano, int hora){
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

	public Data(String dia, String diaDaSemana, String mes, int ano, int hora){
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

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}
}
