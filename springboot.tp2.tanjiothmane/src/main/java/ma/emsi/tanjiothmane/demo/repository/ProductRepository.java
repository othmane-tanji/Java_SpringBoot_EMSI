package ma.emsi.tanjiothmane.demo.repository;

import ma.emsi.tanjiothmane.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
