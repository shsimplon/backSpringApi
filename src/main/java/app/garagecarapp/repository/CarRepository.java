package app.garagecarapp.repository;

import app.garagecarapp.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface CarRepository extends CrudRepository<Car, Long> {
}
