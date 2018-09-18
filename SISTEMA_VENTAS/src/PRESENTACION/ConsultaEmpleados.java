package PRESENTACION;

import NEGOCIO.Cempleado;
import java.awt.Frame;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.Map;
//import java.util.Set;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;




public class ConsultaEmpleados extends javax.swing.JInternalFrame {

    Cempleado emplead = new Cempleado();
    String dato;

    public ConsultaEmpleados() {
        initComponents();

        emplead.ListarEmpleado(TablaEmpleados);

    }

    public void reporte(String cod) {
        try {
            Map parametro = new HashMap();
            parametro.clear();
            parametro.put("codigo", cod);

            JasperReport reporte = JasperCompileManager.compileReport("report2.jrxml");
            JasperPrint p = JasperFillManager.fillReport(reporte, parametro, DATOS.Cconexion.ObtenerConexion());
            JasperViewer view = new JasperViewer(p, false);
            view.setTitle("Reporte Empleado Seleccionado");
            view.setExtendedState(Frame.MAXIMIZED_BOTH);

            view.setVisible(true);
        } catch (Exception ex) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFiltrar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTotalRegistro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTable();
        btnImprListaEmp = new javax.swing.JButton();
        btnImprimirSeleccionado = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta de Empleados");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setText("Filtrar:");

        txtFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltrarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Total Registros:");

        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEmpleados);

        btnImprListaEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/imprimir.png"))); // NOI18N
        btnImprListaEmp.setText("Imprimir Lista Empleados");
        btnImprListaEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprListaEmpActionPerformed(evt);
            }
        });

        btnImprimirSeleccionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/imprimir.png"))); // NOI18N
        btnImprimirSeleccionado.setText("Imprimir Seleccionado");
        btnImprimirSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirSeleccionadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(btnImprListaEmp)
                        .addGap(64, 64, 64)
                        .addComponent(btnImprimirSeleccionado))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnImprListaEmp)
                        .addComponent(btnImprimirSeleccionado)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtTotalRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarKeyReleased
        emplead.setApellidos_emp(this.txtFiltrar.getText() + "%");
        emplead.BuscarEmpleado(TablaEmpleados);
    }//GEN-LAST:event_txtFiltrarKeyReleased

    private void TablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadosMouseClicked

        //capturando el numero de fila seleccionada, el 1 registro es 0
        int fila = this.TablaEmpleados.getSelectedRow();

        if (fila >= 0) {

            dato = TablaEmpleados.getValueAt(fila, 0).toString();

//            //capturando de la tabla de acuerdo a la fila y columna, toString pasa a cadena
//
////            usuario.txtCodigo.setText(TablaEmpleados.getValueAt(fila, 0).toString()); 
////            usuario.txtNombres.setText(TablaEmpleados.getValueAt(fila, 1).toString());
////            usuario.txtApellidos.setText(TablaEmpleados.getValueAt(fila, 2).toString());
////            usuario.txtDNI.setText(TablaEmpleados.getValueAt(fila, 5).toString());
////            usuario.txtDireccion.setText(TablaEmpleados.getValueAt(fila, 3).toString());
////            usuario.txtTelefono.setText(TablaEmpleados.getValueAt(fila, 4).toString());
//            
        }

    }//GEN-LAST:event_TablaEmpleadosMouseClicked

    private void btnImprListaEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprListaEmpActionPerformed

        try {

            JasperReport reporte = JasperCompileManager.compileReport("reporte_empleados.jrxml");
            JasperPrint p = JasperFillManager.fillReport(reporte, null, DATOS.Cconexion.ObtenerConexion());
            JasperViewer view = new JasperViewer(p, false);
            view.setTitle("Reporte Empleado");
            view.setExtendedState(Frame.MAXIMIZED_BOTH);

            view.setVisible(true);
        } catch (Exception ex) {

        }


    }//GEN-LAST:event_btnImprListaEmpActionPerformed

    private void btnImprimirSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirSeleccionadoActionPerformed
        reporte(txtFiltrar.getText());
    }//GEN-LAST:event_btnImprimirSeleccionadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEmpleados;
    private javax.swing.JButton btnImprListaEmp;
    private javax.swing.JButton btnImprimirSeleccionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFiltrar;
    private javax.swing.JTextField txtTotalRegistro;
    // End of variables declaration//GEN-END:variables
}
