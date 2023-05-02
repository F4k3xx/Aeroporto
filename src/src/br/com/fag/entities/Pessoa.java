package br.com.fag.entities;

import java.util.Date;

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
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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
        return "Nome: " + nome
                + ", Email: " + email
                + ", Telefone: " + telefone
                + ", Nascimento: " + nascimento
                + ", Rg: " + rg
                + ", Cpf: " + cpf;
    }
}
