package org.example.pointlist;

public class Main {
    public static void main(String[] args) {
        Point<Integer> newPoint = new Point<>(1,2);
        Point<Integer> anotherPoint = new Point<>(5,6);

        PointList<Point<Integer>> newPointList = new PointList<>();
        newPointList.add(newPoint);
        newPointList.add(anotherPoint);


        System.out.println(newPoint.getX());
        System.out.println(newPoint.getY());
        System.out.println(newPointList);


    }
}