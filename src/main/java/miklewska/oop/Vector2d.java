package miklewska.oop;

import java.util.Objects;

import static java.lang.Math.max;
import static java.lang.Math.min;

public record Vector2d(Integer x, Integer y) {

    public String toString() {
        return "(" + Integer.toString(this.x) + "," + Integer.toString(this.y) + ")";
    }

    Boolean precedes(Vector2d otherVector) {
        if (this.equals(otherVector)) return true;
        return otherVector.x >= this.x && otherVector.y >= this.y;
    }

    Boolean follows(Vector2d otherVector) {
        if (this.equals(otherVector)) return true;
        return otherVector.x <= this.x && otherVector.y <= this.y;
    }

    Vector2d add(Vector2d otherVector) {
        return new Vector2d(this.x + otherVector.x, this.y + otherVector.y);
    }

    Vector2d subtract(Vector2d otherVector) {
        return new Vector2d(this.x - otherVector.x, this.y - otherVector.y);
    }

    Vector2d upperRight(Vector2d otherVector) {
        return new Vector2d(max(this.x, otherVector.x), max(this.y, otherVector.y));
    }

    Vector2d lowerLeft(Vector2d otherVector) {
        return new Vector2d(min(this.x, otherVector.x), min(this.y, otherVector.y));
    }

    Vector2d opposite() {
        return new Vector2d(-this.x, -this.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2d vector2d = (Vector2d) o;
        return x.equals(vector2d.x) && y.equals(vector2d.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
