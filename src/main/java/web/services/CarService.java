package web.services;

import web.models.Car;

import java.util.Arrays;
import java.util.List;

public class CarService implements ICarService {
    @Override
    public List<Car> getCars(int count) {
        return Arrays.asList(
                new Car(1, "Audi"),
                new Car(2, "Honda"),
                new Car(3, "Uas"),
                new Car(4, "Mers"),
                new Car(5, "Subaru")
        ).stream().limit(count).toList();
    }
}
