package volandoAlto.dominio;

import java.awt.Font;
import java.time.ZoneOffset;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CiudadTest {

    @Test
    public void testConstructor1() {
        String unNombre = "Montevideo";
        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad = new Ciudad(unNombre, unaZonaHoraria);

        assertEquals(unNombre, ciudad.getNombre());
        assertEquals(unaZonaHoraria, ciudad.getZonaHoraria());
    }

    @Test
    public void testConstructor2() {
        String unNombre = "654-.asda@";
        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad = new Ciudad(unNombre, unaZonaHoraria);

        assertEquals(unNombre, ciudad.getNombre());
        assertEquals(unaZonaHoraria, ciudad.getZonaHoraria());
    }

    @Test
    public void testConstructor3() {
        String unNombreNull = null;
        ZoneOffset zonaHorariaNull = null;
        Ciudad ciudad = new Ciudad(unNombreNull, zonaHorariaNull);

        assertEquals(unNombreNull, ciudad.getNombre());
        assertEquals(zonaHorariaNull, ciudad.getZonaHoraria());
    }

    @Test
    public void testToString() {
        String unNombre = "Montevideo";
        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad = new Ciudad(unNombre, unaZonaHoraria);

        assertEquals("Montevideo", ciudad.toString());
    }

    @Test
    public void testEquals1() {
        String unNombre = "Montevideo";
        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad = new Ciudad(unNombre, unaZonaHoraria);

        Ciudad ciudadNull = null;

        assertNotEquals(ciudad, ciudadNull);
    }

    @Test
    public void testEquals2() {
        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad1 = new Ciudad("Montevideo", unaZonaHoraria);

        ZoneOffset otraZonaHoraria = ZoneOffset.of("-5");
        Ciudad ciudad2 = new Ciudad("Montevideo", otraZonaHoraria);

        assertEquals(ciudad1, ciudad2);
    }

    @Test
    public void testEquals3() {
        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad1 = new Ciudad("Montevideo", unaZonaHoraria);

        ZoneOffset otraZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad2 = new Ciudad("Montevideo", otraZonaHoraria);

        assertEquals(ciudad1, ciudad2);
    }

    @Test
    public void testEquals4() {
        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad1 = new Ciudad("Montevideo", unaZonaHoraria);

        ZoneOffset otraZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad2 = new Ciudad("Chile", otraZonaHoraria);

        assertNotEquals(ciudad1, ciudad2);
    }

    @Test
    public void testEquals5() {
        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad = new Ciudad("Montevideo", unaZonaHoraria);

        Object object = new Object();

        assertNotEquals(ciudad, object);
    }

    @Test
    public void testEquals6() {
        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad = new Ciudad("Montevideo", unaZonaHoraria);

        assertEquals(ciudad, ciudad);
    }

    
    @Test
    public void testSetNombre() {
        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad = new Ciudad("Montevideo", unaZonaHoraria);

        ciudad.setNombre("Santiago de Chile");
        
        assertEquals("Santiago de Chile", ciudad.getNombre());
    }
    
     @Test
    public void testSetZonaHoraria() {
        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad = new Ciudad("Montevideo", unaZonaHoraria);

        ZoneOffset nuevaZonaHoraria = ZoneOffset.of("-5");
        ciudad.setZonaHoraria(nuevaZonaHoraria);
        
        assertEquals(nuevaZonaHoraria, ciudad.getZonaHoraria());
    }
}
