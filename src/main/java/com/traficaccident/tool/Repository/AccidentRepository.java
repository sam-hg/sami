package com.traficaccident.tool.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traficaccident.tool.Domain.Accident;

@Repository
public interface AccidentRepository extends JpaRepository<Accident, Long> {

}
