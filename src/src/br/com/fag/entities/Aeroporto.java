package br.com.fag.entities;

public class Aeroporto {

    private Long codigo;
    private String sigla;
    private Endereco endereco;

    public Aeroporto(Long codigo, String sigla, Endereco endereco) {
        this.codigo = codigo;
        this.sigla = sigla;
        this.endereco = endereco;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "\nSigla " + getSigla()
                + "\nEndereco " + getEndereco()
                + "\n";
    }
}
