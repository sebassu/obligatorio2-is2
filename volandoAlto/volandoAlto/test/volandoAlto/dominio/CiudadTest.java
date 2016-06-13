package volandoAlto.dominio;

import java.awt.Font;
import java.time.ZoneOffset;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CiudadTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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

}
