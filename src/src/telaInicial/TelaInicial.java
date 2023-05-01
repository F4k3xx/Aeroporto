package telaInicial;

import br.com.fag.entities.Pessoa;
import br.com.fag.entities.menu.Menu;

import java.util.Scanner;

public class TelaInicial {

    private static Pessoa pessoa = new Pessoa();
    private Menu menu = new Menu();
    private static Scanner entrada = new Scanner(System.in);

    public String saudarUsuario() throws InterruptedException {
        return "Olá seja bem vindo à Azul Linhas Aéreas";

        identificadorDeUsuario();

    }

    private void identificadorDeUsuario() throws InterruptedException{

        System.out.println("Para iniciar, selecione uma opção: ");
        Thread.sleep(500);
        System.out.println("1. Já sou cliente");
        System.out.println("2. Quero me cadastrar");    //Ok
        System.out.println("3. Sair");  //Ok
        Thread.sleep(500);
        System.out.print("Digite sua escolha: ");

        int escolha = (entrada.nextInt());

        if(escolha == 1) {
            logarUsuario();
        }
        else if(escolha == 2) {
            logarUsuario();
        }
        else if (escolha == 3){

            System.out.println("VocÃª saiu do programa");

        } else {
            System.out.println("Opção inválida!");
        }
    }

    public void logarUsuario() throws InterruptedException{

        String nomeDigitado;

        do {
            System.out.println("Faça seu login");
            Thread.sleep(1300);
            System.out.print("Digite seu nome de usuário: ");

            if(cadastro.getUsuario().equals(nomeDigitado = entrada.next())) {

                colocarSenha();

            }else {
                System.out.println("Login não encontrado!");
                Thread.sleep(1500);
            }

        }while(!cadastro.getUsuario().equals(nomeDigitado));

    }

    public void colocarSenha() throws InterruptedException{

        String senhaDigitada;

        do {
            System.out.print("Digite sua senha: ");

            if(cadastro.getSenha().equals(senhaDigitada = entrada.next())) {

                menu.Cardapio();

            }else {
                System.out.println("Senha incorreta!");
                Thread.sleep(1500);
            }
        }while(!cadastro.getSenha().equals(senhaDigitada));

    }
}
