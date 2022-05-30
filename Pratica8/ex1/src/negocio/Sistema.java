package negocio;

import java.util.ArrayList;
import java.util.List;

import dados.Pessoa;

public class Sistema {

    
    public void adicionar(Pessoa p){
        pessoas.add(p);
    }

    public void remover(Pessoa p){
        pessoas.remove(p);
    }

    public List<Pessoa> getList(){
        return pessoas;
    }

}