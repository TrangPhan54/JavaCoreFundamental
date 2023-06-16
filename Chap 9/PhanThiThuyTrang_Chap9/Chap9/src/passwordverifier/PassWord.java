package passwordverifier;

public class PassWord {
    private String password;

    public PassWord(String password) {
        this.password = password;
//        checkPassword();
    }

    public boolean checkLength() {
        return this.password.length() >= 6;
    }

    public boolean checkDigit() {
        boolean containsDigit = false;
        char[] charStr = password.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            if (Character.isDigit(charStr[i])) {
                containsDigit = true;
                break;
            }
        }
        return containsDigit;
    }

    public boolean checkUpper() {
        boolean containsUpper = false;
        char[] charStr = password.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            if (Character.isUpperCase(charStr[i])) {
                containsUpper = true;
                break;
            }
        }
        return containsUpper;
    }

    public boolean checkLower() {
        boolean containsLower = false;
        char[] charStr = password.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            if (Character.isLowerCase(charStr[i])) {
                containsLower = true;
                break;
            }
        }
        return containsLower;
    }

    public boolean checkPassword() {
        boolean isValid = false;
        boolean checkLength = checkLength();
        boolean checkUpper = checkUpper();
        boolean checkLower = checkLower();
        boolean checkDigit = checkDigit();
        if (!checkLength) {
            System.out.println("Length must be at least 6 characters.");
        }
        if (!checkUpper) {
            System.out.println("Password must contain at least 1 upper character.");
        }
        if (!checkLower) {
            System.out.println("Password must contain at least 1 lower character.");
        }
        if (!checkDigit) {
            System.out.println("Password must contain at least 1 digit");
        }
        if (checkLength && checkUpper && checkLower && checkDigit) {
            isValid = true;
        }
        return isValid;
    }
}

