package volandoAlto.dominio;

import volandoAlto.interfaz.Cliente;
import java.io.IOException;
import java.util.ArrayList;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

/**
 *
 * @author Br1
 */
public class ReproductorMp3 extends PlaybackListener implements Runnable {

    private String filePath;
    private AdvancedPlayer player;
    private Thread playerThread;
    private ArrayList<String> listaReproduccion;
    private int cancionActual = 0;
    private boolean detenido;
    private String[] nombreCanciones;
    private Cliente ventanaMusica;

    /**
     *
     * @param vMusica
     */
    public ReproductorMp3(Cliente vMusica) {
        this.setListaReproduccion("clasica");
        this.filePath = "//media//music//clasica//Handel Royal Fireworks.mp3";
        this.cancionActual = 0;
        this.detenido = true;
        this.ventanaMusica = vMusica;
    }

    /**
     *
     * @return
     */
    public AdvancedPlayer getPlayer() {
        return player;
    }

    /**
     *
     * @param player
     */
    public void setPlayer(AdvancedPlayer player) {
        this.player = player;
    }

    /**
     *
     * @return
     */
    public Thread getPlayerThread() {
        return playerThread;
    }

    /**
     *
     * @param playerThread
     */
    public void setPlayerThread(Thread playerThread) {
        this.playerThread = playerThread;
    }

    /**
     *
     * @return
     */
    public String[] getNombreCanciones() {
        return nombreCanciones;
    }

    /**
     *
     * @param nombreCanciones
     */
    public void setNombreCanciones(String[] nombreCanciones) {
        this.nombreCanciones = nombreCanciones;
    }

    /**
     *
     * @return
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     *
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getListaReproduccion() {
        return listaReproduccion;
    }

    /**
     *
     * @param genero
     */
    public void setListaReproduccion(String genero) {
        this.listaReproduccion = new ArrayList<String>();
        switch (genero) {
            case "clasica":
                this.nombreCanciones = new String[] {"Handel Royal Fireworks","Spring from Four Seasons","Largo from Four Seasons"};
                this.listaReproduccion.add("//media//music//clasica//Handel Royal Fireworks.mp3");
                this.listaReproduccion.add("//media//music//clasica//Vivaldi - Spring from Four Seasons.mp3");
                this.listaReproduccion.add("//media//music//clasica//Vivaldi -Largo from Four Seasons.mp3");
                break;
            case "rock":
                this.nombreCanciones = new String[] {"Jailhouse Rock","Great Balls of Fire"};
                this.listaReproduccion.add("//media//music//rock//Jailhouse Rock.mp3");
                this.listaReproduccion.add("//media//music//rock//Great Balls of Fire.mp3");
                break;
            case "pop":
                this.nombreCanciones = new String[] {"Dancing in the Street","My Girl"};
                this.listaReproduccion.add("//media//music//pop//Dancing in the Street.mp3");
                this.listaReproduccion.add("//media//music//pop//My Girl.mp3");
                break;
            case "electronica":
                this.nombreCanciones = new String[] {"Ich Bin Meine Maschine","Knowing We'll Be Here","Midnight"};
                this.listaReproduccion.add("//media//music//electronica//Ich Bin Meine Maschine.mp3");
                this.listaReproduccion.add("//media//music//electronica//Knowing We'll Be Here.mp3");
                this.listaReproduccion.add("//media//music//electronica//Midnight.mp3");
                break;
            case "alternativa":
                this.nombreCanciones = new String[] {"Snow","Bonzo Goes to Bitburg","Story Of My Life"};
                this.listaReproduccion.add("//media//music//alternativa//Snow.mp3");
                this.listaReproduccion.add("//media//music//alternativa//Bonzo Goes to Bitburg.mp3");
                this.listaReproduccion.add("//media//music//alternativa//Story Of My Life.mp3");
                break;
            case "reggae":
                this.nombreCanciones = new String[] {"Funky Kingston","No woman no cry","The harder they come"};
                this.listaReproduccion.add("//media//music//reggae//Funky Kingston.mp3");
                this.listaReproduccion.add("//media//music//reggae//No woman no cry.mp3");
                this.listaReproduccion.add("//media//music//reggae//The harder they come.mp3");
            default:
                break;
        }
        this.setFilePath(this.listaReproduccion.get(0));
    }
    
    /**
     *
     * @return
     */
    public String getNombreCancionActual() {
        return this.nombreCanciones[this.cancionActual];
    }
    
    /**
     *
     * @return
     */
    public int getCancionActual() {
        return cancionActual;
    }

    /**
     *
     * @param cancionActual
     */
    public void setCancionActual(int cancionActual) {
        this.cancionActual = cancionActual;
    }

    /**
     *
     */
    public void play() {
        try {
            this.detenido = false;
            String urlAsString
                    = "file:///"
                    + new java.io.File(".").getCanonicalPath()
                    + "/"
                    + this.filePath;

            this.player = new AdvancedPlayer(
                    new java.net.URL(urlAsString).openStream(),
                    javazoom.jl.player.FactoryRegistry.systemRegistry().createAudioDevice()
            );

            this.player.setPlayBackListener(this);
            this.playerThread = new Thread(this, "AudioPlayerThread");

            this.playerThread.start();
        } catch (IOException | JavaLayerException ex) {}
    }

    /**
     *
     * @return
     */
    public boolean isDetenido() {
        return detenido;
    }

    /**
     *
     * @param detenido
     */
    public void setDetenido(boolean detenido) {
        this.detenido = detenido;
    }

    /**
     *
     */
    public void parar() {
        if (this.detenido == false) {
            this.detenido = true;
            this.player.stop();
        }
    }

    /**
     *
     */
    public void siguienteCancion() {
        if (this.detenido == false) {
            this.player.stop();
        }
    }

    /**
     *
     * @param playbackEvent
     */
    @Override
    public void playbackStarted(PlaybackEvent playbackEvent) {
  
    }

    /**
     *
     * @param playbackEvent
     */
    @Override
    public void playbackFinished(PlaybackEvent playbackEvent) {
                if (this.cancionActual < this.listaReproduccion.size() - 1 && this.detenido == false) {
            this.cancionActual++;
            this.filePath = this.listaReproduccion.get(this.cancionActual);
            this.play();
        } else {
            this.detenido = true;
            this.cancionActual = 0;
            this.filePath = this.listaReproduccion.get(0);
        }
    }

    @Override
    public void run() {
        try {
            this.ventanaMusica.ActualizarNombreCancion();
            this.player.play();
        } catch (JavaLayerException ex) {}

    }
}
