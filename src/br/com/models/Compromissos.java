package br.com.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by mauricio on 08/03/17.
 */
public class Compromissos {

    private int codigo;
    private String titulo;
    private String descricao;
    private boolean diaInteiro;
    private Data dataInicio;
    private Data dataFim;
    private List<Compromissos> repeticoes = new ArrayList<>();


    public Compromissos(int codigo){
        this.codigo = codigo;
    }

    public Compromissos(int codigo, String titulo, String descricao, Data dataInicio, boolean diaInteiro){
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
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
        if (isDiaInteiro()){
            System.out.println("=Evento programado para o dia inteiro.");
            System.out.println("=Compromisso ocorre em: " + dataInicio.mostrarData());
        }else {
            System.out.println("Compromisso começa: " + dataInicio.mostrarDataHora());
            System.out.println("Compromisso termina: " + dataFim.mostrarDataHora());
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

    public Data getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Data getDataFim() {
        return dataFim;
    }

    public void repetirCompromissos(Compromissos c, String escolhaDiaMesAno, int repeticao) {
        Compromissos[] datasRepeticao = new Compromissos[repeticao];
        this.repeticoes.add(c);
        int repetir = 1;

        for (int i = 1; i < datasRepeticao.length; i++) {
            c.getDataInicio().repetirData(escolhaDiaMesAno, repetir++);
            this.repeticoes.add(c);
        }
    }
}
