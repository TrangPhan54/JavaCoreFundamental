package CourseGrade;

public class FinalExam extends GradedActivity {
    private static int MAX_QUESTIONS = 50;
    public FinalExam (int correctCount){
        super(correctCount,MAX_QUESTIONS);
    }

}
