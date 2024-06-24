package com.brenofco.carmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.brenofco.carmgmt.domain.Car;

public interface CarRepository extends JpaRepository<Car, String> {
}
