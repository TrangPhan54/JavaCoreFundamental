package sentencecaptilizer;
import java.util.Scanner;
public class SentenceCapitalizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the sentence ");
        String sentence = sc.nextLine();
        returnSentence(sentence);


    }
    public static void returnSentence (String sentence){
        String [] split = sentence.split("\\.");
        for (String str : split){
            System.out.print(str.substring(0,1).toUpperCase()+str.substring(1)+".");
        }
    }
}
