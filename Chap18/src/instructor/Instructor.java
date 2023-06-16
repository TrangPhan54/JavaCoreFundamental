package instructor;

import java.util.Objects;

public class Instructor {


    private String lastName;     // Last name
    private String firstName;    // First name
    private String officeNumber; // Office number


    public Instructor(String lname, String fname,
                      String office)
    {
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }


    public Instructor(Instructor object2)
    {
        lastName = object2.lastName;
        firstName = object2.firstName;
        officeNumber = object2.officeNumber;
    }



    public void set (String lname, String fname,
                    String office)
    {
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public String toString()
    {
        // Create a string representing the object.
        String str = "Last Name: " + lastName +
                "\nFirst Name: " + firstName +
                "\nOffice Number: " + officeNumber;

        // Return the string.
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instructor that = (Instructor) o;
        return Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName) && Objects.equals(officeNumber, that.officeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, officeNumber);
    }

    public String getFirstName() {
        return firstName;
    }
}

