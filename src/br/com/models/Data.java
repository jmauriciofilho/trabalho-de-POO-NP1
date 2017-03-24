package br.com.models;

/**
 * Created by mauricio on 24/03/17.
 */
public class Data {

	private int dia;
	private String diaDaSemana;
	private String mes;
	private int ano;
	private int hora;
	private int minuto;

	public Data(int dia, String diaDaSemana, String mes, int ano, int hora, int minuto){
		this.dia = dia;
		this.diaDaSemana = diaDaSemana;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;

	}

	public String mostrarData(){
		return "Data: " + diaDaSemana + " " + dia + " de " + mes + " de " + ano + " Hora: " + hora + ":" + minuto;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
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

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}
}
