package swigyUsingFunctionsAndConsumers;

public class RestauarntService {
//    Restaurant restaurant;
//    public RestauarntService(){
//        this.restaurant= new Restaurant();
//    }

    //TriFunction<RestaurantResponse ,String,Dish,Restaurant> triFunction =(restaurantResponse, name, dishName)->{

//        Iterator<Restaurant>restaurantIterator= restaurantResponse.restaurantList.iterator();
//        for(;restaurantIterator.hasNext();){
//            Restaurant restaurant1= restaurantIterator.next();
//            //System.out.println(restaurant1);
//            if(restaurant1.restaurantName.equals(name)){
//                System.out.println("restaurant name :"+name);
////
//                Iterator<Dish>dishIterator=restaurant1.dishList.iterator();
//                for(;dishIterator.hasNext() ;){
//                    Dish dish= dishIterator.next();
//                    if(dish.dishName.equals(dishName.dishName)){
//                        System.out.println("selected dish : "+dish.dishName);
//                    }
//                    return restaurant1;
//                }
//
//            }
//

    public void getRestuarntService(RestaurantResponse restaurantResponse, String name, Dish dishName){
        restaurantResponse.restaurantMap.forEach((K,V) ->{
            System.out.println("key is : "+K+" values : "+V);
            if(V.restaurantName.equals(name)){
                System.out.println("restaurant name : "+name);
                V.dishList.forEach((dish)->{
                    if(dish.dishName.equals(dishName.dishName)&&dish.dishType.equals(dishName.dishType)){
                        System.out.println("selected dish is :"+ dishName.dishName+"----"+"dish type: "+dish.dishType);

                    }
                });
            }
        });
    }

}