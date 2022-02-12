package dvfu.mrcpk.java.example013.Ex013_3;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        // параметризация типом Integer
        Optional<Integer> ob1 = new Optional<Integer>();
        ob1.setValue(1);

        // ob1.setValue("2");// ошибка компиляции: недопустимый тип
        int v1 = ob1.getValue();
        System.out.println(v1);

        // параметризация типом String
        Optional<String> ob2 = new Optional<String>("Java");
        String v2 = ob2.getValue();
        System.out.println(v2);
        // ob1 = ob2; //ошибка компиляции – параметризация не ковариантна