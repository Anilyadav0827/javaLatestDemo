package swigyApplications;

import java.util.ArrayList;
import java.util.List;

public class SwigyService {
    public RestaurantResponse getRestaurantlist(){

        Dish luckyDish= new Dish();

        luckyDish.setDishName("biryani");
        luckyDish.setDishType("non veg");
        luckyDish.setPrice(300);

        Rating luckyRating = new Rating();

        luckyRating.setRating("5 star");
        luckyRating.setComment("best one");

        Restaurant lucky= new Restaurant();
        lucky.setRestaurantName("lucky");

        Dish luckyDish1= new Dish();
        luckyDish1.setPrice(300);
        luckyDish1.setDishName("biryani");
        luckyDish1.setDishType("veg");
        Address luckyAddress= new Address();
        luckyAddress.setAreaName("Kph");
        luckyAddress.setLandMark("5th phase");
        luckyAddress.setCity(" hyd");
        luckyAddress.setPinCode("500060");

        List<Dish> dishList =new ArrayList<>();
        dishList.add(luckyDish);
        dishList.add(luckyDish1);
        lucky.dishList = dishList;
        lucky.setRatings( luckyRating);
        lucky.setAddress(luckyAddress);

        Dish mhefilDish= new Dish();
        mhefilDish.setDishName("biryani");
        mhefilDish.setDishType("veg");
        mhefilDish.setPrice(300);

        Rating mhefilRating = new Rating();
        mhefilRating.setRating("5 star");
        mhefilRating.setComment("One of the best Restaurant in hyd");
        Restaurant mhefil= new Restaurant();
        mhefil.setRestaurantName("mhefil");

        Dish mhefilDish1= new Dish();
        mhefilDish1.setPrice(300);
        mhefilDish1.setDishName("biryani");
        mhefilDish1.setDishType("non-veg");
        Address mhefilAddress= new Address();
        mhefilAddress.setPinCode("500090");
        mhefilAddress.setCity("hyd");
        mhefilAddress.setLandMark("Near JNTUH metro station");
        mhefilAddress.setAreaName("Jntuh");

        List<Dish> dishListatMhefil =new ArrayList<>();
        dishListatMhefil.add(mhefilDish);
        dishListatMhefil.add(mhefilDish1);
        mhefil.dishList = dishListatMhefil;
        mhefil.setRatings(mhefilRating);
        mhefil.setAddress(mhefilAddress);

        RestaurantResponse restaurantResponse = new RestaurantResponse();

        List<Restaurant>restaurantListList= new ArrayList();
        restaurantListList.add(lucky);
        restaurantListList.add(mhefil);
        restaurantResponse.restaurantList=restaurantListList;


return restaurantResponse;
    }
}
