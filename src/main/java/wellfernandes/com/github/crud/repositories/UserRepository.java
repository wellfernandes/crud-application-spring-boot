package wellfernandes.com.github.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import wellfernandes.com.github.crud.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
