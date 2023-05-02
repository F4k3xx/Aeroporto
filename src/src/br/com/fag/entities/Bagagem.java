package br.com.fag.entities;

public class Bagagem {

    private Long codigo;
    private String tipo;
    private Double peso;
    private Bilhete bilhete;

    public Bagagem(Long codigo, String tipo, Double peso, Bilhete bilhete) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.peso = peso;
        this.bilhete = bilhete;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Bilhete getBilhete() {
        return bilhete;
    }

    public void setBilhete(Bilhete bilhete) {
        this.bilhete = bilhete;
    }
}
