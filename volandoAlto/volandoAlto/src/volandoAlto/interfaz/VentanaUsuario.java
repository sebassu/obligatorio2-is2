package volandoAlto.interfaz;

import volandoAlto.dominio.Idioma;
import volandoAlto.dominio.ReproductorMp3;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import volandoAlto.dominio.VolandoAlto;
import volandoAlto.dominio.Vuelo;

public class VentanaUsuario extends javax.swing.JFrame {

    VolandoAlto volandoAlto;
    ReproductorMp3 reproductorMusica;
    private int panelActual;

    public VentanaUsuario(VolandoAlto volandoAlto) {
        this.volandoAlto = volandoAlto;
        Object[] iconosIdiomas = ObtenerImageIconsDeIdiomas();
        initComponents();
        cargarComboBoxMotivosAzafata();
        if (volandoAlto.ExistenIdiomasRegistrados()) {
            this.pnlIdioma.setVisible(true);
            this.pnlVuelo.setVisible(false);
            this.pnlBotones.setVisible(false);
        } else {
            this.pnlVuelo.setVisible(true);
            this.pnlBotones.setVisible(true);
            this.pnlIdioma.setVisible(false);
        }
        this.pnlApagado.setVisible(false);
        this.pnlJuegos.setVisible(false);
        this.pnlMapas.setVisible(false);
        this.pnlVideo.setVisible(false);
        this.pnlMusica.setVisible(false);
        this.reproductorMusica = new ReproductorMp3();
        this.panelActual = 0;
        jComboBoxIdiomas.setModel(new DefaultComboBoxModel<>(iconosIdiomas));
        this.actualizarNombreCancion();
    }

