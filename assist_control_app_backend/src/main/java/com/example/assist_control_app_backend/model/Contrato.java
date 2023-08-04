package com.example.assist_control_app_backend.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

import jakarta.persistence.CascadeType;

@Entity
public class Contrato{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_contrato;

    private String tipoContrato;
   
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy= "contrato")
    @JsonManagedReference
    private List<Empleado> empleados;
    
    public Contrato(){}

    public Contrato(int id_contrato, String tipoContrato){
        super();
        this.id_contrato = id_contrato;
        this.tipoContrato = tipoContrato;
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoCargo) {
        this.tipoContrato = tipoCargo;
    }
}
