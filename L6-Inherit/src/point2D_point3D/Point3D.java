package point2D_point3D;

public class Point3D extends Point2D {
    private double z = 0.0;

    public Point3D() {

    }

    public Point3D(float x, float y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public void setXYZ(Point3D point3D) {
        super.setX(point3D.getX());
        super.setY(point3D.getY());
        this.z = point3D.getZ();
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + super.getX() + ", y=" + super.getY() + ", z=" + z + '}';
    }
}
