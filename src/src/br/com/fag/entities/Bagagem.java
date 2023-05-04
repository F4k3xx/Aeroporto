package br.com.fag.entities;

import java.util.Locale;
import java.util.Scanner;

public class Bagagem {

    private static final int TAXA_POR_KILO = 10;

    private Long codigo;
    private String tipo;
    private Double peso;
    private Double valorBagagem;
    private Bilhete bilhete;

    public Bagagem(){}

    public Bagagem(Long codigo, String tipo, Double peso, Double valorBagagem, Bilhete bilhete) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.peso = peso;
        this.valorBagagem = valorBagagem;
        this.bilhete = bilhete;
    }

    public void calculaPeso(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o peso da sua bagagem em kg: ");
        double peso = sc.nextDouble();
        setPeso(peso);

        double preco = peso * TAXA_POR_KILO;

        setValorBagagem(preco);
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

    public Double getValorBagagem() {
        return valorBagagem;
    }

    public void setValorBagagem(Double valorBagagem) {
        this.valorBagagem = valorBagagem;
    }

    public Bilhete getBilhete() {
        return bilhete;
    }

    public void setBilhete(Bilhete bilhete) {
        this.bilhete = bilhete;
    }

    public String toString() {
        return "\nPeso " + getPeso()
                + "\nValor da Bagagem " + getValorBagagem();
    }
}
