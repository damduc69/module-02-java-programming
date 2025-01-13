package point2D_point3D;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        System.out.println(point2D);

        point2D.setX(5);
        point2D.setY(7);
        System.out.println("Updated point2D: " + point2D);
    }
}
