package dados;

public class Cliente {

    private String nome;
    private Float mensalidade;
    private Float beneficio;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getMensalidade() {
        return (mensalidade - beneficio);
    }
    public void setMensalidade(Float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Float getBeneficio() {
        return beneficio;
    }
    public void setBeneficio(Float beneficio) {
        this.beneficio = beneficio;
    }

    
    
}
