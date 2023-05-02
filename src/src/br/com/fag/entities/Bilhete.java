package br.com.fag.entities;

public class Bilhete {

    private int numero;
    private int assento;
    private int passagero;
    private Horario horario;
    private String situacao;

    public Bilhete() {
    }

    public Bilhete(int numero, int assento, int passagero, Horario horario, String situacao) {
        this.numero = numero;
        this.assento = assento;
        this.passagero = passagero;
        this.horario = horario;
        this.situacao = situacao;
    }

    public int getNumeor() {
        return numero;
    }

    public void setNumeor(int numero) {
        this.numero = numero;
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

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
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
