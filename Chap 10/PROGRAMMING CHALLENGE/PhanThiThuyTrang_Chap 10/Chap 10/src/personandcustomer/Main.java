package personandcustomer;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Catherine","123 Wall Street","45673728");
        Customer customer = new Customer (person.getName(), person.getAddress(), person.getTelephoneNumber(), "12346",true);
        System.out.println("The person named "+person.getName() + " live in "+person.getAddress()+". Customer telephone number is "+person.getTelephoneNumber()+". Customer number is "+customer.getCustomerNumber());

    }

}
