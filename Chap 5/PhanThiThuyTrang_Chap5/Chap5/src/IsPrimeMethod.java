import java.util.Scanner;
public class IsPrimeMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int number = scanner.nextInt();
        System.out.println(isPrime(number));

    }
    public static boolean isPrime (int number){
        if (number>=2){
            for (int i =1; i<= number; i++){
                if (number%i==0 && i!=1 && i!=number){
                    return false;
                }
            }
        }
        if (number<2){
            return false;
        }
        return true;
    }
}
