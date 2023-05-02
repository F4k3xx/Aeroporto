package br.com.fag.entities;

import java.util.Date;

public class Horario{

    private Long codigo;
    private String numeroDoPontoDeDorigem;
    private String numeroDoPontoDeDestino;
    private Date dataPartida;
    private  Date dataChegada;
    private String ClasseVoo;

    public Horario() {
    }

    public Horario(String numeroDoPontoDeDorigem, String numeroDoPontoDeDestino, Date dataPartida, Date dataChegada, String classeVoo) {
        this.numeroDoPontoDeDorigem = numeroDoPontoDeDorigem;
        this.numeroDoPontoDeDestino = numeroDoPontoDeDestino;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        ClasseVoo = classeVoo;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getClasseVoo() {
        return ClasseVoo;
    }

    public void setClasseVoo(String classeVoo) {
        ClasseVoo = classeVoo;
    }

    public String getNumeroDoPontoDeDorigem() {
        return numeroDoPontoDeDorigem;
    }

    public void setNumeroDoPontoDeDorigem(String numeroDoPontoDeDorigem) {
        this.numeroDoPontoDeDorigem = numeroDoPontoDeDorigem;
    }

    public String getNumeroDoPontoDeDestino() {
        return numeroDoPontoDeDestino;
    }

    public void setNumeroDoPontoDeDestino(String numeroDoPontoDeDestino) {
        this.numeroDoPontoDeDestino = numeroDoPontoDeDestino;
    }

    @Override
    public String toString(){
        return "Cidade de Origem: " + numeroDoPontoDeDorigem
                + "\nCidade de Destino: " + numeroDoPontoDeDestino
                + "\nDataPartida: " + dataPartida
                + "\nDataChegada: " + dataChegada
                + "\nClasseVoo: " + ClasseVoo;
    }
}
