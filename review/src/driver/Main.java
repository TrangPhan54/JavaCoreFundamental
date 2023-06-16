package driver;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String [] stuAns = new String [20];
        Scanner sc = new Scanner(System.in);
        for (int i =1; i<20;i++){
            System.out.println("here are the student answer");
            stuAns[i]= sc.nextLine();
        }
        DriverLicenseExam driver = new DriverLicenseExam(stuAns);

        driver.setCorrectAnswer(stuAns);
        System.out.println(driver.getCorrectAnswer());
        System.out.println(driver.totalCorrect());
//        driver.getCorrectAnswer();
    }
}

