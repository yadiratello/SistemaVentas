package PRESENTACION;

import DATOS.Cconexion;
import NEGOCIO.ImagenFondo;
import java.awt.Frame;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
//import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class PRINCIPAL extends javax.swing.JFrame {

    public static String TipoUsuario = "";
    public static String codigoObtenido, nombreObtenido, apellidoObtenido;

    public PRINCIPAL() {
        initComponents();

        escritorio.setBorder(new ImagenFondo());
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        //obteniendo el codigo,nombre,apellido del empleado del acceso
        codigoObtenido = acceso.codigo;
        nombreObtenido = acceso.nombre_usu;
        apellidoObtenido = acceso.apellidos_usu;
        //--------------------
        try {
            //obteniendo el login
            TipoUsuario = acceso.txtlogin.getText();

            TipoUsuario = cambiarUsuario.txtlogin.getText();

        } catch (Exception ex) {
        }
    }

    public void CentrarVentanaInterna(JInternalFrame internalFrame) { //pasamos como parametro un objeto de tipo JinternalFrame
        int x = (escritorio.getWidth() / 2) - internalFrame.getWidth() / 2;  //caculas las posiciones x y y 
        int y = (escritorio.getHeight() / 2) - internalFrame.getHeight() / 2;
        if (internalFrame.isShowing()) {// comprobamos si la ventana ya esta ejecutada
            internalFrame.setLocation(x, y); // si es asi solo le colocamos en la mitad
        } else {
            escritorio.add(internalFrame); // si no es asi le insertamos dentro del desktoppane
            internalFrame.setLocation(x, y);
            internalFrame.show(); // y mostramos
        }
    }

    public void reporte(String cod) {
        try {
            Map parametro = new HashMap();
            parametro.clear();
            parametro.put("codigo", cod);

            JasperReport reporte = JasperCompileManager.compileReport("reporrte_empleados_seleccionado.jrxml");
            JasperPrint p = JasperFillManager.fillReport(reporte, parametro, DATOS.Cconexion.ObtenerConexion());
            JasperViewer view = new JasperViewer(p, false);
            view.setTitle("Reporte Empleado Seleccionado");
            view.setExtendedState(Frame.MAXIMIZED_BOTH);

            view.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error" + ex);
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemSesion = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        miUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miClientes = new javax.swing.JMenuItem();
        miCategoria = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmiReporteClientes = new javax.swing.JMenuItem();
        jmiReporteFactura = new javax.swing.JMenuItem();
        jmReporteiEmpleados = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Ventas");

        escritorio.setToolTipText("");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 867, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );

        jMenuBar1.setToolTipText("");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/txt-manila-icono-7504-32.png"))); // NOI18N
        jMenu1.setText("Archivo");

        itemSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/help_user1.png"))); // NOI18N
        itemSesion.setText("Sesión");
        itemSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSesionActionPerformed(evt);
            }
        });
        jMenu1.add(itemSesion);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salir 1.png"))); // NOI18N
        jMenuItem8.setText("Salir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/config.png"))); // NOI18N
        jMenu6.setText("Configuración");

        miUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        miUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/trabajadores.png"))); // NOI18N
        miUsuario.setText("Usuario");
        miUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuarioActionPerformed(evt);
            }
        });
        jMenu6.add(miUsuario);

        jMenuBar1.add(jMenu6);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vmware-icono-8170-32.png"))); // NOI18N
        jMenu2.setText("Mantenimientos");

        miClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        miClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/clientes1.png"))); // NOI18N
        miClientes.setText("Clientes");
        miClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClientesActionPerformed(evt);
            }
        });
        jMenu2.add(miClientes);

        miCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        miCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/kexi-icono-9345-32.png"))); // NOI18N
        miCategoria.setText("Categoria");
        miCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCategoriaActionPerformed(evt);
            }
        });
        jMenu2.add(miCategoria);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ventas_m.png"))); // NOI18N
        jMenuItem9.setText("Producto");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/proveedores.png"))); // NOI18N
        jMenuItem1.setText("Empleado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/coins_add.png"))); // NOI18N
        jMenu3.setText("Transacciones");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/equipos-de-tarea-asignada-icono-7668-32.png"))); // NOI18N
        jMenuItem3.setText("Factura");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/le-asigna-una-tarea-a-icono-4480-32.png"))); // NOI18N
        jMenuItem4.setText("Boleta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/consultas.png"))); // NOI18N
        jMenu4.setText("Consultas");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/autor1.png"))); // NOI18N
        jMenuItem2.setText("Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/productos_m.png"))); // NOI18N
        jMenuItem5.setText("Producto");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/clientes.png"))); // NOI18N
        jMenuItem10.setText("Empleados");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/report.png"))); // NOI18N
        jMenu5.setText("Reportes");

        jmiReporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/empleados_b.png"))); // NOI18N
        jmiReporteClientes.setText("Empleado_Seleccioando");
        jmiReporteClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReporteClientesActionPerformed(evt);
            }
        });
        jMenu5.add(jmiReporteClientes);

        jmiReporteFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ventasrealizadas.png"))); // NOI18N
        jmiReporteFactura.setText("Reporte de factura");
        jmiReporteFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReporteFacturaActionPerformed(evt);
            }
        });
        jMenu5.add(jmiReporteFactura);

        jmReporteiEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/proveedores.png"))); // NOI18N
        jmReporteiEmpleados.setText("Empleados");
        jmReporteiEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmReporteiEmpleadosActionPerformed(evt);
            }
        });
        jMenu5.add(jmReporteiEmpleados);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Ayuda.png"))); // NOI18N
        jMenu7.setText("Ayuda");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientesActionPerformed
        //instanciar
        clientes cli = new clientes();
        escritorio.add(cli);
        cli.show();

        CentrarVentanaInterna(cli);

    }//GEN-LAST:event_miClientesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ConsultaClientes ConsultaClientes = new ConsultaClientes();
        escritorio.add(ConsultaClientes);
        ConsultaClientes.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        factura factura = new factura();
        escritorio.add(factura);
        factura.show();
        CentrarVentanaInterna(factura);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        boleta bo = new boleta();
        escritorio.add(bo);
        bo.show();
        CentrarVentanaInterna(bo);
