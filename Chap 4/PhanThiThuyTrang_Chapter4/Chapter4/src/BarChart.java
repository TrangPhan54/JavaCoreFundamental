import java.util.Scanner;
public class BarChart {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter today 's sales for store 1:");
        int sales1 = kb.nextInt();
        System.out.println("Enter today 's sales for store 2:");
        int sales2 = kb.nextInt();
        System.out.println("Enter today 's sales for store 3:");
        int sales3 = kb.nextInt();
        System.out.println("Enter today 's sales for store 4:");
        int sales4 = kb.nextInt();
        System.out.println("Enter today 's sales for store 5:");
        int sales5 = kb.nextInt();

        int star1 = sales1 / 100;
        int star2 = sales2 / 100;
        int star3 = sales3 / 100;
        int star4 = sales4 / 100;
        int star5 = sales5 / 100;

        System.out.print( "Store 1");

        for (int i = 1; i <= star1; i++) {
            System.out.print(" *");
        }
        System.out.print( "\nStore 2");


        for (int i = 1; i <= star2; i++) {
            System.out.print(" *");
        }
        System.out.print("\nStore 3");

        for (int i = 1; i <= star3; i++) {
            System.out.print(" *");
        }
        System.out.print( "\nStore 4");

        for (int i = 1; i <= star4; i++) {
            System.out.print(" *");
        }
        System.out.print( "\nStore 5");

        for (int i = 1; i <= star5; i++) {
            System.out.print(" *");
        }

    }
}

