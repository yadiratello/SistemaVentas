package PRESENTACION;

import NEGOCIO.Cdetalle;
import NEGOCIO.Cproducto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaProducto extends javax.swing.JInternalFrame {

    Cdetalle detalle = new Cdetalle();
    Cproducto product = new Cproducto();
    int contDetalle = 0;

    DefaultTableModel dtm;
    double suma = 0, igv = 0, neto = 0, subtotal = 0;

    
    public ConsultaProducto() {
        initComponents();
        product.ListarProducto(tablaProducto);
//        suma = Double.parseDouble(factura.txtTotal.getText());
        TotalRegistro();
    }
    
    
    private void TotalRegistro() {
        //Contando el total de registros de la tabla clientes
        this.lblTotalRegistros.setText("" + tablaProducto.getRowCount());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtConsultarProducto = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        lblCantidad_ConsultaProd = new javax.swing.JLabel();
        jpnCantidad = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        lblTotalRegistros = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta de Producto");

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaProductoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

        jLabel1.setText("Producto:");

        txtConsultarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultarProductoActionPerformed(evt);
            }
        });
        txtConsultarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarProductoKeyReleased(evt);
            }
        });

        btnAgregarProducto.setText("Agregar al detalle");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        lblCantidad_ConsultaProd.setText("Cantidad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(txtConsultarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblCantidad_ConsultaProd)
                .addGap(18, 18, 18)
                .addComponent(jpnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtConsultarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProducto)
                    .addComponent(lblCantidad_ConsultaProd)
                    .addComponent(jpnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel10.setText("Total Registro :");

        lblTotalRegistros.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalRegistros.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(lblTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 79, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblTotalRegistros))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaProductoKeyReleased
    }//GEN-LAST:event_tablaProductoKeyReleased

    private void txtConsultarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarProductoKeyReleased
        product.setNombre(this.txtConsultarProducto.getText() + "%");
        product.BuscarProducto(this.tablaProducto);
    }//GEN-LAST:event_txtConsultarProductoKeyReleased

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed

        //Codigo del Detalle      
        //obteniendo el total de registro 
        int TotalRegistro = Integer.parseInt(detalle.ContarDetalle());
        //sumando los registros
        this.contDetalle = TotalRegistro + 1;
        //guardando el codigo de detalle que le pasare al txtiddetalle de la tabla factura
        String CodigoDetalle = "DET" + contDetalle;

        int fila = tablaProducto.getSelectedRow();//capturando el indice de la fila seleccionada

        try {
            String codigo, detalle, producto, descripcion, marca, precio, cantidad, importe;

            if (fila == -1) {
                JOptionPane.showMessageDialog(this, "debe seleccionar un producto de la tabla");
            } 
            if (jpnCantidad.getValue().equals(0)) {
                JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una cantidad mayor a 0 para el producto");
                jpnCantidad.requestFocus();
                return;
            }
            else {
                //almacenando los datos d la fila en c/u de las variables
                //estos datos serán mostrados en los JTextFields del form Factura
                codigo = tablaProducto.getValueAt(fila, 0).toString();
                detalle = CodigoDetalle;
                producto = tablaProducto.getValueAt(fila, 2).toString();
                descripcion = tablaProducto.getValueAt(fila, 3).toString();
                marca = tablaProducto.getValueAt(fila, 1).toString();
                precio = tablaProducto.getValueAt(fila, 6).toString();
                cantidad = jpnCantidad.getValue().toString();
                

                //cálculos
                subtotal = (Double.parseDouble(precio)) * Integer.parseInt(cantidad);
                importe = "" + subtotal;

                suma = suma + subtotal;

                igv = Math.rint(((suma * 0.18) * 100) / 100);

                neto = (suma + igv);

                //crear arreglo 
                String registro[] = {codigo, detalle, producto, descripcion, marca, precio, cantidad, importe};

                //llenar la tabla venta del form factura
                dtm = (DefaultTableModel) factura.tablaVentas.getModel();
                dtm.addRow(registro);//al modelo añadele los titulos

                //obtener el total , igv y neto en la nota
                factura.txtTotal.setText("" + suma);
                factura.txtIGV.setText("" + igv);
                factura.txtNetoPagar.setText("" + neto);

                //GUARDAR EN LA TABLA DETALLE
                this.detalle.setIddetalle_venta(CodigoDetalle);
                this.detalle.setIdventa(factura.txtCodigoVenta.getText());
                this.detalle.setIdproducto(codigo);
                this.detalle.setCantidad(Double.parseDouble(cantidad));
                this.detalle.setPrecio_unitario(Double.parseDouble(precio));
                this.detalle.InsertarDetalle();

                //ACTUALIZAR LA TABLA PRODUCTO
                this.detalle.setIdproducto(codigo);
                this.detalle.setCantidad(Double.parseDouble(cantidad));
                this.detalle.DisminuirStock();

                //actualizar tabla producto
                product.ListarProducto(tablaProducto);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, title, fila, frameIcon);
        }


    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void txtConsultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultarProductoActionPerformed
        txtConsultarProducto.transferFocus();
    }//GEN-LAST:event_txtConsultarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAgregarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JSpinner jpnCantidad;
    public static javax.swing.JLabel lblCantidad_ConsultaProd;
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTextField txtConsultarProducto;
    // End of variables declaration//GEN-END:variables
}
