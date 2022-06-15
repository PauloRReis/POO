package apresentacao;

import dados.*;
import java.util.Random;

public class Apresentacao{
    public static void main(String[] args) {
        Random gerador = new Random();
        Soma soma = new Soma();
        Mdc mdc = new Mdc();
        Mod mod = new Mod();
        Multiplicacao mult = new Multiplicacao();
        int a = gerador.nextInt(100);
        int b = gerador.nextInt(100);

        System.out.println("Multiplicacao entre " + a + " e " + b + " é: " + mult.executar(a, b));
        System.out.println("Mdc entre " + a + " e " + b + " é: " + mdc.executar(a, b));
        System.out.println("Soma entre " + a + " e " + b + " é: " + soma.executar(a, b));
        System.out.println("Mod entre " + a + " e " + b + " é: " + mod.executar(a, b));
    }
}