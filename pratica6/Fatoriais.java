public abstract class Fatoriais extends Gerador{

    public void gerar(int n){
        for(int i = 1; i < n ; i++){
            int produtorio = 0;
            for(int j = i; j > 0 ; j--){
                produtorio += j;
            }
            getSequencia().add(produtorio);
        }
    }
    
}