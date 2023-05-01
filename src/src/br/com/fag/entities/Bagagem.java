package br.com.fag.entities;

public class Bagagem {

    private Long codigo;
    private String tipo;
    private Double peso;
    private String bilhete;

    public Bagagem(Long codigo, String tipo, Double peso, String bilhete) {
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

    public String getBilhete() {
        return bilhete;
    }

    public void setBilhete(String bilhete) {
        this.bilhete = bilhete;
    }
}
