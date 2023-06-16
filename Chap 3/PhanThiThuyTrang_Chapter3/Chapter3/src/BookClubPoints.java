import java.util.Scanner;
public class BookClubPoints {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println ("NUMBER OF BOOKS THAT A CUSTOMER PERCHASES:");
        int books = kb.nextInt();
        if (books == 0){
            System.out.println ("HE OR SHE EARNS 0 POINTS.");
        }
        else if (books == 1){
            System.out.println ("HE OR SHE EARNS 5 POINTS.");

        }
        else if (books == 2){
            System.out.println ("HE OR SHE EARNS 15 POINTS.");

        }
        else if (books == 3){
            System.out.println ("HE OR SHE EARNS 30 POINTS.");

        }
        else if (books >= 4 ){
            System.out.println ("HE OR SHE EARNS 60 POINTS.");

        }

    }
}
