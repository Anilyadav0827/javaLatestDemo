package transaction;

import java.util.List;

public class Shop {
    public List<Product>productList;
    public void productAvailability(Product product){
       if( productList.contains(product)) {
           System.out.println("Product available"+product);
       }
       else {
           System.out.println(" product not available");
       }
    }
    @Override
    public String toString() {
        return " \n Shop{" +
                "productList=" + productList +
                '}';
    }
}
