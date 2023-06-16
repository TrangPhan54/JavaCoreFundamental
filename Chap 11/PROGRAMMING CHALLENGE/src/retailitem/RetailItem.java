package retailitem;

public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem(int unitsOnHand, double price) throws NegativePrice,NegativeUnitOnHand {
        if (unitsOnHand<0 && price < 0){
            throw new NegativeUnitOnHand ("Unit On Hand:" + unitsOnHand + " must be greater than 0 and Price: " + price +  " must be grater than 0");
        }
        if(unitsOnHand < 0 )
            throw new NegativeUnitOnHand("Unit On Hand:" + unitsOnHand + " must be greater than 0");
        if (price<0){
            throw new NegativePrice ("price:" + price + " must be greater than 0");
        }

        this.price = price;
        this.unitsOnHand = unitsOnHand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RetailItem{" +
                "description='" + description + '\'' +
                ", unitsOnHand=" + unitsOnHand +
                ", price=" + price +
                '}';
    }
}