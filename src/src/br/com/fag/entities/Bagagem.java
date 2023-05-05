package br.com.fag.entities;

import java.util.Scanner;

public class Bagagem {
    private static final int TAXA_POR_KILO = 10;
    private static final Scanner scanner = new Scanner(System.in);

    private Long codigo;
    private String tipo;
    private Double peso;
    private int valorBagagem;
    private Bilhete bilhete;

    public Bagagem() {
    }

    public Bagagem(Long codigo, String tipo, Double peso, int valorBagagem, Bilhete bilhete) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.peso = peso;
        this.valorBagagem = valorBagagem;
        this.bilhete = bilhete;
    }

    public void calcularPeso() {
        System.out.print("Insira o peso da sua bagagem em kg: ");
        double peso = scanner.nextDouble();
        setPeso(peso);
        int preco = (int) (peso * TAXA_POR_KILO);
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

    public int getValorBagagem() {
        return valorBagagem;
    }

    public void setValorBagagem(int valorBagagem) {
        this.valorBagagem = valorBagagem;
    }

    public Bilhete getBilhete() {
        return bilhete;
    }

    public void setBilhete(Bilhete bilhete) {
        this.bilhete = bilhete;
    }

    @Override
    public String toString() {
        return "DADOS BAGAGEM"
                + "\n=============================================="
                + "\nPeso: " + getPeso()
                + "\nValor da Bagagem: " + getValorBagagem();
    }
}
