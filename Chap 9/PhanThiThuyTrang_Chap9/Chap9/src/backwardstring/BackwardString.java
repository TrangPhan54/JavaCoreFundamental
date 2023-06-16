package backwardstring;
import java.util.Scanner;
public class BackwardString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word you want to reverse");
        String input = sc.nextLine();
        StringBuilder builder = new StringBuilder (input);
        reverse(builder);
    }
    public static void reverse (StringBuilder builder){
        builder.reverse();
        System.out.println(builder);
    }
}
