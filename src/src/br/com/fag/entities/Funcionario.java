package br.com.fag.entities;

import java.util.Date;

public class Funcionario extends Pessoa{

    private Long codigo;
    private int contaCorrente;

    public Funcionario(String nome, String email, String telefone, Date nascimento, String rg, String cpf, Endereco endereco, Long codigo, int contaCorrente) {
        super(nome, email, telefone, nascimento, rg, cpf, endereco);
        this.codigo = codigo;
        this.contaCorrente = contaCorrente;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public int getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(int contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
