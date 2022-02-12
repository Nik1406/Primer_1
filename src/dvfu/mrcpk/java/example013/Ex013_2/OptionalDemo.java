package dvfu.mrcpk.java.example013.Ex013_2;

public class OptionalDemo <T> {
    private T value;
    public OptionalDemo() {
    }
    public void Optional(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T val) {
        value = val;
    }
    public String toString() {
        if (value == null) return null;
        return value.getClass().getName() + " " + value;
    }
}