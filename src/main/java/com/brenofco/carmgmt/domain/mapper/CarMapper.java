package com.brenofco.carmgmt.domain.mapper;

import com.brenofco.carmgmt.domain.Car;
import com.brenofco.carmgmt.domain.CarDTO;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    public Car mapDtoToCar (CarDTO dto) {
        return new Car(dto.vin(), dto.manufacturer(), dto.model(), dto.modelYear(), dto.color());
    }
    public CarDTO mapCarToDto(Car car) {
        return new CarDTO(car.getVin(), car.getManufacturer(), car.getModel(), car.getModelYear(), car.getColor());
    }
}
