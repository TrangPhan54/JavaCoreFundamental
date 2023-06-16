package testscore;

public class AverageTestScore  {
    private int [] score;
    public AverageTestScore (int [] score) throws NegativeScore, MoreThanOneHundred{
        for (int i =0; i< score.length;i++) {
            int number = score [i];
            if (number < 0) {
                throw new NegativeScore(number);
            }
            if (number > 100 ){
                throw new MoreThanOneHundred (number);
            }
        }
        this.score = score;

    }
    public double getAverage (int [] score){
        int sum = 0;
        for (int i = 0; i<score.length;i++){
            sum+=score[i];
        }
        double average = (double) sum/score.length;
        return average;
    }
}
