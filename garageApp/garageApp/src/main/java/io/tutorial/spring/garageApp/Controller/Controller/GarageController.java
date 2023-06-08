package io.tutorial.spring.garageApp.Controller.Controller;

import Service.GarageService;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class GarageController {





    private GarageService garageService;
    @Autowired

    @GetMapping

    @RequestMapping(method = RequestMethod.GET, value = "/cars")
    public List<Car> getCars(){

        return garageService.getCars();

    }
   @RequestMapping("/car/{id}")
    public Car getCard( @PathVariable long id) {
        return garageService.getCar(id);
    }
   @RequestMapping( method = RequestMethod.DELETE, value = "/car/{id}" )
    public void deleteCar(@PathVariable long id) {
        garageService.deleteCar(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/cars")
    public void addCar(Car car) {
        garageService.addCar(car);

    }
    @RequestMapping( method = RequestMethod.PUT, value = "/car/{id}" )
    public void updateCar(@RequestBody Car car,@PathVariable long id) {

     garageService.updateCar(car, id);
    }



}
