package br.com.fag.entities;

public class SituaçãoBilete {

    private Long codigo;
    private Bilhete descricao;

    public SituaçãoBilete(Long codigo, Bilhete descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Bilhete getDescricao() {
        return descricao;
    }

    public void setDescricao(Bilhete descricao) {
        this.descricao = descricao;
    }
}
