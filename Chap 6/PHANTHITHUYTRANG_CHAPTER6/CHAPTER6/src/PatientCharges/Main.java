package PatientCharges;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner;
//        System.out.println("ENTER YOUR FULL NAME");
//        String name = sc.nextLine();
//        System.out.println("ENTER YOUR ADDRESS");
//        String address = sc.nextLine();
//        System.out.println("ENTER YOUR PHONE NUMBER");
//        String phoneNumber = sc.nextLine();
//        System.out.println("ENTER YOUR PHONE NUMBER FOR CONTACT");
//        String emerContact = sc.nextLine();

        Patient patient = new Patient("Maria","Ho Chi Minh city, Tan Binh District, ZIP CODE 700000","3562276363","6457347237");
        System.out.println(patient);
        Procedure procedure = new Procedure("Physical Exam","Today's date","Dr.Irvine",250.00);
        System.out.println(procedure);
        Procedure procedureOne = new Procedure("X-ray","Today's date","Dr Jaminson",500.00);
        System.out.println(procedureOne);
        Procedure procedureTwo = new Procedure("Blood Test","Today's date","Dr. Smith", 200.00);
        System.out.println(procedureTwo);

    }
}
