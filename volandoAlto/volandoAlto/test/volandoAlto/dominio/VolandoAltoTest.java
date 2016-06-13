package volandoAlto.dominio;

import java.awt.Font;
import java.time.DateTimeException;
import java.time.ZoneOffset;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class VolandoAltoTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testConstructorInicializaListas() {
        VolandoAlto volandoAlto = new VolandoAlto();

        assertNotEquals(null, volandoAlto.getIdiomasRegistrados());
        assertNotEquals(null, volandoAlto.getCiudades());
        assertNotEquals(null, volandoAlto.getMotivosAzafata());
    }

    @Test
    public void testRegistrarCiudad1() {
        VolandoAlto volandoAlto = new VolandoAlto();

        volandoAlto.RegistrarCiudad("Montevideo", "-3");

        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");
        Ciudad ciudadRegistrada = new Ciudad("Montevideo", unaZonaHoraria);
        assertTrue(volandoAlto.getCiudades().contains(ciudadRegistrada));
    }

    @Test
    public void testRegistrarCiudadTiraExcepcion() {
        VolandoAlto volandoAlto = new VolandoAlto();
      
        thrown.expect(DateTimeException.class);
        volandoAlto.RegistrarCiudad("Montevideo", "a/sdas-3");        
    }

}
