package org.example.numberanalyzer;

public class Main {
    public static void main(String[] args) {
        Integer [] list = {-1,2,3,45, 1000};
        NumberAnalyzer <Integer> integerList = new NumberAnalyzer<>(list);
        System.out.println(integerList.lowest());
        System.out.println(integerList.highest());
        System.out.println(integerList.total());
        System.out.println(integerList.average());


    }

}
