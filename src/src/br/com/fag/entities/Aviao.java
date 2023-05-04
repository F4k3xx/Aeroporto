package br.com.fag.entities;

public class Aviao {

    private Long codigo;
    private Double carga;

    private int[] quantidadeEconomica = new int[10];
    private int[] quantidadeExecutiva = new int[10];
    private int[] quantidadePrimeira = new int[10];

    public Aviao() {
    }

    public Aviao(Long codigo, Double carga, int[] quantidadeEconomica, int[] quantidadeExecutiva, int[] quantidadePrimeira) {
        this.codigo = codigo;
        this.carga = carga;
        this.quantidadeEconomica = quantidadeEconomica;
        this.quantidadeExecutiva = quantidadeExecutiva;
        this.quantidadePrimeira = quantidadePrimeira;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public int[] getQuantidadeEconomica() {
        return quantidadeEconomica;
    }

    public void setQuantidadeEconomica(int[] quantidadeEconomica) {
        this.quantidadeEconomica = quantidadeEconomica;
    }

    public int[] getQuantidadeExecutiva() {
        return quantidadeExecutiva;
    }

    public void setQuantidadeExecutiva(int[] quantidadeExecutiva) {
        this.quantidadeExecutiva = quantidadeExecutiva;
    }

    public int[] getQuantidadePrimeira() {
        return quantidadePrimeira;
    }

    public void setQuantidadePrimeira(int[] quantidadePrimeira) {
        this.quantidadePrimeira = quantidadePrimeira;
    }
}
