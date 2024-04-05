package transaction;

public class Product {
    public String type;
    public String price;
    public String brand;
    ProductSpecification productSpecification;

    @Override
    public String toString() {
        return " \n Product{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                ", productSpecification=" + productSpecification +
                '}';
    }
}
