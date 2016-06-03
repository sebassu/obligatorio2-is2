package volandoAlto.dominio;

import java.util.Objects;
import java.util.TimeZone;

/**
 *
 * @author pabloMorales
 */
public class Ciudad {

    private String nombre;
    private TimeZone zonaHoraria;

    public Ciudad(String unNombre, TimeZone unaZonaHoraria) {
        nombre = unNombre;
        zonaHoraria = unaZonaHoraria;
    }

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

    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ciudad other = (Ciudad) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
}
