public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        Circle circle = new Circle(77);

        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.getSquare());
        System.out.println("Периметр круга: " + circle.getPerimeter());
        System.out.println("Площадь круга: " + circle.getSquare());
    }
   /* Output:
Периметр прямоугольника: 20.0
Площадь прямоугольника: 25.0
Периметр круга: 483.80526865282815
Площадь круга: 18626.502843133883
    */
}