package org.example.mylistandmodification;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {
    private ArrayList<T> myList  = new ArrayList<>();


    public MyList() {
    }

    public List<T> adding(T number) {
       this.myList.add(number);
       return this.myList;
    }

    public T largest() {
        T largest = myList.get(0);
        for (T t : myList) {
            if (t.doubleValue() > largest.doubleValue())
                largest = t;

        }
        return largest;
    }
    public T smallest() {
        T smallest = myList.get(0);
        for (T t : myList) {
            if (t.doubleValue() < smallest.doubleValue())
                smallest = t;

        }
        return smallest;
    }
}
