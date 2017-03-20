package br.com.models;

/**
 * Created by mauricio on 08/03/17.
 */
public class Compromissos {

    private int codigo;
    private String titulo;
    private String descricao;
    private boolean diaInteiro;
    private String dataHoraInicio;
    private String dataHoraFim;

    public Compromissos(int codigo){
        this.codigo = codigo;
    }

    public Compromissos(int codigo, String titulo, String descricao, boolean diaInteiro){
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.diaInteiro = diaInteiro;
    }

    public Compromissos(int codigo, String titulo, String descricao, String dataHoraInicio, String dataHoraFim){
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
    }

    public void mostrar(){
        System.out.println("=Código: " + getCodigo());
        System.out.println("=Título: " + getTitulo());
        System.out.println("=Descrição: " + getDescricao());
        if (isDiaInteiro()){
            System.out.println("=Evento programado para o dia inteiro.");
        }else {
            System.out.println("=Duração: " + getDataHoraInicio() + " à " + getDataHoraFim());
        }
        System.out.println("=================================================");
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

}
