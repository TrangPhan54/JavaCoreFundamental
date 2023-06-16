import java.io.*;
import java.util.Scanner;

public class DistanceFiles  {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        System.out.println("THE SPEED (MPH) IS");
        double speed = kb.nextDouble();
        System.out.println("THE TIME (HOURS) IS");
        double time = kb.nextDouble();
//        System.out.println("Hour       Distance Traveled");
//        System.out.println("----------------------------------");
//        for (time = 1; time <= 3; time++) {
//            System.out.println(time + "\t\t\t" + time * speed);
//
//        }
        System.out.println("What name of file do u want to save as?");
        kb.nextLine();
        String nameOfFile = kb.nextLine();
        PrintWriter outPut = new PrintWriter(nameOfFile);
        for (int count = 1 ; count <= time; count++){
            outPut.println(count + "\t\t\t" + speed * count);

        }
        outPut.close();

    }
}
