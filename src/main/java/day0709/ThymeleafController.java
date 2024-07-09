package day0709;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "굿굿베리굿");

        model.addAttribute("testing", "테스팅 테스팅");

        model.addAttribute("h2testing","h2도 연습해보자");
        return "index"; // 여기서 index라는 이름으로 찾는 것임.
    }
}
