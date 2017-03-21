package br.com.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
    Calendar dtInicio = Calendar.getInstance();
    Calendar dtFim = Calendar.getInstance();
    DateFormat dtForm = new SimpleDateFormat("dd/MM/yyyy HH:mm");

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

    public String [] repetirData(String escolhaDiaMesAno, int repeticao){
        String [] datasRepeticao = new String[repeticao*2];
        try {
            dtInicio.setTime(dtForm.parse(this.getDataHoraInicio()));
            dtFim.setTime(dtForm.parse(this.getDataHoraFim()));
        } catch (ParseException e) {
            System.out.println("Data informada errada");
            e.getStackTrace();
        }
        int d=0, m=0, a=0;
        if(escolhaDiaMesAno == "DIA"){
            d=1;
        }
        if(escolhaDiaMesAno == "MES" || escolhaDiaMesAno == "MÊS"){
            m = 1;
        }
        if (escolhaDiaMesAno == "ANO"){
            a = 1;
        }

        for (int i = 0; i < datasRepeticao.length; i ++) {
            dtInicio.set(dtInicio.get(Calendar.YEAR) + a,dtInicio.get(Calendar.MONTH) + m,
                    dtInicio.get(Calendar.DAY_OF_MONTH)+ d);
            datasRepeticao[i] = dtForm.format(dtInicio.getTime());
            dtFim.set(dtInicio.get(Calendar.YEAR) + a,dtInicio.get(Calendar.MONTH) + m,
                    dtInicio.get(Calendar.DAY_OF_MONTH)+ d);
            datasRepeticao[++i] = dtForm.format(dtInicio.getTime());
            System.out.println(dtInicio.getTime());
        }

        return datasRepeticao;
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

    public void setDataHoraInicio(String dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public String getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(String dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }


}
