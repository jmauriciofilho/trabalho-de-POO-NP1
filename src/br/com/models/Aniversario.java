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
		System.out.println("=Data: " + data.mostrarData());
		System.out.println("=Data da Festa: " + getDataFesta());
		System.out.println("=Hora da Festa: " + getHoraFesta());
		System.out.println("=======================================");
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
