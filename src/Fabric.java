public class Fabric {
    static WatchHM buildHM(int count, String name, int hour, int minute){
        return new WatchHM(count, name, hour, minute);
    }
    static WatchHMS buildHMS(int count, String name, int hour, int minute, int seconds){
        return new WatchHMS(count, name, hour, minute, seconds);
    }
}
