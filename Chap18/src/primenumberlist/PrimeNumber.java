package primenumberlist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class PrimeNumber {
    public static void main(String[] args) {
        List <Integer> prime = new ArrayList<>();
        int num = 2;
        while (prime.size()<100){
            if (isPrime(num)){
                prime.add(num);
            }
            num++;
        }
        Iterator <Integer> it = prime.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
    public static boolean isPrime (int number){
        if (number < 2){
            return false;
        }
        else {
            for (int i = 2; i<= Math.sqrt(number);i++){
                if (number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
