package br.com.fag.entities;

public class Cargo {

    private Long codigo;
    private CompanhiaAerea descricao;

    public Cargo(Long codigo, CompanhiaAerea descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public CompanhiaAerea getDescricao() {
        return descricao;
    }

    public void setDescricao(CompanhiaAerea descricao) {
        this.descricao = descricao;
    }
}
