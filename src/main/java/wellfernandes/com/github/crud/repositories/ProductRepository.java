package wellfernandes.com.github.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wellfernandes.com.github.crud.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
