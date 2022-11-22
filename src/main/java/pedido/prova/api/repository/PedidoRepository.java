package pedido.prova.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedido.prova.api.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
