package dvfu.mrcpk.java.example011.Ex0113;

import dvfu.mrcpk.java.example011.Ex0112.Point2D;

public class Point2DUse {

    public static void main(String[] args) {
        Point2D obj1 = new Point2D(1, 2);
        Point2D obj2 = new Point2D(3);
        System.out.println(obj1.getX() + " " + obj1.getY());
        System.out.println(obj2.getX() + " " + obj2.getY());
    }
}