package in.nileshit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nileshit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
