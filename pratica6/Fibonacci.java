public abstract class Fibonacci extends Gerador{

    public void gerar(int n){
        for(int i = 1 ; i < n ; i++){
            getSequencia().add((n-1)+(n-2));
        }
    }


}