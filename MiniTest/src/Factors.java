import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a factor");
        int factor = scanner.nextInt();
        for(int i =1;i<=factor;i++){
            if (factor%i==0){
                System.out.println(i);
                System.out.println(-i);
            }
        }

    }
}
