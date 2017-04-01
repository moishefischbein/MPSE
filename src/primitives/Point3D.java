package primitives;

/**
 * Created by Moishe on 26/03/2017.
 */
public class Point3D extends Point2D  {

    Point2D P2;
    Coordinate Z1;


    public Point3D(Coordinate x ,Coordinate y , Coordinate z) {
       P2 = new Point2D(x,y);
       Z=z;
    }

    @Override
    public String toString() {
        return "Point3D: " +
                "x = " + P2.x +", y = "+P2.y+
                ", Z=" + Z;
    }




    public void setP2(Point2D p2) {
        P2 = p2;
    }

    public Point2D getP2() {
        return P2;

    }

    public void setZ(Coordinate z) {
        Z = z;
    }

    public Coordinate getZ() {
        return Z;
    }

    public int compareTo(Point3D P3) {
        if (this.P2.x == P3.x && this.P2.y == P3.y && this.Z == P3.Z) {
            return 0;
        }
       return  -1;
    }

}

