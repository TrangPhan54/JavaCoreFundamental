import java.io.BufferedReader;
import java.io.*;
public class LineNumbers {
    public static void main(String[] args) throws IOException {
        int number = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("a_thousand_years.txt"));
            PrintWriter Writer = new PrintWriter("trang_phan_thuy.txt");
            String lyrics;
            while ((lyrics = reader.readLine())!=null){
                number ++;
                Writer.println(number +"."+lyrics);
                System.out.println(number +"."+lyrics);
            }
            Writer.close();
            reader.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
