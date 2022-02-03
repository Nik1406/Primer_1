package dvfu.mrcpk.java.example011.Ex0112;

public class Point2D {
    private int x;
    private int y;
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(int size) {
        x = size;
        y = size;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}