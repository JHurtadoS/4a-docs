package com.grupo_4.Reservacion.models;
import org.springframework.data.annotation.Id;
import java.util.Date;

public class Alquiler {
    @Id
    private int id;
    private String nombreDueño;
    private String nombreCliente;
    private Date llegada;
    private Date salida;

    private String estado;
    private Float dinero_abonado;

    public Alquiler(int id, Date llegada, Date salida, String estado, Float dinero_abonado) {
        this.id = id;
        this.llegada = llegada;
        this.salida = salida;
        this.estado = estado;
        this.dinero_abonado = dinero_abonado;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getLlegada() {
        return llegada;
    }
    public void setLlegada(Date llegada) {
        this.llegada = llegada;
    }

    public Date getSalida() {
        return salida;
    }
    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Float getDinero_abonado() {
        return dinero_abonado;
    }
    public void setDinero_abonado(Float dinero_abonado) {
        this.dinero_abonado = dinero_abonado;
    }

}