    public void deseleccionarBotones() {
        this.btnVuelo.setBackground(new Color(0, 204, 204));
        this.btnJuegos.setBackground(new Color(0, 204, 204));
        this.btnMusica.setBackground(new Color(0, 204, 204));
        this.btnVideo.setBackground(new Color(0, 204, 204));
        this.btnMapas.setBackground(new Color(0, 204, 204));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVentana = new javax.swing.JPanel();
        pnlApagado = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnlIdioma = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        lblContinuar = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        jComboBoxIdiomas = new javax.swing.JComboBox<>();
        pnlBotones = new javax.swing.JPanel();
        btnVuelo = new javax.swing.JButton();
        btnMapas = new javax.swing.JButton();
        btnVideo = new javax.swing.JButton();
        btnMusica = new javax.swing.JButton();
        btnJuegos = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        pnlVuelo = new javax.swing.JPanel();
        lblBienvenidoBordo = new javax.swing.JLabel();
        btnAzafata = new javax.swing.JButton();
        lblHoraEnDestino = new javax.swing.JLabel();
        lblClimaEnDestino = new javax.swing.JLabel();
        lblInfoVuelo = new javax.swing.JLabel();
        lblEtiquetaCapitan = new javax.swing.JLabel();
        lblNombreCapitan = new javax.swing.JLabel();
        lblEtiquetaVuelo = new javax.swing.JLabel();
        lblCodigoVuelo = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        lblEtiquetaOrigen = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        lblEtiquetaHoraSalida = new javax.swing.JLabel();
        lblHoraSalida = new javax.swing.JLabel();
        lblEstadoLlegada = new javax.swing.JLabel();
        lblHoraLlegada = new javax.swing.JLabel();
        lblEtiquetaDestino = new javax.swing.JLabel();
        lblHoraActualEnDestino = new javax.swing.JLabel();
        jComboBoxMotivosAzafata = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        pnlMapas = new javax.swing.JPanel();
        pnlVideo = new javax.swing.JPanel();
        pnlMusica = new javax.swing.JPanel();
        btnReproducirCancion = new javax.swing.JButton();
        btnDetenerCancion = new javax.swing.JButton();
        btnClasica = new javax.swing.JButton();
        lblSeleccioneGenero = new javax.swing.JLabel();
        btnRock = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnReggae = new javax.swing.JButton();
        btnAlternativa = new javax.swing.JButton();
        btnElectronica = new javax.swing.JButton();
        lblGeneroSeleccionado = new javax.swing.JLabel();
        lblEstadoReproduccion = new javax.swing.JLabel();
        lblNombreCancion = new javax.swing.JLabel();
        pnlJuegos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pasajero");
        setMinimumSize(new java.awt.Dimension(1024, 604));
        setResizable(false);
        getContentPane().setLayout(null);

        pnlVentana.setAlignmentX(0.0F);
        pnlVentana.setAlignmentY(0.0F);
        pnlVentana.setMaximumSize(new java.awt.Dimension(1024, 576));
        pnlVentana.setMinimumSize(new java.awt.Dimension(1024, 576));
        pnlVentana.setName(""); // NOI18N
        pnlVentana.setPreferredSize(new java.awt.Dimension(1024, 576));

        pnlApagado.setBackground(new java.awt.Color(0, 0, 0));
        pnlApagado.setAlignmentX(0.0F);
        pnlApagado.setAlignmentY(0.0F);
        pnlApagado.setMaximumSize(new java.awt.Dimension(1024, 576));
        pnlApagado.setMinimumSize(new java.awt.Dimension(1024, 576));
        pnlApagado.setPreferredSize(new java.awt.Dimension(1024, 576));
        pnlApagado.setVerifyInputWhenFocusTarget(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/apagar.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setAlignmentY(0.0F);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setIconTextGap(0);
        jButton1.setMaximumSize(new java.awt.Dimension(1024, 576));
        jButton1.setMinimumSize(new java.awt.Dimension(1024, 576));
        jButton1.setPreferredSize(new java.awt.Dimension(1024, 576));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlApagadoLayout = new javax.swing.GroupLayout(pnlApagado);
        pnlApagado.setLayout(pnlApagadoLayout);
        pnlApagadoLayout.setHorizontalGroup(
            pnlApagadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlApagadoLayout.setVerticalGroup(
            pnlApagadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlIdioma.setAlignmentX(0.0F);
        pnlIdioma.setAlignmentY(0.0F);
        pnlIdioma.setMaximumSize(new java.awt.Dimension(1024, 576));
        pnlIdioma.setMinimumSize(new java.awt.Dimension(1024, 576));
        pnlIdioma.setPreferredSize(new java.awt.Dimension(1024, 576));

        lblBienvenido.setFont(new java.awt.Font("Segoe UI Light", 0, 75)); // NOI18N
        lblBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenido.setText("Welcome.");
        lblBienvenido.setAlignmentY(0.0F);

        lblContinuar.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblContinuar.setForeground(new java.awt.Color(51, 51, 51));
        lblContinuar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContinuar.setText("Continue");
        lblContinuar.setToolTipText("");
        lblContinuar.setAlignmentY(0.0F);

        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/arrow.png"))); // NOI18N
        btnContinuar.setAlignmentY(0.0F);
        btnContinuar.setBorder(null);
        btnContinuar.setBorderPainted(false);
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.setFocusPainted(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jComboBoxIdiomas.setMaximumSize(new java.awt.Dimension(576, 576));
        jComboBoxIdiomas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CambiarIdiomaSeleccionado(evt);
            }
        });

        javax.swing.GroupLayout pnlIdiomaLayout = new javax.swing.GroupLayout(pnlIdioma);
        pnlIdioma.setLayout(pnlIdiomaLayout);
        pnlIdiomaLayout.setHorizontalGroup(
            pnlIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdiomaLayout.createSequentialGroup()
                .addGroup(pnlIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIdiomaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBienvenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                            .addComponent(lblContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlIdiomaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIdiomaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jComboBoxIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlIdiomaLayout.setVerticalGroup(
            pnlIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdiomaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pnlBotones.setAlignmentX(0.0F);
        pnlBotones.setAlignmentY(0.0F);
        pnlBotones.setMaximumSize(new java.awt.Dimension(96, 576));
        pnlBotones.setMinimumSize(new java.awt.Dimension(96, 576));
        pnlBotones.setName(""); // NOI18N
        pnlBotones.setPreferredSize(new java.awt.Dimension(96, 576));

        btnVuelo.setBackground(new java.awt.Color(102, 204, 255));
        btnVuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/avion.png"))); // NOI18N
        btnVuelo.setAlignmentY(0.0F);
        btnVuelo.setBorderPainted(false);
        btnVuelo.setContentAreaFilled(false);
        btnVuelo.setFocusPainted(false);
        btnVuelo.setIconTextGap(0);
        btnVuelo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnVuelo.setMaximumSize(new java.awt.Dimension(96, 96));
        btnVuelo.setMinimumSize(new java.awt.Dimension(96, 96));
        btnVuelo.setOpaque(true);
        btnVuelo.setSelected(true);
        btnVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVueloActionPerformed(evt);
            }
        });

        btnMapas.setBackground(new java.awt.Color(0, 204, 204));
        btnMapas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/mapa.png"))); // NOI18N
        btnMapas.setAlignmentY(0.0F);
        btnMapas.setBorderPainted(false);
        btnMapas.setContentAreaFilled(false);
        btnMapas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMapas.setFocusPainted(false);
        btnMapas.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMapas.setMaximumSize(new java.awt.Dimension(96, 96));
        btnMapas.setMinimumSize(new java.awt.Dimension(96, 96));
        btnMapas.setOpaque(true);
        btnMapas.setSelected(true);
        btnMapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapasActionPerformed(evt);
            }
        });

