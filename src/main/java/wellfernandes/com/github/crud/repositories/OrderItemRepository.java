package wellfernandes.com.github.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wellfernandes.com.github.crud.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
