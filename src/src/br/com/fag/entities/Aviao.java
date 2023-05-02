package br.com.fag.entities;

public class Aviao {

    private Long codigo;
    private Double carga;
    private Horario quantidadeEconomica;
    private Horario qunatidadeExecutiva;
    private Horario quantidadePrimeira;

    public Aviao() {
    }

    public Aviao(Long codigo, Double carga, Horario quantidadeEconomica, Horario qunatidadeExecutiva, Horario quantidadePrimeira) {
        this.codigo = codigo;
        this.carga = carga;
        this.quantidadeEconomica = quantidadeEconomica;
        this.qunatidadeExecutiva = qunatidadeExecutiva;
        this.quantidadePrimeira = quantidadePrimeira;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public Horario getQuantidadeEconomica() {
        return quantidadeEconomica;
    }

    public void setQuantidadeEconomica(Horario quantidadeEconomica) {
        this.quantidadeEconomica = quantidadeEconomica;
    }

    public Horario getQunatidadeExecutiva() {
        return qunatidadeExecutiva;
    }

    public void setQunatidadeExecutiva(Horario qunatidadeExecutiva) {
        this.qunatidadeExecutiva = qunatidadeExecutiva;
    }

    public Horario getQuantidadePrimeira() {
        return quantidadePrimeira;
    }

    public void setQuantidadePrimeira(Horario quantidadePrimeira) {
        this.quantidadePrimeira = quantidadePrimeira;
    }
}
