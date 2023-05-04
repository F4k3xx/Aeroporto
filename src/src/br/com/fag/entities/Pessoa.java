package br.com.fag.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Pessoa {

    private Long codigo;
    private String nome;
    private String email;
    private String telefone;
    private Date nascimento;
    private String rg;
    private String cpf;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(Long codigo, String nome, String email, String telefone, Date nascimento, String rg, String cpf, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String dateNascimento() {
        String dateNascimentoFomat = new SimpleDateFormat("yyyy-MM-dd").format(this.nascimento);
        return dateNascimentoFomat;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone() {
        this.telefone = telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento() {
        this.nascimento = nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg() {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf() {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome()
                + "\nEmail: " + getEmail()
                + "\nTelefone: " + getTelefone()
                + "\nNascimento: " + dateNascimento()
                + "\nRg: " + getRg()
                + "\nCpf: " + getCpf()
                + "\nEndereco: " + getEndereco();
    }
}
