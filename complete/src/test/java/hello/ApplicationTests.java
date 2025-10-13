package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class ApplicationTests {

    // Тест, який має пройти успішно
    @Test
    void testCorrectCalculation() {
        Expression expression = new ExpressionBuilder("2+2").build();
        double result = expression.evaluate();
        assertEquals(4.0, result, "2+2 should equal 4");
    }
    //Тест, який навмисно зроблено з помилкою
//    @Test
//    void testWrongCalculation() {
//        Expression expression = new ExpressionBuilder("10-9*1").build();
//        double result = expression.evaluate();
//        assertEquals(2.0, result, "This test should fail");
//    }
}
