package com.grupo_4.Reservacion.models;
import org.springframework.data.annotation.Id;

public class Dueño {
    @Id
    private int id;
    private String nombre;
    private String apellido;
    private String teléfono;
    private String email;
    private Float dinero_actual;


    public Dueño(int id, String nombre, String apellido, String teléfono, String email, Float dinero_actual) {
        this.id=id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.teléfono = teléfono;
        this.email = email;
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

    public String getTeléfono() {
        return teléfono;
    }
    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Float getDinero_actual() {
        return dinero_actual;
    }
    public void setDinero_actual(Float dinero_actual) {
        this.dinero_actual = dinero_actual;
    }

}
