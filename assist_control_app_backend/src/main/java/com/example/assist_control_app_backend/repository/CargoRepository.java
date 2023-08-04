package com.example.assist_control_app_backend.repository;

import com.example.assist_control_app_backend.model.Cargo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer>{

    

}
