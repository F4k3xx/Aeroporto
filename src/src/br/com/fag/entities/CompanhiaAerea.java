package br.com.fag.entities;

public class CompanhiaAerea {

    private Long codigo;
    private Aviao descricao;

    public CompanhiaAerea(Long codigo, Aviao descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Aviao getDescricao() {
        return descricao;
    }

    public void setDescricao(Aviao descricao) {
        this.descricao = descricao;
    }

    public void method(){
        
    }
}
