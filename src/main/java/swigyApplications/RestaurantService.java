package swigyApplications;

public class RestaurantService {
 public   Restaurant restaurant;
  public RestaurantService(){

      restaurant=new Restaurant();
 }

    public Restaurant selectRestaurant( RestaurantResponse restaurantResponse,String name){
       for(Restaurant restaurant:restaurantResponse.restaurantList){
           if( restaurant.getRestaurantName().equals(name)){
               System.out.println("your restaurant found:");
               System.out.println(restaurant.getRestaurantName()+restaurant.getDishList()+restaurant.getAddress());
              return restaurant;
           }
       }

      return null;

    }
//    public  void selectDish(Restaurant restaurant,String dishName){
//       for(Dish dish:restaurant.getDishList()){
//           if(dish.getDishName().equals(dishName)){
//               System.out.println("your dish is available");
//               System.out.println(dish.getDishName());
////               return dish;
//           }
//       }
//      // return null;
//    }


}
