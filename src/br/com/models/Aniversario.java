package br.com.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by mauricio on 11/03/17.
 */
public class Aniversario {

	private int codigo;
	private String nomeAniversariante;
	private Data data;
	private String dataFesta;
	private String horaFesta;

	public Aniversario(int codigo){
		this.codigo = codigo;
	}

	public Aniversario(int codigo, String nomeAniversariante, Data data, String dataFesta, String horaFesta) {
		this.codigo = codigo;
		this.nomeAniversariante = nomeAniversariante;
		this.data = data;
		this.dataFesta = dataFesta;
		this.horaFesta = horaFesta;
	}

	public void mostrar(){
		System.out.println("=Aniversariante: " + getNomeAniversariante());
		System.out.println("=Data: " + getData());
		System.out.println("=Data da Festa: " + getDataFesta());
		System.out.println("=Hora da Festa: " + getHoraFesta());
		System.out.println("=======================================");
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeAniversariante() {
		return nomeAniversariante;
	}

	public void setNomeAniversariante(String nomeAniversariante) {
		this.nomeAniversariante = nomeAniversariante;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getDataFesta() {
		return dataFesta;
	}

	public void setDataFesta(String dataFesta) {
		this.dataFesta = dataFesta;
	}

	public String getHoraFesta() {
		return horaFesta;
	}

	public void setHoraFesta(String horaFesta) {
		this.horaFesta = horaFesta;
	}
}
