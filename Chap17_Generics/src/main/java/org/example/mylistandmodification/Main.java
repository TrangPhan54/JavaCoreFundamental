package org.example.mylistandmodification;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.adding(1);
        myList.adding(2);
        myList.adding(3);
        System.out.println(myList.largest());
        System.out.println(myList.smallest());


        MyListModification<String> myListModification = new MyListModification<>();
        myListModification.add("anna");
        myListModification.add("bella");
        myListModification.add("michael");
        System.out.println(myListModification.largest());
        System.out.println(myListModification.smallest());

    }
}