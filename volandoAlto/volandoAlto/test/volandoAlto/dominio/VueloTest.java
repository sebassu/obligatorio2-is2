package volandoAlto.dominio;

import java.awt.Font;
import java.time.ZoneOffset;
import java.util.Calendar;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class VueloTest {

    @Test
    public void testConstructor1() {
        String codigo = "codigo";
        String capitan = "capitan";

        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");

        Ciudad ciudadOrigen = new Ciudad("Montevideo", unaZonaHoraria);
        Ciudad ciudadDestino = new Ciudad("Pekin", unaZonaHoraria);

        Calendar horaSalida = Calendar.getInstance();
        Calendar horaLlegada = Calendar.getInstance();
        Calendar.getInstance().add(Calendar.HOUR, 8);

        Vuelo vuelo = new Vuelo(codigo, capitan, ciudadOrigen, ciudadDestino,
                horaSalida, horaLlegada, false);

        assertEquals(codigo, vuelo.getCodigoDeVuelo());
        assertEquals(capitan, vuelo.getCapitan());
        assertEquals(ciudadOrigen, vuelo.getCiudadOrigen());
        assertEquals(ciudadDestino, vuelo.getCiudadDestino());
        assertEquals(horaSalida, vuelo.getHoraSalida());
        assertEquals(horaLlegada, vuelo.getHoraLlegada());
    }

    @Test
    public void testConstructor2() {
        String codigo = "";
        String capitan = "";

        ZoneOffset unaZonaHoraria = ZoneOffset.of("-3");

        Ciudad ciudadOrigen = new Ciudad("Montevideo", null);
        Ciudad ciudadDestino = new Ciudad("Pekin", null);

        Calendar horaSalida = Calendar.getInstance();
        Calendar horaLlegada = Calendar.getInstance();
        Calendar.getInstance().add(Calendar.HOUR, 8);
        
        boolean demorado = false;

        Vuelo vuelo = new Vuelo(codigo, capitan, ciudadOrigen, ciudadDestino,
                horaSalida, horaLlegada, demorado);

        assertEquals(codigo, vuelo.getCodigoDeVuelo());
        assertEquals(capitan, vuelo.getCapitan());
        assertEquals(ciudadOrigen, vuelo.getCiudadOrigen());
        assertEquals(ciudadDestino, vuelo.getCiudadDestino());
        assertEquals(horaSalida, vuelo.getHoraSalida());
        assertEquals(horaLlegada, vuelo.getHoraLlegada());
        assertEquals(demorado, vuelo.isDemorado());
    }

    
}
