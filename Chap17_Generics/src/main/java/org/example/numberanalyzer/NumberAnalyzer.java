package org.example.numberanalyzer;

public class NumberAnalyzer <T extends Number>{
    private T [] numberList;
    public NumberAnalyzer(T [] numberList) {
        this.numberList = numberList;
    }

    public T highest() {
        T largest = numberList[0];
        for (T t : numberList) {
            if (t.doubleValue() > numberList[0].doubleValue())
                largest = t;

        }
        return largest;
    }

    public T lowest() {
        T lowest = numberList[0];
        for (T t : numberList) {
            if (t.doubleValue() < numberList[0].doubleValue())
                lowest = t;

        }
        return lowest;
    }
    public double total (){
        double total = 0;
        for (T t : numberList) {
            total += t.doubleValue();
        }
        return total;

    }
    public double average(){
        double total = 0;
        double average;
        for (T t : numberList) {
            total += t.doubleValue();
        }
        average = total/ numberList.length;

        return average;

    }
}
