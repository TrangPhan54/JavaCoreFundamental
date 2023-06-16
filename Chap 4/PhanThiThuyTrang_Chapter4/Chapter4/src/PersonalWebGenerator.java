import java.util.Scanner;
public class PersonalWebGenerator {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println("ENTER YOUR NAME");
        String name = kb.nextLine();
        System.out.println("ENTER YOUR DESCRIPTION");
        String description = kb.nextLine();
        System.out.printf("<html>\n"+
                            "<head>\n"+
                            "</head>\n"+
                               "<body>\n"+
                                  "<center>\n"+
                                    " <h1>\n" +name +"</h1>"+
                                       "</center>\n"+
                                             "<hr />\n"+
                                               description+
                                                   "<hr />\n"+
                                                       "</body>\n"+
                                                            "</html\n");




    }
}
