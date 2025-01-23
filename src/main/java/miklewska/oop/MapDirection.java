package miklewska.oop;

import java.util.EnumSet;

public enum MapDirection {
    NORTH,
    SOUTH,
    EAST,
    WEST;

    public static String toString(MapDirection direction) {
        return switch (direction) {
            case NORTH -> "North";
            case SOUTH -> "South";
            case EAST -> "East";
            case WEST -> "West";
            //default -> "The provided direction is undefined";
        };
    }
    public static MapDirection next(MapDirection direction) {
        return switch (direction) {
            case NORTH -> EAST;
            case EAST -> SOUTH;
            case SOUTH -> WEST;
            case WEST -> NORTH;
        };
    }
    public static MapDirection previous(MapDirection direction) {
        return switch (direction) {
            case NORTH -> WEST;
            case WEST -> SOUTH;
            case SOUTH -> EAST;
            case EAST -> NORTH;
        };
    }

    public static Vector2d toUnitVector(MapDirection direction) {
        return switch (direction) {
            case NORTH -> new Vector2d(0,1);
            case SOUTH -> new Vector2d(0,-1);
            case EAST -> new Vector2d(1,0);
            case WEST -> new Vector2d(-1,0);
        };
    }
}
