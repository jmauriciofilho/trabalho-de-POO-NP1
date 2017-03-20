package br.com.models;

public class Feriados {

    private String nome;
    private String data;
    private boolean nacional;

    public Feriados(String nome, String data, boolean nacional) {
        this.nome = nome;
        this.data = data;
        this.nacional = nacional;
    }

    public String toString(){
        System.out.println("=Feriado");
        System.out.println("=Nome: " + getNome());
        System.out.println("=Data: " + getData());
        if (isNacional()){
            System.out.println("=Feriado Nacional.");
        }
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }
}
