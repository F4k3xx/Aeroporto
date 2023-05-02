package br.com.fag.entities;

public class Aviao {

    private Long codigo;
    private Double carga;
    private int quantidadeEconomica;
    private int qunatidadeExecutiva;
    private int quantidadePrimeira;

    public Aviao() {
    }

    public Aviao(Long codigo, Double carga, int quantidadeEconomica, int qunatidadeExecutiva, int quantidadePrimeira) {
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

    public int getQuantidadeEconomica() {
        return quantidadeEconomica;
    }

    public void setQuantidadeEconomica(int quantidadeEconomica) {
        this.quantidadeEconomica = quantidadeEconomica;
    }

    public int getQunatidadeExecutiva() {
        return qunatidadeExecutiva;
    }

    public void setQunatidadeExecutiva(int qunatidadeExecutiva) {
        this.qunatidadeExecutiva = qunatidadeExecutiva;
    }

    public int getQuantidadePrimeira() {
        return quantidadePrimeira;
    }

    public void setQuantidadePrimeira(int quantidadePrimeira) {
        this.quantidadePrimeira = quantidadePrimeira;
    }
}
