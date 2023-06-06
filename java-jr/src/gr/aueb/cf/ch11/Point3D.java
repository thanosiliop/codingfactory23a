package gr.aueb.cf.ch11;

/**
 * Immutable 3D Point.
 */
public final class Point3D {
    private final Point point; //final εδω είναι ο δείκτης, όχι τα x, y
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z) {
        //για να μη δείχνει η main στην ίδια θέση με το point της Point3D
        this.point = new Point(point.getX(), point.getY());
        this.z = z;
    }

    public Point getPoint() {
        //προσέχουμε τι δίνουμε και τι παίρνουμε για immutability
        return new Point(this.point.getX(), this.point.getY());
    }

    public int getZ() {
        return z;
    }
}
