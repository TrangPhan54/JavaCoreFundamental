public class DemSoLuongChuSoNguyenN2 {
    public static void main(String[] args) {
        System.out.println(count(1234678900));

    }
    public static int count (int n){
        int sum = 0;
        while (n>10){
            n=n/10;
            sum+=1;
        }
        return sum+1;
    }

}
