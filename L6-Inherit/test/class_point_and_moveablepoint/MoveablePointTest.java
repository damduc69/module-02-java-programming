package class_point_and_moveablepoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveablePointTest {

    @Test
    public void testMove() {
        // Step1: Prepare mock data
        float x = 1.0f, y = 2.0f;
        float xSpeed = 3.0f, ySpeed = 4.0f;
        float xAfterMove = x + xSpeed;
        float yAfterMove = y + ySpeed;

        // Step2: Prepare expected value
        MoveablePoint expectedMoveablePoint = new MoveablePoint(xAfterMove, yAfterMove, xSpeed, ySpeed);

        // Step 3: Prepare actual value
        MoveablePoint actualMoveablePoint = new MoveablePoint(x, y, xSpeed, ySpeed);
        actualMoveablePoint.move();

        // Step 4: Compare expected value with actual value
        assertEquals(expectedMoveablePoint, actualMoveablePoint);
    }
}
