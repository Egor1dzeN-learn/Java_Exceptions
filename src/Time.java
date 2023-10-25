public interface Time {
    int getHour();
    int getMinute();
    void setTime(int hour, int minute) throws TimeException;
    void vpered(int hour, int minute) throws TimeException;
}
