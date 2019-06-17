package phase1;

import java.util.Date;
public class MovieTicket extends Product {
    Date screenTime;
    String movieName, screenNo;
    Address address;
    public MovieTicket () {
    }
    public MovieTicket (String productCode, String productType, Date screenTime, String movieName,
        String screenNo, Address address, float price) {
        this.productCode = productCode;
        this.productType = productType;
        this.screenTime = screenTime;
        this.movieName = movieName;
        this.screenNo = screenNo;
        this.address = address;
        this.price = price;
    }
    // Setters
    public void setScreenTime (Date screenTime) {
        this.screenTime = screenTime;
    }
    public void setMovieName (String movieName) {
        this.movieName = movieName;
    }
    public void setScreenNo (String screenNo) {
        this.screenNo = screenNo;
    }
    public void setAddress (Address address) {
        this.address = address;
    }
    // Getters
    public Date getScreenTime () {
        return this.screenTime;
    }
    public String getMovieName () {
        return this.movieName;
    }
    public String getScreenNo () {
        return this.screenNo;
    }
    public Address getAddress () {
        return this.address;
    }
}
