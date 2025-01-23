package miklewska.oop;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class World {

    final public static void main(String[] args) {
        out.println("System has started");

        Animal first = new Animal();
        out.println(first);
        run(OptionsParser.parse(args), first);
        out.println(first);

        out.println("System has finished");

    }

    public static void run (List<MoveDirection> moveDirections, Animal animal){
        out.println("Start");
        for (MoveDirection direction : moveDirections) {
            out.println(animalActionToString(direction));
            animal.move(direction);
        }
        out.println("Stop");
    }

    private static String animalActionToString(MoveDirection direction) {
        return switch(direction){
                    case FORWARD -> "Animal goes forward";
                    case BACKWARD -> "Animal goes backwards";
                    case RIGHT -> "Animal turns right";
                    case LEFT -> "Animal turns left";
        };
    }

}
