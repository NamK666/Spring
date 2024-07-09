package AutowiredPractice2;

import org.springframework.stereotype.Component;

@Component
public class CoffeeBean {
    private String name = "아라비카";

    public String getName() {
        return name;
    }
}
