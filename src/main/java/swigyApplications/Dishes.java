package swigyApplications;

public class Dishes {


    public String dishName;
    public String dishType;
    public int price;
    @Override
    public String toString() {
        return " \n Dishes{" +
                "dishName='" + dishName + '\'' +
                ", dishType='" + dishType + '\'' +
                ", price=" + price +
                '}';
    }
}
