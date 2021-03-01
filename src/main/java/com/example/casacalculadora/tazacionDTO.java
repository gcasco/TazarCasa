package com.example.casacalculadora;

public class tazacionDTO {
    private Double valor;
    private Double metrosCuadrados;
    private HabitacionDTO habitacionMasGrande;
    private HabitacionDTO[] habitaciones;

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setHabitacionMasGrande(HabitacionDTO habitacionMasGrande) {
        this.habitacionMasGrande = habitacionMasGrande;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {

        this.metrosCuadrados = metrosCuadrados;
    }


    public Double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public HabitacionDTO getHabitacionMasGrande() {
        return habitacionMasGrande;
    }

    public void setHabitaciones(HabitacionDTO[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public HabitacionDTO[] getHabitaciones() {
        return habitaciones;
    }
}
