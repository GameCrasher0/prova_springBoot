package pedido.prova.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedido.prova.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
