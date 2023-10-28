import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws TimeException {
        WatchHM watchHM = Fabric.buildHM(200, "Suunto", 21, 21);
        try {
            watchHM.setTime(TypeTime.HOUR, 23);
        }
        catch (TimeException te){
            System.out.println(te.getMessage());
        }

        try {
            watchHM.setTime(TypeTime.SECOND, 23);
        }
        catch (TimeException te){
            System.out.println(te.getMessage());
        }

        try {
            watchHM.setTime(TypeTime.HOUR,24 );
        }
        catch (TimeException te){
            System.out.println(te.getMessage());
        }

        System.out.println("<<<<<<<<>>>>>>>>>>");
        WatchHMS watchHMS = Fabric.buildHMS(200, "Suunto", 21, 21, 21);
        try {
            watchHMS.setTime(TypeTime.HOUR, 23);
        }
        catch (TimeException te){
            System.out.println(te.getMessage());
        }
        try {
            watchHMS.setTime(TypeTime.SECOND, 12);
        }
        catch (TimeException te){
            System.out.println(te.getMessage());
        }
        try {
            watchHMS.setTime(TypeTime.HOUR,24 );
        }
        catch (TimeException te){
            System.out.println(te.getMessage());
        }
        try{
            watchHM.move_forward(TypeTime.HOUR, -12);
        }catch (TimeException te){
            System.out.println(te.getMessage());
        }
    }
}