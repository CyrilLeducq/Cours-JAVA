package records;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean equals (Object o)    {
        if (! (o instanceof Point))
            return false;
        Point other = (Point)  o;
        return other.x == x && other.y == y;
    }

    public int hashCode(){
        return Objects.hash(x, y);
    }

    public String toString(){
        return String.format("Point[x=%d, y=%d", x, y);
    }
}
