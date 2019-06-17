package phase1;

import java.util.Date;
public class SeasonPass extends Product {
    Date screenTime;
    String passName;
    Date startDate, endDate;
    // Constructors
    public SeasonPass () {
    }
    public SeasonPass (String productCode, String productType, String passName, Date startDate, Date endDate, 
        float price) {
        this.productCode = productCode;
        this.productType = productType;
        this.passName = passName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }
    // Setters
    public void setPassName (String passName) {
        this.passName = passName;
    }
    public void setStartDate (Date startDate) {
        this.startDate = startDate;
    }
    public void setEndDate (Date endDate) {
        this.endDate = endDate;
    }
    // Getters
    public String getPassName () {
        return this.passName;
    }
    public Date getStartDate () {
        return this.startDate ;
    }
    public Date getEndDate () {
        return this.endDate;
    }
}
