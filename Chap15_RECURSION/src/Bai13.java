public class Bai13 {
    public static void main(String[] args) {
        System.out.println(tinhTongCacPhanSo(4));

    }
    public static double tinhTongCacPhanSo (double n){
        if (n==1){
            return 1;
        }
        else {
            return tinhTongCacPhanSo(n-1)+1/n;
      }
    }
}
