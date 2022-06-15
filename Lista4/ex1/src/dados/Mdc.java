package dados;

public class Mdc implements IOperacaoInteira{
    
    public int executar(int valor1, int valor2){
        
        int resto;
        while(valor2 != 0){
            resto = valor1 % valor2;
            valor1 = valor2;
            valor2 = resto;
        }
        
        return valor1;
    }


}