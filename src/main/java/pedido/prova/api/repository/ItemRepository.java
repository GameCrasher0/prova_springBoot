package pedido.prova.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedido.prova.api.entity.Items;

public interface ItemRepository extends JpaRepository<Items, Long> {
}
