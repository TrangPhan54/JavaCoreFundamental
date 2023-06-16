package student;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList <Student> students = new ArrayList<Student>();
        students.add(new Student(111,"Anna","Ha Noi"));
        students.add(new Student(99,"jack","HCM"));
        students.add(new Student(1001,"Celine","Da Nang"));
        students.add( new Student(43,"Casandra","London"));
        for (int i = 0;i <students.size();i++) {
            System.out.println(students.get(i));
        }


        Collections.sort (students,new SortByRoll());
        for (int i = 0;i <students.size();i++) {
            System.out.println(students.get(i));
        }
    }
}
