package com.example.assist_control_app_backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assist_control_app_backend.model.Empleado;
import com.example.assist_control_app_backend.repository.EmpleadoRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/empleado")
public class EmpleadoRestController {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

	@GetMapping("/empleados")
	public List<Empleado> getAllempleados(){
		return empleadoRepository.findAll();
	}		

	@PostMapping("/empleados")
	public Empleado createEmpleados(@RequestBody Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

}