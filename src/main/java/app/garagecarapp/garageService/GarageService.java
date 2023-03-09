package app.garagecarapp.garageService;

import app.garagecarapp.model.Car;
import app.garagecarapp.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service


public class GarageService {

    @Autowired

    private  CarRepository carRepository;

    public GarageService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars(){
        List<Car> cars= new ArrayList<>();
        carRepository.findAll().forEach(car ->
               cars.add(car) );
        return cars;
    }

    public Optional<Car> getCar(long id ){

        return carRepository.findById(id);
    }

    public void removeCar(long id) {
        carRepository.deleteById(id);
    }

    public void addCar(Car carBody) {
        carRepository.save(carBody);
    }

    public void updateCar(Car car, long id) {
        carRepository.save(car);
    }
}



