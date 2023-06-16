package PatientCharges;

public class Patient {
    private String name;
    private String address;
    private String phoneNumber;
    private String emerContact;

    public Patient(String name, String address, String phoneNumber, String emerContact) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emerContact = emerContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmerContact() {
        return emerContact;
    }

    public void setEmerContact(String emerContact) {
        this.emerContact = emerContact;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emerContact='" + emerContact + '\'' +
                '}';
    }
}
