package TestScore;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TestScore score = new TestScore();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first score");
        double firstScore = sc.nextDouble();
        System.out.println("enter the second score");

        double secondScore = sc.nextDouble();
        System.out.println("enter the third score");

        double thirdScore = sc.nextDouble();
        score.setFirstScore(firstScore);
        score.setSecondScore(secondScore);
        score.setThirdScore(thirdScore);
        System.out.printf("the average score is %.2f " ,score.averageScore());





    }
}
