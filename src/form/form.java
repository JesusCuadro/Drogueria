
package form;

import conex.conex;
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

public final class form extends javax.swing.JFrame {

        conex con = new conex();
        Connection cn;
        Statement st;
        ResultSet rs;

        DefaultTableModel modeloLaboratorios;
        DefaultTableModel modeloMedicamentos;
        
        int IDMedicamentos;
        int IDLaboratorios;
        
        public form(){
            initComponents();
            setLocationRelativeTo(null);
            listarMedicamentos();
            listarLaboratorios();
        }
        
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIDMedicamentos = new javax.swing.JTextField();
        txtComercial = new javax.swing.JTextField();
        txtGenerico = new javax.swing.JTextField();
        txtConcentracion = new javax.swing.JTextField();
        txtLaboratorio_Medicamentos = new javax.swing.JTextField();
        txtLote = new javax.swing.JTextField();
        txtVencimiento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMedicamentos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIDLaboratorio = new javax.swing.JTextField();
        txtNomLaboratorio = new javax.swing.JTextField();
        txtNIT = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaLaboratorios = new javax.swing.JTable();
        btnAgregarMedicamento = new javax.swing.JButton();
        btnModificarMedicamento = new javax.swing.JButton();
        btnEliminarMedicamento = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAgregarLaboratorio = new javax.swing.JButton();
        btnEliminarLaboratorio = new javax.swing.JButton();
        btnModificarLaboratorio = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre Comercial:");

        jLabel3.setText("Nombre Generico:");

        jLabel4.setText("Concentracion:");

        jLabel5.setText("ID Laboratorio:");

        jLabel6.setText("Lote:");

        jLabel7.setText("Fecha de vencimiento:");

        txtIDMedicamentos.setEnabled(false);

        txtComercial.setText("Ingrese el nombre comercial");

        txtGenerico.setText("Ingrese el nombre generico");

        txtConcentracion.setText("Ingrese el nivel de concentracion");

        txtLaboratorio_Medicamentos.setText("Ingrese el ID del laboratorio");

        txtLote.setText("Ingrese el lote");

        txtVencimiento.setText("Ingrese la fecha de vencimiento");

        tablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom Comercial", "Nom Generico", "Concentracion", "Laboratorio", "Lote", "Fec Vencimiento"
            }
        ));
        tablaMedicamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaMedicamentos.setShowHorizontalLines(true);
        tablaMedicamentos.setShowVerticalLines(true);
        tablaMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaMedicamentos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtIDMedicamentos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtComercial))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtGenerico))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtConcentracion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtVencimiento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtLaboratorio_Medicamentos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtLote))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGenerico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtConcentracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLaboratorio_Medicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel8.setText("ID:");

        jLabel9.setText("Nombre:");

        jLabel10.setText("NIT:");

        txtIDLaboratorio.setEnabled(false);

        txtNomLaboratorio.setText("Ingrese el nombre del laboratorio");

        txtNIT.setText("Ingrese el NIT del laboratorio");

        tablaLaboratorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "NIT"
            }
        ));
        tablaLaboratorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLaboratoriosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaLaboratorios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtIDLaboratorio))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtNIT))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomLaboratorio)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIDLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );

        btnAgregarMedicamento.setBackground(new java.awt.Color(51, 255, 51));
        btnAgregarMedicamento.setText("Agregar Medicamento");
        btnAgregarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMedicamentoActionPerformed(evt);
            }
        });

        btnModificarMedicamento.setBackground(new java.awt.Color(255, 255, 0));
        btnModificarMedicamento.setText("Modificar Medicamento");
        btnModificarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMedicamentoActionPerformed(evt);
            }
        });

        btnEliminarMedicamento.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarMedicamento.setText("Eliminar Medicamento");
        btnEliminarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMedicamentoActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jesus\\Downloads\\img (Pequeño).jpg")); // NOI18N

        btnAgregarLaboratorio.setBackground(new java.awt.Color(102, 255, 0));
        btnAgregarLaboratorio.setText("Agregar Laboratorio");
        btnAgregarLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLaboratorioActionPerformed(evt);
            }
        });

        btnEliminarLaboratorio.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarLaboratorio.setText("Eliminar Laboratorio");
        btnEliminarLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLaboratorioActionPerformed(evt);
            }
        });

        btnModificarLaboratorio.setBackground(new java.awt.Color(255, 204, 51));
        btnModificarLaboratorio.setText("Modificar Laboratorio");
        btnModificarLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLaboratorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminarMedicamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarMedicamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(btnAgregarLaboratorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarLaboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnModificarMedicamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificarLaboratorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModificarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregarLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel11))
                                    .addComponent(btnModificarLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedicamentoActionPerformed
        agregarMedicamentos();
        listarMedicamentos();
        nuevo();
    }//GEN-LAST:event_btnAgregarMedicamentoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tablaMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMedicamentosMouseClicked
        int fila= tablaMedicamentos.getSelectedRow();
        if(fila==-1){
        JOptionPane.showMessageDialog(null, "Medicamento no seleccionado");
        }else{
            IDMedicamentos = Integer.parseInt((String)tablaMedicamentos.getValueAt(fila, 0).toString());
            String Nom_Comercial=(String)tablaMedicamentos.getValueAt(fila, 1);
            String Nom_Generico=(String)tablaMedicamentos.getValueAt(fila, 2);
            String Concentracion=(String)tablaMedicamentos.getValueAt(fila, 3);
            String Laboratorio=(String)tablaMedicamentos.getValueAt(fila, 4).toString();
            String Lote=(String)tablaMedicamentos.getValueAt(fila, 5).toString();
            String Fec_Vencimiento=(String)tablaMedicamentos.getValueAt(fila, 6);

            txtIDMedicamentos.setText(""+IDMedicamentos);
            txtComercial.setText(Nom_Comercial);
            txtGenerico.setText(Nom_Generico);
            txtConcentracion.setText(Concentracion);
            txtLaboratorio_Medicamentos.setText(Laboratorio);
            txtLote.setText(Lote);
            txtVencimiento.setText(Fec_Vencimiento);
        }
    }//GEN-LAST:event_tablaMedicamentosMouseClicked

    private void tablaLaboratoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLaboratoriosMouseClicked
        int fila= tablaLaboratorios.getSelectedRow();
        if(fila==-1){
        JOptionPane.showMessageDialog(null, "Laboratorio no seleccionado");
        }else{
            IDLaboratorios = Integer.parseInt((String)tablaLaboratorios.getValueAt(fila, 0).toString());
            String Nombre = (String)tablaLaboratorios.getValueAt(fila, 1);
            String NIT = (String)tablaLaboratorios.getValueAt(fila, 2).toString();

            txtIDLaboratorio.setText(""+IDLaboratorios);
            txtNomLaboratorio.setText(Nombre);
            txtNIT.setText(NIT);
        }
    }//GEN-LAST:event_tablaLaboratoriosMouseClicked

    private void btnAgregarLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLaboratorioActionPerformed
        agregarLaboratorios();
        listarLaboratorios();
        nuevo();
    }//GEN-LAST:event_btnAgregarLaboratorioActionPerformed

    private void btnModificarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMedicamentoActionPerformed
        modificarMedicamentos();
        listarMedicamentos();
        nuevo();
    }//GEN-LAST:event_btnModificarMedicamentoActionPerformed

    private void btnModificarLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLaboratorioActionPerformed
        modificarLaboratorios();
        listarLaboratorios();
        nuevo();
    }//GEN-LAST:event_btnModificarLaboratorioActionPerformed

    private void btnEliminarLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLaboratorioActionPerformed
        eliminarLaboratorios();
        listarLaboratorios();
        nuevo();
    }//GEN-LAST:event_btnEliminarLaboratorioActionPerformed

    private void btnEliminarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMedicamentoActionPerformed
        eliminarMedicamentos();
        listarMedicamentos();
        nuevo();
    }//GEN-LAST:event_btnEliminarMedicamentoActionPerformed
 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new form().setVisible(true);
        });
    }
    
    void listarMedicamentos(){
        String sql = "select * from medicamentos";
        try{
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]medicamento;
            medicamento = new Object[8];
            modeloMedicamentos = (DefaultTableModel)tablaMedicamentos.getModel();
            while(rs.next()){
                medicamento[0] = rs.getInt("ID");
                medicamento[1] = rs.getString("Nom Comercial");
                medicamento[2] = rs.getString("Nom Generico");
                medicamento[3] = rs.getString("Concentracion");
                medicamento[4] = rs.getInt("Laboratorio");
                medicamento[5] = rs.getInt("Lote");
                medicamento[6] = rs.getString("Fec Vencimiento");
                modeloMedicamentos.addRow(medicamento);
            }
            tablaMedicamentos.setModel(modeloMedicamentos);
        } catch(SQLException e){
            System.out.println("FATAL ERROR IN MEDICAMENTOS");
        }
                
    }
    
    void listarLaboratorios(){
        String sql = "select * from laboratorios";
        try{
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]laboratorio;
            laboratorio = new Object[4];
            modeloLaboratorios = (DefaultTableModel)tablaLaboratorios.getModel();
            while(rs.next()){
                laboratorio[0] = rs.getInt("ID");
                laboratorio[1] = rs.getString("Nombre");
                laboratorio[2] = rs.getInt("NIT");
                modeloLaboratorios.addRow(laboratorio);
            }
            tablaLaboratorios.setModel(modeloLaboratorios);
        } catch(SQLException e){
            System.out.println("FATAL ERROR IN LABORATORIOS");
        }
                
    }
    
    void agregarMedicamentos(){
        
        String Nom_Comercial;
            Nom_Comercial = txtComercial.getText();
        String Nom_Generico;
            Nom_Generico = txtGenerico.getText();
        String Concentracion;
            Concentracion = txtConcentracion.getText();
        String Laboratorio;
            Laboratorio = txtLaboratorio_Medicamentos.getText();
        String Lote;
            Lote = txtLote.getText();
        String Fec_Vencimiento;
            Fec_Vencimiento = txtVencimiento.getText();

        if ((Nom_Comercial.equals("")) || (Nom_Generico.equals("")) || (Concentracion.equals("")) || (Laboratorio.equals("")) || (Lote.equals("")) || (Fec_Vencimiento.equals(""))){
        JOptionPane.showMessageDialog(null, "Las cajas estan vacias............!");
        } else{
        String sql;
            sql = "INSERT INTO medicamentos (Nom Comercial,Nom Generico,Concentracion,Laboratorio,Lote,Fec Vencimiento) VALUES ('"+Nom_Comercial+"','"+Nom_Generico+"','"+Concentracion+"','"+Laboratorio+"','"+Lote+"','"+Fec_Vencimiento+"')";
        try{
            cn=con.getConnection();
            st=cn.createStatement();
            st.executeUpdate(sql);
            limpiarTablaMedicamentos();
            JOptionPane.showMessageDialog(null, "Medicamento agregado!!!");
        } catch(HeadlessException | SQLException e){
            System.out.println("ERROR IN AGREGAR MEDICAMENTOS");
        }
    }
}
    
    void agregarLaboratorios(){
        String Nombre = txtNomLaboratorio.getText();
        String NIT = txtNIT.getText();

        if ((Nombre.equals("")) || (NIT.equals(""))){
        JOptionPane.showMessageDialog(null, "Las cajas estan vacias............!!!");
        } else{
        String sql = "insert into laboratorios(Nombre, NIT) VALUES ('"+Nombre+"','"+NIT+"')";
        try{
            cn=con.getConnection();
            st=cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Laboratorio agregado!!!");
            limpiarTablaLaboratorios();
        } catch(HeadlessException | SQLException e){
            System.out.println("ERROR IN AGREGAR LABORATORIOS");
            }
        }
    }
    
    void modificarMedicamentos(){
        String Nom_Comercial = txtComercial.getText();
        String Nom_Generico = txtGenerico.getText();
        String Concentracion = txtConcentracion.getText();
        String Laboratorio = txtLaboratorio_Medicamentos.getText();
        String Lote = txtLote.getText();
        String Fec_Vencimiento = txtVencimiento.getText();
        
        String sql = "UPDATE medicamentos SET Nom Comercial = '"+Nom_Comercial+"', Nom Generico = '"+Nom_Generico+"', Concentracion = '"+Concentracion+"', Laboratorio = '"+Laboratorio+"', Lote = '"+Lote+"', Fec Vencimiento = '"+Fec_Vencimiento+"' where ID = "+IDMedicamentos;
        if((Nom_Comercial.equals("")) || (Nom_Generico.equals("")) || (Concentracion.equals("")) || (Laboratorio.equals("")) || (Lote.equals("")) || (Fec_Vencimiento.equals(""))){
            JOptionPane.showMessageDialog(null, "Debe ingresar un dato");
        } else {
            try{
                cn = con.getConnection();
                st=cn.createStatement();
                st.execute(sql);
                JOptionPane.showMessageDialog(null, "Medicamento actualizado!!!");
                limpiarTablaMedicamentos();
            } catch(HeadlessException | SQLException e){
            }
        }
}
    
    void modificarLaboratorios(){
        String Nombre = txtNomLaboratorio.getText();
        String NIT = txtNIT.getText();

            String sql;
            sql = "UPDATE laboratorios SET Nombre = '"+Nombre+"', NIT = '"+NIT+"' where ID = "+IDLaboratorios;
            if((Nombre.equals("")) || (NIT.equals(""))){
                JOptionPane.showMessageDialog(null, "Debe ingresar un dato");
            } else {
                try{
                    cn = con.getConnection();
                    st=cn.createStatement();
                    st.execute(sql);
                    JOptionPane.showMessageDialog(null, "Laboratorio actualizado!!!");
                    limpiarTablaLaboratorios();
                } catch(HeadlessException | SQLException e){
                }
            }
    }
    
    
        void limpiarTablaMedicamentos(){
        for(int i=0; i<tablaMedicamentos.getRowCount();i++){
            modeloMedicamentos.removeRow(i);
            i=i-1;
        }
    }
    
        void limpiarTablaLaboratorios(){
        for(int i=0; i<tablaLaboratorios.getRowCount();i++){
            modeloLaboratorios.removeRow(i);
            i=i-1;
        }
    }
    
    void eliminarMedicamentos(){
        int filaseleccionada = tablaMedicamentos.getSelectedRow();
        if(filaseleccionada==-1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            String sql = "delete from usuario where ID = " + IDMedicamentos;
            try{
                cn=con.getConnection();
                st=cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Medicamento eliminado exitosamente...");
                limpiarTablaMedicamentos();
            } catch(Exception e){}
            
        }
    }
    
        void eliminarLaboratorios(){
        int filaseleccionada = tablaLaboratorios.getSelectedRow();
        if(filaseleccionada==-1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            String sql = "delete from laboratorios where ID = " + IDLaboratorios;
            try{
                cn=con.getConnection();
                st=cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Laboratorio eliminado exitosamente...");
                limpiarTablaLaboratorios();
            } catch(HeadlessException | SQLException e){
                System.out.println("ERROR EN ELIMINAR");
            }
        }
    }
    
    void nuevo(){
        txtIDMedicamentos.setText("");
        txtComercial.setText("");
        txtGenerico.setText("");
        txtConcentracion.setText("");
        txtLaboratorio_Medicamentos.setText("");
        txtLote.setText("");
        txtVencimiento.setText("");
        
        txtIDLaboratorio.setText("");
        txtNomLaboratorio.setText("");
        txtNIT.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLaboratorio;
    private javax.swing.JButton btnAgregarMedicamento;
    private javax.swing.JButton btnEliminarLaboratorio;
    private javax.swing.JButton btnEliminarMedicamento;
    private javax.swing.JButton btnModificarLaboratorio;
    private javax.swing.JButton btnModificarMedicamento;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaLaboratorios;
    private javax.swing.JTable tablaMedicamentos;
    private javax.swing.JTextField txtComercial;
    private javax.swing.JTextField txtConcentracion;
    private javax.swing.JTextField txtGenerico;
    private javax.swing.JTextField txtIDLaboratorio;
    private javax.swing.JTextField txtIDMedicamentos;
    private javax.swing.JTextField txtLaboratorio_Medicamentos;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNomLaboratorio;
    private javax.swing.JTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables
}
