package equalsHashCode;

import java.util.HashSet;
import java.util.Set;

public class SetDemoTest {
    public static void main(String[] args) {
        Set<Car> carSet=new HashSet<>();
        Car car1= new Car();
        car1.carName="punch";
        Car car2= new Car();
        car2.carName="punch";
        carSet.add(car1);
        carSet.add(car2);
        System.out.println(carSet);
    }
}
