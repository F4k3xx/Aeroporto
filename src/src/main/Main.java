package main;

import br.com.fag.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Olá seja bem vindo à Spagnol Linhas Aéreas");

        //Endereco Aeroporto
        Endereco enderecoAeroporto = new Endereco(22L, "Av. Itelo Webber", "Santos Dumont", "Cascavel", "Paraná", "Brasil");

        //Aeroporo
        Aeroporto aeroporto = new Aeroporto(22L, "SIGLA", enderecoAeroporto);
        System.out.println(aeroporto);

        //Rotas
        Rota rota = new Rota();

        //Horário
        Horario horario = new Horario();

        //Bilhete
        Bilhete bilhete = new Bilhete(2);

        //Bagagem
        Bagagem bagagem = new Bagagem();

        //Endereco
        Endereco endereco = new Endereco();

//        System.out.println("Digite seu endereço: ");
//
//        //Inserir dados Endereço
//        System.out.print("Logradouro: ");
//        endereco.setLogradouro(sc.next());
//        System.out.print("Bairro: ");
//        endereco.setBairro(sc.next());
//        System.out.print("Cidade: ");
//        endereco.setCidade(sc.next());
//        System.out.print("Estado: ");
//        endereco.setEstado(sc.next());
//        System.out.print("Pais; ");
//        endereco.setPais(sc.next());
//
//        Passageiro passageiroPessoa = new Passageiro();
//        //Passando endero para peassageiroPessoa
//        passageiroPessoa.setEndereco(endereco);
//
//        System.out.println("Digite seus dados pessoais:");
//        System.out.print("Name: ");
//        passageiroPessoa.setNome(sc.next());
//        System.out.print("Email: ");
//        passageiroPessoa.setEmail(sc.next());
//        System.out.print("Telefone: ");
//        passageiroPessoa.setTelefone(sc.next());
//        //Insirir a data de acordo com o formato!
//        System.out.print("Birth date (DD/MM/YYYY): ");
//        passageiroPessoa.dateNascimento(sdf.parse(sc.next()));
//        System.out.print("Rg: ");
//        passageiroPessoa.setRg(sc.next());
//        System.out.print("Cpf: ");
//        passageiroPessoa.setCpf(sc.next());

        //Chamada de metodos
        horario.opcaoViagem();
        rota.rotasViagem();
//        passageiroPessoa.insirirPassaporte();
        bagagem.calculaPeso();


        System.out.println("Dados Insiridos: ");
//        System.out.println(passageiroPessoa);
        System.out.println(horario);
        System.out.println(rota);
        System.out.println(bagagem);

    }
}