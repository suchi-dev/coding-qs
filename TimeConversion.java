import java.util.Scanner;
import java.util.ArrayList;
/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 */
public class TimeConversion {
    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        String s = in.next();
        if(s.charAt(8) == 'P'){
            String portion = s.substring(0,8);
            String [] time = portion.split(":");
            if(time[0].matches("12")){
                System.out.println(time[0]+":" + time[1] + ":" + time[2]);
            }else {
                time[0] = String.valueOf(Integer.valueOf(time[0]) + 12);
                System.out.println(time[0] + ":" + time[1]+":" + time[2]);
            }
        }else {
            String portion = s.substring(0,8);
            String [] time = portion.split(":");
            if(time[0].matches("12")){
                System.out.println("00"+":" + time[1] + ":" + time[2]);
            }else {
                System.out.println(portion);
            }
        }

    }
}