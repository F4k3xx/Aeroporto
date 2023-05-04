package br.com.fag.entities;

import java.util.Locale;
import java.util.Scanner;

public class Horario {

    private Long codigo;
    private String dataPartida;
    private String dataVolta;
    private String classeVoo;

    private int valorClasseVoo;
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

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

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

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] vetorDatasDisponiveis = new String[6];
        int respostaDataSelecionado = 0;

        // Adicionando os estados Brasil
        vetorDatasDisponiveis[0] = ("0 - 05/07/23");
        vetorDatasDisponiveis[1] = ("1 - 09/08/23");
        vetorDatasDisponiveis[2] = ("2 - 13/09/23");
        vetorDatasDisponiveis[3] = ("3 - 17/10/23");
        vetorDatasDisponiveis[4] = ("4 - 23/11/23");
        vetorDatasDisponiveis[5] = ("5 - 17/12/23");

        System.out.println("Datas disponiveís: ");

        for (String datas : vetorDatasDisponiveis) {
            if (datas != null) {
                System.out.println(datas);
            }
        }
        System.out.println("Selecione sua Data de Ida: ");
        respostaDataSelecionado = sc.nextInt();

        setDataPartida(vetorDatasDisponiveis[respostaDataSelecionado]);

    }

    public void dadosDataVooVolta() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] vetorDatasDisponiveis = new String[6];
        int respostaDataSelecionado = 0;

        // Adicionando os estados Brasil
        vetorDatasDisponiveis[0] = ("0 - 08/07/24");
        vetorDatasDisponiveis[1] = ("1 - 14/08/24");
        vetorDatasDisponiveis[2] = ("2 - 16/09/24");
        vetorDatasDisponiveis[3] = ("3 - 20/10/24");
        vetorDatasDisponiveis[4] = ("4 - 27/11/24");
        vetorDatasDisponiveis[5] = ("5 - 30/12/24");

        System.out.println("Datas disponiveís: ");

        for (String datas : vetorDatasDisponiveis) {
            if (datas != null) {
                System.out.println(datas);
            }
        }
        System.out.println("Selecione sua Data de volta: ");
        respostaDataSelecionado = sc.nextInt();

        setdataVolta(vetorDatasDisponiveis[respostaDataSelecionado]);

    }

    public void dadosClasseVoo() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] classeVoo = new String[4];
        int respostaClasseVooSelecionado = 0;

        // Adicionando os estados Brasil
        classeVoo[0] = ("0 - Econômica");
        classeVoo[1] = ("1 - Premium economy");
        classeVoo[2] = ("2 - Executiva/Business");
        classeVoo[3] = ("3 - Primeira Classe");

        System.out.println("Classes disponiveís: ");

        for (String datas : classeVoo) {
            if (datas != null) {
                System.out.println(datas);
            }
        }
        System.out.println("Selecione sua classe: ");
        respostaClasseVooSelecionado = sc.nextInt();

        setClasseVoo(classeVoo[respostaClasseVooSelecionado]);
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
            return "DataPartida: " + getDataPartida()
                    + "\ndataVolta: " + getdataVolta()
                    + "\nClasseVoo: " + getClasseVoo()
                    + "\nValor classe: " + getValorClasseVoo();
        } else {
            return "\nDataPartida: " + getDataPartida()
                    + "\nClasseVoo: " + getClasseVoo()
                    + "\nValor classe: " + getValorClasseVoo();
        }
    }
}
