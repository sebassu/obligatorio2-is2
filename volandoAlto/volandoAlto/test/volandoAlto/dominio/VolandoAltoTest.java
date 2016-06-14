package volandoAlto.dominio;

import java.awt.Font;
import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.util.Calendar;
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
    public void testRegistrarCiudadTiraIllegalArgumentExcepcion() {
        VolandoAlto volandoAlto = new VolandoAlto();

        thrown.expect(IllegalArgumentException.class);
        volandoAlto.RegistrarCiudad("Montevideo", "a/sdas-3");
    }

    @Test
    public void testRegistrarCiudadRepetidaTiraIllegalStateArgument() {
        VolandoAlto volandoAlto = new VolandoAlto();

        volandoAlto.RegistrarCiudad("Montevideo", "-5");
        thrown.expect(IllegalStateException.class);
        volandoAlto.RegistrarCiudad("Montevideo", "-3");
    }

    @Test
    public void testEliminarCiudadCuandoHaySoloUnaRegistradaTiraExcepcion() {
        VolandoAlto volandoAlto = new VolandoAlto();

        volandoAlto.RegistrarCiudad("Montevideo", "-3");
        Ciudad ciudadRegistradaAEliminar = volandoAlto.getCiudades().get(0);

        thrown.expect(IllegalStateException.class);

        volandoAlto.EliminarCiudad(ciudadRegistradaAEliminar);
    }

    @Test
    public void testEliminarCiudadCuandoHaySoloDosRegistradasTiraExcepcion() {
        VolandoAlto volandoAlto = new VolandoAlto();

        volandoAlto.RegistrarCiudad("Montevideo", "-3");
        volandoAlto.RegistrarCiudad("Buenos Aires", "-3");
        Ciudad ciudadRegistradaAEliminar = volandoAlto.getCiudades().get(0);

        thrown.expect(IllegalStateException.class);

        volandoAlto.EliminarCiudad(ciudadRegistradaAEliminar);
    }

    @Test
    public void testEliminarCiudadCuandoHayVueloQueUsaLaCiudadComoOrigenTiraExcepcion() {
        VolandoAlto volandoAlto = new VolandoAlto();

        Ciudad ciudadOrigen = new Ciudad("Montevideo", ZoneOffset.UTC);
        Ciudad ciudadDestino = new Ciudad("Buenos Aires", ZoneOffset.UTC);

        volandoAlto.RegistrarCiudad(ciudadOrigen.getNombre(), ciudadOrigen.getZonaHoraria().getId());
        volandoAlto.RegistrarCiudad(ciudadDestino.getNombre(), ciudadDestino.getZonaHoraria().getId());

        Calendar horarioSalida = Calendar.getInstance();
        Calendar horarioActualMasUnaHora = Calendar.getInstance();
        horarioActualMasUnaHora.add(Calendar.HOUR, 1);
        Calendar horarioLlegada = horarioActualMasUnaHora;

        Vuelo vuelo = new Vuelo("codigo", "capitan", ciudadOrigen,
                ciudadDestino, horarioSalida, horarioLlegada, false);

        volandoAlto.setVueloActual(vuelo);

        Ciudad ciudadRegistradaAEliminar = volandoAlto.getCiudades().get(0);

        thrown.expect(IllegalStateException.class);

        volandoAlto.EliminarCiudad(ciudadRegistradaAEliminar);
    }

    @Test
    public void testEliminarCiudadCuandoHayVueloQueUsaLaCiudadComoDestinoTiraExcepcion() {
        VolandoAlto volandoAlto = new VolandoAlto();

        Ciudad ciudadOrigen = new Ciudad("Montevideo", ZoneOffset.UTC);
        Ciudad ciudadDestino = new Ciudad("Buenos Aires", ZoneOffset.UTC);

        volandoAlto.RegistrarCiudad(ciudadOrigen.getNombre(), ciudadOrigen.getZonaHoraria().getId());
        volandoAlto.RegistrarCiudad(ciudadDestino.getNombre(), ciudadDestino.getZonaHoraria().getId());

        Calendar horarioSalida = Calendar.getInstance();
        Calendar horarioActualMasUnaHora = Calendar.getInstance();
        horarioActualMasUnaHora.add(Calendar.HOUR, 1);
        Calendar horarioLlegada = horarioActualMasUnaHora;

        Vuelo vuelo = new Vuelo("codigo", "capitan", ciudadOrigen,
                ciudadDestino, horarioSalida, horarioLlegada, false);

        volandoAlto.setVueloActual(vuelo);

        Ciudad ciudadRegistradaAEliminar = volandoAlto.getCiudades().get(1);

        thrown.expect(IllegalStateException.class);

        volandoAlto.EliminarCiudad(ciudadRegistradaAEliminar);
    }

    @Test
    public void testRegistrarMotivo() {
        VolandoAlto volandoAlto = new VolandoAlto();
        String motivo = "motivo";

        volandoAlto.RegistrarMotivo(motivo);

        assertTrue(volandoAlto.getMotivosAzafata().contains(motivo));
    }

    @Test
    public void testRegistrarMotivoVacio() {
        VolandoAlto volandoAlto = new VolandoAlto();
        String motivo = "";

        volandoAlto.RegistrarMotivo(motivo);

        assertTrue(volandoAlto.getMotivosAzafata().contains(motivo));
    }

    @Test
    public void testRegistrarMotivoVacioRepetidoTiraExcepcion() {
        VolandoAlto volandoAlto = new VolandoAlto();
        String motivo = "motivo";

        volandoAlto.RegistrarMotivo(motivo);

        thrown.expect(IllegalStateException.class);

        volandoAlto.RegistrarMotivo(motivo);
    }

    @Test
    public void testEliminarMotivo() {
        VolandoAlto volandoAlto = new VolandoAlto();
        String motivo1 = "motivo1";
        String motivo2 = "motivo2";
        volandoAlto.RegistrarMotivo(motivo1);
        volandoAlto.RegistrarMotivo(motivo2);

        volandoAlto.ElminarMotivo(motivo1);

        assertFalse(volandoAlto.getMotivosAzafata().contains(motivo1));
    }

    @Test
    public void testEliminarMotivoCuandoSoloHayUnMotivoRegistradoTiraExcepcion() {
        VolandoAlto volandoAlto = new VolandoAlto();
        String motivo = "motivo";

        volandoAlto.RegistrarMotivo(motivo);

        thrown.expect(IllegalStateException.class);

        volandoAlto.ElminarMotivo(motivo);
    }

    @Test
    public void testExistenIdiomasRegistrados() {
        VolandoAlto volandoAlto = new VolandoAlto();

        Idioma idioma = new Idioma("nombre", new String[21], "nombreFuente");
        volandoAlto.getIdiomasRegistrados().add(idioma);
        
        assertTrue(volandoAlto.ExistenIdiomasRegistrados());
    }
}
