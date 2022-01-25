package dvfu.mrcpk.java.example06.Ex06;

public class ComparePack {
    public static void main(String[] args) {
        int i = 128; // заменить на 127 !!!
        Integer oa = i; // сщздание объекта + упаковка
        Integer ob = i;
        System.out.println("oa==i " + (oa == i)); //true
        System.out.println("ob==i " + (ob == i)); //true
        System.out.println("oa==ob " + (oa == ob)); //false
        System.out.println("equals ->" + oa.equals(i) + ob.equals(i) + oa.equals(ob)); //true
    }
}
