package dvfu.mrcpk.java.example014.Ex014_1;

public enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    public boolean isWeekend() {
        switch(this) {
            case SUNDAY:
            case SATURDAY:
                return true;
            default:
                return false;
        }
    }
}