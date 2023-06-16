public class Bai9 {
    public static void main(String[] args) {
        System.out.println(tongCacLuyThua(10));

    }
    public static double tongCacLuyThua (double n){
        if(n==1){
            return 1;
        }
        else {
            return tongCacLuyThua(n-1)+Math.pow(-1,n+1)*n;
        }
    }
}
