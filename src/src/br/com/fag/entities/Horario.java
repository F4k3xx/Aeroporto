package br.com.fag.entities;

import java.util.Date;

public class Horario{

    private int codigo;
    private Date dataPartida;
    private  Date dataChegada;
    private Date ClasseVoo;

    public Horario() {
    }

    public Horario(int codigo, Date dataPartida, Date dataChegada, Date classeVoo) {
        this.codigo = codigo;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        ClasseVoo = classeVoo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Date getClasseVoo() {
        return ClasseVoo;
    }

    public void setClasseVoo(Date classeVoo) {
        ClasseVoo = classeVoo;
    }
}
