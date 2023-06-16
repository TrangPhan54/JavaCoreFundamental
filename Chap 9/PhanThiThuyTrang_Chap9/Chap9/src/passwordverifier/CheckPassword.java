package passwordverifier;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = kb.nextLine();
        PassWord newPassword = new PassWord(password);
        if (newPassword.checkPassword()) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
    }
}
