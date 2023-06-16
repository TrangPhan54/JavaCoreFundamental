package PrefferedCustomer;

public class PrefferedCustomer extends Customer {
    private double customerPurchase;
    private double discountLevel;

    public PrefferedCustomer(String name, String address, String telephoneNumber, String customerNumber, boolean mailList, double customerPurchase) {
        super(name, address, telephoneNumber, customerNumber, mailList);
        this.customerPurchase = customerPurchase;
        if (this.customerPurchase>=500 &&this.customerPurchase<1000)
        discountLevel = 0.05;
        else if (this.customerPurchase>=1000 &&this.customerPurchase<1500)
            discountLevel = 0.06;
        else if (this.customerPurchase>=1500 &&this.customerPurchase<2000)
            discountLevel = 0.07;
        else if (this.customerPurchase>2000)
            discountLevel = 0.1;


    }

    public double getCustomerPurchase() {
        return customerPurchase;
    }

    public void setCustomerPurchase(double customerPurchase) {
        this.customerPurchase = customerPurchase;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }
}
