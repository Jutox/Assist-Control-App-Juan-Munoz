package com.example.assist_control_app_backend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assist_control_app_backend.exception.ResourceNotFoundException;
import com.example.assist_control_app_backend.model.Cargo;
import com.example.assist_control_app_backend.model.Contrato;
import com.example.assist_control_app_backend.repository.CargosRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/cargo")
public class CargoRestController {

   @Autowired
    private CargosRepository cargoRepository;

    // get contrato by id rest api
	@GetMapping("/cargos/{id}")
	public ResponseEntity<Cargo> getcontratoById(@PathVariable int id) {
		Cargo cargo = cargoRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("contrato not exist with id :" + id));
		return ResponseEntity.ok(cargo);
	}

        // create empleados rest api
	@PostMapping("/cargos")
	public Cargo createCargos(@RequestBody Cargo cargo) {
		return cargoRepository.save(cargo);
	}

}
