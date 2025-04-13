package ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane;

import ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane.entities.Product;
import ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean // methode qui s execute au demarage

	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {
			Product product = Product.builder().name("Computer").price(5400).quantitiy(50).build();
			productRepository.save(product);
			productRepository.save(Product.builder().name("Printer").price(2400).quantitiy(10).build());
			productRepository.save(Product.builder().name("Phone").price(3400).quantitiy(20).build());
			productRepository.findAll().forEach(p->{
						System.out.println(p.toString());
					}

			);


		};
	}

}
