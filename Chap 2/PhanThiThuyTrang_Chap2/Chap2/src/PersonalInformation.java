import java.util.Scanner;
public class PersonalInformation {
    public static void main(String[] args) {
        Scanner id = new Scanner (System.in);
        System.out.println ("my name is ");
        String name = id.nextLine();
        System.out.println ("my address is ");
        String address = id.nextLine();
        System.out.println ("my phone number is ");
        String telephoneNumber = id.nextLine();
        System.out.println ("my major is ");


        String collegeMajor = id.nextLine();
        System.out.println (" Hello everyone. My name is "+ name +". I live in "+ address +". My telephone number is "+ telephoneNumber + ". My major is "+ collegeMajor);












    }
}
