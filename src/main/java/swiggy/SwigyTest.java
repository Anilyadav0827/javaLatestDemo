package swiggy;

public class SwigyTest {
    public static void main(String[] args) {
        Address restaAddress= new Address();
        Address userAddress= new Address();
        Order order= new Order();
        OrderItems orderItems= new OrderItems();
        Products products= new Products();
        Restaurant restaurant= new Restaurant();
        Reviews reviews = new Reviews();
        reviews.reviews="5 Star";
        reviews.ratings="Best restaurant";

        products.productName="biryani";
        products.price=300;

        restaAddress.area="kph";
        restaAddress.city="hyd";
        restaAddress.landMark="pillarNo123";

        userAddress.area="kph";
        userAddress.city="hyd";
        userAddress.landMark="pillarNo123";

        restaurant.restAddress=restaAddress;

        restaurant.products=products;
        restaurant.reviews=reviews;

        restaurant.restaurantName="Pista House";
        orderItems.quantity=2;
        orderItems.price=600;

        orderItems.restaurant=restaurant;
        order.address=userAddress;
        order.orderId="123456";
        order.orderItems=orderItems;
        System.out.println(order.orderItems.restaurant.restaurantName);

    }
}
