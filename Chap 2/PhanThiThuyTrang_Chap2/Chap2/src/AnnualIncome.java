import java.util.Scanner;
public class AnnualIncome {
    public static void main ( String [] args){
        Scanner kb = new Scanner (System.in);
        System.out.println ("My name is");


        String name = kb.nextLine();
        System.out.println ("My age is");


        int age = kb.nextInt();
        System.out.println ("My annual pay is");
        double annualPay = kb.nextDouble();






        System.out.println ("My name is "+ name + ", my age is "+ age + " and I hope to earn $ "+ annualPay + " this year.");


    }
}
