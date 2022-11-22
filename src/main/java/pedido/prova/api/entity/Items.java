package pedido.prova.api.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeProduto;
    private Long precoIndividual;
    private Long quantidade;

    public Items() {
    }

    public Items(String nomeProduto, Long precoIndividual, Long quantidade) {
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

    public Long getPrecoIndividual() {
        return precoIndividual;
    }

    public void setPrecoIndividual(Long precoIndividual) {
        this.precoIndividual = precoIndividual;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }
}
