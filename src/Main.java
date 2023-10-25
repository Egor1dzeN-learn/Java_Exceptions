import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        Time watchHM = Fabric.buildHM(200, "suunto", 23, 59);
        System.out.println(watchHM.getHour());
        System.out.println(watchHM.getMinute());
        try{
            watchHM.setTime(23, 6);
            System.out.println(watchHM.getHour());
            System.out.println(watchHM.getMinute());
        }
        catch (TimeException e){
            System.out.println(e.getMessage());
        }
        WatchHMS watchHMS = Fabric.buildHMS(300, "Tissot", 21, 9, 14);
        try {
            watchHMS.vpered(25, 12, 59);
        } catch (TimeException e) {
            System.out.println(e.getMessage());
        }
    }
}