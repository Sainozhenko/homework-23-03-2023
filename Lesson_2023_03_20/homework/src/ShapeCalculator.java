import java.util.List;

public class ShapeCalculator  {
    public static double totalSquare(List<Shape> shapes){
        double total = 0;
        for (Shape s : shapes) {
            total += s.getSquare();
        }
        return total;
    }
}
