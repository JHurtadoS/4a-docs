package com.grupo_4.Reservacion.models;
import org.springframework.data.annotation.Id;
import java.util.Date;

public class Alquiler {
    @Id
    private int id;
    private int NombrePropiedad;
    private String nombreCliente;
    private String nombreDueño;

    private Date llegada;
    private Date salida;

    private Float dinero_abonado;

    public Alquiler(int id, int nombrePropiedad, String nombreCliente, String nombreDueño, Date llegada, Date salida, Float dinero_abonado) {
        this.id = id;
        NombrePropiedad = nombrePropiedad;
        this.nombreCliente = nombreCliente;
        this.nombreDueño = nombreDueño;
        this.llegada = llegada;
        this.salida = salida;
        this.dinero_abonado = dinero_abonado;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public int getNombrePropiedad() {
        return NombrePropiedad;
    }

    public void setNombrePropiedad(int NombrePropiedad) {
        this.NombrePropiedad = NombrePropiedad;
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



    public Float getDinero_abonado() {
        return dinero_abonado;
    }
    public void setDinero_abonado(Float dinero_abonado) {
        this.dinero_abonado = dinero_abonado;
    }

}

