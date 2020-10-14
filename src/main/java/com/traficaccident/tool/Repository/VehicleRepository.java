package com.traficaccident.tool.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traficaccident.tool.Domain.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

}
