package phase1;

public class Refreshment extends Product {
    String refreshmentName;
    // Constructors
    public Refreshment () {
    }
    public Refreshment (String productCode, String productType, String refreshmentName, float price) {
        this.productCode = productCode;
        this.productType = productType;
        this.refreshmentName = refreshmentName;
        this.price = price;
    }
    // Setters
    public void setRefreshmentName (String refreshmentName) {
        this.refreshmentName = refreshmentName;
    }
    // Getters
    public String getRefreshmentName () {
        return this.refreshmentName;
    }
}
