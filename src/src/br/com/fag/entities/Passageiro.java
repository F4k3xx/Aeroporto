package br.com.fag.entities;

import java.util.Date;

public class Passageiro extends Pessoa{

    private Long codigo;
    private String passaporte;

    public Passageiro(){

    }
    public Passageiro(String nome, String email, String telefone, Date nascimento, String rg, String cpf, Endereco endereco, Long codigo, String passaporte) {
        this.codigo = codigo;
        this.passaporte = passaporte;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
}
