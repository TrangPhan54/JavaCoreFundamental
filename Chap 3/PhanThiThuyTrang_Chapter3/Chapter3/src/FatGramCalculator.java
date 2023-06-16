import java.util.Scanner;
public class FatGramCalculator {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println ("THE NUMBER OF FAT GRAMS :");
        double fatGrams = kb.nextDouble();
        System.out.println ("THE NUMBER OF CALORIES :" + fatGrams*9);
        System.out.println ("THE NUMBER TOTAL CALORIES :");

        double totalCalories = kb.nextDouble();
        double percentOfCalories = fatGrams*9/totalCalories;
        if (percentOfCalories<0.03) {
            System.out.println("THE PERCENTAGES OF CALORIES :" + percentOfCalories * 100 + " %. THE FOOD IS LOW IN FAT");


        }
        else {
            System.out.println("THE PERCENTAGES OF CALORIES :" +  percentOfCalories* 100 + " %.");

        }



    }
}
