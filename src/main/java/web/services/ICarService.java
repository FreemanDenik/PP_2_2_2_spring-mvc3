package web.services;

import web.models.Car;

import java.util.List;

public interface ICarService {
    public List<Car> getCars(int count);
}
