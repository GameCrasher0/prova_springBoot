package pedido.prova.api.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pedidoId;
    @Column(name = "ENDERECO")
    private String endereco;
    private String cep;
    private Long numero;
    private String formaPagamento;
    private Long parcelas;
    @Column(name = "order_itens")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Items> items;

    public Pedido() {
    }

    public Pedido(String endereco, String cep, Long numero, String formaPagamento, Long parcelas, List<Items> items) {
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.items = items;
    }

    public Long getOrderId() {
        return pedidoId;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Long getParcelas() {
        return parcelas;
    }

    public void setParcelas(Long parcelas) {
        this.parcelas = parcelas;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}
