package negocio;

import java.util.ArrayList;
import java.util.List;
import dados.Cliente;

public class Negocio{

    private List<Cliente> clientes = new ArrayList<Cliente>();

    public void adicionaCliente(Cliente c){
        clientes.add(c);
    }

    public void adicionaClienteOuro(Cliente c){
        clientes.add(c);
    }

    public float totalMensalidades(){
        
        Float mensalidadesTotal = (float) 0.0;

        for(int i = 0; i < clientes.size() ; i++){
            mensalidadesTotal += clientes.get(i).getMensalidade();
        }

        return mensalidadesTotal;
    }

    public float totalBeneficios(){

        Float beneficiosTotal = (float)0.0;

        for(int i = 0; i< clientes.size() ; i++){
            beneficiosTotal += clientes.get(i).getBeneficio();
        }

        return beneficiosTotal;
    }

    public List<String> listaNomeClientesOuro(){

    }

}
