/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volandoAlto.dominio;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author alumnoFI
 */
public class Vuelo implements Serializable {

    private String codigoDeVuelo;
    private String capitan;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private Calendar horaSalida;
    private Calendar horaLlegada;

    /**
     * @return the codigoDeVuelo
     */
    public String getCodigoDeVuelo() {
        return codigoDeVuelo;
    }

    /**
     * @param codigoDeVuelo the codigoDeVuelo to set
     */
    public void setCodigoDeVuelo(String codigoDeVuelo) {
        this.codigoDeVuelo = codigoDeVuelo;
    }

    /**
     * @return the capitan
     */
    public String getCapitan() {
        return capitan;
    }

    /**
     * @param capitan the capitan to set
     */
    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }

    /**
     * @return the ciudadOrigen
     */
    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    /**
     * @param ciudadOrigen the ciudadOrigen to set
     */
    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    /**
     * @return the ciudadDestino
     */
    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    /**
     * @param ciudadDestino the ciudadDestino to set
     */
    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    /**
     * @return the horaSalida
     */
    public Calendar getHoraSalida() {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(Calendar horaSalida) {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the horaLlegada
     */
    public Calendar getHoraLlegada() {
        return horaLlegada;
    }

    /**
     * @param horaLlegada the horaLlegada to set
     */
    public void setHoraLlegada(Calendar horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

}
