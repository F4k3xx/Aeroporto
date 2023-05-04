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
        Rota rota = new Rota();
        Horario horario = new Horario();

        System.out.println("Olá seja bem vindo à Spagnol Linhas Aéreas");

        /* horario.opcaoViagem();
        System.out.println(horario);
        */
        rota.rotasViagem();
        System.out.println(rota);
        /*
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


         */
    }
}