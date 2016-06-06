package volandoAlto.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TimeZone;

public class VolandoAlto implements Serializable {

    private final ArrayList<Ciudad> ciudades;
    private Vuelo vueloActual;
    private HashMap<String, Idioma> listadoIdiomas;

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public Vuelo getVueloActual() {
        return vueloActual;
    }

    public void setVueloActual(Vuelo vueloActual) {
        this.vueloActual = vueloActual;
    }

    public VolandoAlto() {
        this.ciudades = new ArrayList<>();
    }

    public void EliminarCiudad(Ciudad ciudadSeleccionada) {
        this.ciudades.remove(ciudadSeleccionada);
    }

    public void RegistrarCiudad(String nombre, String gmtZonaHoraria) throws IllegalStateException {
        String timeZoneId = "Etc/" + gmtZonaHoraria;
        TimeZone zonaHoraria = TimeZone.getTimeZone(timeZoneId);
        Ciudad ciudadARegistrar = new Ciudad(nombre, zonaHoraria);
        if (ciudadRegistrada(ciudadARegistrar)) {
            throw new IllegalStateException("Ciudad ya registrada");
        }
        this.ciudades.add(ciudadARegistrar);
    }

    private boolean ciudadRegistrada(Ciudad ciudad) {
        return this.ciudades.contains(ciudad);
    }
}
