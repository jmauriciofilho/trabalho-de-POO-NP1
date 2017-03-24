package br.com.models;

/**
 * Created by mauricio on 08/03/17.
 */
public class Compromissos {

    private int codigo;
    private String titulo;
    private String descricao;
    private boolean diaInteiro;
    private String repeticao;
    private Data dataInicio;
    private Data dataFim;


    public Compromissos(int codigo){
        this.codigo = codigo;
    }

    public Compromissos(int codigo, String titulo, String descricao, boolean diaInteiro){
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.diaInteiro = diaInteiro;
    }

    public Compromissos(int codigo, String titulo, String descricao, Data dataInicio, Data dataFim){
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void mostrar(){
        System.out.println("=Código: " + getCodigo());
        System.out.println("=Título: " + getTitulo());
        System.out.println("=Descrição: " + getDescricao());
        System.out.println("=Repetição: " + getRepeticao());
        if (isDiaInteiro()){
            System.out.println("=Evento programado para o dia inteiro.");
        }else {
            System.out.println("Compromisso começa: " + dataInicio.mostrarData());
            System.out.println("Compromisso termina: " + dataFim.mostrarData());
        }
        System.out.println("=================================================");
    }

    public void repetirCompromisso(String repeticao){
        this.repeticao = repeticao;
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

    public String getRepeticao(){
        return repeticao;
    }

    public Data getDataInicio() {
        return dataInicio;
    }

    public Data getDataFim() {
        return dataFim;
    }
}
