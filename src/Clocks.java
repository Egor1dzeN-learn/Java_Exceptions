import java.util.Scanner;
public class Clocks {
    private int hour_arrow, minute_arrow, cost = 20000, input, hour = 0, minute = 0;
    private String name_of_clocks = "Tissot";
    Scanner scan = new Scanner(System.in);

    public Clocks() {
    }

    public Clocks(int hour_arrow, int minute_arrow, int cost, int input, int hour, int minute, String name_of_clocks) {
        this.hour_arrow = hour_arrow;
        this.minute_arrow = minute_arrow;
        this.cost = cost;
        this.input = input;
        this.hour = hour;
        this.minute = minute;
        this.name_of_clocks = name_of_clocks;
    }

    void print_with_new_line(String st) {
        System.out.println(st);
    }

    void print_without_new_line(String st) {
        System.out.print(st);
    }

    int scan_function() {
        input = scan.nextInt();
        return input;
    }

    void print_cost_of_clocks() {
        print_with_new_line("Clocks costs " + cost + "$");
    }

    void print_name_of_clocks() {
        print_with_new_line("Clock's name is " + name_of_clocks);
    }

    void set_time() {
        print_without_new_line("Enter hours: ");
        hour = scan_function();
        if (hour > 23) {
            print_without_new_line("Time error");
            hour = 0;
        }
        print_without_new_line("Enter minutes: ");
        minute = scan_function();
        if (minute > 60) {
            print_without_new_line("Time error");
            minute = 0;
        } else {
            print_with_new_line("Time on clocks is " + hour + ":" + minute);
        }
    }

    void new_time() {
        print_without_new_line("Enter  new hours: ");
        input = scan_function();
        if (hour + input < 24) {
            hour += input;
        } else {
            hour = hour + input - 24;
        }
        print_without_new_line("Enter  new minutes: ");
        input = scan_function();
        minute += input;
        print_with_new_line("New time on clocks is " + hour + ":" + minute);
    }
}