package br.com.fag.entities;

import java.text.ParseException;
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

    public Pessoa(Endereco endereco){
        this.endereco = endereco;
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

    public String dateNascimento(Date nascimento) {
        String dateNascimentoFomat = new SimpleDateFormat("yyyy-MM-dd").format(nascimento);
        return dateNascimentoFomat;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = this.nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = this.email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = this.telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = this.nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = this.rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = this.cpf;
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
                + "\nNascimento: " + dateNascimento(nascimento)
                + "\nRg: " + getRg()
                + "\nCpf: " + getCpf()
                + "\nEndereco: " + getEndereco();
    }
}
