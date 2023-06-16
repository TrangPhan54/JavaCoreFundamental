package filearray;
import java.io.*;

public class FileArray {
    public static void writeArray (String filePath,int [] number){
        try {

            DataOutputStream output = new DataOutputStream( new FileOutputStream(filePath));
            for (int num: number){
                output.writeInt(num);
            }
            output.close();
            System.out.println("\nDone");

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    public static void readArray (String filePath, int [] number){
        int num;
        boolean endFile = false;
        try {
            DataInputStream input = new DataInputStream( new FileInputStream(filePath));
            while(!endFile){
                try {
                    num = input.readInt();
                    System.out.println(num+" ");
                } catch (IOException e){
                    endFile = true;

                }
            }
            input.close();
            System.out.println("\nfinished");

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
