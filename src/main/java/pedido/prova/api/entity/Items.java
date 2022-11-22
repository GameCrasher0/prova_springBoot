package pedido.prova.api.entity;

import javax.persistence.*;

@Entity
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nomeProduto;
    private Double precoIndividual;
    private Long quantidade;

    public Items() {
    }

    public Items(String nomeProduto, Double precoIndividual, Long quantidade) {
        this.nomeProduto = nomeProduto;
        this.precoIndividual = precoIndividual;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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
