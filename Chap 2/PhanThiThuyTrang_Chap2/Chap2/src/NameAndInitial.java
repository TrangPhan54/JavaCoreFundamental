import java.util.Scanner;
public class NameAndInitial {
    public static void main ( String [] args){
        Scanner keyboard = new Scanner ( System.in );
        System.out.println ("What's your first name?");
        String firstName = keyboard.nextLine();
        System.out.println ("What's your last name?");
        String lastName= keyboard.nextLine();
        System.out.println ("What's your middle name?");


        String middleName = keyboard.nextLine();
        System.out.println (firstName + " "+ middleName+ " "+ lastName);


        char firstInitial = keyboard.next().charAt(0);
        System.out.println (firstInitial);
        char middleInitial = keyboard.next().charAt(2);
        System.out.println (middleInitial);


        char lastInitial = keyboard.next().charAt(4);
        System.out.println (lastInitial);










    }
}
