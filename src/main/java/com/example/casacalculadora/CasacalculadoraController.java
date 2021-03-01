package com.example.casacalculadora;

import org.springframework.web.bind.annotation.*;

@RestController
public class CasacalculadoraController {

    private static final int USDxMetro=800;

    @PostMapping(path = "/calculate")
    @ResponseBody
    public tazacionDTO tazarCasa(@RequestBody CasaDTO casaDTO){
        tazacionDTO response = new tazacionDTO();
        response.setHabitaciones(rellenarDTOHabitadion(casaDTO.getHabitaciones()));
        response.setHabitacionMasGrande(getHabitacionMasGrande(response.getHabitaciones()));
        response.setMetrosCuadrados(getMetrosCuadrados(response.getHabitaciones()));
        response.setValor(response.getMetrosCuadrados()*USDxMetro);

        return response;
    }

    public HabitacionDTO[] rellenarDTOHabitadion(HabitacionDTO[] habitaciones){
        HabitacionDTO[] habitacionDTOS = new HabitacionDTO[habitaciones.length];
        for(int i=0;i<habitaciones.length;i++){
            habitacionDTOS[i]=habitaciones[i];
            habitacionDTOS[i].setMetrosCuadrados(
                    habitacionDTOS[i].getAncho()*habitacionDTOS[i].getLargo()
            );
        }

        return habitacionDTOS;
    }

    public Double getMetrosCuadrados(HabitacionDTO[] habitaciones) {
        double metros=0;
        HabitacionDTO habGrande;

        for (HabitacionDTO h:habitaciones) {
            metros=metros+h.getMetrosCuadrados();
        }
        return metros;
    }


    public HabitacionDTO getHabitacionMasGrande(HabitacionDTO[] habitaciones) {
        HabitacionDTO habGrande= new HabitacionDTO();

        if(habitaciones.length>0){
            habGrande=habitaciones[0];
            for (HabitacionDTO h:habitaciones) {
                if(habGrande.getMetrosCuadrados()<h.getMetrosCuadrados()){
                    habGrande=h;
                }
            }
        }
        return habGrande;
    }

}
