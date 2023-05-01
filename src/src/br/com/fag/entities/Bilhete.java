package br.com.fag.entities;

import java.util.Date;

public class Bilhete {

    private int numeor;
    private int assento;
    private int passagero;
    private Date horario;
    private String situacao;

    public Bilhete(int numeor, int assento, int passagero, Date horario, String situacao) {
        this.numeor = numeor;
        this.assento = assento;
        this.passagero = passagero;
        this.horario = horario;
        this.situacao = situacao;
    }

    public int getNumeor() {
        return numeor;
    }

    public void setNumeor(int numeor) {
        this.numeor = numeor;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public int getPassagero() {
        return passagero;
    }

    public void setPassagero(int passagero) {
        this.passagero = passagero;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void reservar(Passageiro passageiro){

    }

    public void comprar(){

    }

    public void cancelarReserva(){

    }

    public void checkin(Bagagem bagagem){

    }
}
