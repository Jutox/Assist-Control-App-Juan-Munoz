package com.example.assist_control_app_backend.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;

@Entity
public class Cargo 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_cargo")
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

}
