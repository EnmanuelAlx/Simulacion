/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author Jose Andres
 */
public class EstadisticasVista extends javax.swing.JPanel {

    /**
     * Creates new form EstadisticasVista
     */
    public EstadisticasVista() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cantClientesNoEsperaLabel = new javax.swing.JLabel();
        cantPromedioClientesColaLabel = new javax.swing.JLabel();
        cantPromedioClientesSistemaLabel = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        probEsperaLabel = new javax.swing.JLabel();
        utilizacionGeneralLabel = new javax.swing.JLabel();
        cantClientesNoAtendidosLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Resultados de la simulación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Costo promedio de espera: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 210, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Cantidad Cientes que no esperan:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 250, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Costo de cada servidor");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 170, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Probabilidad de esperar: ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 180, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Cantidad Promedio de clientes en cola: ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 290, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Cantidad Promedio de clientes en sistema: ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 320, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Utilizacion general: ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Tiempo promedio de un cliente en cola:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 300, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Tiempo promedio de un cliente en cola:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 300, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 20, 370));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Servidor", "Costo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 270, 100));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Servidor", "Porcentaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 270, 90));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("00");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 40, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Porcentaje de utilizacion de cada servidor");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 300, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Cantidad Clientes que se van sin ser atendidos: ");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 340, -1));

        cantClientesNoEsperaLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cantClientesNoEsperaLabel.setForeground(new java.awt.Color(102, 102, 102));
        cantClientesNoEsperaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cantClientesNoEsperaLabel.setText("00");
        add(cantClientesNoEsperaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 40, -1));

        cantPromedioClientesColaLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cantPromedioClientesColaLabel.setForeground(new java.awt.Color(102, 102, 102));
        cantPromedioClientesColaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cantPromedioClientesColaLabel.setText("00");
        add(cantPromedioClientesColaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 40, -1));

        cantPromedioClientesSistemaLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cantPromedioClientesSistemaLabel.setForeground(new java.awt.Color(102, 102, 102));
        cantPromedioClientesSistemaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cantPromedioClientesSistemaLabel.setText("00");
        add(cantPromedioClientesSistemaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 40, -1));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("00");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 40, -1));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("00");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 40, -1));

        probEsperaLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        probEsperaLabel.setForeground(new java.awt.Color(102, 102, 102));
        probEsperaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        probEsperaLabel.setText("00");
        add(probEsperaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 40, -1));

        utilizacionGeneralLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        utilizacionGeneralLabel.setForeground(new java.awt.Color(102, 102, 102));
        utilizacionGeneralLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        utilizacionGeneralLabel.setText("00");
        add(utilizacionGeneralLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 40, -1));

        cantClientesNoAtendidosLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cantClientesNoAtendidosLabel.setForeground(new java.awt.Color(102, 102, 102));
        cantClientesNoAtendidosLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cantClientesNoAtendidosLabel.setText("00");
        add(cantClientesNoAtendidosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 40, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel cantClientesNoAtendidosLabel;
    public static javax.swing.JLabel cantClientesNoEsperaLabel;
    public static javax.swing.JLabel cantPromedioClientesColaLabel;
    public static javax.swing.JLabel cantPromedioClientesSistemaLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public static javax.swing.JLabel probEsperaLabel;
    public javax.swing.JLabel utilizacionGeneralLabel;
    // End of variables declaration//GEN-END:variables
}
