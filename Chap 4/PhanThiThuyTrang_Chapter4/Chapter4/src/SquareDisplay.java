import java.util.Scanner;
public class SquareDisplay {
    public static void main(String[] args) {
        System.out.println("ENTER 1 NUMBER");
        Scanner kb = new Scanner(System.in);
        int dimension = kb.nextInt();


        for (int width = 0; width < dimension; width++) {
            for (int length = 0; length < dimension; length++) {
                System.out.print("*");
            }
            System.out.print("\n");


        }
    }
}


