package swigyUsingFunctionsAndConsumers;

public class  Dish {
    public String dishName;
    public String dishType;
public Rating dishRating;

    public Dish(String dishName, String dishType) {
        this.dishName = dishName;
        this.dishType = dishType;
       // this.dishRating = dishRating;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", dishType='" + dishType + '\'' +
                ", dishRating=" + dishRating +
                '}';
    }
}
