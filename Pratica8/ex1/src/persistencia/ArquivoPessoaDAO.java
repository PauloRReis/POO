package persistencia;

import java.util.LinkedList;
import java.util.List;

import dados.Pessoa;

public class ArquivoPessoaDAO{

    private final String caminho = "files/arquivo.csv";
    private static EditorTexto arquivo = new EditorTexto(); 

    private String toCSV(Pessoa p){
        String s = "";

        s += p.getNome() + ',';
        s += p.getIdade() + ',';
        s += p.getAltura() + ',';
        s += p.getMassa() + ',';

        return s;
    }
    
    private Pessoa fromCSV(String linhaCSV){

        String [] atributos = linhaCSV.split(",");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(atributos[0]);
        pessoa.setIdade(Integer.parseInt(atributos[1]));
        pessoa.setAltura(Float.parseFloat(atributos[2]));
        pessoa.setMassa(Float.parseFloat(atributos[3]));

        return pessoa;
    }

    private List<String> listaPessoaToString(List<Pessoa> pessoas){

        List<String> arquivo = new LinkedList<String>();

        for(Pessoa pessoa : pessoas){
            arquivo.add(toCSV(pessoa));
        }

        return arquivo;

    }

}