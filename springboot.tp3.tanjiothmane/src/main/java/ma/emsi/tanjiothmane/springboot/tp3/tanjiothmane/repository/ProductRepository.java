package ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane.repository;

import ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
