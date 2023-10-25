public class WatchHM extends Watch implements Time{
    protected int hour;
    protected int minute;
    public WatchHM(int count, String name, int hour, int minute) {
        super(count, name);
        this.hour = hour;
        this.minute = minute;
    }
    public void vpered(int hour, int minute) throws TimeException {
        if((hour>23)||(hour<0)||(minute>59)||(minute<0)){
            throw new TimeException();
        }
    }
    public void setTime(int hour, int minute) throws TimeException {
        if((hour>23)||(hour<0)||(minute>59)||(minute<0)){
            throw new TimeException();
        }
        this.hour = hour;
        this.minute = minute;
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
