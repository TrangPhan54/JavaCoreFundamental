package personandcustomer;

public class Customer extends Person {
    private String customerNumber;
    private boolean mailList;

    public Customer(String name, String address, String telephoneNumber, String customerNumber, boolean mailList) {
        super(name, address, telephoneNumber);
        this.customerNumber = customerNumber;
        this.mailList = mailList;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailList() {
        return mailList;
    }

    public void setMailList(boolean mailList) {
        this.mailList = mailList;
    }
}
