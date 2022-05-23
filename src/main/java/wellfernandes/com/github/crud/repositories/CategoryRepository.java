package wellfernandes.com.github.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wellfernandes.com.github.crud.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
