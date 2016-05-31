/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package volandoAlto.dominio;

import volandoAlto.dominio.ReproductorMp3;
import volandoAlto.dominio.Idioma;
import volandoAlto.interfaz.Cliente;
import static java.lang.Thread.sleep;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Nabo
 */
public class ReproductorMp3Test {
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    public ReproductorMp3Test() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getFilePath method, of class ReproductorMp3.
     */
    @Test
    public void testConstructor() {
        Idioma idioma = new Idioma();
        Cliente cliente = new Cliente(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        assertTrue(reproductor.isDetenido());
        assertEquals(reproductor.getCancionActual(),0);
    }
    
    /**
     *
     */
    @Test
    public void testListaClasica() {
        Idioma idioma = new Idioma();
        Cliente cliente = new Cliente(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("clasica");
        assertEquals(reproductor.getListaReproduccion().size(),3);
        assertEquals(reproductor.getFilePath(), "//media//music//clasica//Handel Royal Fireworks.mp3");
    }
    
    /**
     *
     */
    @Test
    public void testListaRock() {
        Idioma idioma = new Idioma();
        Cliente cliente = new Cliente(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("rock");
        assertEquals(reproductor.getListaReproduccion().size(),2);
        assertEquals(reproductor.getFilePath(), "//media//music//rock//Jailhouse Rock.mp3");
    }
    
    /**
     *
     */
    @Test
    public void testListaPop() {
        Idioma idioma = new Idioma();
        Cliente cliente = new Cliente(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("pop");
        assertEquals(reproductor.getListaReproduccion().size(),2);
        assertEquals(reproductor.getFilePath(), "//media//music//pop//Dancing in the Street.mp3");
    }
    
    /**
     *
     */
    @Test
    public void testListaElectronica() {
        Idioma idioma = new Idioma();
        Cliente cliente = new Cliente(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("electronica");
        assertEquals(reproductor.getListaReproduccion().size(),3);
        assertEquals(reproductor.getFilePath(), "//media//music//electronica//Ich Bin Meine Maschine.mp3");
    }
    
    /**
     *
     */
    @Test
    public void testListaAlternativa() {
        Idioma idioma = new Idioma();
        Cliente cliente = new Cliente(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("alternativa");
        assertEquals(reproductor.getListaReproduccion().size(),3);
        assertEquals(reproductor.getFilePath(), "//media//music//alternativa//Snow.mp3");
    }
    
    /**
     *
     */
    @Test
    public void testListaReggae() {
        Idioma idioma = new Idioma();
        Cliente cliente = new Cliente(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("reggae");
        assertEquals(reproductor.getListaReproduccion().size(),3);
        assertEquals(reproductor.getFilePath(), "//media//music//reggae//Funky Kingston.mp3");
    }
    
    /**
     *
     */
    @Test
    public void testReproducir() {
        Idioma idioma = new Idioma();
        Cliente cliente = new Cliente(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("alternativa");
        reproductor.play();
        try {
            sleep(100);
        } catch (InterruptedException ex) {}
        assertTrue(!reproductor.isDetenido());
    }
    
    /**
     *
     */
    @Test
    public void testDetener() {
        Idioma idioma = new Idioma();
        Cliente cliente = new Cliente(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("alternativa");
        reproductor.play();
        try {
            sleep(100);
        } catch (InterruptedException ex) {}
        reproductor.parar();
        assertTrue(reproductor.isDetenido());
    }
    
    /**
     *
     */
    @Test
    public void testSiguienteCancion() {
        Idioma idioma = new Idioma();
        Cliente cliente = new Cliente(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("alternativa");
        reproductor.play();
        try {
            sleep(100);
        } catch (InterruptedException ex) {}
        reproductor.siguienteCancion();
        assertEquals(reproductor.getCancionActual(),1);
    }
    
    /**
     *
     */
    @Test
    public void testListaFinalizada() {
        Idioma idioma = new Idioma();
        Cliente cliente = new Cliente(idioma);
        ReproductorMp3 reproductor = new ReproductorMp3(cliente);
        reproductor.setListaReproduccion("alternativa");
        reproductor.play();
        try {
            sleep(100);
        } catch (InterruptedException ex) {}
        reproductor.siguienteCancion();
        reproductor.siguienteCancion();
        reproductor.siguienteCancion();
        assertTrue(reproductor.isDetenido());
    }
}
