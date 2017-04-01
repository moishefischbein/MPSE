package primitives;

/**
 * Created by yona on 26/03/2017.
 */
public class Point2D implements Comparable<Point2D>  {

    Coordinate x;
    Coordinate y;

    public Point2D() {
    }

    public Point2D(Coordinate x, Coordinate y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D: " +
                "x = " + x +
                ", y = " + y;
    }

    public Coordinate getX() {
        return x;
    }

    public void setX(Coordinate x) {
        this.x = x;
    }

    public Coordinate getY() {

        return y;
    }

    public void setY(Coordinate y) {
        this.y = y;
    }

    @Override
    public int compareTo(Point2D o) {
        return 0;
    }
}
