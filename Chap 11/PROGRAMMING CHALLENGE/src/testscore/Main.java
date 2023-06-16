package testscore;

public class Main {
    public static void main(String[] args) {
        try {
            int [] testScore = {77,-88,99,101};
            AverageTestScore averScore = new AverageTestScore (testScore);
            System.out.println("average score is "+averScore.getAverage(testScore));

        } catch (NegativeScore i) {
            System.out.println(i.getMessage() );

        } catch (MoreThanOneHundred j) {
            System.out.println(j.getMessage());
        }
    }
}
