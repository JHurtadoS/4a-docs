package com.grupo_4.Reservacion.models;
import org.springframework.data.annotation.Id;

public class Propiedad {
    @Id
    private int id;
    private String direccion;
    private String codigo;
    private String descripcion;
    private Integer precio;
    private int IDdueño;

    public Propiedad(int id, String direccion, String codigo, String descripcion, Integer precio, int IDdueño) {
        this.id = id;
        this.direccion = direccion;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.IDdueño = IDdueño;
    }



    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public int getIDdueño() {
        return IDdueño;
    }

    public void setIDdueño(int IDdueño) {
        this.IDdueño = IDdueño;
    }

    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion () {
        return direccion;
    }

    public String getCodigo () {
        return codigo;
    }

    public void setCodigo (String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio () {
        return precio;
    }

    public void setPrecio (Integer precio) {
        this.precio = precio;
    }
}