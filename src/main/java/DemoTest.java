public class DemoTest {
    public static void main(String[] args) {
        User user= new User();
        Address address =new Address();
        address.area="kphp";
        address.landMark="pillarNo 1344";
        address.city="hyd";
        address.pinCode="22222";
        System.out.println(address);
        user.address=address;
        System.out.println(user.address.area);

        Restaurant restaurant= new Restaurant();
        restaurant.restaurantName="lucky";
        restaurant.address=address;
        System.out.println(restaurant.address.area);

        Address userAddress= new Address();

        userAddress.area="kphp";
        userAddress.landMark="pillarNo 1344";
        userAddress.city="hyd";
        userAddress.pinCode="22222";

        User user1= new User();
        user1.address=userAddress;
        System.out.println();

        Address restaurantAddress= new Address();
        restaurantAddress.area="kphp";
        restaurantAddress.landMark="pillarNo 1344";
        restaurantAddress.city="hyd";
        restaurantAddress.pinCode="22222";

        User user2= new User();
        user2.address=restaurantAddress;



    }
}
