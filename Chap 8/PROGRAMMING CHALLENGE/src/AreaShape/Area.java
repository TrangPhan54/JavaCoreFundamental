package AreaShape;

public class Area {

    public static double area (int length, int width){
        double areaRectangle = length * width;
        return areaRectangle;
    }

    public static double area (double radius){
        double areaCircle = radius*radius*Math.PI;
        return areaCircle ;
    }
    public static double area (double height,double radius){
        double areaCylinder = radius*radius*height*Math.PI;
        return areaCylinder;

    }

}

