package primitives;

/**
 * Created by yona on 26/03/2017.
 */
public class Coordinate implements Comparable<Coordinate>{
    //A variable that representing a coordinate
    private double x;

    public Coordinate(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    /**Comparable between two coordinates
     *
     * @param co is object of coordinate
     * @return:
     * if the coordinates are equal returns 0
     * if co is bigger than returns -1
     * if co is smaller than returns 1
     */
    @Override
    public int compareTo(Coordinate co) {
        if (this.x < co.x)
            return -1;
        if(this.x > co.x)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Coordinate: " +
                "x = " + x;
    }

    /**
     * Receive two coordinates and add x of co to x of this coordinate
     * @param co
     */
    public void add(Coordinate co){
        this.x += co.x;
    }

    /**
     * Receive two coordinates and substract x of co to x of this coordinate
     * @param co
     */
    public void Substract(Coordinate co){
        this.x -= co.x;
    }
}
