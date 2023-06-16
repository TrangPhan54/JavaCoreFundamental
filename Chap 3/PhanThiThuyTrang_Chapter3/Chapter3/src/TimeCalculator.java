import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("NUMBER OF SECONDS");
        int second = kb.nextInt();
        if (second > 60 && second < 3600) {
            int minutes =  second / 60;
            int seconds = second%60;
            System.out.println(second + " seconds = " + minutes + " minutes "+ seconds +" seconds");
        }
        if (second > 3600 && second < 86400) {
            int hours = second / 3600;
            int leftSeconds = second%3600;
            int leftMinutes = leftSeconds/60;
            int lastSeconds = leftSeconds%60;
            System.out.println(second + " seconds = " + hours + " hours "+ leftMinutes +" minutes "+lastSeconds+ " seconds");
        }
        if (second > 86400) {
            int days = second / 86400;
            int leftSeconds1 = second % 86400;
            int leftHour = leftSeconds1/3600;
            int leftSeconds2 = leftSeconds1%3600;
            int lastMinutes1 = leftSeconds2/60;
            int theLastSeconds = leftSeconds2%60;


            System.out.println(second + " seconds = " + days +" days "+leftHour+ " hours "+ lastMinutes1 +" minutes "+theLastSeconds+ " seconds");


        }

    }
}
