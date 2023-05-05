package br.com.fag.entities;

import java.util.Scanner;

public class Bilhete {

    public static Scanner sc = new Scanner(System.in);
    private int numero;
    private int assento;
    private Passageiro passagero;
    private Horario horario;
    private SituaçãoBilete situacao;

    public Bilhete() {
    }

    public Bilhete(int numero) {
        this.numero = numero;
    }

    public Bilhete(int numero, int assento, Passageiro passagero, Horario horario, SituaçãoBilete situacao) {
        this.numero = numero;
        this.assento = assento;
        this.passagero = passagero;
        this.horario = horario;
        this.situacao = situacao;
    }

    public void selecionarAssento() {
        System.out.println("\n==============================================");
        System.out.println("Temos 100 Assento");
        System.out.println("Selecione 1:");
        int assentoSelecionado = sc.nextInt();

        setAssento(assentoSelecionado);

    }

    public void exibirOpcoes(Passageiro passageiro) throws InterruptedException {
        System.out.println("Selecione uma opção:");
        System.out.println("0 - Reservar");
        System.out.println("1 - Comprar");
        System.out.println("2 - Cancelar");
        int respostaSelecionada = sc.nextInt();

        switch (respostaSelecionada) {
            case 0:
                reservar(passageiro);
                break;
            case 1:
                comprar();
                break;
            case 2:
                cancelarReserva();
                break;
            default:
                System.out.println("Opção inválida!");
                Thread.sleep(500);
                exibirOpcoes(passageiro);
                break;
        }
    }

    public void reservar(Passageiro passageiro) throws InterruptedException {
        System.out.println("Olá " + passageiro.getNome());
        System.out.println("Você acabou de reservar");
        System.out.println("Você deseja [1].comprar ou [2].cancelar a reserva?");
        int comprarOuCancelar = sc.nextInt();

        switch (comprarOuCancelar) {
            case 1:
                comprar();
                break;
            case 2:
                cancelarReserva();
                break;
            default:
                System.out.println("Opção inválida!");
                Thread.sleep(500);
                reservar(passageiro);
                break;
        }
    }

    public void comprar() throws InterruptedException {
        System.out.println("Você escolheu comprar");
        Thread.sleep(500);
        escolherFormaDePagamento();
    }

    public static void escolherFormaDePagamento() throws InterruptedException {
        System.out.println("\nEscolha a forma de pagamento:\n");
        System.out.println("0 - Cartão de Crédito/Débito");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Pix");
        byte formaDePagamento = sc.nextByte();

        switch (formaDePagamento) {
            case 0:
                pagamentoPorCartao();
                break;
            case 1:
                pagamentoEmDinheiro();
                break;
            case 2:
                pagamentoEmPix();
                break;
            default:
                System.out.println("Opção inválida!");
                Thread.sleep(500);
                escolherFormaDePagamento();
                break;
        }
    }

    public static void pagamentoPorCartao() throws InterruptedException {
        System.out.println("Pagamento por cartão selecionado.\nSelecione a opção: ");
        Thread.sleep(500);
        System.out.println("\n1- Débito.\n2- Crédito (não parcelamos)");
        byte opcaoDePagamento = sc.nextByte();
        Thread.sleep(500);
        if (opcaoDePagamento == 1) {
            System.out.println("Cartão de Débito selecionado.");
            Thread.sleep(500);
            System.out.println("compra efetuada com sucesso!");
            Thread.sleep(500);
            System.out.println("Boa viagem!");
        } else if (opcaoDePagamento == 2) {
            System.out.println("Cartão de Crédito selecionado.");
            Thread.sleep(500);
            System.out.println("Compra efetuada com sucesso!");
            Thread.sleep(500);
            System.out.println("Boa viagem!");
        } else {
            System.out.println("Opcão inválida!");
            pagamentoPorCartao();
        }
    }

    public static void pagamentoEmDinheiro() throws InterruptedException {
        System.out.println("Pagamento em Dinheiro selecionado.");
        Thread.sleep(500);
        System.out.println("Compra efetuada com sucesso!");
        Thread.sleep(500);
        System.out.println("Boa viagem!");
    }

    public static void pagamentoEmPix() throws InterruptedException {
        System.out.println(
                "Pagamento por PIX selecionando.\nPara efetuar o pagamento copie e cole o código abaixo na aba PIX do aplicativo do seu banco.");
        Thread.sleep(500);
        System.out.println("\n7163e29e-bdaf-4f02-b492-90e161b9ede7");
        Thread.sleep(500);
        System.out.println("\nPagamento confirmado.");
    }

    public void cancelarReserva() {
        System.out.println("Voce escolheu cancelar reserva:");
    }


    public void checkin(Bagagem bagagem) {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public Passageiro getPassagero() {
        return passagero;
    }

    public void setPassagero(Passageiro passagero) {
        this.passagero = passagero;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public SituaçãoBilete getSituacao() {
        return situacao;
    }

    public void setSituacao(SituaçãoBilete situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Assento selecionado: " + getAssento();
    }
}
