/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volandoAlto.dominio;

import java.util.ArrayList;
import java.util.TimeZone;

/**
 *
 * @author alumnoFI
 */
public class VolandoAlto {

    private final ArrayList<Ciudad> ciudades;
    private Vuelo vueloActual;

    /**
     * @return the ciudades
     */
    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    /**
     * @return the vueloActual
     */
    public Vuelo getVueloActual() {
        return vueloActual;
    }

    /**
     * @param vueloActual the vueloActual to set
     */
    public void setVueloActual(Vuelo vueloActual) {
        this.vueloActual = vueloActual;
    }

    public VolandoAlto() {
        this.ciudades = new ArrayList<>();
    }

    public void EliminarCiudad(Ciudad ciudadSeleccionada) {
        this.ciudades.remove(ciudadSeleccionada);
    }

    public void RegistrarCiudad(String nombre, String gmtZonaHoraria) {
        
        String timeZoneId = "Etc/" + gmtZonaHoraria;
        TimeZone zonaHoraria = TimeZone.getTimeZone(timeZoneId);
        
        Ciudad ciudadARegistrar = new Ciudad(nombre, zonaHoraria);
        
        this.ciudades.add(ciudadARegistrar);
    }
}
