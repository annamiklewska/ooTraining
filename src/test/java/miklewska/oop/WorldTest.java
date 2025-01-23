package miklewska.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorldTest {

    @Test
    void run_() {
        //given
        String[] arrDirections = new String[] {"a", "r", "f", "f", "f"};
        Animal animal = new Animal();
        //when
        World.run(OptionsParser.parse(arrDirections), animal);
        Vector2d expectedPosition = new Vector2d(4,2);

        assertEquals(expectedPosition, animal.getPosition());
        assertEquals(MapDirection.EAST, animal.getMapDirection());
    }
}