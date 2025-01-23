package miklewska.oop;

public class Animal {
    private MapDirection mapDirection = MapDirection.NORTH;

    public MapDirection getMapDirection() {
        return mapDirection;
    }

    public Vector2d getPosition() {
        return position;
    }

    private Vector2d position = new Vector2d(2,2);

    @Override
    public String toString() {
        return "Animal{" +
                "direction=" + this.mapDirection.toString() +
                ", position=" + this.position.toString() +
                '}';
    }
    public void move(MoveDirection moveDirection) {
        switch (moveDirection) {
            case LEFT:
                this.mapDirection = MapDirection.previous(this.mapDirection);
                break;
            case RIGHT:
                this.mapDirection = MapDirection.next(this.mapDirection);
                break;
            case FORWARD:
                //if the animal would go out of the board - ignore
                if (this.position.x() + MapDirection.toUnitVector(this.mapDirection).x() > 4 ||
                        this.position.x() + MapDirection.toUnitVector(this.mapDirection).x() < 0 ||
                        this.position.y() + MapDirection.toUnitVector(this.mapDirection).y() > 4 ||
                        this.position.y() + MapDirection.toUnitVector(this.mapDirection).y() < 0) {
                    break;
                }
                this.position = this.position.add(MapDirection.toUnitVector(this.mapDirection));
                break;
            case BACKWARD:
                //if the animal would go out of the board - ignore
                if (Animal.goesOutOfMap(this, moveDirection)) {
                    break;
                }
                this.position = this.position.subtract(MapDirection.toUnitVector(this.mapDirection));
                break;
        }
    }

    public static boolean goesOutOfMap (Animal animal, MoveDirection moveDirection) {
        switch (moveDirection) {
            case FORWARD:
                if (animal.position.x() + MapDirection.toUnitVector(animal.mapDirection).x() > 4 ||
                        animal.position.x() + MapDirection.toUnitVector(animal.mapDirection).x() < 0 ||
                        animal.position.y() + MapDirection.toUnitVector(animal.mapDirection).y() > 4 ||
                        animal.position.y() + MapDirection.toUnitVector(animal.mapDirection).y() < 0) {
                    return true;
                }
                return false;
            case BACKWARD:
                if (animal.position.x() - MapDirection.toUnitVector(animal.mapDirection).x() > 4 ||
                        animal.position.x() - MapDirection.toUnitVector(animal.mapDirection).x() < 0 ||
                        animal.position.y() - MapDirection.toUnitVector(animal.mapDirection).y() > 4 ||
                        animal.position.y() - MapDirection.toUnitVector(animal.mapDirection).y() < 0) {
                    return true;
                }
                return false;
        }
        return false;
    }
}
