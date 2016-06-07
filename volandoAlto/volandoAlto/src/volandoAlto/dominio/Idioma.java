package volandoAlto.dominio;

import java.awt.Font;

public class Idioma {

    private final String nombre;
    private final String[] palabras;
    private final Font fuenteIdioma;

    public Idioma(String unNombre, String[] unasPalabras, String nombreFuente) {
        nombre = unNombre;
        palabras = unasPalabras;
        fuenteIdioma = new Font(nombreFuente, Font.PLAIN, 12);
    }

    public String[] getPalabras() {
        return palabras;
    }

    public Font getFuente() {
        return fuenteIdioma;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
}
