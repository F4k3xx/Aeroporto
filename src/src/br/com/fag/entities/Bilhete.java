package br.com.fag.entities;

public class Bilhete {

    private int numero;
    private int assento;
    private Passageiro passagero;
    private Horario horario;
    private SituaçãoBilete situacao;

    public Bilhete(int numero, int assento, Passageiro passagero, Horario horario, SituaçãoBilete situacao) {
        this.numero = numero;
        this.assento = assento;
        this.passagero = passagero;
        this.horario = horario;
        this.situacao = situacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public Passageiro getPassagero() {
        return passagero;
    }

    public void setPassagero(Passageiro passagero) {
        this.passagero = passagero;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public SituaçãoBilete getSituacao() {
        return situacao;
    }

    public void setSituacao(SituaçãoBilete situacao) {
        this.situacao = situacao;
    }

    public Bilhete() {
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
