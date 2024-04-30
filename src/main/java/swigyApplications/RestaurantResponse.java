package swigyApplications;

import java.util.List;

public class RestaurantResponse {
    List<Restaurant>restaurantList;

    @Override
    public String toString() {
        return " \n RestaurantResponse{" +
                "restaurantList=" + restaurantList +
                '}';
    }
}
