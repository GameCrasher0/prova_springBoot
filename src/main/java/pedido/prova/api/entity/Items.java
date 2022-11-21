package pedido.prova.api.entity;

import javax.persistence.*;

@Entity
@Table(name="itens")
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private Double precoIndividual;
    private Long quantidade;

    public Items() {
    }

    public Items(String nome, Double precoIndividual, Long quantidade) {
        this.nome = nome;
        this.precoIndividual = precoIndividual;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoIndividual() {
        return precoIndividual;
    }

    public void setPrecoIndividual(Double precoIndividual) {
        this.precoIndividual = precoIndividual;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }
}
