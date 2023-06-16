package CircleClass;

public class CircleClass {
    private double radius;
    private final double PI = 3.14159;

    public CircleClass(double radius) {
        this.radius = radius;
    }

    public CircleClass() {
        this.radius = 0.0;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double area (){
        double area = radius*radius*PI;
        return area;
    }
    public double diameter(){
        double diameter = radius*2;
        return diameter;
    }
    public double circumference (){
        double circumference = radius*2*PI;
        return circumference;
    }
}
