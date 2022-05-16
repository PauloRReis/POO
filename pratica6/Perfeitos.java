public abstract class Perfeitos extends Gerador{
    
    public void gerar(int n){
        for(int i = 0 ; i < n ; i++){
            int divisores = 0;
            for(int j = i; j > 0 ; j++){
                if(i % j == 0){
                    divisores += j;
                }
            }
            if(divisores == i){
                getSequencia().add(divisores);
            }
        }
    }

}