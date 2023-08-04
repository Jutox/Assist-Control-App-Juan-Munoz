package com.example.assist_control_app_backend.rest;

import java.util.List;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.assist_control_app_backend.model.Cargo;
import com.example.assist_control_app_backend.model.Contrato;
import com.example.assist_control_app_backend.service.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoRestController {
    
    
}