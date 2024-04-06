package swigyApplications;

import java.util.ArrayList;
import java.util.List;

public class SwigyService {
    public RestaurantList getRestaurant(){

        Dishes luckyDish= new Dishes();
        Ratings luckyRatings= new Ratings();
        luckyRatings.rating="5 star";
        luckyRatings.feedBack="best one";
        Restaurant lucky= new Restaurant();
        lucky.restaurantName="lucky";
        luckyDish.dishName="biryani";
        luckyDish.dishType="non veg";
        luckyDish.price=300;
        Dishes luckyDish1= new Dishes();
        luckyDish1.price=300;
        luckyDish1.dishName="biryani";
        luckyDish1.dishType="veg";
        List<Dishes> dishesList=new ArrayList<>();
        dishesList.add(luckyDish);
        dishesList.add(luckyDish1);
        lucky.dishesList=dishesList;
        lucky.ratings=luckyRatings;

        Dishes mhefilDish= new Dishes();
        Ratings mhefilRatings= new Ratings();
        mhefilRatings.rating="5 star";
        mhefilRatings.feedBack="One of the best Restaurant in hyd";
        Restaurant mhefil= new Restaurant();
        mhefil.restaurantName="mehfil";
        mhefilDish.dishName="biryani";
        mhefilDish.dishType="non veg";
        mhefilDish.price=300;
        Dishes mhefilDish1= new Dishes();
        mhefilDish1.price=300;
        mhefilDish1.dishName="biryani";
        mhefilDish1.dishType="veg";
        List<Dishes>dishesListatMhefil=new ArrayList<>();
        dishesListatMhefil.add(mhefilDish);
        dishesListatMhefil.add(mhefilDish1);
        mhefil.dishesList=dishesListatMhefil;
        mhefil.ratings=mhefilRatings;

        RestaurantList restaurantList= new RestaurantList();

        List<Restaurant>restaurantListList= new ArrayList();
        restaurantListList.add(lucky);
        restaurantListList.add(mhefil);
        restaurantList.restaurantList=restaurantListList;


return restaurantList;
    }
}
