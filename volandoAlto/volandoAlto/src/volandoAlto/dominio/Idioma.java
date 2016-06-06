package volandoAlto.dominio;

import java.awt.Font;

public class Idioma {

    private final String[] palabras;
    private final Font fuenteIdioma;

    public Idioma(String[] unasPalabras, String nombreFuente) {
        palabras = unasPalabras;
        fuenteIdioma = new Font(nombreFuente, Font.PLAIN, 12);
    }

    public String[] getPalabras() {
        return palabras;
    }

    public Font getFuente() {
        return fuenteIdioma;
    }
}
