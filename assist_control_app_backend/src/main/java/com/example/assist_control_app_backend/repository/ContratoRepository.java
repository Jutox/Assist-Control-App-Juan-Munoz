package com.example.assist_control_app_backend.repository;

import com.example.assist_control_app_backend.model.Contrato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Integer>{

}
