package volandoAlto.dominio;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import volandoAlto.persistencia.ArchivoLectura;

public class VolandoAlto implements Serializable {

    private Idioma idiomaActual;
    private final ArrayList<Ciudad> ciudades;
    private Vuelo vueloActual;
    private transient ArrayList<Idioma> idiomasRegistrados;
    private final ArrayList<String> motivosAzafata;

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public Vuelo getVueloActual() {
        return vueloActual;
    }

    public void setVueloActual(Vuelo vueloActual) {
        this.vueloActual = vueloActual;
    }

    public VolandoAlto() {
        this.ciudades = new ArrayList<>();
        this.idiomasRegistrados = new ArrayList<>();
        this.motivosAzafata = new ArrayList<>();
    }

    public void EliminarCiudad(Ciudad ciudadSeleccionada) {
        this.ciudades.remove(ciudadSeleccionada);
    }

    public void RegistrarCiudad(String nombre, String gmtZonaHoraria) throws IllegalStateException {
        String timeZoneId = "Etc/" + gmtZonaHoraria;
        TimeZone zonaHoraria = TimeZone.getTimeZone(timeZoneId);
        Ciudad ciudadARegistrar = new Ciudad(nombre, zonaHoraria);
        if (ciudadRegistrada(ciudadARegistrar)) {
            throw new IllegalStateException("Ciudad ya registrada");
        }
        this.ciudades.add(ciudadARegistrar);
    }

    private boolean ciudadRegistrada(Ciudad ciudad) {
        return this.ciudades.contains(ciudad);
    }

    public Idioma getIdiomaActual() {
        return idiomaActual;
    }

    public void setIdiomaActual(Idioma idiomaActual) {
        this.idiomaActual = idiomaActual;
    }

    public void cargarIdiomas() {
        ArchivoLectura archivo;
        try {
            archivo = new ArchivoLectura("./Idiomas.txt");
            while (archivo.hayMasLineas()) {
                String linea = archivo.linea();
                String[] datos = linea.split("#");
                String[] palabras = quitarPrimerYUltimoElemento(datos);
                String nombreIdioma = datos[0];
                String fontIdioma = datos[datos.length - 1];
                Idioma idiomaAAgregar = new Idioma(nombreIdioma, palabras, fontIdioma);
                this.getIdiomasRegistrados().add(idiomaAAgregar);
            }
        } catch (IOException ex) {
            Logger.getLogger(VolandoAlto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String[] quitarPrimerYUltimoElemento(String[] datos) {
        int largo = datos.length;
        String[] retorno = new String[largo - 2];
        for (int i = 1; i < largo - 2; i++) {
            retorno[i - 1] = datos[i];
        }
        return retorno;
    }

    public ArrayList<String> getMotivosAzafata() {
        return motivosAzafata;
    }

    public void RegistrarMotivo(String motivo) {
        if (motivoRegistrado(motivo)) {
            throw new IllegalStateException("Motivo ya registrado");
        }
        this.motivosAzafata.add(motivo);
    }

    private boolean motivoRegistrado(String motivo) {
        return this.motivosAzafata.contains(motivo);
    }

    public void ElminarMotivo(String motivo) {
        this.motivosAzafata.remove(motivo);
    }

    public void setIdiomasRegistrados(ArrayList<Idioma> unosIdiomas) {
        this.idiomasRegistrados = unosIdiomas;
    }

    public ArrayList<Idioma> getIdiomasRegistrados() {
        return idiomasRegistrados;
    }
}
