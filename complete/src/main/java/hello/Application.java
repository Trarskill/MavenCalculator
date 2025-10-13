package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

@SpringBootApplication
@Controller
public class Application {

    @GetMapping("/")
    public String home() {
        return "calculator";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam String expr, Model model) {
        try {
            Expression expression = new ExpressionBuilder(expr).build();
            double result = expression.evaluate();

            model.addAttribute("expr", expr);
            model.addAttribute("result", result);
        } catch (Exception e) {
            model.addAttribute("error", "Invalid expression. Try again.");
        }

        return "calculator";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
