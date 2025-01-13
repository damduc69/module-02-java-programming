package class_object;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.0, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.0, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
