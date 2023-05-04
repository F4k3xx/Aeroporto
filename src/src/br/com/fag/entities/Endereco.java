package br.com.fag.entities;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Endereco {

    private Long codigo;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco() {
    }

    public Endereco(Long codigo, String logradouro, String bairro, String cidade, String estado, String pais) {
        this.codigo = codigo;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public void dadosEndereco(Endereco endereco) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Inserir dados Endereço
        System.out.println("Logradouro: ");
        endereco.setLogradouro(sc.next());
        System.out.println("Bairro: ");
        endereco.setBairro(sc.next());
        System.out.println("Cidade: ");
        endereco.setCidade(sc.next());
        System.out.println("Estado: ");
        endereco.setEstado(sc.next());
        System.out.println("Pais; ");
        endereco.setPais(sc.next());
        System.out.println(this);
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "\nLogradouro: " + getLogradouro()
                + "\nBairro: " + getBairro()
                + "\nCidade:" + getCidade()
                + "\nEstado: " + getEstado()
                + "\nPais: " + getPais();
    }
}
