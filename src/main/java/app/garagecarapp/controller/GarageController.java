package app.garagecarapp.controller;
import app.garagecarapp.garageService.GarageService;
import app.garagecarapp.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController



public class GarageController{

    @Autowired
    private GarageService garageService;
    public GarageController(GarageService garageService) {
        this.garageService = garageService;
    }

    @RequestMapping("/cars")
    public List<Car> getCar() {
        return garageService.getCars();

    }

    @RequestMapping("/car/{id}")
    public Optional<Car> getCar(@PathVariable long id){
        return garageService.getCar(id);
    }

    @DeleteMapping("/car/{id}")
    public void deleteCar(@PathVariable long id)
    {
        garageService.removeCar(id);
    }

    @PostMapping("/cars")
    public void addCar(@RequestBody Car carBody){
        garageService.addCar(carBody);
    }

    @PutMapping("/car/{id}")
    public void putCar( @RequestBody Car car,@PathVariable long id){
        garageService.updateCar(car,id);
    }


}
