package miklewska.oop;

import java.util.ArrayList;
import java.util.stream.Stream;

import static java.lang.System.*;
import static miklewska.oop.MoveDirection.*;

public class World {

    final

    public static void main(String[] args) {
        out.println("System has started");

        Animal first = new Animal();
        out.println(first);
        run(OptionsParser.parse(args), first);
        out.println(first);

        out.println("System has finished");

    }

    public static void run (ArrayList<MoveDirection> moveDirections, Animal animal){
        out.println("Start");
//        moveDirections
//                .stream()
//                .forEach(moveDirection -> {switch(moveDirection){
//                    case FORWARD -> out.println("Animal goes forward");
//                    case BACKWARD -> out.println("Animal goes backwards");
//                    case RIGHT -> out.println("Animal turns right");
//                    case LEFT -> out.println("Animal turns left");}}
//                );
        moveDirections
                .stream()
                .forEach(moveDirection -> {switch(moveDirection){
                    case FORWARD:
                        out.println("Animal goes forward");
                        animal.move(moveDirection);
                        break;
                    case BACKWARD:
                        out.println("Animal goes backwards");
                        animal.move(moveDirection);
                        break;
                    case RIGHT:
                        out.println("Animal turns right");
                        animal.move(moveDirection);
                        break;
                    case LEFT:
                        out.println("Animal turns left");
                        animal.move(moveDirection);
                        break;
                }}
                );
        out.println("Stop");
    }
}
