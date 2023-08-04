package com.example.assist_control_app_backend.repository;

import com.example.assist_control_app_backend.model.Empleado;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

}