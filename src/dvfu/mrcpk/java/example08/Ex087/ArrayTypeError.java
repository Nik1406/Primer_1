package dvfu.mrcpk.java.example08.Ex087;

public class ArrayTypeError {
    public static void main(String[] args) {
        Object x[] = new String[3];         // попытка поместить в массив содержимое 				//несоответствующего типа
        x[0] = new Integer(0);
    }
}