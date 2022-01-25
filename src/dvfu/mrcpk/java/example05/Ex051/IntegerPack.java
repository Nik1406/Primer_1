package dvfu.mrcpk.java.example05.Ex051;

public class IntegerPack {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        System.out.println("In main - before call function: i=" + i);
        changeInteger(i);
        System.out.println("In main - after call function: i=" + i);
    }
    public static void changeInteger(Integer x) {
        System.out.println("In changeInteger - before change: x=" + x);
        x = new Integer(20);
        System.out.println("In changeInteger - after change: x=" + x);
    }
}
