import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeCalculatorTest {
    Rectangle rect1;
    Circle circle1;
    @DisplayName("First Testing ")
    @BeforeEach
    void setUp(){
        rect1 = new Rectangle(10,20);
        circle1 = new Circle(50);
    }
    @Test
    public void totalSquareTest() {
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(5);
        List<Shape>shapes = Arrays.asList(rectangle, circle);
        double expected = rectangle.getSquare() + circle.getSquare();
        double actually = ShapeCalculator.totalSquare(shapes);
        assertEquals(expected, actually);
    }
}
