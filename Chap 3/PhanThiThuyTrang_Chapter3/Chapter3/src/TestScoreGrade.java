import java.util.Scanner;
public class TestScoreGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println ("Enter your score");
        int score = kb.nextInt();
        if (score>= 90 && score <=100) {
            System.out.println("You get grade A");
        }
        else if (score>= 80 && score <=89){
            System.out.println("You get grade B");

        }
        else if (score>= 70 && score <=79){
            System.out.println("You get grade C");

        }
        else if (score>= 60 && score <=69){
            System.out.println("You get grade D");

        }
        else if (score<60){
            System.out.println("You get grade F");

        }

        }
}
