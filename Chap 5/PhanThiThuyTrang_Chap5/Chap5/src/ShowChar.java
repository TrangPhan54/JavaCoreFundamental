import java.util.Scanner;
public class ShowChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NAME OF THE CITY");
        String firstName = scanner.nextLine();
        System.out.println("ENTER THE NUMBER");
        int firstNumber = scanner.nextInt();
        showChar(firstName,firstNumber);

    }
    public static void showChar (String firstName, int firstNumber){
        char character = firstName.charAt(firstNumber);
        System.out.println(character);

    }
}
