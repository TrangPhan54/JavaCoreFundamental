public class Bai8TinhTongCacSoLe {
    public static void main(String[] args) {
        System.out.println(plus(4));


    }
    public static int plus (int n){
        if (n == 0 ){
            return 1;
        }
        else if (n==1){
            return 1;
        }
        else {
            return plus(n-1)+(2*n-1);
        }
    }
}
