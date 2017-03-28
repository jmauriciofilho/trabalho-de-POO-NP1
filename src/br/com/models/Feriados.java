package br.com.models;

/**
 * Created by mauricio and zeky on 11/03/17.
 */
public class Feriados {

	private String nome;
	private PadraoData data = new PadraoData();
	private boolean nacional;

	public Feriados(String nome, String data, boolean nacional) {
		this.nome = nome;
		this.data.setApenasData(data);
		this.nacional = nacional;
	}

	public void mostrar(){
		System.out.println("=Nome: " + getNome());
		System.out.println("=Data: " + data.getApenasData());
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

	public boolean isNacional() {
		return nacional;
	}

	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}

	public PadraoData getData() {
		return data;
	}

	public void setData(PadraoData data) {
		this.data = data;
	}
}
