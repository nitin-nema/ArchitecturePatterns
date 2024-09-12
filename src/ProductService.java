// ProductService.java
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductService {

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        return new Product(id, "Sample Product");
    }
}

// Product.java
public class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
}
