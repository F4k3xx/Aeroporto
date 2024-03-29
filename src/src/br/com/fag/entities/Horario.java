package br.com.fag.entities;

import java.util.Locale;
import java.util.Scanner;

public class Horario {

    private static final String[] DATAS_IDA = {"0 - 05/07/23", "1 - 09/08/23", "2 - 13/09/23", "3 - 17/10/23", "4 - 23/11/23", "5 - 17/12/23"};
    private static final String[] DATAS_VOLTA = {"0 - 08/07/24", "1 - 14/08/24", "2 - 16/09/24", "3 - 20/10/24", "4 - 27/11/24", "5 - 30/12/24"};
    private static final String[] CLASSES_VOO = {"0 - Econômica", "1 - Premium economy", "2 - Executiva/Business", "3 - Primeira Classe"};

    public static Scanner sc = new Scanner(System.in);

    private Long codigo;
    private String dataPartida;
    private String dataVolta;
    private String classeVoo;

    private Rota rota;
    private Aviao aviao;

    private int valorClasseVoo = 0;
    private int escolhaOpcao;

    public Horario() {
    }

    public Horario(Long codigo, String dataPartida, String dataVolta, String classeVoo) {
        this.codigo = codigo;
        this.dataPartida = dataPartida;
        this.dataVolta = dataVolta;
        this.classeVoo = classeVoo;
    }

    public void opcaoViagem() {

        System.out.println("Selecione a opção desejada:");
        System.out.println("1.Ida e Volta\n2.Só Ida");
        escolhaOpcao = sc.nextInt();

        if (escolhaOpcao == 1) {
            dadosDataVooIda();
            dadosDataVooVolta();
        } else if (escolhaOpcao == 2) {
            dadosDataVooIda();
        } else {
            System.out.println("Opcao selecionada inválida");
            opcaoViagem();
        }
        dadosClasseVoo();
    }

    public void dadosDataVooIda() {

        System.out.println("Datas disponíveis para ida: ");

        for (String data : DATAS_IDA) {
            System.out.println(data);
        }

        System.out.println("Selecione a data de ida: ");
        int respostaDataSelecionado = sc.nextInt();

        setDataPartida(DATAS_IDA[respostaDataSelecionado]);

    }

    public void dadosDataVooVolta() {
        System.out.println("Datas disponíveis para volta: ");

        for (String data : DATAS_VOLTA) {
            System.out.println(data);
        }

        System.out.println("Selecione a data de volta: ");
        int respostaDataSelecionado = sc.nextInt();

        setdataVolta(DATAS_VOLTA[respostaDataSelecionado]);

    }

    public void dadosClasseVoo() {

        System.out.println("Classes disponíveis: ");

        for (String classe : CLASSES_VOO) {
            System.out.println(classe);
        }

        System.out.println("Selecione a classe: ");
        int respostaClasseVooSelecionado = sc.nextInt();

        setClasseVoo(CLASSES_VOO[respostaClasseVooSelecionado]);
        calculoValorTotalClassevoo(respostaClasseVooSelecionado);
    }

    public void calculoValorTotalClassevoo(int opcaoSelecionadaClasseVoo) {

        switch (opcaoSelecionadaClasseVoo) {
            case 0:
                setValorClasseVoo(100);
                break;
            case 1:
                setValorClasseVoo(200);
                break;
            case 2:
                setValorClasseVoo(300);
                break;
            case 3:
                setValorClasseVoo(400);
                break;
        }
    }

    /*Deixar guardada para quando precisar kk
    public String dataPartidaformatacao() {
        String dataPartidaFormat = new SimpleDateFormat("yyyy-MM-dd").format(this.dataPartida);
        return dataPartidaFormat;
    }

    public String dataVoltaformatacao() {
        String dataVoltaFormat = new SimpleDateFormat("yyyy-MM-dd").format(this.dataVolta);
        return dataVoltaFormat;
    }
     */

    public Long getCodigo() {
        return codigo;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getdataVolta() {
        return dataVolta;
    }

    public void setdataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }

    public String getClasseVoo() {
        return classeVoo;
    }

    public void setClasseVoo(String classeVoo) {
        this.classeVoo = classeVoo;
    }

    public int getValorClasseVoo() {
        return valorClasseVoo;
    }

    public void setValorClasseVoo(int valorClasseVoo) {
        this.valorClasseVoo = valorClasseVoo;
    }

    @Override
    public String toString() {
        if (escolhaOpcao == 1) {
            return "DADOS HORÁRIO VOO"
                    + "\n=============================================="
                    + "\nDataPartida: " + getDataPartida()
                    + "\ndataVolta: " + getdataVolta()
                    + "\nClasseVoo: " + getClasseVoo()
                    + "\nValor classe: " + getValorClasseVoo();
        } else {
            return "DADOS HORÁRIO VOO"
                    + "\n=============================================="
                    + "\nDataPartida: " + getDataPartida()
                    + "\nClasseVoo: " + getClasseVoo()
                    + "\nValor classe: " + getValorClasseVoo();
        }
    }
}
