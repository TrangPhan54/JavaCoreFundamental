import java.util.Scanner;
public class Bai1InDaoNguocSoNguyenN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to reverse: ");
        int num = sc.nextInt();
        System.out.println (reverse(num));

    }
    public static int reverse (int n){
        if (n<10){
            return n;
        }
        else {
            System.out.print(n%10);
        }
        return reverse(n/10);
    }
}
