import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Gerador implements ISequencia{

    protected List<Integer> sequencia = new ArrayList<Integer>();

    public abstract void gerar(int quantidade);

    public List<Integer> getSequencia(){
        return sequencia;
    }

    public int sortear(){

        Random r = new Random();

        return sequencia.get(r.nextInt(sequencia.size()));
    }

    public long somatorio(){
        
        long somatorio = 0;

        for(int i = 0; i < sequencia.size() ; i++){
            somatorio += sequencia.get(i);
        }

        return somatorio;
    }

    

}