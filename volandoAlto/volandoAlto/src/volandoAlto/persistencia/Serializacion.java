package volandoAlto.persistencia;

import volandoAlto.dominio.VolandoAlto;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Clase auxiliar para solucionar la persistencia del Sistema.
public class Serializacion {

    /**
     * Método ejecutado al finalizar el programa, que guarda en un archivo al
     * objeto fachada.
     *
     * @param s El objeto de la clase VolandoAlto a serializar.
     * @throws java.io.IOException
     */
    public static void serializar(VolandoAlto s) throws IOException {
        try (ObjectOutputStream aux = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("DatosSistema.dat")))) {
            aux.writeObject(s);
            aux.flush();
            aux.close();
        }
    }

    /**
     * Método ejecutado al inicio del programa, que carga desde un archivo al
     * objeto fachada previamente guardado.
     *
     * @return Retorna el sistema generado en base al archivo guardado.
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static VolandoAlto deserializar() throws IOException, ClassNotFoundException {
        VolandoAlto retorno;
        try (ObjectInputStream aux = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("DatosSistema.dat")))) {
            retorno = (VolandoAlto) aux.readObject();
            aux.close();
        }
        return retorno;
    }
}
