package volandoAlto.dominio;

import volandoAlto.persistencia.Serializacion;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import volandoAlto.interfaz.VentanaTripulacion;

public class Principal {

    private static VolandoAlto abrirSistema() {
        VolandoAlto ret;
        try {
            ret = Serializacion.deserializar();
        } catch (IOException | ClassNotFoundException e) {
            ret = new VolandoAlto();
        }
        return ret;
    }

    public static void main(String[] args) {
        try {
            final VolandoAlto volandoAlto = abrirSistema();
            volandoAlto.cargarIdiomas("./Idiomas.txt");
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
            VentanaTripulacion vT = new VentanaTripulacion(volandoAlto);
            vT.setVisible(true);
            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    try {
                        Serializacion.serializar(volandoAlto);
                    } catch (IOException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException |
                InstantiationException | IllegalAccessException e) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
