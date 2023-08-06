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
import com.example.assist_control_app_backend.model.Contrato;
import com.example.assist_control_app_backend.model.Empleado;
import com.example.assist_control_app_backend.repository.ContratoRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value= "/contrato")
public class ContratoRestController {
    
    @Autowired
    private ContratoRepository contratoRepository;

    // get contrato by id rest api
	@GetMapping("/contratos/{id}")
	public ResponseEntity<Contrato> getcontratoById(@PathVariable int id) {
		Contrato contrato = contratoRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("contrato not exist with id :" + id));
		return ResponseEntity.ok(contrato);
	}

        // create empleados rest api
	@PostMapping("/contratos")
	public Contrato creatContratos(@RequestBody Contrato contrato) {
		return contratoRepository.save(contrato);
	}
    

}
