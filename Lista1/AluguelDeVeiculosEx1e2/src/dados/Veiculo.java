package dados;
import java.util.Objects;

public class Veiculo {

    private String modelo;
    private String marca;
    private int ano;
    private Cliente cliente;
    private Data data;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return ano == veiculo.ano &&
                Objects.equals(modelo, veiculo.modelo) &&
                Objects.equals(marca, veiculo.marca) &&
                Objects.equals(cliente, veiculo.cliente) &&
                Objects.equals(data, veiculo.data);
    }

    public String toString() {
        return "modelo='" + modelo + "\nmarca='" + marca + "\nano=" + ano + "\ncliente=" + cliente.toString() + "\ndata=" + data.toString();
    }
}
