package br.com.models;

import java.util.ArrayList;
import java.util.List;

public class Compromissos {

    private int codigo;
    private String titulo;
    private String descricao;
    private boolean diaInteiro;
    private PadraoData dataCompleta = new PadraoData();
    private PadraoData dtFinal = new PadraoData();
    private List<Compromissos> repeticoes = new ArrayList<>();


    public Compromissos(int codigo){
        this.codigo = codigo;
    }

    public Compromissos(int codigo, String titulo, String descricao, String dataDiaInteiro, boolean diaInteiro){
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.diaInteiro = diaInteiro;
        this.dataCompleta.setApenasData(dataDiaInteiro);
    }


    public Compromissos(int codigo, String titulo, String descricao,
                        String dataHoraInicio, String dataHoraFim){
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCompleta.setDataHora(dataHoraInicio);
        this.dtFinal.setDataHora(dataHoraFim);
    }

    public void mostrar(){
        System.out.println("=Código: " + getCodigo());
        System.out.println("=Título: " + getTitulo());
        System.out.println("=Descrição: " + getDescricao());
        if (isDiaInteiro()){
            System.out.println("===========Dia: "+ dataCompleta.getApenasData() +" ===========");
            System.out.println("=Evento programado para o dia inteiro.");
        }else {
            System.out.println("=Duração: \n" +
                    "=De: "+ dataCompleta.getApenasData() + " às " + dataCompleta.getApenasHora()+
                    "\n=Até: "+ dtFinal.getApenasData()+ " às " + dtFinal.getApenasHora());
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


    public PadraoData getDataCompleta() {
        return dataCompleta;
    }

    public void setDataCompleta(PadraoData dataCompleta) {
        this.dataCompleta = dataCompleta;
    }

    public PadraoData getDtFinal() {
        return dtFinal;
    }

    public void setDtFinal(PadraoData dtFinal) {
        this.dtFinal = dtFinal;
    }

    public void repetirCompromissos(Compromissos c, String escolhaDiaMesAno, int repeticao) {
        Compromissos[] datasRepeticao = new Compromissos[repeticao];
        this.repeticoes.add(c);
        int repetir = 1;

        for (int i = 1; i < datasRepeticao.length; i++) {
            c.getDataCompleta().repetirData(escolhaDiaMesAno, repetir++);
            this.repeticoes.add(c);
        }
    }
}
