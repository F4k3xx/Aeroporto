package main;

import br.com.fag.entities.*;
import telaInicial.TelaInicial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        TelaInicial iniciarPrograma = new TelaInicial();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite o ponto de partida: \n1.França\n2.EUA\n3.Itália\n4.Inglaterra\n5.Japão ");

        System.out.println("Digite o destino: \n1.França\n2.EUA\n3.Itália\n4.Inglaterra\n5.Japão ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("O número escolhido foi: 1.");
                break;
            case 2:
                System.out.println("O número escolhido foi: 2.");
                break;
            case 3:
                System.out.println("O número escolhido foi: 3.");
                break;
            case 4:
                System.out.println("O número escolhido foi: 4.");
                break;
            case 5:
                System.out.println("O número escolhido foi: 5.");
                break;
        }

        //Inserir dados Pessoa
        System.out.println("Digite seus dados pessoais:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Telefone: ");
        String telefone = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date nascimento = sdf.parse(sc.next());
        System.out.print("Rg: ");
        String rg = sc.next();
        System.out.print("Cpf: ");
        String cpf = sc.next();

        //Inserir dados Endereço
        System.out.println("Logradouro: ");
        String logradouro = sc.next();
        System.out.println("Bairro: ");
        String bairro = sc.next();
        System.out.println("Cidade: ");
        String cidade = sc.next();
        System.out.println("Estado: ");
        String estado = sc.next();
        System.out.println("Pais; ");
        String pais = sc.next();

        Endereco endereco = new Endereco(logradouro, bairro, cidade, estado, pais);

        Pessoa pessoa = new Pessoa(name, email, telefone, nascimento, rg, cpf, endereco);

        Aviao aviao = new Aviao();

        Horario horario = new Horario();




        System.out.println(endereco);
        System.out.println(pessoa);

    }
}