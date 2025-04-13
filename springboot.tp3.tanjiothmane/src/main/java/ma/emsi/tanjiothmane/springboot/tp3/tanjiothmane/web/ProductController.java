package ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane.web;

import ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane.entities.Product;
import ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired // injection des depândances
    private ProductRepository productRepository;
    @GetMapping("/index")

    private String index(Model model){ // STOCKER LA LIST DE PRODUIT DANS MODELS
        List<Product> products = productRepository.findAll();
        model.addAttribute("listProducts",products);
        return "products"; // forward
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(name="id") Long id){
        productRepository.deleteById(id);
        return "redirect:/index";
    }
}
