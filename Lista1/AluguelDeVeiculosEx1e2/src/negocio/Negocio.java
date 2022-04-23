package negocio;

import java.util.Arrays;
import dados.Cliente;
import dados.Veiculo;

public class Negocio {

    private Veiculo [] veiculos = new Veiculo[100];
    private int contAlugados = 0;
    private Cliente [] clientes = new Cliente[100];
    private int contClientes = 0;

    public Veiculo[] getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }

    public int getContAlugados() {
        return contAlugados;
    }

    public void setContAlugados(int contAlugados) {
        this.contAlugados = contAlugados;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getContClientes() {
        return contClientes;
    }

    public void setContClientes(int contClientes) {
        this.contClientes = contClientes;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Negocio negocio = (Negocio) o;
        return contAlugados == negocio.contAlugados &&
                contClientes == negocio.contClientes &&
                Arrays.equals(veiculos, negocio.veiculos) &&
                Arrays.equals(clientes, negocio.clientes);
    }

    public String toString() {
        return "\nVeiculos=" + Arrays.toString(veiculos) + "\nClientes=" + Arrays.toString(clientes);
    }
}
