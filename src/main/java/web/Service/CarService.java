package web.Service;

import Models.Car;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class CarService {
    private List<Car> carList = Arrays.asList(
            new Car("Toyota", 2000, 777),
            new Car("Mersedes", 2002, 666),
            new Car("Lamborgini", 2003, 555),
            new Car("Lada", 2004, 444),
            new Car("Ferrari", 2005, 333));

    public List<Car> getCarList (int count) {
        if (count >= 5) {
            return this.carList;
        }
        return this.carList.subList(0, count);
    }



 }
