import class_point_and_moveablepoint.MoveablePoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);

        moveablePoint.setSpeed(5.0f, 6.0f);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
