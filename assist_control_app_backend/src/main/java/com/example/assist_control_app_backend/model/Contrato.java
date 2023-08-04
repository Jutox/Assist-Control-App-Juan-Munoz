package com.example.assist_control_app_backend.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

@Entity
public class Contrato{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_contrato")
    private int id_contrato;

    private String tipoContrato;
   

    @OneToMany(cascade = CascadeType.ALL, mappedBy= "empleado")
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
