package swigyApplications;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SwigyService service= new SwigyService();
        RestaurantResponse getlist= service.getRestaurantlist();
        System.out.println(getlist);
//        Scanner input= new Scanner(System .in);
//        System.out.println("Enter restaurant name:");
//        String name=input.nextLine();
//        System.out.println(" Restaurant name : " + name);
//        RestaurantService restaurantService= new RestaurantService();
//        restaurantService.selectRestaurant(getlist,name);
//        for(int i=0; i<getlist.restaurantList.size();i++){
//            Restaurant restaurant1=getlist.restaurantList.get(i);
//            System.out.println(restaurant1);
//            for(int j=0; j<restaurant1.getDishList().size();j++){
//                Dish dish1=restaurant1.getDishList().get(i);
//                System.out.println(dish1);
//            }
//        }
        for(Restaurant restaurant2:getlist.restaurantList){
           // System.out.println(restaurant2.getRestaurantName());
            for(Dish dish2:restaurant2.getDishList()){
                System.out.println( "restaurant name: "+restaurant2.getRestaurantName()
                        +" dish Name:"+dish2.getDishName()+"   Dish type:"+dish2.getDishType());
            }
        }






        Restaurant r1= new Restaurant();
        r1.setRestaurantName("BBB");

        Restaurant r2= new Restaurant();
        r2.setRestaurantName("BBB");

        Restaurant r3=new Restaurant();
        r3.setRestaurantName("BBB");

        System.out.println("Reflex Starts here:");
        Restaurant reflex=r1;
        System.out.println(r1.equals(reflex));
        System.out.println("Reflex ends here");

        System.out.println("symmetric starts here:");
        System.out.println(r1.equals(r2));
        System.out.println("symmetric ends here");

        System.out.println("Transmitive Starts here:");
        System.out.println(r1.equals(r3));
        System.out.println("transmitive ends here:");

        System.out.println("hashCode for r1: "+r1.getRestaurantName().hashCode());
        System.out.println("hashCode for r2: "+r2.getRestaurantName().hashCode());
        System.out.println("hashCode for r3: "+r3.getRestaurantName().hashCode());








    }
}
