package dvfu.mrcpk.java.example03.Ex03_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadCharRunnerString {
    public static void main(String[] args) {
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader bis = new BufferedReader(is);
    try {
    System.out.println("Введите Ваше имя и нажмите <Enter>:");
        String name = bis.readLine();
        System.out.println("Привет, " + name);
    } catch (IOException e) {
        System.err.println("ошибка ввода " + e);
    }
    }
}
