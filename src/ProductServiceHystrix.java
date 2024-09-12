

// ProductServiceHystrix.java (with Hystrix)
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceHystrix {

    @HystrixCommand(fallbackMethod = "fallbackProduct")
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id) {
        // Simulate failure for demonstration
        if (id == 0) {
            throw new RuntimeException("Product not found");
        }
        return new Product(id, "Sample Product");
    }

    public Product fallbackProduct(int id) {
        return new Product(id, "Fallback Product");
    }
}
