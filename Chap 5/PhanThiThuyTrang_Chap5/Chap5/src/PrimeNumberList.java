import java.util.Scanner;

public class PrimeNumberList {
    public static void main(String[] args) {
//
           for (int i =1;i<=100;i++){
               if(isPrime(i)){
                   System.out.println(i+" is a prime method");
               }
               else {
                   System.out.println(i+" is not a prime method");


               }
           }

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

