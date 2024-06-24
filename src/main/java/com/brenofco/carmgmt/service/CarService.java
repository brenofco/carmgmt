package com.brenofco.carmgmt.service;

import com.brenofco.carmgmt.domain.Car;
import com.brenofco.carmgmt.domain.CarDTO;
import com.brenofco.carmgmt.domain.mapper.CarMapper;
import com.brenofco.carmgmt.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Autowired
    public CarService(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository=carRepository;
        this.carMapper=carMapper;
    }
//    public CarDTO getCarByVin(String vin) {
//
//    }
    public String postCar(CarDTO dto) {
        //if (checkValidVin(dto.vin())) {
            if (checkVinExistence(dto.vin())) {
                return "Car already exists!";
            } else {
                carRepository.save(carMapper.mapDtoToCar(dto));
                return "Car successfully added!";
            }
        //} else {
        //    return "Error: Invalid vin!";
        //}
    }

    public boolean checkVinExistence(String vin) {
        return carRepository.existsById(vin);
    }

//    public boolean checkValidVin(String vin) {
//
//        return true;
//    }
}

