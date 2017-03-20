package br.com.models;

public class Aniversario {

	private int codigo;
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

	public void mostrar(){
		System.out.println("=Aniversario");
		System.out.println("=Aniversariante: " + getNomeAniversariante());
		System.out.println("=Data: " + getData());
		System.out.println("=Data da Festa: " + getDataFesta());
		System.out.println("=Hora da Festa: " + getHoraFesta());
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
