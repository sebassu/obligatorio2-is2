package volandoAlto.dominio;

import java.awt.Font;
import static org.junit.Assert.*;
import org.junit.Test;

public class IdiomaTest {

    @Test
    public void testConstructor1() {
        String unNombre = "Zulu";
        String[] unasPalabras = new String[]{"Welcome.", "Continue",
            "Flight Information", "Captain", "Flight", "Departure",
            "Departure", "Estimated arrival time", "Destination",
            "Time information", "and weather on arrival",
            "Welcome aboard.", "Flight attendant", "Delayed", "Select genre",
            "classical", "Pop", "Rock", "Electronics", "Reggae", "Alternative",
            "Stopped", "Playing"};
        String nombreFuente = "Arial";
        Font fuenteEsperada = new Font(nombreFuente, Font.PLAIN, 12);

        Idioma idioma = new Idioma(unNombre, unasPalabras, nombreFuente);

        assertEquals(unNombre, idioma.getNombre());
        assertEquals(fuenteEsperada, idioma.getFuente());
        assertArrayEquals(unasPalabras, idioma.getPalabras());
    }

    @Test
    public void testConstructor2() {
        String unNombre = "2$%$%7652;:;:;";
        String[] unasPalabras = new String[0];
        String nombreFuente = "37;:;234234";
        Font fuenteEsperada = new Font(nombreFuente, Font.PLAIN, 12);

        Idioma idioma = new Idioma(unNombre, unasPalabras, nombreFuente);

        assertEquals(unNombre, idioma.getNombre());
        assertEquals(fuenteEsperada, idioma.getFuente());
        assertArrayEquals(unasPalabras, idioma.getPalabras());
    }
}
