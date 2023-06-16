import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args) {
        double length,width,area;
        String displayData;
        length = getLength();
        width = getWidth();
        area = getArea (length,width);
        displayData=displayData(length,width,area);
        System.out.println(displayData);


    }
    public static double getLength(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER LENGTH");
        double length = scanner.nextDouble();
        return length;

    }
    public static double getWidth(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("ENTER WIDTH");
        double width = scanner.nextDouble();
        return width;
    }
    public static double getArea (double length, double width){
        double area = length*width;
        System.out.println("area = "+area);
        return area;
    }
    public static String displayData (double length, double width, double area){
        String displayData;
        displayData = "length is "+length+"\n"+width +"\narea is"+area;
        return displayData.toString();
    }
}
