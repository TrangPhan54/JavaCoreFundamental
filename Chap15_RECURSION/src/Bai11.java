public class Bai11 {
    public static void main(String[] args) {
        System.out.println(luythua(5));


    }
    public static double luythua (double n){
        if (n==1){
            return 1;
        }
        else {
            return luythua (n-1)+Math.pow(n,2);
        }
    }
}
