public abstract class NumerosPrimos extends Gerador{
    
    public void gerar(int n){
        for(int i = 1 ; i < n ; i++){
            int quantDivisores = 0;
            for(int j = 1; j < i ; j++){
                if(i % j == 0){
                    quantDivisores++;
                }
            }
            if(quantDivisores == 2){
                getSequencia().add(i);
            }
        }
    }

}