package SmartPhone;

public class SmartPhone {
    private int phoneID;
    private String manufacturer;
    private int price;
    private String createdDate;
    private String description;

    public SmartPhone(int id, String manu, int price, String date, String des) {
        this.phoneID = id;
        this.manufacturer = manu;
        this.price = price;
        this.createdDate = date;
        this.description = des;
    }

    public int getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "phoneID=" + phoneID +
                        ", manufacturer='" + manufacturer + '\'' +
                        ", price=" + price +
                        ", createdDate='" + createdDate + '\'' +
                        ", description='" + description + '\'' +
                        '}';
    }
}
