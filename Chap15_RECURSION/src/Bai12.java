public class Bai12 {
    public static void main(String[] args) {
        System.out.println(xLuyThuaY(6,4));

    }
    public static double xLuyThuaY (int x, int y){
        if (x==0 && y!=0){
            return 0;
        }
        else if (x!=0 && y == 0){
            return 1;
        }
        else {
            return xLuyThuaY(x,y-1)*Math.pow(x,1);
        }

    }
}
