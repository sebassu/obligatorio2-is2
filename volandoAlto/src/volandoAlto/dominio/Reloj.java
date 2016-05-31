package volandoAlto.dominio;

import volandoAlto.interfaz.Operario;
import java.awt.Font;
import java.util.Calendar;

class Reloj implements Runnable {

    Thread runner;
    Font clockFont;
    Operario ventanaOperario = new Operario();

    Reloj() {
        start();
    }

    public Calendar timeNow() {
        Calendar now = Calendar.getInstance();
        return now;
    }

    public void start() {
        if (runner == null) {
            runner = new Thread(this);
        }
        runner.start();
    }

    @Override
    public void run() {
        ventanaOperario.setVisible(true);
        while (runner == Thread.currentThread()) {
            try {
                Thread.sleep(1000);
                ventanaOperario.setHora(timeNow());

            } catch (InterruptedException e) {
            }

        }
    }
}
