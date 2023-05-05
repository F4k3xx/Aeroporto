package br.com.fag.entities;

import java.util.Scanner;

public class Rota {

    private static final int[] VALORES_PASSAGEM = {100, 200, 300, 400, 500, 600};
    private static final String[] DESCRICOES_ROTA = {
            "0 - Tocantins -> Mato Grosso do Sul",
            "1 - São Paulo -> Mato Grosso do Sul",
            "2 - Minas Gerais -> Paraná",
            "3 - Paraná -> Santa Catarina",
            "4 - Rio de Janeiro -> Pernambuco",
            "5 - Rio de Janeiro -> Rio Grande do Sul"
    };

    private static final Scanner SC = new Scanner(System.in);

    private Long codigo;
    private String descricao;
    private int valorPassagem;
    private Aeroporto aeroporto;

    public Rota() {
    }

    public Rota(Long codigo, String descricao, int valorPassagem, Aeroporto aeroporto) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorPassagem = valorPassagem;
        this.aeroporto = aeroporto;
    }

    public void rotasViagem() {
        System.out.println("Rotas disponíveis:");
        for (String descricao : DESCRICOES_ROTA) {
            System.out.println(descricao);
        }

        System.out.print("Selecione sua Rota: ");
        int respostaEstadoSelecionado = SC.nextInt();

        setDescricao(DESCRICOES_ROTA[respostaEstadoSelecionado]);
        setValorPassagem(VALORES_PASSAGEM[respostaEstadoSelecionado]);
    }

    public int getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(int valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
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

    @Override
    public String toString() {
        return "DADOS ROTA"
                + "\n=============================================="
                + "\nSua rota: " + getDescricao()
                + "\nValor rota: " + getValorPassagem();
    }
}
