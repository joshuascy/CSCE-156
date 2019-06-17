package phase1;

public class Product {
    String productCode, productType; 
    float price;
    // Constructors
    public Product () {
    }
    public Product (String productCode, String productType, float price) {
        this.productCode = productCode;
        this.productType = productType;
        this.price = price;
    }
    // Setters
    public void setProductCode (String productCode) {
        this.productCode = productCode;
    }
    public void setProductType (String productType) {
        this.productType = productType;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    // Getters
    public String getProductCode() {
        return this.productCode;
    }
    public String getProductType() {
        return this.productType;
    }
    public float getPrice() {
        return this.price;
    }
}
