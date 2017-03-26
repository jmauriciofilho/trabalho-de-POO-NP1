package br.com.models;

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
    private Data dataInicio;
    private Data dataFim;


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

    public String retornarDiaDaSemana(Data data){
        try {
            String diaDaSemana = null;
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
            calendar.setTime(simpleFormat.parse(data.mostrarData()));
            int semana = calendar.get(Calendar.DAY_OF_WEEK);
            if (semana == 1){
                diaDaSemana = "Domingo";
            }else if (semana == 2){
                diaDaSemana = "Segunda";
            }else if (semana == 3){
                diaDaSemana = "Terça";
            }else if (semana == 4){
                diaDaSemana = "Quarta";
            }else if (semana == 5){
                diaDaSemana = "Quinta";
            }else if (semana == 6){
                diaDaSemana = "Sexta";
            }else if (semana == 7){
                diaDaSemana = "Sábado";
            }

            return diaDaSemana;
        }catch (ParseException e){
            e.printStackTrace();
            return null;
        }
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

    public Data getDataFim() {
        return dataFim;
    }
}
