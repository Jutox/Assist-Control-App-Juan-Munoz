package com.example.assist_control_app_backend.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;




@Entity
public class Empleado {
    
    @Id
    private int id_empleado;

    private String rut_empleado;
    private String nombres;
    private String apellidos;
    private int edad;
    private String genero;
    private String correo;

    
    @ManyToOne
    @JoinColumn(name = "id_cargo")
    @JsonBackReference
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "id_contrato")
    @JsonBackReference
    private Contrato contrato;

    public Empleado(){super();}

    public Empleado(int id_empleado, String rut_empleado, String nombres, String apellidos, int edad, String genero, String correo){
        super();
        this.id_empleado = id_empleado;
        this.rut_empleado = rut_empleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
        this.correo = correo;
    }

    public String getRut_empleado() {
        return rut_empleado;
    }

    public void setRut_empleado(String rut_empleado) {
        this.rut_empleado = rut_empleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Contrato getcontrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

}
