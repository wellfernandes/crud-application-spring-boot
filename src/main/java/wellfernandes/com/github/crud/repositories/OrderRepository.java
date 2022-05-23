package wellfernandes.com.github.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wellfernandes.com.github.crud.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
