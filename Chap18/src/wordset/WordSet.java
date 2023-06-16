package wordset;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String str = sc.nextLine();
        Set <String> list = new TreeSet<>();
        for (String s: str.split(" ")){
            list.add(s);
        }
        for (String s: list){
            System.out.println(s);
        }


    }
}