package Geometry;

import java.util.Scanner;

public class Geometry {

    public static double areaRectangle (double length, double width){
        return length*width;
    }
    public static double areaTriangle (double base, double height){
        return base*height/2;
    }
    public static double areaCirlcle (double radius){
        return 2*radius*Math.PI;
    }

}
