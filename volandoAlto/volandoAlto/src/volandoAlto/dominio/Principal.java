package volandoAlto.dominio;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import volandoAlto.interfaz.VentanaTripulacion;

public class Principal {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
            VentanaTripulacion vT = new VentanaTripulacion();
            vT.setVisible(true);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            Logger.getLogger(ReproductorMp3.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
