package phase1;

import java.util.List;
import java.util.Arrays;

public class Person {
    String personCode, lastName, firstName, emailAddresses;
    Address address;
    // Constructors
    public Person () {};
    public Person (String personCode, String lastName, String firstName, Address address,
        String emailAddresses) {
        this.personCode = personCode;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.emailAddresses = emailAddresses;
    }
    // Setters
    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setEmailAddresses(String emailAddresses) {
        this.emailAddresses = emailAddresses;
    }
    // Getters
    public String getPersonCode() {
        return this.personCode;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public Address getAddress() {
        return this.address;
    }
    public String getEmailAddresses() {
        return this.emailAddresses;
    }
    // Return a list of emails
    public List<String> getEmailAddressList() {
        List<String> em = Arrays.asList(this.emailAddresses.split(","));
        return em;
    }
}
