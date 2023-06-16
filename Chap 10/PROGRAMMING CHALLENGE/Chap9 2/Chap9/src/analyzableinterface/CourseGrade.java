package analyzableinterface;

import java.text.DecimalFormat;
public class CourseGrade implements Analyzable {
    GradedActivity lab;
    PassFail passfail;
    GradedActivity essay;
    FinalExam finalExam;
    GradedActivity[] grades = new GradedActivity[4];


    public void setLab (GradedActivity lab){
        grades [0]=lab;
    }
    public void setPassFail (PassFail passFail){
        grades [1]= passFail;

    }
    public void setEssay (GradedActivity essay){
        grades [2]= essay;
    }
    public void setFinalExam (FinalExam finalExam){
        grades [3]= finalExam;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.#");
        String letterGrade ="";
        double percentage = 0;
        int index = 0;
        String [] testName ={"lab test "," pass fail test ","essay test ","final exam"};
        for (GradedActivity activity:grades){
            percentage = activity.percentage();
            if (percentage>=90)
                letterGrade ="A";
            else if (percentage>=80)
                letterGrade = "B";
            else if (percentage>=70)
                letterGrade ="C";
            else if (percentage >=60)
                letterGrade ="D";
            else
                letterGrade ="F";
            System.out.println("grades for "+testName[index]+"\nScore "+activity.getScore()+" "+"/"+activity.getMaxScore()
                    +"\nPercentage:"+activity.percentage()+"%"+"\ngrades "+letterGrade);
        }
        return "";
    }

    @Override
    public double getAverage() {
        double lab = grades[0].getScore();
        double essay = grades[2].getScore();
//        double total = 0;
//        for (int i = 0; i<grades.length;i++){
//            total+=grades[i].getScore();
//        }
        return (lab+essay)/2;
    }

    @Override
    public GradedActivity getLowest() {
        double lab = grades[0].getScore();
        double essay = grades[2].getScore();

        return (lab<essay?grades[0]:grades[2]);
    }

    @Override
    public GradedActivity getHighest() {
        double lab = grades[0].getScore();
        double essay = grades[2].getScore();

        return (lab>essay?grades[0]:grades[2]);
    }
}
