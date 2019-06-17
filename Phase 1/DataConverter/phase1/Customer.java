package phase1;

public class Customer {
    String customerCode, customerType, customerName;
    Person primaryContact;
    Address address;
    // Constructors
    public void Customer () {
    }
    public void Customer (String customerCode, String customerType, String customerName, 
        Person primaryContact, Address address) {
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.customerName = customerName;
        this.primaryContact = primaryContact;
        this.address = address;
    }
    // Setters
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setPrimaryContact(Person primaryContact) {
        this.primaryContact = primaryContact;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    // Getters
    public String getCustomerCode() {
        return this.customerCode;
    }
    public String getCustomerType() {
        return this.customerType;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public Person getPrimaryContact() {
        return this.primaryContact;
    }
    public Address getAddress() {
        return this.address;
    }
}
