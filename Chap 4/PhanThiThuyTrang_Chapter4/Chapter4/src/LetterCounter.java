import java.util.Scanner;
public class LetterCounter {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);

        System.out.println ("Enter a String ");
        String string = kb.nextLine();
        System.out.println ("Enter a character ");
        String input = kb.nextLine();
        char character = input.charAt(0);
        int count = 0 , stringLength = string.length();
        for (int i = 0; i < string.length(); i++){
            if (character == string.charAt(i)) {

                count++;
            }

        }
        System.out.println(count);





    }
}
