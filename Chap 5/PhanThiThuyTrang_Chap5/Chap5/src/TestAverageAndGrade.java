import java.util.Scanner;

public class TestAverageAndGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE FIRST SCORE");
        int firstScore = scanner.nextInt();
        determineGrade(firstScore);

        System.out.println("ENTER THE SECOND SCORE");
        int  secondScore = scanner.nextInt();
        determineGrade(secondScore);

        System.out.println("ENTER THE THIRD SCORE");
        int thirdScore = scanner.nextInt();
        determineGrade(thirdScore);

        System.out.println("ENTER THE FOURTH SCORE");
        int fourthScore = scanner.nextInt();
        determineGrade(fourthScore);

        System.out.println("ENTER THE FIFTH SCORE");
        int fifthScore = scanner.nextInt();
        determineGrade(fifthScore);
        calAverage(firstScore, secondScore,  thirdScore,  fourthScore, fifthScore);
        

    }
    public static int determineGrade (int testScore) {
        if (testScore >= 90 && testScore <= 100) {
            System.out.println("A");
        }
        if (testScore >= 80 && testScore <= 89) {
            System.out.println("B");
        }
        if (testScore >= 70 && testScore <= 79) {
            System.out.println("C");
        }
        if (testScore >= 60 && testScore <= 69) {
            System.out.println("D");
        }
        if (testScore < 59) {
            System.out.println("F");
        }
        return testScore;
    }
    public static double calAverage(int firstScore, int secondScore, int thirdScore, int fourthScore, int fifthScore){
        double averageScore = (double) (firstScore+secondScore+thirdScore+fourthScore+fifthScore)/5;
        System.out.println(averageScore);
        return averageScore;

    }
}
