package com.example.assist_control_app_backend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assist_control_app_backend.repository.CargosRepository;



@RestController
@RequestMapping("/cargos")
public class CargoRestController {

   @Autowired
    private CargosRepository cargoRepository;

}
