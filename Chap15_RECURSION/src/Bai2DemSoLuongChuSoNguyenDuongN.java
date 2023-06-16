public class Bai2DemSoLuongChuSoNguyenDuongN {
    public static void main(String[] args) {
        System.out.println(countNumber(12));

    }

    public static int countNumber(int num) {
        if (num > 10) {
            return countNumber(num / 10) + 1;
        }
        else {
            return 1;
        }
    }
}