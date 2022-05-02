package negocio;

import java.util.ArrayList;
import java.util.List;

import dados.ContaBancaria;
import dados.ContaCorrente;
import dados.ContaSalario;

public class Sistema {
    
    private int quantidade = 0;
    private List<ContaBancaria> contasBancarias = new ArrayList<ContaBancaria>(); 

    public void cadastrarConta(ContaBancaria conta){
        contasBancarias.add(conta);
        quantidade++;
    }

    public void realizarSaque(ContaBancaria conta, float valor){
        
        for(int i = 0 ; i < contasBancarias.size() ; i++){
            if(contasBancarias.get(i).equals(conta) == true){
                contasBancarias.get(i).sacar(valor);
            }
        }

    }

    public boolean realizarDeposito(ContaCorrente conta, float valor){
        return conta.depositar(valor);
    }

    public boolean realizarDeposito(ContaSalario conta, float valor, String cnpj){
        return conta.depositar(valor, cnpj);
    }

    


}