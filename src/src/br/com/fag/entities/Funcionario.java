package br.com.fag.entities;

import java.util.Date;

public class Funcionario extends Pessoa{

    private Long codigo;
    private int contaCorrente;
    private Cargo cargo;

    public Funcionario (Cargo cargo){
        this.cargo = cargo;
    }
    public Funcionario(Long codigo, String nome, String email, String telefone, Date nascimento, String rg, String cpf, Endereco endereco, Long codigo1, int contaCorrente, Cargo cargo) {
        super(codigo, nome, email, telefone, nascimento, rg, cpf, endereco);
        this.codigo = codigo1;
        this.contaCorrente = contaCorrente;
        this.cargo = cargo;
    }

    public Funcionario(String descricao) {
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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
