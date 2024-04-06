package swigyApplications;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
      SwigyService service= new SwigyService();
     RestaurantList getlist= service.getRestaurant();
        System.out.println(getlist);

    }
}
