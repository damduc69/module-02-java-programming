package circle_cylinder;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "indigo");
        System.out.println(circle);

        circle.setRadius(7.0);
        circle.setColor("yellow");
        System.out.println("Updated circle: " + circle);
    }
}
