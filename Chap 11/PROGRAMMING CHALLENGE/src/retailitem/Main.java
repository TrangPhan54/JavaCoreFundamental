package retailitem;

public class Main {
    public static void main(String[] args) {
        try {
            RetailItem item = new RetailItem(-10, -5);
            item.getUnitsOnHand();
            item.getPrice();
        } catch (NegativeUnitOnHand i) {
            System.out.println(i.getMessage());

        } catch (NegativePrice j) {
            System.out.println(j.getMessage());

        }

    }
}
