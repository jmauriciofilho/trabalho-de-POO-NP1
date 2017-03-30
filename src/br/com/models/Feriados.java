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
