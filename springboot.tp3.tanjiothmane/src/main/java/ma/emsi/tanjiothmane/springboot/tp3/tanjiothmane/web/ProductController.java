package ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane.web;

import ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane.entities.Product;
import ma.emsi.tanjiothmane.springboot.tp3.tanjiothmane.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;

import java.util.List;

@Controller
public class ProductController {
    @Autowired // injection des depândances
    private ProductRepository productRepository;
    @GetMapping("/index")

    //public String index(Model model,@RequestParam(name = "page" , defaultValue = "0") int page,@RequestParam(name = "size" , defaultValue = "4") int size){ // STOCKER LA LIST DE PRODUIT DANS MODELS
       // List<Product> products = productRepository.findAll(PageRequest.of(page,size)).getContent();
       // model.addAttribute("listProducts",products);
       // model.addAttribute("pages",new int[products.getTotalPages()]);
        //return "products"; // forward
    //}

    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "0") int page,
                        @RequestParam(name = "size", defaultValue = "4") int size,
                        @RequestParam(name = "keyword", defaultValue = "") String kw) {
        Page<Product> productPage = productRepository.findByNameContains(kw,PageRequest.of(page,size));
        model.addAttribute("listProducts", productPage.getContent());
        model.addAttribute("pages", new int[productPage.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("keyword",kw);
        return "products";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam(name="id") Long id){
        productRepository.deleteById(id);
        return "redirect:/index";
    }
}
