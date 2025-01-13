package class_point_and_moveablepoint;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(2.5f, 3.5f);
        System.out.println(point);

        point.setX(5.0f);
        point.setY(7.0f);
        System.out.println("Updated point: " + point);
    }
}
