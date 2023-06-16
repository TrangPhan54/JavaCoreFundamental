package TelemarketingPhoneNumber;

import java.util.Scanner;

public class CheckTelephone {
    public static void main(String[] args) {
        String[] name = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
        String[] tel = {"555-2234", "555-9098", "555-1785", "555-9224"};

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first few characters of a name: ");
        String input = kb.nextLine().toLowerCase();
        for (int i = 0; i < name.length; i++) {
            if (name[i].toLowerCase().startsWith(input)) {
                System.out.println("Name: " + name[i] + "\nTel: " + tel[i] + "\n");
            }
        }
    }
}
