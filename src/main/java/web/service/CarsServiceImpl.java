package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.Objects;

@Service
public class CarsServiceImpl implements CarsService {

    private final List<Car> cars = List.of(
            new Car("Audi", "A7", 249),
            new Car("BMW", "320", 218),
            new Car("Mercedes Benz", "E-class", 354),
            new Car("Infinity", "G37", 333),
            new Car("Nissan", "Skyline", 280));

    @Override
    public List<Car> getCars(Integer count) {
        return cars.stream().limit(Objects.isNull(count) ? cars.size() : count).toList();
    }
}
