package br.com.fag.entities;

public class Rota {

    private Long codigo;
    private String descricao;

    public Rota(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
