package br.com.models;

/**
 * Created by mauricio on 11/03/17.
 */
public class Aniversario {

	private String nomeAniversariante;
	private String data;
	private String dataFesta;
	private String horaFesta;

	public Aniversario(String nomeAniversariante, String data, String dataFesta, String horaFesta) {
		this.nomeAniversariante = nomeAniversariante;
		this.data = data;
		this.dataFesta = dataFesta;
		this.horaFesta = horaFesta;
	}

	public String getNomeAniversariante() {
		return nomeAniversariante;
	}

	public void setNomeAniversariante(String nomeAniversariante) {
		this.nomeAniversariante = nomeAniversariante;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
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
