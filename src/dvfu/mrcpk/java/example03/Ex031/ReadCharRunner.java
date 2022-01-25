package dvfu.mrcpk.java.example03.Ex031;

public class ReadCharRunner {
    public static void main(String[] args) {
        int x;
        try {
        x = System.in.read();
        char c = (char)x;
        System.out.println("Код символа: "+c+" = "+x);
        } catch (java.io.IOException e) {
        e.printStackTrace();
        }
    }
}
