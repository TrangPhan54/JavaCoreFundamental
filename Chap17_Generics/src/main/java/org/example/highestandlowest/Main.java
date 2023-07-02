package org.example.highestandlowest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer [] list = {-1,2,3,45, 1000};
        HighestAndLowest<Integer> anotherList = new HighestAndLowest<>(list);
        System.out.println(anotherList.highest());
        System.out.println(anotherList.lowest());

    }






}
