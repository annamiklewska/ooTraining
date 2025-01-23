package miklewska.oop;

public class Animal {
    private MapDirection mapDirection = MapDirection.NORTH;
    private Vector2d position = new Vector2d(2,2);

    public MapDirection getMapDirection() {
        return mapDirection;
    }

    public Vector2d getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "direction=" + this.mapDirection.toString() +
                ", position=" + this.position.toString() +
                '}';
    }

    public void move(MoveDirection moveDirection) {
        if (this.goesOutOfMap(moveDirection)) return; //if the animal would go out of the board - ignore
        switch (moveDirection) {
            case LEFT -> this.mapDirection = MapDirection.previous(this.mapDirection);
            case RIGHT -> this.mapDirection = MapDirection.next(this.mapDirection);
            case FORWARD -> this.position = this.position.add(MapDirection.toUnitVector(this.mapDirection));
            case BACKWARD -> this.position = this.position.subtract(MapDirection.toUnitVector(this.mapDirection));
        }
    }

    public boolean goesOutOfMap(MoveDirection moveDirection) {
        return switch (moveDirection) {
            case FORWARD -> (this.position.x() + MapDirection.toUnitVector(this.mapDirection).x() > 4 ||
                        this.position.x() + MapDirection.toUnitVector(this.mapDirection).x() < 0 ||
                        this.position.y() + MapDirection.toUnitVector(this.mapDirection).y() > 4 ||
                        this.position.y() + MapDirection.toUnitVector(this.mapDirection).y() < 0);
            case BACKWARD -> (this.position.x() - MapDirection.toUnitVector(this.mapDirection).x() > 4 ||
                        this.position.x() - MapDirection.toUnitVector(this.mapDirection).x() < 0 ||
                        this.position.y() - MapDirection.toUnitVector(this.mapDirection).y() > 4 ||
                        this.position.y() - MapDirection.toUnitVector(this.mapDirection).y() < 0);
            default -> false;
        };
    }
}
