package miklewska.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2dTest {

    @Test
    void testToString() {
        //given
        Vector2d vector = new Vector2d(2,3);

        //when
        String ActualOutput =  vector.toString();
        String ExpectedOutput = "(2,3)";
        assertEquals(ExpectedOutput, ActualOutput);
    }

    @Test
    void precedes() {
        Vector2d vector1 = new Vector2d(1,2);
        Vector2d vector2 = new Vector2d(3,4);
        assertTrue(vector1.precedes(vector2));
    }

    @Test
    void follows() {
        Vector2d vector1 = new Vector2d(3,4);
        Vector2d vector2 = new Vector2d(1,2);
        assertTrue(vector1.follows(vector2));
    }

    @Test
    void add() {
        Vector2d vector1 = new Vector2d(3,4);
        Vector2d vector2 = new Vector2d(1,2);
        Vector2d ActualValue = vector1.add(vector2);
        Vector2d ExpectedValue = new Vector2d(4,6);
        assertTrue(ExpectedValue.equals(ActualValue));
    }

    @Test
    void subtract() {
        Vector2d vector1 = new Vector2d(3,4);
        Vector2d vector2 = new Vector2d(1,2);
        Vector2d ActualValue = vector1.subtract(vector2);
        Vector2d ExpectedValue = new Vector2d(2,2);
        assertTrue(ExpectedValue.equals(ActualValue));
    }

    @Test
    void upperRight() {
        Vector2d vector1 = new Vector2d(3,4);
        Vector2d vector2 = new Vector2d(1,5);
        Vector2d ActualValue = vector1.upperRight(vector2);
        Vector2d ExpectedValue = new Vector2d(3,5);
        assertTrue(ExpectedValue.equals(ActualValue));
    }

    @Test
    void lowerLeft() {
        Vector2d vector1 = new Vector2d(3,4);
        Vector2d vector2 = new Vector2d(1,5);
        Vector2d ActualValue = vector1.lowerLeft(vector2);
        Vector2d ExpectedValue = new Vector2d(1,4);
        assertTrue(ExpectedValue.equals(ActualValue));
    }

    @Test
    void opposite() {
        Vector2d vector1 = new Vector2d(3,4);
        Vector2d ActualValue = vector1.opposite();
        Vector2d ExpectedValue = new Vector2d(-3,-4);
        assertTrue(ExpectedValue.equals(ActualValue));
    }

    @Test
    void testEquals() {
        Vector2d vector1 = new Vector2d(3,4);
        Vector2d vector2 = new Vector2d(3,4);
        assertTrue(vector1.equals(vector2));
    }
}