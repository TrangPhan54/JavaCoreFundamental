package CourseGrade;

import java.util.Arrays;
import java.text.DecimalFormat;
public class CourseGrade {
    GradedActivity lab;
    PassFail passfail;
    GradedActivity essay;
    FinalExam finalExam;
    GradedActivity [] grades = new GradedActivity[4];


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
}
