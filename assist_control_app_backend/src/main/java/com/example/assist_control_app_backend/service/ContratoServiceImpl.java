package com.example.assist_control_app_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assist_control_app_backend.model.Cargo;
import com.example.assist_control_app_backend.model.Contrato;
import com.example.assist_control_app_backend.model.Empleado;
import com.example.assist_control_app_backend.repository.ContratoRepository;

@Service
public class ContratoServiceImpl implements ContratoService{

 
    @Autowired
    private ContratoRepository contratoRepository;


}
