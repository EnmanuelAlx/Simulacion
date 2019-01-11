/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilderFactory;
import simulacion.Servidor;
import simulacion.Simulacion;
import simulacion.Tiempo;
import java.io.File;
import java.io.FileReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import static vistas.InicioVista.mainPanel;

/**
 *
 * @author Jose Andres
 */
public class FormularioVista extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public FormularioVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unidadTiempoSelector = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tiempoServicioCantValores = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cantidadServidoresSelector = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tiempoServicioTabla = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        volverBoton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        continuarBoton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tiempoSimulacionTextField = new javax.swing.JTextField();
        costoServidorTextField = new javax.swing.JTextField();
        costoEsperaTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        clientesPermitidosSelector = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tiempoEntreLlegadasTabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unidadTiempoSelector.setBackground(new java.awt.Color(238, 238, 238));
        unidadTiempoSelector.setEditable(true);
        unidadTiempoSelector.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        unidadTiempoSelector.setForeground(new java.awt.Color(102, 102, 102));
        unidadTiempoSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segundos", "Minutos", "Horas", "Días", "Semanas", "Meses", "Años" }));
        unidadTiempoSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadTiempoSelectorActionPerformed(evt);
            }
        });
        add(unidadTiempoSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 250, 30));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Llene el Formulario");

        jButton1.setText("Cargar Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivo(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("1.- Selecciona la unidad de tiempo ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("9.- Tiempo de servicio y probabilidad");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 340, -1));

        tiempoServicioCantValores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tiempoServicioCantValores.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tiempoServicioCantValoresStateChanged(evt);
            }
        });
        tiempoServicioCantValores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tiempoServicioCantValoresMouseMoved(evt);
            }
        });
        tiempoServicioCantValores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiempoServicioCantValoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tiempoServicioCantValoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tiempoServicioCantValoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tiempoServicioCantValoresMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tiempoServicioCantValoresMouseReleased(evt);
            }
        });
        add(tiempoServicioCantValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 70, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("(Cantidad de valores)");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 160, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("4.- Cantidad de servidores");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 290, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("3.- Clientes permitidos en el sistema");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 290, -1));

        cantidadServidoresSelector.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cantidadServidoresSelector.setValue(2);
        add(cantidadServidoresSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 70, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Servidores");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 90, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("5.- Costo de cada servidor");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 290, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("moneda/servidor");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 130, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("6.- Costo de espera por cliente");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 290, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("moneda/servidor");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 130, 30));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 20, 370));

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("1.- Selecciona la unidad de tiempo ");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, -1));

        tiempoServicioTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Tiempo", "Probabilidad"
            }
        ));
        jScrollPane1.setViewportView(tiempoServicioTabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 310, 80));

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("2.- Tiempo total de simulacion");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 270, -1));

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Unidad Tiempo");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 120, 30));

        volverBoton.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Volver");

        javax.swing.GroupLayout volverBotonLayout = new javax.swing.GroupLayout(volverBoton);
        volverBoton.setLayout(volverBotonLayout);
        volverBotonLayout.setHorizontalGroup(
            volverBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volverBotonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        volverBotonLayout.setVerticalGroup(
            volverBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volverBotonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(volverBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 160, 50));

        continuarBoton.setBackground(new java.awt.Color(125, 202, 131));
        continuarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarSimulacion(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Continuar");

        javax.swing.GroupLayout continuarBotonLayout = new javax.swing.GroupLayout(continuarBoton);
        continuarBoton.setLayout(continuarBotonLayout);
        continuarBotonLayout.setHorizontalGroup(
            continuarBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(continuarBotonLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        continuarBotonLayout.setVerticalGroup(
            continuarBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(continuarBotonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(continuarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 160, 50));

        tiempoSimulacionTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tiempoSimulacionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoSimulacionTextFieldActionPerformed(evt);
            }
        });
        add(tiempoSimulacionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 70, 30));

        costoServidorTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        costoServidorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoServidorTextFieldActionPerformed(evt);
            }
        });
        add(costoServidorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 70, 30));
        add(costoEsperaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 70, 30));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("3.- Clientes permitidos en el sistema");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 290, -1));

        clientesPermitidosSelector.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clientesPermitidosSelector.setValue(2);
        add(clientesPermitidosSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 70, 30));

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Clientes");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 70, 20));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("7.- Tiempo de servicio para cada servidor");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 340, -1));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("8.- Tiempo de llegada y probabilidad");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 340, -1));

        tiempoEntreLlegadasTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Tiempo", "Probabilidad"
            }
        ));
        jScrollPane2.setViewportView(tiempoEntreLlegadasTabla);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 310, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void unidadTiempoSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadTiempoSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadTiempoSelectorActionPerformed
   
    
    private void iniciarSimulacion(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSimulacion
        int tiempoSimulacion = 6;
        int cantClientes = 0;
        int cantServidores = 0;
        int tablaEventos = 1;
        float costoEspera = 0;
        int cantValores;
        float costoServidor = 0;
        float tiempoTotal = 0;
        ArrayList<Tiempo> tiemposLlegada = new ArrayList<Tiempo>();
        ArrayList<Tiempo> tiemposServicios = new ArrayList<Tiempo>();
        ArrayList<Servidor> servidores = new ArrayList<Servidor>();

        
        
        
        switch ((String) this.unidadTiempoSelector.getModel().getSelectedItem()) {
            case "Segundos":
                tiempoSimulacion = 1;
                break;
            case "Minutos":  
                tiempoSimulacion = 2;
                break;
            case "Horas":  
                tiempoSimulacion = 3;
                break;
            case "Días": 
                tiempoSimulacion = 4;
                break;
            case "Semanas": 
                tiempoSimulacion = 5;
                break;
            case "Meses": 
                tiempoSimulacion = 6;
                break;
            case "Años": 
                tiempoSimulacion = 7;
                break;
        }
        
        try{
            tiempoTotal = Float.parseFloat(this.tiempoSimulacionTextField.getText());
            cantClientes = Integer.parseInt(this.cantidadServidoresSelector.getModel().getValue().toString());
            costoServidor = Float.parseFloat(this.costoServidorTextField.getText());
            costoEspera = Float.parseFloat(this.costoEsperaTextField.getText());
            cantServidores = Integer.parseInt(this.cantidadServidoresSelector.getModel().getValue().toString());
            
            for (int i = 0; i < cantServidores; i++) {
            Servidor servidor = new Servidor(true,costoServidor);
            servidores.add(servidor);
            }
            
           
        }catch(Exception e){
            System.err.println("ERRORR:  " + e );   
        }
        
        
        /*
            Lectura de tablas
        */
        cantValores = (int)this.tiempoServicioCantValores.getValue();
        int tiempo=0;
        float probabilidad=0;
        int min = 0;
        int max = 0;
        for(int i = 0; i < cantValores; i++){    
            tiempo = Integer.parseInt(this.tiempoEntreLlegadasTabla.getModel().getValueAt(i, 1).toString());
            probabilidad = Float.parseFloat(this.tiempoEntreLlegadasTabla.getModel().getValueAt(i, 2).toString());

            max += probabilidad*100;
            Tiempo tiempoLlegada = new Tiempo(tiempo, probabilidad, min, max-1);
            min +=probabilidad*100;
            
            tiemposLlegada.add(tiempoLlegada);
        }
        
        min = 0;
        max = 0;
        for(int i = 0; i < cantValores; i++){    
            tiempo = Integer.parseInt(this.tiempoServicioTabla.getModel().getValueAt(i, 1).toString());
            probabilidad = Float.parseFloat(this.tiempoServicioTabla.getModel().getValueAt(i, 2).toString());

            max += probabilidad*100;
            Tiempo tiempoServicio = new Tiempo(tiempo, probabilidad, min, max-1);
            min +=probabilidad*100;
            tiemposServicios.add(tiempoServicio);
        }
        
        
        
        
        
        
        Simulacion simulacion = new Simulacion(
            tiempoSimulacion,
            cantClientes,
            tiemposLlegada,
            tiemposServicios,
            costoServidor,
            costoEspera,
            tablaEventos,
            cantServidores,
            false,
            tiempoTotal, 
            servidores);
        
        simulacion.play();
        
        
        
        
        
    }//GEN-LAST:event_iniciarSimulacion

    private void tiempoSimulacionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoSimulacionTextFieldActionPerformed

    }//GEN-LAST:event_tiempoSimulacionTextFieldActionPerformed

    private void costoServidorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoServidorTextFieldActionPerformed

    }//GEN-LAST:event_costoServidorTextFieldActionPerformed

    private void cargarArchivo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivo
        
        try {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            String ruta = System.getProperty("user.dir");
            ruta = ruta + "/src/extras/formulario.txt";
            archivo = new File(ruta);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            DefaultTableModel tiempoServicioModel = (DefaultTableModel) this.tiempoServicioTabla.getModel();
            DefaultTableModel tiempoLlegadaModel = (DefaultTableModel) this.tiempoEntreLlegadasTabla.getModel();
            tiempoServicioModel.setRowCount(0);
            tiempoLlegadaModel.setRowCount(0);

         // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null){
                 
                String campoFormulario = linea.substring(0, linea.indexOf(":"));
                
                switch (campoFormulario){
                    
                    case "unidad de tiempo":
                        asignarUnidadTiempo(linea);
                        break;
                    case "tiempo de simulacion":
                        this.tiempoSimulacionTextField.setText(obtenerCampo(linea));
                        break;
                    case "cantidad de clientes":
                        this.clientesPermitidosSelector.getModel().setValue(Integer.parseInt(obtenerCampo(linea)));
                        break;
                    case "servidores":
                        this.cantidadServidoresSelector.getModel().setValue(Integer.parseInt(obtenerCampo(linea)));
                        break;
                    case "costo servidores":
                        this.costoServidorTextField.setText(obtenerCampo(linea));
                        break;
                    case "costo de espera":
                        this.costoEsperaTextField.setText(obtenerCampo(linea));
                        break;
                    case "llegada":
                        obtenerLlegada(linea);
                        break;
                    case "servicio":
                        obtenerTiempoServicio(linea);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Archivo invalido", "Error en el formato del archivo", JOptionPane.ERROR_MESSAGE);
                        break;
                }
                
                
            }
      }
      catch(Exception e){
         e.printStackTrace();
      }
        
    }//GEN-LAST:event_cargarArchivo

    private void tiempoServicioCantValoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoServicioCantValoresMouseClicked

    }//GEN-LAST:event_tiempoServicioCantValoresMouseClicked

    private void tiempoServicioCantValoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoServicioCantValoresMouseReleased

    }//GEN-LAST:event_tiempoServicioCantValoresMouseReleased

    private void tiempoServicioCantValoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoServicioCantValoresMousePressed

    }//GEN-LAST:event_tiempoServicioCantValoresMousePressed

    private void tiempoServicioCantValoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoServicioCantValoresMouseMoved

    }//GEN-LAST:event_tiempoServicioCantValoresMouseMoved

    private void tiempoServicioCantValoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoServicioCantValoresMouseExited
  
    }//GEN-LAST:event_tiempoServicioCantValoresMouseExited

    private void tiempoServicioCantValoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoServicioCantValoresMouseEntered

    }//GEN-LAST:event_tiempoServicioCantValoresMouseEntered

    private void tiempoServicioCantValoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tiempoServicioCantValoresStateChanged
       if(this.tiempoServicioCantValores.isVisible()){
           cambiarCantidadValores();
       }
       this.tiempoServicioCantValores.setVisible(true);
        
    }//GEN-LAST:event_tiempoServicioCantValoresStateChanged

    public String obtenerCampo(String linea){
        String campoValor;
        linea = linea.substring(linea.indexOf(":")+1);
        campoValor = linea.replaceAll(" ", "");
        return campoValor;
    }
    
    public void asignarUnidadTiempo(String unidad){
        unidad = obtenerCampo(unidad);
        unidad.toLowerCase();
        switch (unidad){
                    
                    case "segundos":
                        this.unidadTiempoSelector.getModel().setSelectedItem("Segundos");
                        break;
                        
                    case "minutos":
                        this.unidadTiempoSelector.getModel().setSelectedItem("Minutos");
                        break;
                        
                    case "horas":
                        this.unidadTiempoSelector.getModel().setSelectedItem("Horas");
                        break;
                    
                    case "dias":
                        this.unidadTiempoSelector.getModel().setSelectedItem("Dias");
                        break;
                   
                    case "semanas":
                        this.unidadTiempoSelector.getModel().setSelectedItem("Semanas");
                        break;
                    
                    case "meses":
                        this.unidadTiempoSelector.getModel().setSelectedItem("Meses");
                        break;
                    
                    case "años":
                        this.unidadTiempoSelector.getModel().setSelectedItem("Años");
                        break;
                }
    }
    
    public void obtenerLlegada(String linea){
        try{
            String campoValor = linea.replaceAll(" ", "");
            int tiempo = Integer.parseInt(campoValor.substring(15, campoValor.indexOf(",")));
            
            float probabilidad = Float.parseFloat(campoValor.substring(campoValor.indexOf("probabilidad:") +13));
            
            DefaultTableModel tiempoLlegadaModel = (DefaultTableModel) this.tiempoEntreLlegadasTabla.getModel();
            tiempoLlegadaModel.addRow(new Object[]{tiempoLlegadaModel.getRowCount() + 1, tiempo, probabilidad}); 
            this.tiempoServicioCantValores.setVisible(false);
            this.tiempoServicioCantValores.getModel().setValue(tiempoLlegadaModel.getRowCount());
            this.tiempoServicioCantValores.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Archivo invalido", "Error en el formato de tiempo", JOptionPane.ERROR_MESSAGE);
        }
             
    }
    
    public void obtenerTiempoServicio(String linea){
        try{
            String campoValor = linea.replaceAll(" ", "");
            int tiempo = Integer.parseInt(campoValor.substring(16, campoValor.indexOf(",")));
            
            float probabilidad = Float.parseFloat(campoValor.substring(campoValor.indexOf("probabilidad:") +13));
            
            DefaultTableModel tiempoServicioModel = (DefaultTableModel) this.tiempoServicioTabla.getModel();
            tiempoServicioModel.addRow(new Object[]{tiempoServicioModel.getRowCount() + 1, tiempo, probabilidad}); 
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Archivo invalido", "Error en el formato de tiempo servicio", JOptionPane.ERROR_MESSAGE);
        }
             
    }
    
    
    public void cambiarCantidadValores(){
        DefaultTableModel tiempoServicioModel = (DefaultTableModel) this.tiempoServicioTabla.getModel();
        DefaultTableModel tiempoLlegadaModel = (DefaultTableModel) this.tiempoEntreLlegadasTabla.getModel();

        int rowServicio = tiempoServicioModel.getRowCount();
        int rowLlegada = tiempoLlegadaModel.getRowCount();

        //Remove rows one by one from the end of the table
        for (int i = rowServicio - 1; i >= 0; i--){
            tiempoServicioModel.removeRow(i);
            tiempoLlegadaModel.removeRow(i);
        }
       
        
        int cantValores = (int)this.tiempoServicioCantValores.getValue();
        for (int i=0; i <cantValores; i++ ){
            tiempoServicioModel.addRow(new Object[]{i+1, "", ""});
            tiempoLlegadaModel.addRow(new Object[]{i+1, "", ""});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JSpinner cantidadServidoresSelector;
    public javax.swing.JSpinner clientesPermitidosSelector;
    public javax.swing.JPanel continuarBoton;
    public javax.swing.JTextField costoEsperaTextField;
    public javax.swing.JTextField costoServidorTextField;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable tiempoEntreLlegadasTabla;
    public javax.swing.JSpinner tiempoServicioCantValores;
    public javax.swing.JTable tiempoServicioTabla;
    private javax.swing.JTextField tiempoSimulacionTextField;
    public javax.swing.JComboBox<String> unidadTiempoSelector;
    public javax.swing.JPanel volverBoton;
    // End of variables declaration//GEN-END:variables
}
