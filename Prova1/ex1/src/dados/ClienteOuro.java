package dados;

public class ClienteOuro extends Cliente{
    
    private int quantDependentes;

    public Float getMensalidade(){
        return (float) (getMensalidade()*0.8);
    }

    public Float getBeneficio(){
        return (float) (getBeneficio() *1.1);
    }

    public void setQuantDependentes(int quantDependentes) {
        this.quantDependentes = quantDependentes;
    }
    public int getQuantDependentes() {
        return quantDependentes;
    }

}
