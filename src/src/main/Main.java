package main;

import br.com.fag.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static int valorTotal = 0;

    public static void main(String[] args) throws InterruptedException, ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Companhia Aerea
        CompanhiaAerea companhiaAerea = new CompanhiaAerea(1223L, "COMPANHIA SPAGNOL");

        //Cargo
        Cargo cargo = new Cargo(22L, "Piloto" );

        System.out.println("==============================================");
        System.out.println("OLÁ SEJA BEM VINDO Á SPAGNOL LINHAS AÉRIAS");

        //Endereco Aeroporto
        Endereco enderecoAeroporto = new Endereco(22L, "Av. Itelo Webber", "Santos Dumont", "Cascavel", "Paraná", "Brasil");

        //Aeroporo
        Aeroporto aeroporto = new Aeroporto(22L, "BR", enderecoAeroporto);

        System.out.println("==============================================");

        System.out.println();

        System.out.println("==============================================");
        System.out.println("ENDEREÇO AEROPORTO");
        System.out.println("==============================================");

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

        System.out.println("==============================================");
        System.out.println("DIGITE SEU ENDEREÇO: ");
        System.out.println("==============================================");

        //Inserir dados Endereço
        System.out.print("Logradouro: ");
        endereco.setLogradouro(sc.nextLine());
        System.out.print("Bairro: ");
        endereco.setBairro(sc.nextLine());
        System.out.print("Cidade: ");
        endereco.setCidade(sc.nextLine());
        System.out.print("Estado: ");
        endereco.setEstado(sc.nextLine());
        System.out.print("Pais: ");
        endereco.setPais(sc.nextLine());

        Passageiro passageiroPessoa = new Passageiro();
        //Passando endero para peassageiroPessoa
        passageiroPessoa.setEndereco(endereco);
        System.out.println("==============================================");
        System.out.println("DIGITE SEUS DADOS PESSOAIS:");
        System.out.println("==============================================");
        System.out.print("Name: ");
        passageiroPessoa.setNome(sc.nextLine());
        System.out.print("Email: ");
        passageiroPessoa.setEmail(sc.nextLine());
        System.out.print("Telefone: ");
        passageiroPessoa.setTelefone(sc.nextLine());
        //Insirir a data de acordo com o formato!
        System.out.print("Data de nascimento FORMATO -> (DD/MM/YYYY): ");
        passageiroPessoa.dateNascimento(sdf.parse(sc.nextLine()));
        System.out.print("Rg: ");
        passageiroPessoa.setRg(sc.nextLine());
        System.out.print("Cpf: ");
        passageiroPessoa.setCpf(sc.nextLine());
        System.out.println("==============================================");

        //Chamada de metodos
        rota.rotasViagem();
        horario.opcaoViagem();
        bilhete.selecionarAssento();
        passageiroPessoa.insirirPassaporte();
        bagagem.calcularPeso();
        valorTotal = bagagem.getValorBagagem() + horario.getValorClasseVoo() + rota.getValorPassagem();

        //DADOS DO BILHETE FINAL
        System.out.println();
        System.out.println("==============================================");
        System.out.println("DADOS PASSAGEM: ");
        System.out.println("==============================================");
        System.out.println(bilhete);
        System.out.println(passageiroPessoa);
        System.out.println("==============================================");
        System.out.println(horario);
        System.out.println("==============================================");
        System.out.println(rota);
        System.out.println("==============================================");
        System.out.println(bagagem);
        System.out.println("==============================================");
        System.out.println("VALOR PASSAGEM TOTAL: " + valorTotal);
        System.out.println("==============================================");

        //DADOS DA COMPRA/PAGAMENTO
        System.out.println();
        System.out.println("==============================================");
        System.out.println("DADOS PAGAMENTO BILHETE");
        System.out.println("==============================================");
        bilhete.exibirOpcoes(passageiroPessoa);
        System.out.println();
        System.out.println("==============================================");
        System.out.println("BOA VIAGEM!");
        System.out.println("==============================================");
    }
}