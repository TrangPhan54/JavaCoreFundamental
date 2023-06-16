package gradebook;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double [] stu1 = new double[4];
        double [] stu2 = new double[4];
        double [] stu3 = new double[4];
        double [] stu4 = new double[4];
        double [] stu5 = new double[4];

        GradeBook gradeBook = new GradeBook(stu1,stu2,stu3,stu4,stu5);
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i<stu1.length;i++){
            System.out.println("enter score for student 1");
            stu1[i]= sc.nextDouble();
        }
        gradeBook.setScore1(stu1);
        gradeBook.getScore1();
        double aver1 = gradeBook.getaverageScore1();
        System.out.println(aver1);
        gradeBook.getLetterGrade(aver1);

        for (int i = 0; i<stu2.length;i++){
            System.out.println("enter score for student 2 ");
            stu2[i]= sc.nextDouble();
        }
        gradeBook.setScore2(stu2);
        gradeBook.getScore2();
        double aver2 = gradeBook.getaverageScore2();
        System.out.println(aver2);
        gradeBook.getLetterGrade(aver2);

        for (int i = 0; i<stu3.length; i++){
            System.out.println("enter score for student 3");
            stu3[i]= sc.nextDouble();
        }
        gradeBook.setScore3(stu3);
        gradeBook.getScore3();
        double aver3 = gradeBook.getaverageScore3();
        System.out.println(aver3);
        gradeBook.getLetterGrade(aver3);

        for (int i = 0; i<stu4.length;i++){
            System.out.println("enter score for student 4 ");
            stu4[i]=sc.nextDouble();
        }
        gradeBook.setScore4(stu4);
        gradeBook.getScore4();
        double aver4 = gradeBook.getaverageScore4();
        System.out.println(aver4);
        gradeBook.getLetterGrade(aver4);

        for (int i = 0; i<stu5.length;i++){
            System.out.println("enter score for student 5");
            stu5[i]=sc.nextDouble();
        }
        gradeBook.setScore5(stu5);
        gradeBook.getScore5();
        double aver5 = gradeBook.getaverageScore5();
        System.out.println(aver5);
        gradeBook.getLetterGrade(aver5);

        sc.nextLine();
        gradeBook.setAverageScoreList();
        double [] averScore = gradeBook.getAverageScoreList();

        String [] nameArray = gradeBook.getName();
        String inputName;
        int index = -1;
        System.out.println("enter name");
        inputName = sc.nextLine();
        for (int i = 0; i< nameArray.length;i++){
            if (inputName.equalsIgnoreCase(nameArray[i])){
                index = i;
            }
        }
        if (index ==-1){
            System.out.println("cannot find the student");
        }
        else{
            System.out.println("the average score of the student is"+nameArray[index]+averScore[index]);
        }


    }
}