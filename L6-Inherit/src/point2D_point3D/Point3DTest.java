package point2D_point3D;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D);

        point3D.setX(5);
        point3D.setY(7);
        point3D.setZ(9);
        System.out.println("Updated point3D: " + point3D);
    }
}
