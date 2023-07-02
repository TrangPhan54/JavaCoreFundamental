package org.example.pointlist;

public class Point<T extends Number> {
    protected T x, y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }
    public Point (){
    }
    T getX() {
        return x;
    }

    T getY() {
        return y;
    }

    public String toString() {
        return "(" + x.toString() + "," + y.toString() + ")";
    }

}
