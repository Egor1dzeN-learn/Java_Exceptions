public class WatchHMS extends WatchHM{
    private int second;
    public WatchHMS(int count, String name, int hour, int minute, int second) {
        super(count, name, hour, minute);
        this.second = second;
    }
    void setTime(int hour, int minute, int second) throws TimeException {
        super.setTime(hour, minute);
        this.second = second;
    }
    void vpered(int hour, int minute, int seconds) throws TimeException {
        super.vpered(hour, minute);
        if(seconds>59 || seconds<0)
            throw new TimeException();
        this.second = (this.second + seconds)/24;
    }

}
