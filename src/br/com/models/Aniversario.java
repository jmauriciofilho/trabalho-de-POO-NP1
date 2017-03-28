package br.com.models;


/**
 * Created by mauricio and zeky on 11/03/17.
 */
public class Aniversario {

	private int codigo;
	private String nomeAniversariante;
	private PadraoData dataNiver = new PadraoData();
	private PadraoData dataFesta = new PadraoData();

	public Aniversario(int codigo){
		this.codigo = codigo;
	}

	public Aniversario(int codigo, String nomeAniversariante, String dataNiver, String dataFesta, String horaFesta) {
		this.codigo = codigo;
		this.nomeAniversariante = nomeAniversariante;
		this.dataNiver.setApenasData(dataNiver);
		this.dataFesta.setApenasData(dataFesta);
		this.dataFesta.setApenasHora(horaFesta);
	}

	public void mostrar(){
		System.out.println("=Aniversariante: " + getNomeAniversariante());
		System.out.println("=Data: " + dataNiver.getApenasData());
		System.out.println("=Data da Festa: " + this.dataFesta.getApenasData());
		System.out.println("=Hora da Festa: " + this.dataFesta.getApenasHora());
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

	public PadraoData getDataNiver() {
		return dataNiver;
	}

	public void setDataNiver(PadraoData dataNiver) {
		this.dataNiver = dataNiver;
	}

	public PadraoData getDataFesta() {
		return dataFesta;
	}

	public void setDataFesta(PadraoData dataFesta) {
		this.dataFesta = dataFesta;
	}
}
