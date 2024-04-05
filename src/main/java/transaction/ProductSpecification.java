package transaction;

public class ProductSpecification {
    public int price;
    public int size;
    public String color;

    @Override
    public String toString() {
        return "\n ProductSpecification{" +
                "price=" + price +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
