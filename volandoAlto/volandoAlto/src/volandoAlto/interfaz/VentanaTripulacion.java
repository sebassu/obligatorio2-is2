package volandoAlto.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.apache.commons.lang3.StringUtils;
import volandoAlto.dominio.Ciudad;
import volandoAlto.dominio.VolandoAlto;
import volandoAlto.dominio.Vuelo;

/**
 *
 * @author Br1
 */
public class VentanaTripulacion extends javax.swing.JFrame {

    VentanaUsuario ventanaCliente;

    private final VolandoAlto volandoAlto;

    /**
     * @param volandoAlto Objeto fachada del sistema.
     */
    public VentanaTripulacion(VolandoAlto volandoAlto) {
        initComponents();
        this.volandoAlto = volandoAlto;
        cargarComboBoxCiudadOrigen();
        cargarComboBoxCiudadDestino();
        this.jPanelCiudades.setVisible(false);
        this.jPanelRegistrarCiudad.setVisible(false);
        this.jPanelListaMotivosAzafata.setVisible(false);
        this.jPanelRegistrarMotivo.setVisible(false);
        ventanaCliente = new VentanaUsuario(volandoAlto);
        ventanaCliente.setLocationRelativeTo(null);
        ventanaCliente.setVisible(true);
        cargarListaJListCiudades();
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaTripulacion.this.setHora();
            }
        };
        new Timer(1000, taskPerformer).start();
    }

    public void setHora() {
        if (volandoAlto.getVueloActual() != null) {
            Ciudad destino = volandoAlto.getVueloActual().getCiudadDestino();
            if (destino != null) {
                ZonedDateTime horaActual = ZonedDateTime.now(destino.getZonaHoraria());
                int hrs = horaActual.getHour();
                int min = horaActual.getMinute();
                String horaS = zero(hrs) + ":" + zero(min);
                ventanaCliente.actualizarHora(horaS);
            }
        }
    }

    public static String zero(int num) {
        return (num < 10) ? ("0" + num) : ("" + num);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanelMenuPrincipalVentanaTripulacion = new javax.swing.JPanel();
        jPanelCiudades = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCiudades = new javax.swing.JList<>();
        btnEliminar = new javax.swing.JButton();
        btnRegistrarNuevaCiudad = new javax.swing.JButton();
        btnVolverDesdeCiudades = new javax.swing.JButton();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelVuelo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoVuelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCapitan = new javax.swing.JTextField();
        cmbOrigen = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbDestino = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAplicarCambios = new javax.swing.JButton();
        chkDemorado = new javax.swing.JCheckBox();
        lblCambiosAplicados = new javax.swing.JLabel();
        jSpinnerHoraSalida = new javax.swing.JSpinner();
        jSpinnerMinutoSalida = new javax.swing.JSpinner();
        jSpinnerHoraLlegada = new javax.swing.JSpinner();
        jSpinnerMinutoLlegada = new javax.swing.JSpinner();
        jPanelMantenimiento = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnCiudades = new javax.swing.JButton();
        btnMotivosLlamadoAzafata = new javax.swing.JButton();
        jPanelRegistrarCiudad = new javax.swing.JPanel();
        btnVolver1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        jTextFieldNombreCiudad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxZonaHoraria = new javax.swing.JComboBox<>();
        jPanelListaMotivosAzafata = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        btnVolverDesdeAzafata = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListMotivos = new javax.swing.JList<>();
        btnRegistrarNuevoMotivo = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jPanelRegistrarMotivo = new javax.swing.JPanel();
        jTextFieldNombreMotivo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        btnVolverDesdeRegistrarMOtivoAzafata = new javax.swing.JButton();
        btnRegistrarMotivo = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tripulacion");
        setResizable(false);

        jPanelCiudades.setName("Ciudades"); // NOI18N
        jPanelCiudades.setPreferredSize(new java.awt.Dimension(348, 470));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Ciudades");

        jListCiudades.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jScrollPane1.setViewportView(jListCiudades);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegistrarNuevaCiudad.setText("Registrar Nueva");
        btnRegistrarNuevaCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevaCiudadActionPerformed(evt);
            }
        });

        btnVolverDesdeCiudades.setText("Volver");
        btnVolverDesdeCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverDesdeCiudadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCiudadesLayout = new javax.swing.GroupLayout(jPanelCiudades);
        jPanelCiudades.setLayout(jPanelCiudadesLayout);
        jPanelCiudadesLayout.setHorizontalGroup(
            jPanelCiudadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCiudadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCiudadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverDesdeCiudades)
                    .addGroup(jPanelCiudadesLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel12))
                    .addGroup(jPanelCiudadesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelCiudadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCiudadesLayout.createSequentialGroup()
                                .addComponent(btnRegistrarNuevaCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCiudadesLayout.setVerticalGroup(
            jPanelCiudadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCiudadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverDesdeCiudades)
                .addGap(11, 11, 11)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCiudadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarNuevaCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanelVuelo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Vuelo");

        jLabel2.setText("Código de vuelo");

        txtCodigoVuelo.setText("A482H");
        txtCodigoVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVueloActionPerformed(evt);
            }
        });

        jLabel5.setText("Capitán");

        txtCapitan.setText("Luis Suárez");
        txtCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapitanActionPerformed(evt);
            }
        });

        cmbOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrigenActionPerformed(evt);
            }
        });

        jLabel3.setText("Orígen");

        jLabel4.setText("Destino");

        jLabel6.setText("Estado");

        jLabel7.setText("Salida");

        jLabel8.setText(":");

        jLabel9.setText("Llegada");

        jLabel10.setText(":");

        btnAplicarCambios.setText("Aplicar");
        btnAplicarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarCambiosActionPerformed(evt);
            }
        });

        chkDemorado.setText("Demorado");

        lblCambiosAplicados.setText("  ");

        jSpinnerHoraSalida.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        jSpinnerMinutoSalida.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jSpinnerHoraLlegada.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        jSpinnerMinutoLlegada.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        javax.swing.GroupLayout jPanelVueloLayout = new javax.swing.GroupLayout(jPanelVuelo);
        jPanelVuelo.setLayout(jPanelVueloLayout);
        jPanelVueloLayout.setHorizontalGroup(
            jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVueloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanelVueloLayout.createSequentialGroup()
                        .addComponent(chkDemorado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAplicarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVueloLayout.createSequentialGroup()
                        .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelVueloLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCodigoVuelo))
                                .addGroup(jPanelVueloLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblCambiosAplicados))
                                .addGroup(jPanelVueloLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelVueloLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(22, 22, 22)
                                    .addComponent(cmbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelVueloLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelVueloLayout.createSequentialGroup()
                                            .addComponent(jSpinnerHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSpinnerMinutoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(cmbDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel6)
                            .addGroup(jPanelVueloLayout.createSequentialGroup()
                                .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerMinutoLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelVueloLayout.setVerticalGroup(
            jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVueloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCambiosAplicados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSpinnerHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerMinutoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jSpinnerHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerMinutoLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDemorado)
                    .addComponent(btnAplicarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanelMantenimiento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Mantenimiento");

        btnCiudades.setLabel("Ciudades");
        btnCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCiudadesActionPerformed(evt);
            }
        });

        btnMotivosLlamadoAzafata.setText("Motivos llamado azafata");
        btnMotivosLlamadoAzafata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotivosLlamadoAzafataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMantenimientoLayout = new javax.swing.GroupLayout(jPanelMantenimiento);
        jPanelMantenimiento.setLayout(jPanelMantenimientoLayout);
        jPanelMantenimientoLayout.setHorizontalGroup(
            jPanelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel11))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMantenimientoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMotivosLlamadoAzafata, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );
        jPanelMantenimientoLayout.setVerticalGroup(
            jPanelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMotivosLlamadoAzafata, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVuelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMantenimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnVolver1.setText("Volver");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Registrar Ciudad");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel14.setText("Nombre:");

        jLabel15.setText("Zona Horaria:");

        jComboBoxZonaHoraria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GMT+12", "GMT+11", "GMT+10", "GMT+9", "GMT+8", "GMT+7", "GMT+6", "GMT+5", "GMT+4", "GMT+3", "GMT+2", "GMT+1", "GMT+0", "GMT-1", "GMT-2", "GMT-3", "GMT-4", "GMT-5", "GMT-6", "GMT-7", "GMT-8", "GMT-9", "GMT-10", "GMT-11", "GMT-12", "GMT-13", "GMT-14" }));

        javax.swing.GroupLayout jPanelRegistrarCiudadLayout = new javax.swing.GroupLayout(jPanelRegistrarCiudad);
        jPanelRegistrarCiudad.setLayout(jPanelRegistrarCiudadLayout);
        jPanelRegistrarCiudadLayout.setHorizontalGroup(
            jPanelRegistrarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarCiudadLayout.createSequentialGroup()
                .addGroup(jPanelRegistrarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarCiudadLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelRegistrarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolver1)))
                    .addGroup(jPanelRegistrarCiudadLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelRegistrarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelRegistrarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombreCiudad)
                            .addComponent(jComboBoxZonaHoraria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarCiudadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(117, 117, 117))
        );
        jPanelRegistrarCiudadLayout.setVerticalGroup(
            jPanelRegistrarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarCiudadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver1)
                .addGap(11, 11, 11)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanelRegistrarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(56, 56, 56)
                .addGroup(jPanelRegistrarCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxZonaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Motivos para llamar a la azafata");

        btnVolverDesdeAzafata.setText("Volver");
        btnVolverDesdeAzafata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverDesdeAzafataActionPerformed(evt);
            }
        });

        jListMotivos.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jScrollPane2.setViewportView(jListMotivos);

        btnRegistrarNuevoMotivo.setText("Registrar Nuevo");
        btnRegistrarNuevoMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoMotivoActionPerformed(evt);
            }
        });

        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListaMotivosAzafataLayout = new javax.swing.GroupLayout(jPanelListaMotivosAzafata);
        jPanelListaMotivosAzafata.setLayout(jPanelListaMotivosAzafataLayout);
        jPanelListaMotivosAzafataLayout.setHorizontalGroup(
            jPanelListaMotivosAzafataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaMotivosAzafataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(78, 78, 78))
            .addGroup(jPanelListaMotivosAzafataLayout.createSequentialGroup()
                .addGroup(jPanelListaMotivosAzafataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListaMotivosAzafataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelListaMotivosAzafataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelListaMotivosAzafataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelListaMotivosAzafataLayout.createSequentialGroup()
                                    .addComponent(btnRegistrarNuevoMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelListaMotivosAzafataLayout.createSequentialGroup()
                                .addComponent(btnVolverDesdeAzafata)
                                .addGap(257, 257, 257))))
                    .addGroup(jPanelListaMotivosAzafataLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelListaMotivosAzafataLayout.setVerticalGroup(
            jPanelListaMotivosAzafataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaMotivosAzafataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverDesdeAzafata)
                .addGap(11, 11, 11)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelListaMotivosAzafataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarNuevoMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelRegistrarMotivo.setPreferredSize(new java.awt.Dimension(340, 533));

        jLabel17.setText("Nombre:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Registrar motivo");

        btnVolverDesdeRegistrarMOtivoAzafata.setText("Volver");
        btnVolverDesdeRegistrarMOtivoAzafata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverDesdeRegistrarMOtivoAzafataActionPerformed(evt);
            }
        });

        btnRegistrarMotivo.setText("Registrar");
        btnRegistrarMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMotivoActionPerformed(evt);
            }
        });

        jLabel19.setText("(Se espera que el motivo esté en inglés)");

        javax.swing.GroupLayout jPanelRegistrarMotivoLayout = new javax.swing.GroupLayout(jPanelRegistrarMotivo);
        jPanelRegistrarMotivo.setLayout(jPanelRegistrarMotivoLayout);
        jPanelRegistrarMotivoLayout.setHorizontalGroup(
            jPanelRegistrarMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarMotivoLayout.createSequentialGroup()
                .addGroup(jPanelRegistrarMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarMotivoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolverDesdeRegistrarMOtivoAzafata))
                    .addGroup(jPanelRegistrarMotivoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistrarMotivoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelRegistrarMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarMotivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombreMotivo)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarMotivoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(115, 115, 115))
        );
        jPanelRegistrarMotivoLayout.setVerticalGroup(
            jPanelRegistrarMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarMotivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverDesdeRegistrarMOtivoAzafata)
                .addGap(21, 21, 21)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanelRegistrarMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(36, 36, 36)
                .addComponent(btnRegistrarMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMenuPrincipalVentanaTripulacionLayout = new javax.swing.GroupLayout(jPanelMenuPrincipalVentanaTripulacion);
        jPanelMenuPrincipalVentanaTripulacion.setLayout(jPanelMenuPrincipalVentanaTripulacionLayout);
        jPanelMenuPrincipalVentanaTripulacionLayout.setHorizontalGroup(
            jPanelMenuPrincipalVentanaTripulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelCiudades, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelRegistrarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelListaMotivosAzafata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelRegistrarMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelMenuPrincipalVentanaTripulacionLayout.setVerticalGroup(
            jPanelMenuPrincipalVentanaTripulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createSequentialGroup()
                    .addComponent(jPanelCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jPanelRegistrarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelListaMotivosAzafata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelMenuPrincipalVentanaTripulacionLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jPanelRegistrarMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelMenuPrincipalVentanaTripulacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenuPrincipalVentanaTripulacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoVueloActionPerformed

    private void cmbOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrigenActionPerformed

    private void txtCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapitanActionPerformed

    private void btnAplicarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarCambiosActionPerformed
        if (this.datosValidos()) {
            int horaSalida = (int) this.jSpinnerHoraSalida.getValue();
            int minutoSalida = (int) this.jSpinnerMinutoSalida.getValue();
            int horaLlegada = (int) this.jSpinnerHoraLlegada.getValue();
            int minutoLlegada = (int) this.jSpinnerMinutoLlegada.getValue();
            String capitan = this.txtCapitan.getText();
            String codigoDeVuelo = this.txtCodigoVuelo.getText();
            Ciudad ciudadOrigen = (Ciudad) this.cmbOrigen.getSelectedItem();
            Ciudad ciudadDestino = (Ciudad) this.cmbDestino.getSelectedItem();
            boolean demorado = this.chkDemorado.isSelected();

            Calendar salida = Calendar.getInstance();
            salida.set(Calendar.HOUR_OF_DAY, horaSalida);
            salida.set(Calendar.MINUTE, minutoSalida);

            Calendar llegada = Calendar.getInstance();
            llegada.set(Calendar.HOUR_OF_DAY, horaLlegada);
            llegada.set(Calendar.MINUTE, minutoLlegada);

            Vuelo vuelo = new Vuelo(codigoDeVuelo, capitan, ciudadOrigen, ciudadDestino,
                    salida, llegada, demorado);

            volandoAlto.setVueloActual(vuelo);

            ventanaCliente.actualizarCambiosDeVuelo();
            this.lblCambiosAplicados.setText("Cambios aplicados");
        } else {
            this.lblCambiosAplicados.setText("Datos incorrectos");
        }
    }//GEN-LAST:event_btnAplicarCambiosActionPerformed

    private void btnCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCiudadesActionPerformed
        this.jPanelPrincipal.setVisible(false);
        cargarListaJListCiudades();
        this.jPanelCiudades.setVisible(true);
    }//GEN-LAST:event_btnCiudadesActionPerformed

    private void btnVolverDesdeCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverDesdeCiudadesActionPerformed
        this.jPanelCiudades.setVisible(false);
        cargarComboBoxCiudadOrigen();
        cargarComboBoxCiudadDestino();
        this.jPanelPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVolverDesdeCiudadesActionPerformed

    private void btnRegistrarNuevaCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevaCiudadActionPerformed
        this.jPanelCiudades.setVisible(false);
        this.jPanelRegistrarCiudad.setVisible(true);
    }//GEN-LAST:event_btnRegistrarNuevaCiudadActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Ciudad ciudadSeleccionada = ObtenerCiudadSeleccionada();
        if (ciudadSeleccionada != null) {
            if (JOptionPane.showConfirmDialog(this,
                    "¿Está seguro de que desea eliminar a la ciudad seleccionada?", "Confirmación",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                try {
                    volandoAlto.EliminarCiudad(ciudadSeleccionada);
                    this.cargarListaJListCiudades();
                    JOptionPane.showMessageDialog(this, "Ciudad eliminada", "OK",
                            JOptionPane.INFORMATION_MESSAGE);
                    cargarListaJListCiudades();
                } catch (IllegalStateException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe primero seleccionar una ciudad",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = (this.jTextFieldNombreCiudad.getText());
        if (!esVacio(nombre)) {
            if (StringUtils.isAlphaSpace(nombre)) {
                String gmtZonaHoraria = this.jComboBoxZonaHoraria.getSelectedItem().toString();
                try {
                    volandoAlto.RegistrarCiudad(nombre, gmtZonaHoraria);
                    JOptionPane.showMessageDialog(this, "Ciudad registrada"
                            + " con éxito", "OK", JOptionPane.INFORMATION_MESSAGE);
                    cargarListaJListCiudades();
                } catch (IllegalStateException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nombre inválido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe especificar un"
                    + " nombre para la ciudad a registrar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        this.jPanelRegistrarCiudad.setVisible(false);
        limpiarCamposjPanelRgistrarCiudad();
        cargarListaJListCiudades();
        this.jPanelCiudades.setVisible(true);
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnVolverDesdeAzafataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverDesdeAzafataActionPerformed
        this.jPanelListaMotivosAzafata.setVisible(false);
        this.jPanelPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVolverDesdeAzafataActionPerformed

    private void btnMotivosLlamadoAzafataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotivosLlamadoAzafataActionPerformed
        this.jPanelPrincipal.setVisible(false);
        cargarListaJListMotivos();
        this.jPanelListaMotivosAzafata.setVisible(true);
    }//GEN-LAST:event_btnMotivosLlamadoAzafataActionPerformed

    private void btnRegistrarNuevoMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoMotivoActionPerformed
        this.jPanelListaMotivosAzafata.setVisible(false);
        this.jPanelRegistrarMotivo.setVisible(true);
    }//GEN-LAST:event_btnRegistrarNuevoMotivoActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        String motivo = ObtenerMotivoSeleccionado();
        if (motivo != null) {
            if (JOptionPane.showConfirmDialog(this,
                    "¿Está seguro de que desea eliminar al motivo seleccionado?", "Confirmación",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                try {
                    volandoAlto.ElminarMotivo(motivo);
                    cargarListaJListMotivos();
                    JOptionPane.showMessageDialog(this, "Motivo eliminado", "Éxito",
                            JOptionPane.INFORMATION_MESSAGE);

                } catch (IllegalStateException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this.jPanelListaMotivosAzafata, "Debe seleccionar "
                    + "un motivo a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private String ObtenerMotivoSeleccionado() {
        return (String) this.jListMotivos.getSelectedValue();
    }
    private void btnVolverDesdeRegistrarMOtivoAzafataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverDesdeRegistrarMOtivoAzafataActionPerformed
        this.jPanelRegistrarMotivo.setVisible(false);
        this.jTextFieldNombreMotivo.setText("");
        cargarListaJListMotivos();
        this.jPanelListaMotivosAzafata.setVisible(true);
    }//GEN-LAST:event_btnVolverDesdeRegistrarMOtivoAzafataActionPerformed

    private void btnRegistrarMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMotivoActionPerformed
        String motivo = jTextFieldNombreMotivo.getText().trim();
        if (!motivo.isEmpty()) {
            if (StringUtils.isAlphaSpace(motivo)) {
                try {
                    volandoAlto.RegistrarMotivo(motivo);
                    JOptionPane.showMessageDialog(this, "Motivo registrado correctamente",
                            "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (IllegalStateException e) {
                    JOptionPane.showMessageDialog(this, "Motivo ya registrado",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El nombre indicado no puede contener numeros",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El nombre del motivo no puede ser vacío",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarMotivoActionPerformed

    private boolean datosValidos() {
        try {
            String horaLlegada = this.jSpinnerHoraLlegada.getValue().toString();
            String minutoLlegada = this.jSpinnerMinutoLlegada.getValue().toString();
            String horaSalida = this.jSpinnerHoraSalida.getValue().toString();
            String minutoSalida = this.jSpinnerMinutoSalida.getValue().toString();

            boolean valido = true;
            String capitan = this.txtCapitan.getText();
            String codigoDeVuelo = this.txtCodigoVuelo.getText();

            if (capitan.isEmpty() || capitan.length() > 25
                    || !StringUtils.isAlphaSpace(capitan)) {
                valido = false;
            } else if (codigoDeVuelo.isEmpty()
                    || codigoDeVuelo.length() > 10
                    || !StringUtils.isAlphanumeric(codigoDeVuelo)) {
                valido = false;
            } else if (this.cmbOrigen.getSelectedItem().
                    equals(this.cmbDestino.getSelectedItem())) {
                valido = false;
            } else if (horaLlegada.isEmpty()
                    || minutoLlegada.isEmpty()
                    || horaLlegada.length() > 2
                    || minutoLlegada.length() > 2
                    || !StringUtils.isNumeric(horaLlegada)
                    || !StringUtils.isNumeric(minutoLlegada)) {
                valido = false;
            } else if (horaSalida.isEmpty()
                    || minutoSalida.isEmpty()
                    || horaSalida.length() > 2
                    || minutoSalida.length() > 2
                    || !StringUtils.isNumeric(horaSalida)
                    || !StringUtils.isNumeric(minutoSalida)) {
                valido = false;
            }
            return valido;
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this,
                    "Registre ciudades antes de acceder a esta funcionalidad",
                    "Error", JOptionPane.ERROR_MESSAGE);
            for (String aux : ZoneId.getAvailableZoneIds()) {
                System.out.println(aux);
            }
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarCambios;
    private javax.swing.JButton btnCiudades;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnMotivosLlamadoAzafata;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarMotivo;
    private javax.swing.JButton btnRegistrarNuevaCiudad;
    private javax.swing.JButton btnRegistrarNuevoMotivo;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolverDesdeAzafata;
    private javax.swing.JButton btnVolverDesdeCiudades;
    private javax.swing.JButton btnVolverDesdeRegistrarMOtivoAzafata;
    private javax.swing.JCheckBox chkDemorado;
    private javax.swing.JComboBox cmbDestino;
    private javax.swing.JComboBox cmbOrigen;
    private javax.swing.JComboBox<String> jComboBoxZonaHoraria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<Object> jListCiudades;
    private javax.swing.JList<Object> jListMotivos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanelCiudades;
    private javax.swing.JPanel jPanelListaMotivosAzafata;
    private javax.swing.JPanel jPanelMantenimiento;
    private javax.swing.JPanel jPanelMenuPrincipalVentanaTripulacion;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelRegistrarCiudad;
    private javax.swing.JPanel jPanelRegistrarMotivo;
    private javax.swing.JPanel jPanelVuelo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSpinner jSpinnerHoraLlegada;
    private javax.swing.JSpinner jSpinnerHoraSalida;
    private javax.swing.JSpinner jSpinnerMinutoLlegada;
    private javax.swing.JSpinner jSpinnerMinutoSalida;
    private javax.swing.JTextField jTextFieldNombreCiudad;
    private javax.swing.JTextField jTextFieldNombreMotivo;
    private javax.swing.JLabel lblCambiosAplicados;
    private javax.swing.JTextField txtCapitan;
    private javax.swing.JTextField txtCodigoVuelo;
    // End of variables declaration//GEN-END:variables

    private void cargarListaJListCiudades() {
        this.jListCiudades.setListData(volandoAlto.getCiudades().toArray());
    }

    private Ciudad ObtenerCiudadSeleccionada() {
        return (Ciudad) this.jListCiudades.getSelectedValue();
    }

    private boolean esVacio(String texto) {
        return "".equals(texto.trim());
    }

    private void limpiarCamposjPanelRgistrarCiudad() {
        this.jTextFieldNombreCiudad.setText("");
    }

    private void cargarListaJListMotivos() {
        this.ventanaCliente.cargarComboBoxMotivosAzafata();
        this.jListMotivos.setListData(volandoAlto.getMotivosAzafata().toArray());
    }

    private void cargarComboBoxCiudadOrigen() {
        Object[] ArrayCiudades = volandoAlto.getCiudades().toArray();
        this.cmbOrigen.setModel(new DefaultComboBoxModel<>(ArrayCiudades));
    }

    private void cargarComboBoxCiudadDestino() {
        Object[] ArrayCiudades = volandoAlto.getCiudades().toArray();
        this.cmbDestino.setModel(new DefaultComboBoxModel<>(ArrayCiudades));
    }
}
