package instructor;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Instructor> instructorSet = new HashSet<>();
        Instructor William = new Instructor("William", "Kane", "123");
        Instructor Anna = new Instructor("Anna", "Karenina", "456");
        Instructor Nicolas = new Instructor("Nicolas", "Spark", "789");
        Instructor Colleen = new Instructor("Colleen", "McCullough", "657");

        // Add some strings to the set.
        instructorSet.add(William);
        instructorSet.add(Anna);
        instructorSet.add(Nicolas);
        instructorSet.add(Colleen);

        // Display the elements in the set.
        System.out.println("Here are all the instructors ");
        System.out.println(instructorSet);


        // Search for a specific car. This one is in the set.
        Instructor instructor = new Instructor("William","Kane","123");
        System.out.println("Searching for " + instructor);
        if (instructorSet.contains(instructor)) {
            System.out.println( instructor.getFirstName()+ " is in the set.");
        } else {
            System.out.println(instructor.getFirstName()+ " is NOT in the set.");
        }

        // Search for another car. This one is not in the set.
        Instructor instructor1 = new Instructor(Anna);
        System.out.println("Searching for " + instructor1);
        if (instructorSet.contains(instructor1)) {
            System.out.println("Anna is in the set.");
        } else {
            System.out.println("Anna is NOT in the set.");
        }
    }
}
