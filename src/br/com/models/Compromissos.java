package br.com.models;

<<<<<<< HEAD
/**
 * Created by mauricio on 08/03/17.
 */
=======

>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
public class Compromissos {

    private int codigo;
    private String titulo;
    private String descricao;
<<<<<<< HEAD
    private boolean diaInteiro;
    private String dataHoraInicio;
    private String dataHoraFim;

    public Compromissos(int codigo){
        this.codigo = codigo;
    }
=======
    private String dataHoraInicio;
    private String dataHoraFim;
    private boolean diaInteiro;
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a

    public Compromissos(int codigo, String titulo, String descricao, boolean diaInteiro){
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.diaInteiro = diaInteiro;
    }

<<<<<<< HEAD
    public Compromissos(int codigo, String titulo, String descricao, String dataHoraInicio, String dataHoraFim){
=======
    public Compromissos(int codigo, String titulo, String descricao, String dataHoraInicio, String HoraFim){
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHoraInicio = dataHoraInicio;
<<<<<<< HEAD
        this.dataHoraFim = dataHoraFim;
    }

    public void mostrar(){
        System.out.println("=Código: " + getCodigo());
=======
        this.dataHoraFim = HoraFim;
    }

    public void mostrar(){
        System.out.println("=Compromisso");
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
        System.out.println("=Título: " + getTitulo());
        System.out.println("=Descrição: " + getDescricao());
        if (isDiaInteiro()){
            System.out.println("=Evento programado para o dia inteiro.");
        }else {
            System.out.println("=Duração: " + getDataHoraInicio() + " à " + getDataHoraFim());
        }
<<<<<<< HEAD
        System.out.println("=================================================");
=======
    }

    public void repetir(){

>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDiaInteiro() {
        return diaInteiro;
    }

    public void setDiaInteiro(boolean diaInteiro) {
        this.diaInteiro = diaInteiro;
    }

    public String getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(String dataInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public String getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(String dataFim) {
        this.dataHoraFim = dataHoraFim;
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> b8dad553d2d3cf709a1179b5f119c7798b4a678a
