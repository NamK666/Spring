package DailyQuiz715;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

	@GetMapping("/index")
	public String test(){

		return "/dailyQuiz715/index";
	}
}
