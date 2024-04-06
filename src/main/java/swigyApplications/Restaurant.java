package swigyApplications;

import java.util.List;

public class Restaurant {
     List<Dishes>dishesList;
     public String restaurantName;
     public Ratings ratings;

     @Override
     public String toString() {
          return " \n Restaurant{" +
                  "dishesList=" + dishesList +
                  ", restaurantName='" + restaurantName + '\'' +
                  ", ratings=" + ratings +
                  '}';
     }
}
