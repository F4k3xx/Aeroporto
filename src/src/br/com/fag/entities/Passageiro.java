package br.com.fag.entities;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Passageiro extends Pessoa {

    private Long codigo;
    private String passaporte;

    public Passageiro(){}

    public Passageiro(String nome, String email, String telefone, Date nascimento, String rg, String cpf, Endereco endereco, Long codigo, String passaporte) {
        this.codigo = codigo;
        this.passaporte = passaporte;
    }

    public void insirirPassaporte() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu passaporte: ");
        String passaporte = sc.next();

        setPassaporte(passaporte);
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

    @Override
    public String toString(){
        return "\nPassaporte: " + getPassaporte();
    }
}
