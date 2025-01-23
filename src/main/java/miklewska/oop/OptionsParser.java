package miklewska.oop;

import java.util.ArrayList;
import java.util.stream.Stream;

import static miklewska.oop.MoveDirection.*;

public class OptionsParser {

    public static ArrayList<MoveDirection> parse (String[] arrDirections) {
        ArrayList<MoveDirection> moveDirectionArrayList = new ArrayList<>();
        Stream.of(arrDirections)
                .forEach(dir -> {switch(dir){
                    case "f", "forward" -> moveDirectionArrayList.add(FORWARD);
                    case "b", "backward" -> moveDirectionArrayList.add(BACKWARD);
                    case "l", "left" -> moveDirectionArrayList.add(LEFT);
                    case "r", "right" -> moveDirectionArrayList.add(RIGHT);}}
                );
        return moveDirectionArrayList;
    }
}
