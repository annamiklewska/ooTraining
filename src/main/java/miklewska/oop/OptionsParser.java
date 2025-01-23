package miklewska.oop;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static miklewska.oop.MoveDirection.*;

public class OptionsParser {

    public static List<MoveDirection> parse (String[] arrDirections) {
        return Stream.of(arrDirections)
                .map(dir -> switch(dir){
                    case "f", "forward" -> FORWARD;
                    case "b", "backward" -> BACKWARD;
                    case "l", "left" -> LEFT;
                    case "r", "right" -> RIGHT;
                    default -> null;}
                )
                .filter(Objects::nonNull)
                //.filter(x -> Objects.nonNull(x))
                .toList();
    }
}
