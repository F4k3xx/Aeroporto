package br.com.fag.entities;

public enum SituacaoBilhete {

    CONFIRMADO(1),
    ATRASADO(2),
    CANCELADO(3);

    public int situacaoBilhete;

    SituacaoBilhete(int tipo) {
        situacaoBilhete = tipo;
    }

    public int getTipo() {
        return(situacaoBilhete);
    }
}
