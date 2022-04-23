package ex3;

import java.util.Arrays;

public class Imobiliaria {

    private String nome;
    private Imoveis[] imoveis = new Imoveis[100];

    public String toString() {
        return "Imobiliaria [imoveis=" + Arrays.toString(imoveis) + ", nome=" + nome + "]";
    }
    

}