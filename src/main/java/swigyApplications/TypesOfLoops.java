package swigyApplications;

import java.util.Iterator;

public class TypesOfLoops {
    public static void main(String[] args) {


        SwigyService service = new SwigyService();
        RestaurantResponse list = service.getRestaurantlist();
        for(int i=0 ;i<list.restaurantList.size();i++){
            Restaurant restaurant= list.restaurantList.get(i);
            System.out.println(" normal for loop:"+restaurant.getRestaurantName());

        }
        for (Restaurant restaurant:list.restaurantList){
            System.out.println(" advanced for "+restaurant.getRestaurantName());

        }

        Iterator<Restaurant> restaurantIterator =list.restaurantList.iterator();
        for(;restaurantIterator.hasNext();){
            Restaurant restaurantlist= restaurantIterator.next();
            System.out.println("Iterator restuarents : "+restaurantlist.getRestaurantName());
        }
        list.restaurantList.forEach(restaurant ->
                System.out.println(" for each restauarnt:"+restaurant.getRestaurantName()));
       }

}