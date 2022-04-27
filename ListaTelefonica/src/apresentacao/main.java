package apresentacao;

import java.util.Scanner;

import dados.Contato;
import negocio.ListaTelefonica;

public class main {
    
    private static ListaTelefonica sistema = new ListaTelefonica();
    private static Scanner s = new Scanner(System.in);

    public static Contato novoContato(){

        Contato contato = new Contato();

        System.out.println("Digite o nome do contato:");
        contato.setNome(s.nextLine());
        System.out.println("Digite o telefone do contato: ");
        contato.setTelefone(Integer.valueOf(s.nextLine()));

        return contato;
    }

    public static void removerConta(){

        System.out.print("Digite o nome  da pessoa que voce deseja remover o contato: ");

        char letra = s.nextLine().toUpperCase().charAt(0);



    }



}