package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample {
	public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("BMW", 52400));
        cars.add(new Car("Toyota", 66000));
        cars.add(new Car("Audi", 44000));
         
        for(Car car: cars) {
            car.printDetails();
        }
        
       System.out.println("---------------------------");
  List<Car> c = cars.stream().filter(car->car.getMiles()>50000).collect(Collectors.toList());
  
  for (Car car : c) {
	  car.printDetails();
}
  
    }
}
