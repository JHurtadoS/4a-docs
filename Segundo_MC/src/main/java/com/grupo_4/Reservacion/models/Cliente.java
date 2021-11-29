package com.grupo_4.Reservacion.models;

import org.springframework.data.annotation.Id;

public class Cliente {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private Integer cédula;
    private Integer teléfono;
    private Float dinero_actual;

    public Cliente(String nombre,String apellido, Integer cédula, Integer teléfono, Float dinero_actual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cédula = cédula;
        this.teléfono = teléfono;
        this.dinero_actual = dinero_actual;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCédula() {
        return cédula;
    }
    public void setCédula(Integer cédula) {
        this.cédula = cédula;
    }

    public Integer getTeléfono() {
        return teléfono;
    }
    public void setTeléfono(Integer teléfono) {
        this.teléfono = teléfono;
    }

    public Float getDinero_actual() {
        return dinero_actual;
    }
    public void setDinero_actual(Float dinero_abonado) {
        this.dinero_actual = dinero_actual;
    }


}
