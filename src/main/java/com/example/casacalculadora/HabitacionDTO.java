package com.example.casacalculadora;

public class HabitacionDTO {
    private String nombre;
    private Double ancho;
    private Double largo;
    private Double metrosCuadrados;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }
}
