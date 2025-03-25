package ma.emsi.tanjiothmane.demo;

import ma.emsi.tanjiothmane.demo.entities.Product;
import ma.emsi.tanjiothmane.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product("Computer",4300.0,3));
        productRepository.save(new Product("Phone",2300.0,6));
        productRepository.save(new Product("printer",1300.0,1));

    }

}
