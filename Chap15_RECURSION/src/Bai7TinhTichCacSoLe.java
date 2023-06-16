public class Bai7TinhTichCacSoLe {
    public static void main(String[] args) {
        System.out.println(multiply(10));

    }
    public static int multiply (int n){
        if (n==0){
            return 1;
        }
        if (n==1){
            return 1;
        }
        else {
            return multiply(n-1)*(2*n-1);
        }
    }
}
