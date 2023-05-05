package br.com.fag.entities;

public class Cargo {
    private static final String[] cargosColaborados = {
            "0 - Piloto",
            "1 - Comissário de Vool",
            "2 - Segurança",
    };

    private Long codigo;
    private String descricao;

    private CompanhiaAerea companhiaAerea;

    public Cargo(Long codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
