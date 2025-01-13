package circle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(6.0, "green", 10.0);
        System.out.println(cylinder);

        cylinder.setRadius(10.0);
        cylinder.setColor("yellow");
        cylinder.setHeight(15.0);
        System.out.println("Updated cylinder: " + cylinder);
    }
}
