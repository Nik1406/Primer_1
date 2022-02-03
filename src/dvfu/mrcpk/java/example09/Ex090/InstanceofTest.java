package dvfu.mrcpk.java.example09.Ex090;

public class InstanceofTest {

    public static void main(String[] args) {
        doLogic(new BaseCourse());
        doLogic(new OptionalCourse());
        doLogic(new FreeCourse());
    }

    public static void doLogic(Course c) {
        if (c instanceof BaseCourse) {
            System.out.println("BaseCourse");
        } else if (c instanceof OptionalCourse) {
            System.out.println("OptionalCourse");
        } else {
            System.out.println("Что-то другое.");
        }
    }
}
class Course extends Object {}
class BaseCourse extends Course {}
class FreeCourse extends BaseCourse {}
class OptionalCourse extends Course {}