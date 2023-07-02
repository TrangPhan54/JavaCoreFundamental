package org.example.mylistandmodification;

import java.util.ArrayList;
import java.util.List;

public class MyListModification<T extends Comparable<T>>{
    private ArrayList<T> myList;

    public MyListModification() {
        this.myList = new ArrayList<>();
    }

    public List<T> add(T number) {
        myList.add(number);
        return myList;
    }

    public T largest() {
        T largest = myList.get(0);
        for (T t : myList) {
            if (t.compareTo(largest)>0)
                largest = t;

        }
        return largest;
    }
    public T smallest() {
        T smallest = myList.get(0);
        for (T t : myList) {
            if (t.compareTo(smallest)<0)
                smallest = t;

        }
        return smallest;
    }
}
