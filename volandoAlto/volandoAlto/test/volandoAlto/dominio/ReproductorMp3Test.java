package volandoAlto.dominio;

import volandoAlto.interfaz.VentanaUsuario;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReproductorMp3Test {

    @Test
    public void testConstructor() {
        Idioma idioma = new Idioma();
        VentanaUsuario cliente = new VentanaUsuario(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        assertTrue(reproductor.isDetenido());
        assertEquals(reproductor.getCancionActual(), 0);
    }

    @Test
    public void testListaClasica() {
        Idioma idioma = new Idioma();
        VentanaUsuario cliente = new VentanaUsuario(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("clasica");
        assertEquals(reproductor.getListaReproduccion().size(), 3);
        assertEquals(reproductor.getFilePath(), "//media//music//clasica//Handel Royal Fireworks.mp3");
    }

    @Test
    public void testListaRock() {
        Idioma idioma = new Idioma();
        VentanaUsuario cliente = new VentanaUsuario(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("rock");
        assertEquals(reproductor.getListaReproduccion().size(), 2);
        assertEquals(reproductor.getFilePath(), "//media//music//rock//Jailhouse Rock.mp3");
    }

    @Test
    public void testListaPop() {
        Idioma idioma = new Idioma();
        VentanaUsuario cliente = new VentanaUsuario(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("pop");
        assertEquals(reproductor.getListaReproduccion().size(), 2);
        assertEquals(reproductor.getFilePath(), "//media//music//pop//Dancing in the Street.mp3");
    }

    @Test
    public void testListaElectronica() {
        Idioma idioma = new Idioma();
        VentanaUsuario cliente = new VentanaUsuario(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("electronica");
        assertEquals(reproductor.getListaReproduccion().size(), 3);
        assertEquals(reproductor.getFilePath(), "//media//music//electronica//Ich Bin Meine Maschine.mp3");
    }

    @Test
    public void testListaAlternativa() {
        Idioma idioma = new Idioma();
        VentanaUsuario cliente = new VentanaUsuario(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("alternativa");
        assertEquals(reproductor.getListaReproduccion().size(), 3);
        assertEquals(reproductor.getFilePath(), "//media//music//alternativa//Snow.mp3");
    }

    @Test
    public void testListaReggae() {
        Idioma idioma = new Idioma();
        VentanaUsuario cliente = new VentanaUsuario(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("reggae");
        assertEquals(reproductor.getListaReproduccion().size(), 3);
        assertEquals(reproductor.getFilePath(), "//media//music//reggae//Funky Kingston.mp3");
    }

    @Test
    public void testReproducir() {
        Idioma idioma = new Idioma();
        VentanaUsuario cliente = new VentanaUsuario(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("alternativa");
        reproductor.play();
        try {
            sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReproductorMp3.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertTrue(!reproductor.isDetenido());
    }

    @Test
    public void testDetener() {
        Idioma idioma = new Idioma();
        VentanaUsuario cliente = new VentanaUsuario(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("alternativa");
        reproductor.play();
        try {
            sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReproductorMp3.class.getName()).log(Level.SEVERE, null, ex);
        }
        reproductor.parar();
        assertTrue(reproductor.isDetenido());
    }

    @Test
    public void testSiguienteCancion() {
        Idioma idioma = new Idioma();
        VentanaUsuario cliente = new VentanaUsuario(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("alternativa");
        reproductor.play();
        try {
            sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReproductorMp3.class.getName()).log(Level.SEVERE, null, ex);
        }
        reproductor.siguienteCancion();
        assertEquals(reproductor.getCancionActual(), 1);
    }

    @Test
    public void testListaFinalizada() {
        Idioma idioma = new Idioma();
        VentanaUsuario cliente = new VentanaUsuario(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("alternativa");
        reproductor.play();
        try {
            sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReproductorMp3.class.getName()).log(Level.SEVERE, null, ex);
        }
        reproductor.siguienteCancion();
        reproductor.siguienteCancion();
        reproductor.siguienteCancion();
        assertTrue(reproductor.isDetenido());
    }
}
