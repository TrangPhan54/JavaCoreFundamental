import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number n: ");
        int input = sc.nextInt();

        System.out.println(tongCacGiaiThua(input));

    }
    public static int tongCacGiaiThua (int n){
        if (n==1){
            return 1;
        }
        else {
            return tongCacGiaiThua(n-1)+giaiThua(n);
        }
    }
    public static int giaiThua (int n){
        if (n==1){
            return 1;
        }
        else if (n == 0){
            return 1;
        }
        else {
            return giaiThua(n-1)*n ;
        }
    }
}
