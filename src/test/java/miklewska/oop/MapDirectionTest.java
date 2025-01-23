package miklewska.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapDirectionTest {
    @Test
    void previous_North() {
        MapDirection actualOutput = MapDirection.previous(MapDirection.NORTH);
        MapDirection expectedOutput = MapDirection.WEST;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void previous_West() {
        MapDirection actualOutput = MapDirection.previous(MapDirection.WEST);
        MapDirection expectedOutput = MapDirection.SOUTH;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void previous_South() {
        MapDirection actualOutput = MapDirection.previous(MapDirection.SOUTH);
        MapDirection expectedOutput = MapDirection.EAST;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void previous_East() {
        MapDirection actualOutput = MapDirection.previous(MapDirection.EAST);
        MapDirection expectedOutput = MapDirection.NORTH;
        assertEquals(expectedOutput, actualOutput);
    }


    /*@Test
    void next() {
        // czy ma sens to rozbijać?
        MapDirection actualOutput = MapDirection.next(MapDirection.NORTH);
        MapDirection expectedOutput = MapDirection.EAST;
        assertEquals(actualOutput, expectedOutput);
        actualOutput = MapDirection.next(MapDirection.EAST);
        expectedOutput = MapDirection.SOUTH;
        assertEquals(actualOutput, expectedOutput);
        actualOutput = MapDirection.next(MapDirection.SOUTH);
        expectedOutput = MapDirection.WEST;
        assertEquals(actualOutput, expectedOutput);
        actualOutput = MapDirection.next(MapDirection.WEST);
        expectedOutput = MapDirection.NORTH;
        assertEquals(actualOutput, expectedOutput);
    }*/

    @Test
    void next_North(){
        MapDirection actualOutput = MapDirection.next(MapDirection.NORTH);
        MapDirection expectedOutput = MapDirection.EAST;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void next_West(){
        MapDirection actualOutput = MapDirection.next(MapDirection.WEST);
        MapDirection expectedOutput = MapDirection.NORTH;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void next_South(){
        MapDirection actualOutput = MapDirection.next(MapDirection.SOUTH);
        MapDirection expectedOutput = MapDirection.WEST;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void next_East(){
        MapDirection actualOutput = MapDirection.next(MapDirection.EAST);
        MapDirection expectedOutput = MapDirection.SOUTH;
        assertEquals(expectedOutput, actualOutput);
    }
}
