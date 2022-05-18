package web.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private Collection<Car> cars;

    public CarServiceImp() {
        cars = Arrays.asList(
                new Car(1, "Audi"),
                new Car(2, "Honda"),
                new Car(3, "Uas"),
                new Car(4, "Mers"),
                new Car(5, "Subaru"));
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
