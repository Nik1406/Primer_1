package dvfu.mrcpk.java.example02;
public class AboutJava {
    public void printReleaseData() {
        System.out.println("Java с объектами!");
    }
}

class FirstOOPProgram {
    public static void main(String[] args) {
        AboutJava object = new AboutJava();
        object.printReleaseData();
    }
}