        btnVideo.setBackground(new java.awt.Color(0, 204, 204));
        btnVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/video.png"))); // NOI18N
        btnVideo.setAlignmentY(0.0F);
        btnVideo.setBorderPainted(false);
        btnVideo.setContentAreaFilled(false);
        btnVideo.setFocusPainted(false);
        btnVideo.setIconTextGap(0);
        btnVideo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnVideo.setMaximumSize(new java.awt.Dimension(96, 96));
        btnVideo.setMinimumSize(new java.awt.Dimension(96, 96));
        btnVideo.setOpaque(true);
        btnVideo.setSelected(true);
        btnVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVideoActionPerformed(evt);
            }
        });

        btnMusica.setBackground(new java.awt.Color(0, 204, 204));
        btnMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/musica.png"))); // NOI18N
        btnMusica.setAlignmentY(0.0F);
        btnMusica.setBorderPainted(false);
        btnMusica.setContentAreaFilled(false);
        btnMusica.setFocusPainted(false);
        btnMusica.setIconTextGap(0);
        btnMusica.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMusica.setMaximumSize(new java.awt.Dimension(96, 96));
        btnMusica.setMinimumSize(new java.awt.Dimension(96, 96));
        btnMusica.setOpaque(true);
        btnMusica.setSelected(true);
        btnMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaActionPerformed(evt);
            }
        });

        btnJuegos.setBackground(new java.awt.Color(0, 204, 204));
        btnJuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/juegos.png"))); // NOI18N
        btnJuegos.setAlignmentY(0.0F);
        btnJuegos.setBorderPainted(false);
        btnJuegos.setContentAreaFilled(false);
        btnJuegos.setFocusPainted(false);
        btnJuegos.setIconTextGap(0);
        btnJuegos.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnJuegos.setMaximumSize(new java.awt.Dimension(96, 96));
        btnJuegos.setMinimumSize(new java.awt.Dimension(96, 96));
        btnJuegos.setOpaque(true);
        btnJuegos.setSelected(true);
        btnJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegosActionPerformed(evt);
            }
        });

        btnApagar.setBackground(new java.awt.Color(0, 204, 204));
        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/apagar.png"))); // NOI18N
        btnApagar.setAlignmentY(0.0F);
        btnApagar.setBorderPainted(false);
        btnApagar.setContentAreaFilled(false);
        btnApagar.setFocusPainted(false);
        btnApagar.setIconTextGap(0);
        btnApagar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnApagar.setMaximumSize(new java.awt.Dimension(96, 96));
        btnApagar.setMinimumSize(new java.awt.Dimension(96, 96));
        btnApagar.setOpaque(true);
        btnApagar.setSelected(true);
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMapas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVideo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMusica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJuegos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addComponent(btnVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMapas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlVuelo.setAlignmentX(0.0F);
        pnlVuelo.setAlignmentY(0.0F);
        pnlVuelo.setMaximumSize(new java.awt.Dimension(928, 576));
        pnlVuelo.setMinimumSize(new java.awt.Dimension(928, 576));
        pnlVuelo.setPreferredSize(new java.awt.Dimension(928, 576));

        lblBienvenidoBordo.setFont(new java.awt.Font("Segoe UI Light", 0, 90)); // NOI18N
        lblBienvenidoBordo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenidoBordo.setText("Bienvenido a Bordo.");
        lblBienvenidoBordo.setAlignmentY(0.0F);

        btnAzafata.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        btnAzafata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/azafata.png"))); // NOI18N
        btnAzafata.setText("Azafata");
        btnAzafata.setAlignmentY(0.0F);
        btnAzafata.setBorder(null);
        btnAzafata.setBorderPainted(false);
        btnAzafata.setContentAreaFilled(false);
        btnAzafata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzafataActionPerformed(evt);
            }
        });

        lblHoraEnDestino.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblHoraEnDestino.setText("Información de hora");
        lblHoraEnDestino.setAlignmentY(0.0F);

        lblClimaEnDestino.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblClimaEnDestino.setText("y clima en destino");
        lblClimaEnDestino.setAlignmentY(0.0F);

        lblInfoVuelo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lblInfoVuelo.setText("Información del vuelo");
        lblInfoVuelo.setAlignmentY(0.0F);

        lblEtiquetaCapitan.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblEtiquetaCapitan.setText("Capitan: ");

        lblNombreCapitan.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblNombreCapitan.setText("nombre");

        lblEtiquetaVuelo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblEtiquetaVuelo.setText("Vuelo:");

        lblCodigoVuelo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblCodigoVuelo.setText("codigo");

        lblDestino.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        lblDestino.setText("Ciudad");

        lblEtiquetaOrigen.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblEtiquetaOrigen.setText("Origen:");

        lblOrigen.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblOrigen.setText("origen");

        lblEtiquetaHoraSalida.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblEtiquetaHoraSalida.setText("Hora de salida:");

        lblHoraSalida.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblHoraSalida.setText("hora salida");

        lblEstadoLlegada.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblEstadoLlegada.setText("Hora estimada de arribo:");

        lblHoraLlegada.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblHoraLlegada.setText("hora llegada");

        lblEtiquetaDestino.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblEtiquetaDestino.setText("Destino:");

        lblHoraActualEnDestino.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblHoraActualEnDestino.setText("00:00:00");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/translatorLogo.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlVueloLayout = new javax.swing.GroupLayout(pnlVuelo);
        pnlVuelo.setLayout(pnlVueloLayout);
        pnlVueloLayout.setHorizontalGroup(
            pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVueloLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVueloLayout.createSequentialGroup()
                        .addComponent(lblEtiquetaOrigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOrigen))
                    .addGroup(pnlVueloLayout.createSequentialGroup()
                        .addComponent(lblEtiquetaHoraSalida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHoraSalida))
                    .addGroup(pnlVueloLayout.createSequentialGroup()
                        .addComponent(lblEstadoLlegada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHoraLlegada))
                    .addGroup(pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlVueloLayout.createSequentialGroup()
                            .addComponent(lblEtiquetaCapitan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNombreCapitan))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlVueloLayout.createSequentialGroup()
                            .addComponent(lblEtiquetaVuelo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCodigoVuelo))
                        .addComponent(lblInfoVuelo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHoraEnDestino, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblClimaEnDestino, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVueloLayout.createSequentialGroup()
                        .addComponent(lblEtiquetaDestino)
                        .addGap(18, 18, 18)
                        .addComponent(lblDestino))
                    .addComponent(lblHoraActualEnDestino, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVueloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenidoBordo, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlVueloLayout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(btnAzafata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlVueloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxMotivosAzafata, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
        );
        pnlVueloLayout.setVerticalGroup(
            pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVueloLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlVueloLayout.createSequentialGroup()
                        .addGroup(pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDestino)
                            .addComponent(lblEtiquetaDestino))
                        .addGap(24, 24, 24)
                        .addComponent(lblHoraActualEnDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHoraEnDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblClimaEnDestino))
                    .addGroup(pnlVueloLayout.createSequentialGroup()
                        .addComponent(lblInfoVuelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEtiquetaCapitan)
                            .addComponent(lblNombreCapitan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEtiquetaVuelo)
                            .addComponent(lblCodigoVuelo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEtiquetaOrigen)
                            .addComponent(lblOrigen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEtiquetaHoraSalida)
                            .addComponent(lblHoraSalida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstadoLlegada)
                            .addComponent(lblHoraLlegada))))
                .addGap(34, 34, 34)
                .addComponent(lblBienvenidoBordo)
                .addGap(13, 13, 13)
                .addComponent(jComboBoxMotivosAzafata, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVueloLayout.createSequentialGroup()
                        .addComponent(btnAzafata, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlMapas.setAlignmentX(0.0F);
        pnlMapas.setAlignmentY(0.0F);
        pnlMapas.setMaximumSize(new java.awt.Dimension(928, 576));
        pnlMapas.setMinimumSize(new java.awt.Dimension(928, 576));
        pnlMapas.setPreferredSize(new java.awt.Dimension(928, 576));

        javax.swing.GroupLayout pnlMapasLayout = new javax.swing.GroupLayout(pnlMapas);
        pnlMapas.setLayout(pnlMapasLayout);
        pnlMapasLayout.setHorizontalGroup(
            pnlMapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        pnlMapasLayout.setVerticalGroup(
            pnlMapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        pnlVideo.setAlignmentX(0.0F);
        pnlVideo.setAlignmentY(0.0F);
        pnlVideo.setMaximumSize(new java.awt.Dimension(928, 576));
        pnlVideo.setMinimumSize(new java.awt.Dimension(928, 576));
        pnlVideo.setPreferredSize(new java.awt.Dimension(928, 576));

        javax.swing.GroupLayout pnlVideoLayout = new javax.swing.GroupLayout(pnlVideo);
        pnlVideo.setLayout(pnlVideoLayout);
        pnlVideoLayout.setHorizontalGroup(
            pnlVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        pnlVideoLayout.setVerticalGroup(
            pnlVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        pnlMusica.setAlignmentX(0.0F);
        pnlMusica.setAlignmentY(0.0F);
        pnlMusica.setMaximumSize(new java.awt.Dimension(928, 576));
        pnlMusica.setMinimumSize(new java.awt.Dimension(928, 576));
        pnlMusica.setPreferredSize(new java.awt.Dimension(928, 576));

        btnReproducirCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/play.png"))); // NOI18N
        btnReproducirCancion.setToolTipText("");
        btnReproducirCancion.setIconTextGap(0);
        btnReproducirCancion.setMargin(new java.awt.Insets(2, 20, 2, 14));
        btnReproducirCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducirCancionActionPerformed(evt);
            }
        });

        btnDetenerCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/stop.png"))); // NOI18N
        btnDetenerCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerCancionActionPerformed(evt);
            }
        });

        btnClasica.setText("Clasica");
        btnClasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasicaActionPerformed(evt);
            }
        });

        lblSeleccioneGenero.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        lblSeleccioneGenero.setText("Seleccione un genero");

        btnRock.setText("Rock");
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });

        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volandoAlto/interfaz/skip.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnReggae.setText("Reggae");
        btnReggae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReggaeActionPerformed(evt);
            }
        });

        btnAlternativa.setText("Alternativa");
        btnAlternativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlternativaActionPerformed(evt);
            }
        });

        btnElectronica.setText("Electrónica");
        btnElectronica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectronicaActionPerformed(evt);
            }
        });

        lblGeneroSeleccionado.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lblGeneroSeleccionado.setText("Clasica: ");

        lblEstadoReproduccion.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lblEstadoReproduccion.setText("Detenido");

        lblNombreCancion.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        lblNombreCancion.setText("NOMBRE DE LA CANCION");

        javax.swing.GroupLayout pnlMusicaLayout = new javax.swing.GroupLayout(pnlMusica);
        pnlMusica.setLayout(pnlMusicaLayout);
        pnlMusicaLayout.setHorizontalGroup(
            pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMusicaLayout.createSequentialGroup()
                .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMusicaLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSeleccioneGenero)
                            .addGroup(pnlMusicaLayout.createSequentialGroup()
                                .addComponent(lblGeneroSeleccionado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEstadoReproduccion))
                            .addGroup(pnlMusicaLayout.createSequentialGroup()
                                .addComponent(btnReproducirCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDetenerCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMusicaLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMusicaLayout.createSequentialGroup()
                                .addComponent(btnClasica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRock, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMusicaLayout.createSequentialGroup()
                                .addComponent(btnElectronica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReggae, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlternativa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        pnlMusicaLayout.setVerticalGroup(
            pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMusicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeleccioneGenero)
                .addGap(33, 33, 33)
                .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClasica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElectronica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReggae, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlternativa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeneroSeleccionado)
                    .addComponent(lblEstadoReproduccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreCancion)
                .addGap(33, 33, 33)
                .addGroup(pnlMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReproducirCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetenerCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
        );

        pnlJuegos.setAlignmentX(0.0F);
        pnlJuegos.setAlignmentY(0.0F);
        pnlJuegos.setMaximumSize(new java.awt.Dimension(928, 576));
        pnlJuegos.setMinimumSize(new java.awt.Dimension(928, 576));

        javax.swing.GroupLayout pnlJuegosLayout = new javax.swing.GroupLayout(pnlJuegos);
        pnlJuegos.setLayout(pnlJuegosLayout);
        pnlJuegosLayout.setHorizontalGroup(
            pnlJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        pnlJuegosLayout.setVerticalGroup(
            pnlJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlVentanaLayout = new javax.swing.GroupLayout(pnlVentana);
        pnlVentana.setLayout(pnlVentanaLayout);
        pnlVentanaLayout.setHorizontalGroup(
            pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVentanaLayout.createSequentialGroup()
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVentanaLayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(pnlMapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVentanaLayout.createSequentialGroup()
                    .addComponent(pnlIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)))
            .addGroup(pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVentanaLayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(pnlJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(pnlApagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVentanaLayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(pnlVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)))
            .addGroup(pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVentanaLayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(pnlMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlVentanaLayout.setVerticalGroup(
            pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVentanaLayout.createSequentialGroup()
                .addGroup(pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
            .addGroup(pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlMapas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVentanaLayout.createSequentialGroup()
                    .addComponent(pnlIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)))
            .addGroup(pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVentanaLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlJuegos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pnlApagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVentanaLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlVideo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)))
            .addGroup(pnlVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlVentanaLayout.createSequentialGroup()
                    .addComponent(pnlMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)))
        );

        pnlMapas.getAccessibleContext().setAccessibleName("");

        getContentPane().add(pnlVentana);
        pnlVentana.setBounds(0, 0, 1024, 576);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int getPanelActual() {
        return panelActual;
    }

    private void setPanelActual(int panelActual) {
        this.panelActual = panelActual;
    }

    private void btnVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVueloActionPerformed
        this.setPanelActual(0);
        this.deseleccionarBotones();
        this.btnVuelo.setBackground(new Color(102, 204, 255));
        this.ocultarPaneles();
        this.pnlVuelo.setVisible(true);
    }//GEN-LAST:event_btnVueloActionPerformed

    private void btnMapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapasActionPerformed
        this.setPanelActual(1);
        this.deseleccionarBotones();
        this.btnMapas.setBackground(new Color(102, 204, 255));
        this.ocultarPaneles();
        this.pnlMapas.setVisible(true);
    }//GEN-LAST:event_btnMapasActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        this.pnlBotones.setVisible(false);
        ocultarPaneles();
        this.pnlApagado.setVisible(true);
    }//GEN-LAST:event_btnApagarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.pnlApagado.setVisible(false);
        switch (this.getPanelActual()) {
            case 0:
                this.pnlVuelo.setVisible(true);
                break;
            case 1:
                this.pnlMapas.setVisible(true);
                break;
            case 2:
                this.pnlVideo.setVisible(true);
                break;
            case 3:
                this.pnlMusica.setVisible(true);
                break;
            case 4:
                this.pnlJuegos.setVisible(true);
                break;
            default:
                break;
        }
        this.pnlBotones.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        try {
            ObtenerIdiomaSeleccionadoYActualizarPalabras();
        } catch (IllegalStateException e) {

        }
        this.pnlIdioma.setVisible(false);
        this.pnlApagado.setVisible(false);
        this.pnlBotones.setVisible(true);
        this.pnlJuegos.setVisible(false);
        this.pnlMapas.setVisible(false);
        this.pnlVuelo.setVisible(true);
        this.pnlVideo.setVisible(false);
        this.pnlMusica.setVisible(false);
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaActionPerformed
        this.setPanelActual(3);
        this.ocultarPaneles();
        this.deseleccionarBotones();
        this.btnMusica.setBackground(new Color(102, 204, 255));
        this.pnlMusica.setVisible(true);
    }//GEN-LAST:event_btnMusicaActionPerformed

    private void btnReproducirCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproducirCancionActionPerformed
        if (this.reproductorMusica.isDetenido() == true) {
            this.lblEstadoReproduccion.setText(volandoAlto.getIdiomaActual().getPalabras()[22]);
            reproductorMusica.play();
        }
        actualizarNombreCancion();
    }//GEN-LAST:event_btnReproducirCancionActionPerformed

    private void btnDetenerCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerCancionActionPerformed
        this.lblEstadoReproduccion.setText("Detenido");
        reproductorMusica.parar();
    }//GEN-LAST:event_btnDetenerCancionActionPerformed

    private void btnClasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasicaActionPerformed
        this.setTextoGenero(volandoAlto.getIdiomaActual().getPalabras()[15]);
        reproductorMusica.parar();
        this.lblEstadoReproduccion.setText(volandoAlto.getIdiomaActual().getPalabras()[21]);
        this.reproductorMusica.setListaReproduccion("clasica");
        this.actualizarNombreCancion();
    }//GEN-LAST:event_btnClasicaActionPerformed

    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockActionPerformed
        this.setTextoGenero(volandoAlto.getIdiomaActual().getPalabras()[17]);
        reproductorMusica.parar();
        this.lblEstadoReproduccion.setText(volandoAlto.getIdiomaActual().getPalabras()[21]);
        this.reproductorMusica.setListaReproduccion("rock");
        this.actualizarNombreCancion();
    }//GEN-LAST:event_btnRockActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        this.setTextoGenero(volandoAlto.getIdiomaActual().getPalabras()[16]);
        this.lblEstadoReproduccion.setText("Detenido");
        reproductorMusica.parar();
        this.lblEstadoReproduccion.setText(volandoAlto.getIdiomaActual().getPalabras()[21]);
        this.reproductorMusica.setListaReproduccion("pop");
        this.actualizarNombreCancion();
    }//GEN-LAST:event_btnPopActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.reproductorMusica.siguienteCancion();
        if (this.reproductorMusica.isDetenido()) {
            this.lblEstadoReproduccion.setText(volandoAlto.getIdiomaActual().getPalabras()[21]);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVideoActionPerformed
        this.setPanelActual(2);
        this.deseleccionarBotones();
        this.btnVideo.setBackground(new Color(102, 204, 255));
        this.ocultarPaneles();
        this.pnlVideo.setVisible(true);
    }//GEN-LAST:event_btnVideoActionPerformed

    private void btnJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegosActionPerformed
        this.setPanelActual(4);
        this.deseleccionarBotones();
        this.btnJuegos.setBackground(new Color(102, 204, 255));
        this.ocultarPaneles();
        this.pnlJuegos.setVisible(true);
    }//GEN-LAST:event_btnJuegosActionPerformed

    private void btnElectronicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectronicaActionPerformed
        this.setTextoGenero(volandoAlto.getIdiomaActual().getPalabras()[18]);
        reproductorMusica.parar();
        this.lblEstadoReproduccion.setText(volandoAlto.getIdiomaActual().getPalabras()[21]);
        this.reproductorMusica.setListaReproduccion("electronica");
        this.actualizarNombreCancion();
    }//GEN-LAST:event_btnElectronicaActionPerformed

    private void btnReggaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReggaeActionPerformed
        this.setTextoGenero(volandoAlto.getIdiomaActual().getPalabras()[19]);
        reproductorMusica.parar();
        this.lblEstadoReproduccion.setText(volandoAlto.getIdiomaActual().getPalabras()[21]);
        this.reproductorMusica.setListaReproduccion("reggae");
        this.actualizarNombreCancion();
    }//GEN-LAST:event_btnReggaeActionPerformed

    private void btnAlternativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlternativaActionPerformed
        this.setTextoGenero(volandoAlto.getIdiomaActual().getPalabras()[20]);
        reproductorMusica.parar();
        this.lblEstadoReproduccion.setText(volandoAlto.getIdiomaActual().getPalabras()[21]);
        this.reproductorMusica.setListaReproduccion("alternativa");
        this.actualizarNombreCancion();
    }//GEN-LAST:event_btnAlternativaActionPerformed

    private void CambiarIdiomaSeleccionado(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CambiarIdiomaSeleccionado
        ObtenerIdiomaSeleccionadoYActualizarPalabras();

    }//GEN-LAST:event_CambiarIdiomaSeleccionado

    private void btnAzafataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzafataActionPerformed
        Object selecionado = this.jComboBoxMotivosAzafata.getSelectedItem();
        if (selecionado != null) {
            String motivo = selecionado.toString();
            JOptionPane.showMessageDialog(null, "Se realizó un llamado a la azafata: "
                    + motivo, "Llamado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAzafataActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (volandoAlto.ExistenIdiomasRegistrados()) {
            this.pnlIdioma.setVisible(true);
            this.pnlVuelo.setVisible(false);
            this.pnlBotones.setVisible(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ObtenerIdiomaSeleccionadoYActualizarPalabras() {
        int indexSelecionado = this.jComboBoxIdiomas.getSelectedIndex();
        if (indexSelecionado > -1) {
            Idioma idiomaSeleccionado = volandoAlto.getIdiomasRegistrados().get(indexSelecionado);
            volandoAlto.setIdiomaActual(idiomaSeleccionado);
            cargarPalabras();
        } else {
            throw new IllegalStateException();
        }
    }

    public void setTextoGenero(String genero) {
        this.lblGeneroSeleccionado.setText(genero + ":");
    }

    public void ocultarPaneles() {
        this.pnlVuelo.setVisible(false);
        this.pnlApagado.setVisible(false);
        this.pnlJuegos.setVisible(false);
        this.pnlMapas.setVisible(false);
        this.pnlVideo.setVisible(false);
        this.pnlMusica.setVisible(false);
    }

    public void cargarPalabras() {
        Idioma idiomaActual = volandoAlto.getIdiomaActual();
        String[] palabras = idiomaActual.getPalabras();
        Font fuente = idiomaActual.getFuente();

        this.lblBienvenido.setText(palabras[0]);
        this.lblBienvenido.setFont(fuente.deriveFont(Font.PLAIN, 75));

        this.lblContinuar.setText(palabras[1]);
        this.lblContinuar.setFont(fuente.deriveFont(Font.PLAIN, 20));

        this.lblInfoVuelo.setText(palabras[2]);
        this.lblInfoVuelo.setFont(fuente.deriveFont(Font.BOLD, 24));

        this.lblEtiquetaCapitan.setText(palabras[3] + ":");
        this.lblEtiquetaCapitan.setFont(fuente.deriveFont(Font.PLAIN, 18));

        this.lblEtiquetaVuelo.setText(palabras[4] + ":");
        this.lblEtiquetaVuelo.setFont(fuente.deriveFont(Font.PLAIN, 18));

        this.lblEtiquetaOrigen.setText(palabras[5] + ":");
        this.lblEtiquetaOrigen.setFont(fuente.deriveFont(Font.PLAIN, 18));

        this.lblEtiquetaHoraSalida.setText(palabras[6] + ":");
        this.lblEtiquetaHoraSalida.setFont(fuente.deriveFont(Font.PLAIN, 18));

        this.lblEstadoLlegada.setText(palabras[7] + ":");
        this.lblEstadoLlegada.setFont(fuente.deriveFont(Font.PLAIN, 18));

        this.lblEtiquetaDestino.setText(palabras[8] + ":");
        this.lblEtiquetaDestino.setFont(fuente.deriveFont(Font.PLAIN, 18));

        this.lblHoraEnDestino.setText(palabras[9]);
        this.lblHoraEnDestino.setFont(fuente.deriveFont(Font.PLAIN, 24));

        this.lblClimaEnDestino.setText(palabras[10]);
        this.lblClimaEnDestino.setFont(fuente.deriveFont(Font.PLAIN, 24));

        this.lblDestino.setFont(fuente.deriveFont(Font.BOLD, 36));

        this.lblEtiquetaDestino.setFont(fuente.deriveFont(Font.PLAIN, 36));

        this.lblHoraActualEnDestino.setFont(fuente.deriveFont(Font.PLAIN, 24));

        this.lblClimaEnDestino.setFont(fuente.deriveFont(Font.PLAIN, 24));

        this.lblBienvenidoBordo.setText(palabras[11]);
        this.lblBienvenidoBordo.setFont(fuente.deriveFont(Font.PLAIN, 90));

        this.lblSeleccioneGenero.setText(palabras[14]);
        this.lblSeleccioneGenero.setFont(fuente.deriveFont(Font.BOLD, 36));

        this.btnClasica.setText(palabras[15]);
        this.btnClasica.setFont(fuente.deriveFont(Font.PLAIN, 14));

        this.btnPop.setText(palabras[16]);
        this.btnPop.setFont(fuente.deriveFont(Font.PLAIN, 14));

        this.btnRock.setText(palabras[17]);
        this.btnRock.setFont(fuente.deriveFont(Font.PLAIN, 14));

        this.btnElectronica.setText(palabras[18]);
        this.btnElectronica.setFont(fuente.deriveFont(Font.PLAIN, 14));

        this.btnReggae.setText(palabras[19]);
        this.btnReggae.setFont(fuente.deriveFont(Font.PLAIN, 14));

        this.btnAlternativa.setText(palabras[20]);
        this.btnAlternativa.setFont(fuente.deriveFont(Font.PLAIN, 14));

        this.lblGeneroSeleccionado.setFont(fuente.deriveFont(Font.BOLD, 24));

        this.lblNombreCancion.setFont(fuente.deriveFont(Font.BOLD, 36));

        this.lblEstadoReproduccion.setText(palabras[21]);
        this.lblEstadoReproduccion.setFont(fuente.deriveFont(Font.BOLD, 24));
        if (volandoAlto.getVueloActual() != null) {
            actualizarCambiosDeVuelo();
        }
    }

    public void actualizarNombreCancion() {
        this.lblNombreCancion.setText(this.reproductorMusica.getNombreCancionActual());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlternativa;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnAzafata;
    private javax.swing.JButton btnClasica;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnDetenerCancion;
    private javax.swing.JButton btnElectronica;
    private javax.swing.JButton btnJuegos;
    private javax.swing.JButton btnMapas;
    private javax.swing.JButton btnMusica;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnReggae;
    private javax.swing.JButton btnReproducirCancion;
    private javax.swing.JButton btnRock;
    private javax.swing.JButton btnVideo;
    private javax.swing.JButton btnVuelo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<Object> jComboBoxIdiomas;
    private javax.swing.JComboBox jComboBoxMotivosAzafata;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblBienvenidoBordo;
    private javax.swing.JLabel lblClimaEnDestino;
    private javax.swing.JLabel lblCodigoVuelo;
    private javax.swing.JLabel lblContinuar;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblEstadoLlegada;
    private javax.swing.JLabel lblEstadoReproduccion;
    private javax.swing.JLabel lblEtiquetaCapitan;
    private javax.swing.JLabel lblEtiquetaDestino;
    private javax.swing.JLabel lblEtiquetaHoraSalida;
    private javax.swing.JLabel lblEtiquetaOrigen;
    private javax.swing.JLabel lblEtiquetaVuelo;
    private javax.swing.JLabel lblGeneroSeleccionado;
    private javax.swing.JLabel lblHoraActualEnDestino;
    private javax.swing.JLabel lblHoraEnDestino;
    private javax.swing.JLabel lblHoraLlegada;
    private javax.swing.JLabel lblHoraSalida;
    private javax.swing.JLabel lblInfoVuelo;
    private javax.swing.JLabel lblNombreCancion;
    private javax.swing.JLabel lblNombreCapitan;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblSeleccioneGenero;
    private javax.swing.JPanel pnlApagado;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlIdioma;
    private javax.swing.JPanel pnlJuegos;
    private javax.swing.JPanel pnlMapas;
    private javax.swing.JPanel pnlMusica;
    private javax.swing.JPanel pnlVentana;
    private javax.swing.JPanel pnlVideo;
    private javax.swing.JPanel pnlVuelo;
    // End of variables declaration//GEN-END:variables

    public void actualizarCambiosDeVuelo() {

        Vuelo vueloActual = volandoAlto.getVueloActual();

        this.lblNombreCapitan.setText(vueloActual.getCapitan());
        this.lblCodigoVuelo.setText(vueloActual.getCodigoDeVuelo());
        this.lblOrigen.setText(vueloActual.getCiudadOrigen().toString());
        this.lblDestino.setText(vueloActual.getCiudadDestino().toString());

        Calendar horaSalida = vueloActual.getHoraSalida();
        this.lblHoraSalida.setText(zero(horaSalida.get(Calendar.HOUR_OF_DAY))
                + ":" + zero(horaSalida.get(Calendar.MINUTE)));
        if (vueloActual.isDemorado()) {
            String texto = volandoAlto.getIdiomaActual().getPalabras()[13];
            this.lblEstadoLlegada.setText(texto);
            this.lblHoraLlegada.setText("");
        } else {
            String texto = volandoAlto.getIdiomaActual().getPalabras()[7] + ":";
            this.lblEstadoLlegada.setText(texto);
            Calendar horaLlegada = vueloActual.getHoraLlegada();
            this.lblHoraLlegada.setText(zero(horaLlegada.get(Calendar.HOUR_OF_DAY))
                    + ":" + zero(horaLlegada.get(Calendar.MINUTE)));
        }
    }

    public static String zero(int num) {
        return (num < 10) ? ("0" + num) : ("" + num);
    }

    public void actualizarHora(String hora) {
        this.lblHoraActualEnDestino.setText(hora);
    }

    private Object[] ObtenerImageIconsDeIdiomas() {
        ArrayList<Object> retorno = new ArrayList<>();
        for (Idioma idiomaAux : volandoAlto.getIdiomasRegistrados()) {
            try {
                ImageIcon imageIcon = new ImageIcon(getClass().getResource("/volandoAlto/interfaz/"
                        + idiomaAux.getNombre() + ".png"));
                Image unaImagen = imageIcon.getImage();
                Image imagenEscalada = unaImagen.getScaledInstance(225, 185, java.awt.Image.SCALE_SMOOTH);
                imageIcon = new ImageIcon(imagenEscalada);
                retorno.add(imageIcon);
            } catch (NullPointerException e) {
                Logger.getLogger(VentanaUsuario.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return retorno.toArray();
    }

    public void cargarComboBoxMotivosAzafata() {
        Object[] arrayMotivos = volandoAlto.getMotivosAzafata().toArray();
        this.jComboBoxMotivosAzafata.setModel(new DefaultComboBoxModel<>(arrayMotivos));
    }
}
