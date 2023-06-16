package testscore;

public class TestScore {
    private int [] testScore;

    public TestScore(int[] testScore) throws NegativeTestScore, MoreThanHundred {
        for (int i =0;i<testScore.length;i++){
            int number = testScore [i];
        if (number < 0){
            throw new NegativeTestScore("score ( "+number+" ) must be greater than 0");
        }
        if (number > 100){
            throw new MoreThanHundred ("score ( "+number+" ) must be less than 100");
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
