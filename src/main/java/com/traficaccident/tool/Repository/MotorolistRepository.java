package com.traficaccident.tool.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traficaccident.tool.Domain.Motorolist;

@Repository
public interface MotorolistRepository extends JpaRepository<Motorolist, String> {

}
