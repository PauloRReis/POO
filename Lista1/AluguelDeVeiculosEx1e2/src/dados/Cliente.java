package dados;

import java.util.Objects;

public class Cliente {

    private String nome;
    private String cpf;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) &&
                Objects.equals(cpf, cliente.cpf) &&
                Objects.equals(endereco, cliente.endereco);
    }

    public String toString() {
        return "nome= " + nome + "\ncpf= " + cpf + "\nendereco= " + endereco.toString();
    }
}
