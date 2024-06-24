package com.brenofco.carmgmt.presenter.rest;

import com.brenofco.carmgmt.domain.CarDTO;
import com.brenofco.carmgmt.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    public CarService carService;

//    @GetMapping("/{vin}")
//    public CarDTO getCar(@PathVariable String vin) {
//        return carService.getCarByVin(vin);
//    }

    @PostMapping
    public String addCar(@RequestBody CarDTO dto) {
        return carService.postCar(dto);
    }

//    @PutMapping("/{vin}")
//    public String editCar(@PathVariable String vin, @RequestBody CarDTO dto) {
//        return carService.editCar(dto);
//    }
//
//    @DeleteMapping("/{vin}")
//    public String deleteCar(@PathVariable String vin, @RequestBody CarDTO dto) {
//        return carService.deleteCar(dto);
//    }
}
