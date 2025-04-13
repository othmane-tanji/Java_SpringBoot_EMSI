package ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane.repository;

import ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByNameContains(String keyword, Pageable pageable);
}
