package swigyApplications;

import java.util.List;

public class Restaurant {
    public List<Dish> dishList;
    private String restaurantName;
     private Address address;
     private Rating rating;

     public List<Dish> getDishList() {
          return dishList;
     }

     public void setDishList(List<Dish> dishList) {
          this.dishList = dishList;
     }

     public String getRestaurantName() {
          return restaurantName;
     }

     public void setRestaurantName(String restaurantName) {
          this.restaurantName = restaurantName;
     }

     public Address getAddress() {
          return address;
     }

     public void setAddress(Address address) {
          this.address = address;
     }

     public Rating getRatings() {
          return rating;
     }

     public void setRatings(Rating rating) {
          this.rating = rating;
     }

    @Override
    public String toString() {
        return "Restaurant{" +
                "dishList=" + dishList +
                ", restaurantName='" + restaurantName + '\'' +
                ", address=" + address +
                ", rating=" + rating +
                '}';
    }


   @Override
    public boolean equals(Object o){
         if(this==o){
             return true;
         }
         if(this.getClass()!=o.getClass()){
             return false;
         }
         Restaurant restaurant= (Restaurant)o;
         return this.restaurantName.equals(restaurant.restaurantName);
    }
    @Override
    public int hashCode(){
         return this.restaurantName.hashCode();
    }

}
