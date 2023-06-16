package testscoremoditification;

import testscore.MoreThanHundred;
import testscore.NegativeTestScore;

public class TestScore {
    private int [] testScore;

    public TestScore(int[] testScore) throws InvalidTestScore {
        for (int i =0;i<testScore.length;i++){
            int number = testScore [i];
            if (number < 0 || number > 100){
                throw new InvalidTestScore ("score ( "+number+" ) must be greater than 0 or less than 100");
            }

            this.testScore = testScore;
        }

    }
    public void averageScore (int [] testScore){
        int sum = 0;
        for (int i = 0;i <testScore.length;i++){
            sum+=testScore[i];
        }
        double average = (double)sum/testScore.length;
        System.out.println("the average score is "+ average);
    }
}
