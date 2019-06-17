package phase1;

public class Address {
    String street, city, state, zip, country;
    // Constructors
    public Address () {};
    public Address (String street, String city, String state, String zip, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
    // Setters
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    // Getters
    public String getStreet() {
        return this.street;
    }
    public String getCity() {
        return this.city;
    }
    public String getState() {
        return this.state;
    }
    public String getZip() {
        return this.zip;
    }
    public String getCountry() {
        return this.country;
    }
    // Public methods
    public String printAddress() {
        return this.street + "\n" + this.city + "\n" + this.state + " " + this.zip + "\n" + this.country;
    }
}
