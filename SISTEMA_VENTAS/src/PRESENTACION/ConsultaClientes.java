package PRESENTACION;

import NEGOCIO.Ccliente;
import java.awt.Color;
import java.awt.Graphics;

public class ConsultaClientes extends javax.swing.JInternalFrame {

    Ccliente cli = new Ccliente();

    public ConsultaClientes() {
        initComponents();
        cli.ListarCliente(tablaCOnsultarClientes);
        TotalRegistro();
    }

    //transparencia al jFrameInternal
    protected void paintComponent(Graphics g) {
    // Establecer color transparente 
        g.setColor(new Color(255, 255, 255, 64));
        g.fillRect(0, 0, getWidth(), getHeight());
    }
    //Transparencia alJFrameinternal

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFiltrar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCOnsultarClientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTotalRegistro = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta Clientes");

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

        tablaCOnsultarClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCOnsultarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCOnsultarClientesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaCOnsultarClientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCOnsultarClientes);

        jLabel2.setText("Total Registros:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTotalRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarKeyReleased
        cli.setApellidos_cli(this.txtFiltrar.getText() + "%");
        cli.BuscarCliente(this.tablaCOnsultarClientes);
    }//GEN-LAST:event_txtFiltrarKeyReleased

    private void tablaCOnsultarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCOnsultarClientesMouseClicked
//        //capturando el numero de fila seleccionada, el 1 registro es 0
//        int fila = this.tablaCOnsultarClientes.getSelectedRow();
//
//        if (fila >= 0) {
//            //capturando de la tabla de acuerdo a la fila y columna, toString pasa a cadena     
//            factura.idcli = this.tablaCOnsultarClientes.getValueAt(fila, 0).toString();
//            factura.txtCliente.setText(this.tablaCOnsultarClientes.getValueAt(fila, 1).toString() + " " + tablaCOnsultarClientes.getValueAt(fila, 2).toString());
//            factura.txtRUC.setText(this.tablaCOnsultarClientes.getValueAt(fila, 6).toString());
//            factura.txtDNI.setText(this.tablaCOnsultarClientes.getValueAt(fila, 5).toString());
//            factura.txtDireccion.setText(this.tablaCOnsultarClientes.getValueAt(fila, 3).toString());
//        }
    }//GEN-LAST:event_tablaCOnsultarClientesMouseClicked

    private void tablaCOnsultarClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCOnsultarClientesMousePressed
        // cuenta las veces que hago con el mouse
        if(evt.getClickCount() == 2){//si he hecho dos clicks en la fila de la tabla
            
            int fila = tablaCOnsultarClientes.getSelectedRow();//almacenando la fila seleccionada
            String cod, valor;
            
            factura.idcli = this.tablaCOnsultarClientes.getValueAt(fila, 0).toString();
            factura.txtCliente.setText(this.tablaCOnsultarClientes.getValueAt(fila, 1).toString() + " " + tablaCOnsultarClientes.getValueAt(fila, 2).toString());
            factura.txtRUC.setText(this.tablaCOnsultarClientes.getValueAt(fila, 6).toString());
            factura.txtDNI.setText(this.tablaCOnsultarClientes.getValueAt(fila, 5).toString());
            factura.txtDireccion.setText(this.tablaCOnsultarClientes.getValueAt(fila, 3).toString());
            
            this.dispose();//cerrar este form
        }
    }//GEN-LAST:event_tablaCOnsultarClientesMousePressed

    private void TotalRegistro() {
        //Contando el total de registros de la tabla clientes
        this.txtTotalRegistro.setText("" + tablaCOnsultarClientes.getRowCount());
        txtTotalRegistro.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCOnsultarClientes;
    private javax.swing.JTextField txtFiltrar;
    private javax.swing.JTextField txtTotalRegistro;
    // End of variables declaration//GEN-END:variables
}
