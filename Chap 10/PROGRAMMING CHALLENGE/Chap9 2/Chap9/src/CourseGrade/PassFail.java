package CourseGrade;

public class PassFail extends GradedActivity {
    private static int MIN_PASS = 70;
    private static int MAX_QUESTION = 10;
    public PassFail (int correctCount){
        super(correctCount,MAX_QUESTION);
    }
    public boolean isPassed (){
        double score = (double) super.getScore()/super.getMaxScore();
        score*=100;
        return score>=MIN_PASS;
    }
}
