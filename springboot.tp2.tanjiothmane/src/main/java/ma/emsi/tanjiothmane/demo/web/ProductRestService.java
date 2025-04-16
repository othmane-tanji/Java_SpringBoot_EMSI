package ma.emsi.tanjiothmane.demo.web;

import ma.emsi.tanjiothmane.demo.entities.Product;
import ma.emsi.tanjiothmane.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // format json web service
public class ProductRestService {
    @Autowired // injection des depandances
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product>products(){
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable Long id){
        return productRepository.findById(id).get();
    }
}
