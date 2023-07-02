package org.example.highestandlowest;

import java.util.ArrayList;
import java.util.List;

public class HighestAndLowest<T extends Comparable<T>> {
    private T [] numberList;

    public HighestAndLowest(T [] numberList) {
        this.numberList = numberList;
    }

    public T highest() {
        T largest = numberList[0];
        for (T t : numberList) {
            if (t.compareTo(largest) > 0)
                largest = t;

        }
        return largest;
    }

    public T lowest() {
        T lowest = numberList[0];
        for (T t : numberList) {
            if (t.compareTo(lowest) < 0)
                lowest = t;

        }
        return lowest;
    }
}
