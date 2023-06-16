import java.util.Scanner;
public class WordGame {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner (System.in);
        System.out.println ("What is your name ?");
        String name = keyboard.nextLine();
        System.out.println ("How old are u ?");
        String age = keyboard.nextLine();
        System.out.println ("Where are u from ?");
        String city = keyboard.nextLine();
        System.out.println ("Where did u learn ?");
        String college = keyboard.nextLine();
        System.out.println ("What's your major ?");
        String profession = keyboard.nextLine();
        System.out.println ("What's kind of animals do u like ?");
        String animal = keyboard.nextLine();
        System.out.println ("What's your dog's name ?");
        String petName = keyboard.nextLine();
        System.out.println ("My name's"+ name);


        System.out.println ("There once was a person "+ name+" who live in "+ city + " . At the age of " + age +"," + name+ " go to college at " + college + "." + name+ " graduated and went to work as a"+profession+ ". Then,"+ name+" adopt a " + animal + "name "+ petName+ ". They both live happily ever after!");




    }
}
