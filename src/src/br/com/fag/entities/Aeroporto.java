package br.com.fag.entities;

public class Aeroporto {

    private int codigo;
    private double carga;
    private String sigla;
    private Endereco endereco;

    public Aeroporto(int codigo, double carga, String sigla, Endereco endereco) {
        this.codigo = codigo;
        this.carga = carga;
        this.sigla = sigla;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
