package Service;

import model.Car;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {
    static private ArrayList<Car> Cars = new ArrayList<>(Arrays.asList(
      new Car(1, "laguna", "Renault", 2004, Color.BLUE),
      new Car(2, "5008", "Peugeot", 2015, Color.yellow),
      new Car(3, "C4", "Citroen", 2006, Color.BLUE),
      new Car( 4,"Laguna", "Peugeot", 2018, Color.RED)
    ));



    public List<Car> getCars(){
       return Cars;
   }

    public Car getCar(long id) {
       return Cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);
    }

    public void deleteCar(long id) {
        Cars.removeIf(car -> car.getId() == id);


    }

    public void addCar(Car car) {
        Cars.add(car);

    }

    public void updateCar(Car car, long id) {
         Cars.forEach(car1 -> {
             if (car1.getId() == id) {
                 Cars.set(Cars.indexOf(car1), car1 );
             }
         });
    }
}
