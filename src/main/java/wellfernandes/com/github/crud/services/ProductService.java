package wellfernandes.com.github.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wellfernandes.com.github.crud.entities.Product;
import wellfernandes.com.github.crud.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository userRepository;

	public List<Product> findAll() {
		return userRepository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = userRepository.findById(id);
		return obj.get();
	}
}
