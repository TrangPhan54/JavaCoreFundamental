import java.util.Scanner;
public class Percentage {
    public static void main (String [] args ){
        Scanner keyboard = new Scanner (System.in);


        System.out.println ("Enter number of males:" );
        double males = keyboard.nextInt();
        System.out.println ("Enter number of females:" );
        double females = keyboard.nextInt();
        System.out.println ("Percentages of males " + males/(males+females));
        System.out.println ("Percentages of females " + males/(males+females));





    }


}
