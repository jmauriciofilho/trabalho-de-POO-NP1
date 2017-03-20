package br.com.models;

<<<<<<< HEAD
/**
 * Created by mauricio on 11/03/17.
 */
public class Aniversario {

	private int codigo;
	private String nomeAniversariante;
=======
public class Aniversario {

	private int codigo;
    private String nomeAniversariante;
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
	private String data;
	private String dataFesta;
	private String horaFesta;

<<<<<<< HEAD
	public Aniversario(int codigo){
		this.codigo = codigo;
	}

	public Aniversario(int codigo, String nomeAniversariante, String data, String dataFesta, String horaFesta) {
		this.codigo = codigo;
=======
	public Aniversario(String nomeAniversariante, String data, String dataFesta, String horaFesta) {
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
		this.nomeAniversariante = nomeAniversariante;
		this.data = data;
		this.dataFesta = dataFesta;
		this.horaFesta = horaFesta;
	}

	public void mostrar(){
<<<<<<< HEAD
=======
		System.out.println("=Aniversario");
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
		System.out.println("=Aniversariante: " + getNomeAniversariante());
		System.out.println("=Data: " + getData());
		System.out.println("=Data da Festa: " + getDataFesta());
		System.out.println("=Hora da Festa: " + getHoraFesta());
<<<<<<< HEAD
		System.out.println("=======================================");
=======
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
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
