package gradebook;

import java.util.Scanner;
public class GradeBook {
    private String [] name ={ "Anna","Ethan","Bell","Catherine","Jack"};
    private double [] score1;
    private double [] score2;
    private double [] score3;
    private double [] score4;
    private double [] score5;
    private double [] averScore;

    public GradeBook(double[] score1, double[] score2, double[] score3, double[] score4, double[] score5) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.score5 = score5;
    }
    public void setAverageScoreList(){
        averScore = new double [5];

        averScore[0]= getaverageScore1();
        averScore[1]= getaverageScore2();
        averScore[2]= getaverageScore3();
        averScore[3]= getaverageScore4();
        averScore[4]= getaverageScore5();


    }
    public double [] getAverageScoreList(){
        return averScore;
    }

    public GradeBook(String[] name) {
        this.name = name;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public double[] getScore1() {
        return score1;
    }

    public void setScore1(double[] score1) {
        this.score1 = score1;
    }

    public double[] getScore2() {
        return score2;
    }

    public void setScore2(double[] score2) {
        this.score2 = score2;
    }

    public double[] getScore3() {
        return score3;
    }

    public void setScore3(double[] score3) {
        this.score3 = score3;
    }

    public double[] getScore4() {
        return score4;
    }

    public void setScore4(double[] score4) {
        this.score4 = score4;
    }

    public double[] getScore5() {
        return score5;
    }

    public void setScore5(double[] score5) {
        this.score5 = score5;
    }

    public double getaverageScore1 (){
        double sum = 0;
        for (int i = 0; i<score1.length; i++) {
            sum += score1[i];
        }
        double average1=sum/score1.length;

        return average1;
    }
    public double getaverageScore2 (){
        double sum = 0;
        for (int i = 0; i<score2.length; i++){
            sum+=score2[i];
        }
        double  average2=sum/score2.length;

        return average2;
    }
    public double  getaverageScore3 (){
        double sum = 0;
        for (int i = 0; i<score3.length; i++) {
            sum += score1[i];
        }
        double average3=sum/score3.length;


        return average3;
    }
    public double  getaverageScore4 (){
        double sum = 0;
        for (int i = 0; i<score4.length; i++) {
            sum += score4[i];
        }
        double average4=sum/score4.length;
        return average4;
    }
    public double getaverageScore5 (){
        double sum = 0;
        for (int i = 0; i<score5.length; i++) {
            sum += score5[i];
        }
        double average5=sum/score5.length;


        return average5;
    }

    public void getLetterGrade(double averScore){
        String grade;
        if (averScore>=90 && averScore<=100){
            grade ="A";
            System.out.println(grade);
        }
        if (averScore>=80 && averScore<=89){
            grade ="B";
            System.out.println(grade);
        }
        if (averScore>=70 && averScore<=79){
            grade ="C";
            System.out.println(grade);
        }
        if (averScore>=60 && averScore<=69){
            grade ="D";
            System.out.println(grade);
        }
        if(averScore<=59){
            grade="F";
            System.out.println(grade);
        }
    }



}
