package com.example.assist_control_app_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cargo 
{
    @Id
    private String tipoCargo;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cargo;
    
    public Cargo(){}

    public Cargo(String tipoCargo, int id_cargo){
        super();
        this.tipoCargo = tipoCargo;
        this.id_cargo = id_cargo;
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

    /*
    public List<Empleado> getEmpleados() {
        return empleados;
    }
    
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    */
}
