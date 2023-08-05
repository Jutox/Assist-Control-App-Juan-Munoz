package com.example.assist_control_app_backend.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cargo 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    private int id_cargo;

    private String tipoCargo;
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy= "cargo")
    @JsonManagedReference
    private List<Empleado> empleados;
    
    public Cargo(){}

    public Cargo(int id_cargo, String tipoCargo){
        super();
        this.id_cargo = id_cargo;
        this.tipoCargo = tipoCargo;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(String tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
    
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
