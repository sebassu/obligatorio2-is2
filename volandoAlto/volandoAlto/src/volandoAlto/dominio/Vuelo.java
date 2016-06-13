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
    private boolean demorado;

    
    public Vuelo(String codigo, String capitan, Ciudad origen, 
            Ciudad destino, Calendar horaSalida, Calendar horaLlegada, boolean demorado){
    
        this.codigoDeVuelo = codigo;
        this.capitan = capitan;
        this.ciudadOrigen = origen;
        this.ciudadDestino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.demorado = demorado;
    }
    
    public String getCodigoDeVuelo() {
        return codigoDeVuelo;
    }

    
    public void setCodigoDeVuelo(String codigoDeVuelo) {
        this.codigoDeVuelo = codigoDeVuelo;
    }

    
    public String getCapitan() {
        return capitan;
    }

    
    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }

    
    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    
    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    
    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

   
    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    
    public Calendar getHoraSalida() {
        return horaSalida;
    }

    
    public void setHoraSalida(Calendar horaSalida) {
        this.horaSalida = horaSalida;
    }

    
    public Calendar getHoraLlegada() {
        return horaLlegada;
    }

    
    public void setHoraLlegada(Calendar horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

        public Boolean isDemorado() {
        return demorado;
    }

    public void setDemorado(Boolean demorado) {
        this.demorado = demorado;
    }

}
