package PrefferedCustomer;

public class Main {
    public static void main(String[] args) {
        PrefferedCustomer prefferedCustomer = new PrefferedCustomer("Ethan","123 wall street","12345","34567",false,1000);
        System.out.println("Customer named "+prefferedCustomer.getName()+ " who is living in "+prefferedCustomer.getAddress()+ " can get discount "+ prefferedCustomer.getDiscountLevel()*100+ "% because he purchase $"+prefferedCustomer.getCustomerPurchase());
    }
}
