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
    public void testEquals() {
        String unNombre = "Montevideo";
        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudad = new Ciudad(unNombre, unaZonaHoraria);

        assertEquals("Montevideo", ciudad.toString());
    }
}
