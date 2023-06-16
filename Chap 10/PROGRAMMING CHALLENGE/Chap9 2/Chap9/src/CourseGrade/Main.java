package CourseGrade;

public class Main {
    public static void main(String[] args) {
        CourseGrade coursegrade = new CourseGrade();
        GradedActivity lab = new GradedActivity(28,30);
        PassFail passFail = new PassFail(9);
        GradedActivity essay = new GradedActivity(27,30);
        FinalExam finalExam = new FinalExam(44);
        coursegrade.setLab(lab);
        coursegrade.setPassFail(passFail);
        coursegrade.setEssay(essay);
        coursegrade.setFinalExam(finalExam);
        System.out.println(coursegrade.toString());


    }
}
