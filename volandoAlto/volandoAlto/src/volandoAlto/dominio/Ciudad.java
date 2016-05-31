package volandoAlto.dominio;

import java.util.TimeZone;

/**
 *
 * @author pabloMorales
 */
public class CiudadDestino {

    private String nombre;
    private TimeZone zonaHoraria;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the zonaHoraria
     */
    public TimeZone getZonaHoraria() {
        return zonaHoraria;
    }

    /**
     * @param zonaHoraria the zonaHoraria to set
     */
    public void setZonaHoraria(TimeZone zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }
}
