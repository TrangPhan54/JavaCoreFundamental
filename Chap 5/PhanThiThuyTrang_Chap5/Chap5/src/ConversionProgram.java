import java.util.Scanner;
public class ConversionProgram {
    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        int number;
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THE NUMBER OF METERS");
        double meters = sc.nextDouble();
        do {
            System.out.println("convert to kilometers");
            System.out.println("convert to inches");
            System.out.println("convert to feet");
            System.out.println("quit the program");
            System.out.println("ENTER YOUR CHOICE");
            number = sc.nextInt();
            if (number==1){
                showKilometers(meters);
            }
            if (number ==2){
                showInches(meters);
            }
            if (number ==3){
                showFeet(meters);
            }

        } while (number<4);
    }
    public static void showKilometers (double meters){
        double kilometers = meters *0.001;
        System.out.println(meters+" meters= "+kilometers+ " kilometers");
    }
    public static void showInches (double meters){
        double inches = meters * 39.37;
        System.out.println(meters+" meters= "+inches+ " inches ");
    }
    public static void showFeet (double meters){
        double feet = meters * 3.281;
        System.out.println(meters+" meters= "+feet + " feet");
    }
}
