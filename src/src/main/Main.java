package main;

import br.com.fag.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Bilhete bilhete = new Bilhete();
        Horario horario = new Horario();


        System.out.println("Selecione a opção desejada:");
        System.out.println("1.Ida e Volta\n2.Só Ida");
        int opcaoViagem = sc.nextInt();

        if (opcaoViagem == 1) {

            System.out.println("Opção: " + opcaoViagem + " selecionada!");

            System.out.println("Olá seja bem vindo à Spagnol Linhas Aéreas");

            System.out.print("Insira sua cidade de origem: ");
            horario.setNumeroDoPontoDeDorigem(sc.next());

            System.out.print("Insira sua cidade de destino:");
            horario.setNumeroDoPontoDeDestino(sc.next());

            //Insirir a data de acordo com o formato!
            System.out.print("Insira a data de ida: ");
            horario.setDataPartida(sdf.parse(sc.next()));

            //Insirir a data de acordo com o formato!
            System.out.print("Insira a data para voltar: ");
            horario.setDataChegada(sdf.parse(sc.next()));

            System.out.println("Selecione a classe do voo que deseja:");
            System.out.println("1.Econômica\n2.Premium economy\n3.Executiva/Business\n4.Primeira Classe");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    horario.setClasseVoo("Econômica");
                    break;

                case 2:
                    horario.setClasseVoo("Premium economy");
                    break;

                case 3:
                    horario.setClasseVoo("Executiva/Business");
                    break;

                case 4:
                    horario.setClasseVoo("Primeira Classe");

                default:
                    System.out.println("Opção selecionada Invalid");
            }
            System.out.println(horario);


        } else if (opcaoViagem == 2) {

            System.out.println("Opção: " + opcaoViagem + " selecionada!");

            System.out.println("Olá seja bem vindo à Spagnol Linhas Aéreas");

            System.out.print("Insira sua cidade de origem: ");
            horario.setNumeroDoPontoDeDorigem(sc.next());

            System.out.print("Insira sua cidade de destino:");
            horario.setNumeroDoPontoDeDestino(sc.next());
            //Insirir a data de acordo com o formato!
            System.out.print("Insira a data de ida: ");
            horario.setDataPartida(sdf.parse(sc.next()));

            System.out.println("Selecione a classe do voo que deseja:");
            System.out.println("1.Econômica\n2.Premium economy\n3.Executiva/Business\n4.Primeira Classe");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    horario.setClasseVoo("Econômica");
                    break;

                case 2:
                    horario.setClasseVoo("Premium economy");
                    break;

                case 3:
                    horario.setClasseVoo("Executiva/Business");
                    break;

                case 4:
                    horario.setClasseVoo("Primeira Classe");
                    break;

                default:
                    System.out.println("Opção selecionada Invalid");
            }

            System.out.println(horario);
        } else {
            System.out.println("Selecione novamente!");
        }

        //Inserir dados Pessoa
        System.out.println("Digite seus dados pessoais:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Telefone: ");
        String telefone = sc.next();
        //Insirir a data de acordo com o formato!
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date nascimento = sdf.parse(sc.next());
        System.out.print("Rg: ");
        String rg = sc.next();
        System.out.print("Cpf: ");
        String cpf = sc.next();

        //Inserir dados Endereço
        System.out.print("Logradouro: ");
        String logradouro = sc.next();
        System.out.print("Bairro: ");
        String bairro = sc.next();
        System.out.print("Cidade: ");
        String cidade = sc.next();
        System.out.print("Estado: ");
        String estado = sc.next();
        System.out.print("Pais; ");
        String pais = sc.next();


        Endereco endereco = new Endereco(1L, logradouro, bairro, cidade, estado, pais);

        Pessoa pessoa = new Pessoa(11L, name, email, telefone, nascimento, rg, cpf, endereco);

        System.out.println(pessoa);

    }
}