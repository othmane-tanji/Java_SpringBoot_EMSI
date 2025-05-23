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
       // productRepository.save(new Product("Computer",4300.0,3));
       // productRepository.save(new Product("Phone",2300.0,6));
        //productRepository.save(new Product("printer",1300.0,1));
       // productRepository.save(new Product("Monitor",5300.0,1));

        List<Product> products = productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString());
        });
        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("***********************");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getQuantity());
        System.out.println("*****************");
        List<Product> productList = productRepository.findByNameContains("C");
        productList.forEach(p->{
            System.out.println(p);
        });
        System.out.println("------------------------------");
        List<Product> productList2 = productRepository.findByNameContains("C");
        productList2.forEach(p->{
            System.out.println(p);
        });
        System.out.println("------------------------------");
        List<Product> productList3 = productRepository.findByPriceGreaterThan(5000);
        productList3.forEach(p->{
            System.out.println(p);
        });
        System.out.println("------------------------------");
        List<Product> productList4 = productRepository.searchByPrice(3000);
        productList4.forEach(p->{
            System.out.println(p);
        });

    }

}
