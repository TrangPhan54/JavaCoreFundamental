package testscoremoditification;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] score = new int [4];
        Scanner sc = new Scanner (System.in);
        for (int i = 0;i<score.length;i++){
            System.out.println("enter the score "+(i+1));
            score [i]= sc.nextInt();
        }
        try {
            TestScore testScore = new TestScore(score);
        } catch (InvalidTestScore i){
            System.out.println(i.getMessage());
        }
    }
}
