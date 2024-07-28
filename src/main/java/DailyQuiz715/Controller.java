package DailyQuiz715;

import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/index")
	public String test(Model model) {
		User user = new User("Draco", "draco@gmail.com", true, "0000");
		model.addAttribute("draco", user);

		List<Product> products = new ArrayList<>();
		products.add(new Product(1L, "Product 1", 10));
		products.add(new Product(2L, "Product 2", 20));
		products.add(new Product(3L, "Product 3", 30));
		model.addAttribute("products", products);

		return "/dailyQuiz715/index";
	}
}
