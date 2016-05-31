/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volandoAlto.dominio;

import java.util.ArrayList;

/**
 *
 * @author alumnoFI
 */
public class AccesoADatos {

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

    public AccesoADatos() {
        this.ciudades = new ArrayList<>();
    }
}
