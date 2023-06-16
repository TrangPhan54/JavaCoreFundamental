package Cash;


public class CashRegister {
    private RetailItem retailItem;
    private int quantity;

    public CashRegister(RetailItem retailItem, int quantity) {
        this.retailItem = retailItem;
        this.quantity=quantity;
    }
    public double subTotal(RetailItem retailItem){
        return retailItem.getPrice()*quantity;
    }
    public double getTax (RetailItem retailItem){
        return retailItem.getPrice()*quantity*0.06;
    }
    public double totalSale (RetailItem retailItem){
        return retailItem.getPrice()*quantity*1.06;
    }
}
