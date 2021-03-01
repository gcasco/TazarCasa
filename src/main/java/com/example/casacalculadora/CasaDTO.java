package com.example.casacalculadora;

public class CasaDTO {

    private String nombre;
    private String direccion;
    private HabitacionDTO[] habitaciones;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHabitaciones(HabitacionDTO[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public HabitacionDTO[] getHabitaciones() {
        return habitaciones;
    }

    public String getDireccion() {
        return direccion;
    }
}

