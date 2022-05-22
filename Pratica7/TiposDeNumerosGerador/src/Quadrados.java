public class Quadrados extends Gerador{

    public void gerar(int n){
        for(int i = 1; i <= n ; i++){
            getSequencia().add(i*i);
        }
    }

    @Override
    public double mediaAritmetica() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double mediaGeometrica() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double variancia() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double desvioPadrao() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double amplitude() {
        // TODO Auto-generated method stub
        return 0;
    }

}