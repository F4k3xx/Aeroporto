package br.com.fag.entities;

import java.util.*;

public class Rota {
    private Long codigo;
    private String descricao;
    private int valorPassagem;
    private Aeroporto aeroporto;

    public Rota() {

    }

    public Rota(Long codigo, String descricao) {
        this.descricao = descricao;
    }

    public void rotasViagem() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] estado = new String[6];
        int respostaEstadoSelecionados = 0;

        // Adicionando os estados Brasil
        estado[0] = ("0 - Tocantins -> Mato Grosso do Sul");
        estado[1] = ("1 - São Paulo -> Mato Grosso do Sul");
        estado[2] = ("2 - Minas Gerais -> Paraná");
        estado[3] = ("3 - Paraná -> Santa Catarina");
        estado[4] = ("4 - Rio de Janeiro -> Pernambuco ");
        estado[5] = ("5 - Rio de Janeiro -> Rio Grande do Sul");

        System.out.println("Rotas disponiveís: ");

        for (String estados : estado) {
            if (estados != null) {
                System.out.println(estados);
            }
        }
        System.out.println("Selecione sua Rota: ");
        respostaEstadoSelecionados = sc.nextInt();

        setDescricao(estado[respostaEstadoSelecionados]);

        calculaValorPassagem(respostaEstadoSelecionados);

    }

    public void calculaValorPassagem(int respostaEstadoSelecionados) {

        switch (respostaEstadoSelecionados) {
            case 0:
                setValorPassagem(100);
                break;
            case 1:
                setValorPassagem(200);
                break;
            case 2:
                setValorPassagem(300);
                break;
            case 3:
                setValorPassagem(400);
                break;
            case 4:
                setValorPassagem(500);
                break;
            case 5:
                setValorPassagem(600);
                break;
        }
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
        return "\nSua rota: " + getDescricao()
                + "\nValor rota: " + getValorPassagem();
    }
}
