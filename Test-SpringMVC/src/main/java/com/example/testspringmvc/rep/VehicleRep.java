package com.example.testspringmvc.rep;

import com.example.testspringmvc.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRep extends JpaRepository<Vehicle, Long> {
}
