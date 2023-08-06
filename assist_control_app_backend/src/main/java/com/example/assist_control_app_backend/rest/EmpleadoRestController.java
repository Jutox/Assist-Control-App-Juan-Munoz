package com.example.assist_control_app_backend.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.example.assist_control_app_backend.model.Empleado;
import com.example.assist_control_app_backend.repository.EmpleadoRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/empleado")
public class EmpleadoRestController {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

   // get all empleados
	@GetMapping("/empleados")
	public List<Empleado> getAllempleados(){
		return empleadoRepository.findAll();
	}		

    // create empleados rest api
	@PostMapping("/empleados")
	public Empleado createEmpleados(@RequestBody Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

    // get empleado by id rest api
	@GetMapping("/empleados/{id}")
	public ResponseEntity<Empleado> getEmpleadoById(@PathVariable int id) {
		Empleado empleado = empleadoRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Empleado not exist with id :" + id));
		return ResponseEntity.ok(empleado);
	}

}