package volandoAlto.dominio;

import java.io.Serializable;
import java.time.ZoneOffset;
import java.util.Objects;

public class Ciudad implements Serializable {

    private String nombre;
    private ZoneOffset zonaHoraria;

    public Ciudad(String unNombre, ZoneOffset unaZonaHoraria) {
        nombre = unNombre;
        zonaHoraria = unaZonaHoraria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ZoneOffset getZonaHoraria() {
        return zonaHoraria;
    }

    public void setZonaHoraria(ZoneOffset zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    @Override
    public String toString() {
        return this.nombre;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + Objects.hashCode(this.zonaHoraria);
        return hash;
    }
}
