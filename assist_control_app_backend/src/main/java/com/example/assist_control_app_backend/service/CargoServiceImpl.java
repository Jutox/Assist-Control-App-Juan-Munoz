package com.example.assist_control_app_backend.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.assist_control_app_backend.model.Cargo;
import com.example.assist_control_app_backend.model.Contrato;
import com.example.assist_control_app_backend.model.Empleado;
import com.example.assist_control_app_backend.repository.CargoRepository;

@Service
public class CargoServiceImpl implements CargoService{
    
    @Autowired
    private CargoRepository cargoRepository;

}
