package transaction;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {
    public static void main(String[] args) {
        Product shirtProduct= new Product();
        ProductSpecification shirtProductSpecification= new ProductSpecification();
        shirtProduct.type="Shirt";
        shirtProductSpecification.color="black";
        shirtProductSpecification.size=42;
        shirtProductSpecification.price=2000;
        shirtProduct.productSpecification=shirtProductSpecification;

        Product tShirtProduct= new Product();
        ProductSpecification tShirtProductSpecification= new ProductSpecification();
        tShirtProduct.type="Shirt";
        tShirtProductSpecification .color="white";
        tShirtProductSpecification.size=42;
        tShirtProductSpecification.price=2000;
        tShirtProduct.productSpecification=tShirtProductSpecification;

        Product jeansProduct= new Product();
        ProductSpecification jeansProductSpecification= new ProductSpecification();
        jeansProduct.type="Shirt";
        jeansProductSpecification.color="black";
        jeansProductSpecification.size=34;
        jeansProductSpecification.price=2000;
        jeansProduct.productSpecification=jeansProductSpecification;

        Product jerkinProduct= new Product();
        ProductSpecification jerkinProductSpecification= new ProductSpecification();
        jerkinProduct.type="Shirt";
        jerkinProductSpecification.color="black";
        jerkinProductSpecification.size=42;
        jerkinProductSpecification.price=2000;
        jerkinProduct.productSpecification=jerkinProductSpecification;

        Product jacketProduct= new Product();
        ProductSpecification jacketProductSpecification= new ProductSpecification();
        jacketProduct.type="Shirt";
        jacketProductSpecification.color="black";
        jacketProductSpecification.size=42;
        jacketProductSpecification.price=2000;
        jacketProduct.productSpecification=jacketProductSpecification;
        Shop shop= new Shop();

        List<Product>productList= new ArrayList<>();

        productList.add(shirtProduct);
        productList.add(jerkinProduct);
        productList.add(jeansProduct);
        productList.add(tShirtProduct);


        shop.productList=productList;
        System.out.println(productList);
        shop.productAvailability(shirtProduct);
        shop.productAvailability(jacketProduct);
    }
}
