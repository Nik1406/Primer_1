package dvfu.mrcpk.java.example011.Ex011_1;

import java.util.Date;
public class SimpleProgram {
    private Date today;
    public Date getToday() {
        return today;
    }
    public static final int PROGRAM_SIZE = 560;
    public static void main(String[] args) {
        SimpleProgram object = new SimpleProgram();
        System.out.println(object.getToday());
        System.out.println(object.PROGRAM_SIZE);
    }
}