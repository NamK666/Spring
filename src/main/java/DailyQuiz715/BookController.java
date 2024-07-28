package DailyQuiz715;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

	private List<Book> books = new ArrayList<>();
	private AtomicLong counter = new AtomicLong();

	@GetMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", books);
		return "books";
	}

	@GetMapping("/addBook")
	public String addBookForm(Model model) {
		model.addAttribute("book", new Book());
		return "addBook";
	}

	@PostMapping("/addBook")
	public String addBookSubmit(@ModelAttribute Book book) {
		book.setId(counter.incrementAndGet());
		books.add(book);
		return "redirect:/books";
	}

}
