package com.example.assist_control_app_backend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assist_control_app_backend.model.Cargo;
import com.example.assist_control_app_backend.repository.CargosRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/cargo")
public class CargoRestController {

   @Autowired
    private CargosRepository cargoRepository;

	@PostMapping("/cargos")
	public Cargo createCargos(@RequestBody Cargo cargo) {
		return cargoRepository.save(cargo);
	}

}
