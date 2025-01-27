package miklewska.oop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OptionsParserTest {

    @Test
    void parse() {
        //given
        String[] arrDirections = new String[] {"a", "b", "c", "f", "l", "backward", "forward", "c", "l", "right", "r", "b", "left"};

        //when
        List<MoveDirection> ActualOutput =  OptionsParser.parse(arrDirections);
        List<MoveDirection> ExpectedOutput = new ArrayList<>(Arrays.asList(
                MoveDirection.BACKWARD,
                MoveDirection.FORWARD,
                MoveDirection.LEFT,
                MoveDirection.BACKWARD,
                MoveDirection.FORWARD,
                MoveDirection.LEFT,
                MoveDirection.RIGHT,
                MoveDirection.RIGHT,
                MoveDirection.BACKWARD,
                MoveDirection.LEFT
        ));
        assertEquals(ExpectedOutput, ActualOutput);

    }
}