//        factura fac = new factura();
//        escritorio.add(pedido);
//        pedido.show();
//
//        CentrarVentanaInterna(pedido);


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ConsultaProducto produc = new ConsultaProducto();
        escritorio.add(produc);
        produc.show();
        produc.setVisible(true);
     
        CentrarVentanaInterna(produc);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jmiReporteClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReporteClientesActionPerformed
        String cod = JOptionPane.showInputDialog(this, "INGRESE CODIGO DEL EMPLEADO");
        reporte(cod);

//        reporte();
    }//GEN-LAST:event_jmiReporteClientesActionPerformed

    private void miCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCategoriaActionPerformed
        categoria ca = new categoria();
        escritorio.add(ca);
        ca.show();
        CentrarVentanaInterna(ca);
    }//GEN-LAST:event_miCategoriaActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        producto pro = new producto();
        escritorio.add(pro);
        pro.show();

        CentrarVentanaInterna(pro);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void itemSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSesionActionPerformed

        this.dispose();
        ventanaTarea vt = new ventanaTarea();
        vt.setVisible(true);

    }//GEN-LAST:event_itemSesionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        empleado emp = new empleado();
        escritorio.add(emp);
        emp.show();
        CentrarVentanaInterna(emp);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void miUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuarioActionPerformed
//        ventanaTarea vt = new ventanaTarea();
//        escritorio.add(vt);
//        vt.toFront();
//        vt.setVisible(true);
        //CentrarVentanaInterna(vt);
    }//GEN-LAST:event_miUsuarioActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        ConsultaEmpleados cemp = new ConsultaEmpleados();
        escritorio.add(cemp);
        cemp.show();
        CentrarVentanaInterna(cemp);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jmiReporteFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReporteFacturaActionPerformed
        ConsultaProductoxfecha cpf = new ConsultaProductoxfecha();
        escritorio.add(cpf);
        cpf.show();
    }//GEN-LAST:event_jmiReporteFacturaActionPerformed

    private void jmReporteiEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmReporteiEmpleadosActionPerformed
        try {
            Cconexion cc= new Cconexion();
            
            JasperReport reportes=JasperCompileManager.compileReport("reporrte_empleados.jrxml");
            JasperPrint print=JasperFillManager.fillReport(reportes, null,Cconexion.ObtenerConexion());
            JasperViewer.viewReport(print);
            
        } catch (JRException e) {
            System.out.printf(e.getMessage());
        }
    }//GEN-LAST:event_jmReporteiEmpleadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemSesion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jmReporteiEmpleados;
    private javax.swing.JMenuItem jmiReporteClientes;
    private javax.swing.JMenuItem jmiReporteFactura;
    private javax.swing.JMenuItem miCategoria;
    private javax.swing.JMenuItem miClientes;
    public static javax.swing.JMenuItem miUsuario;
    // End of variables declaration//GEN-END:variables

}
