package PRESENTACION;

import NEGOCIO.Cdetalle;

import NEGOCIO.Cventa;
import static PRESENTACION.PRINCIPAL.escritorio;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.view.JasperViewer;



public class factura extends javax.swing.JInternalFrame {

    int contadorVentas = 0, contadorFactura = 0;

    Cventa venta = new Cventa();
    Cdetalle detalle = new Cdetalle();

    DefaultTableModel dtmVenta = new DefaultTableModel();
    double total = 0, total_pagar, cant, igv;

    //declaramos un contador para crear el numero
//    int cantFactura = 0;

    int anio, mes, dia;

    //variable para almacenar el codigo del empleado y del cliente
    String idemp;
    public static String idcli;

    
    public factura() {
        initComponents();
        //obteniendo el nombre y apellido 
        this.lblVendedor.setText(PRINCIPAL.nombreObtenido + " " + PRINCIPAL.apellidoObtenido);

        idemp = PRINCIPAL.codigoObtenido;

        dtmVenta.addColumn("Código");
        dtmVenta.addColumn("Detalle");
        dtmVenta.addColumn("Producto");
        dtmVenta.addColumn("Descripción");
        dtmVenta.addColumn("Marca");
        dtmVenta.addColumn("Precio");
        dtmVenta.addColumn("Cantidad");
        dtmVenta.addColumn("Importe");

        this.tablaVentas.setModel(dtmVenta);

        Calendar fecha = new GregorianCalendar();

        anio = fecha.get(Calendar.YEAR);
        mes = fecha.get(Calendar.MONTH) + 1;
        dia = fecha.get(Calendar.DAY_OF_MONTH);

        String FechaActual = "" + dia + "-" + mes + "-" + anio;

        lblFecha.setText(FechaActual);//mandando la fecha del sistema al labelFecha

        //---inicilializando a 0 
        txtTotal.setText("0.0");
        txtIGV.setText("0.0");
        txtNetoPagar.setText("0.0");

        //deshabilitar
        deshabilitar();

    }
    
    private void deshabilitar(){
        txtCodigoVenta.setEnabled(false);
        txtCliente.setEnabled(false);
        txtRUC.setEnabled(false);
        txtDNI.setEnabled(false);
        txtDireccion.setEnabled(false);
        
        txtTotal.setEditable(false);
        txtIGV.setEditable(false);
        txtNetoPagar.setEditable(false);
        
        btnGuardarFactura.setEnabled(false);
        btnBuscarProducto.setEnabled(false);
        btnBuscarCliente.setEnabled(false);
        btnNuevoCliente.setEnabled(false);
        btnEliminarProducto.setEnabled(false);
        btnGuardarVenta.setEnabled(false);

        btnCancelarVenta.setEnabled(false);
        btnCancelarFactura.setEnabled(false);
        btnEliminarVenta.setEnabled(false);
    }

    private void limpiar() {
        //limpiando cajas
        txtCodigoVenta.setText("");
        txtCliente.setText("");
        txtRUC.setText("");
        txtDNI.setText("");
        txtDireccion.setText("");

        lblNumeroFactura.setText("000000");
        txtTotal.setText("0.0");
        txtIGV.setText("0.0");
        txtNetoPagar.setText("0.0");

        //limpiando la tabla
        for (int i = 0; i < tablaVentas.getRowCount(); i++) {
            dtmVenta.removeRow(i);
            i -= 1;
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtRUC = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        btnNuevoCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnBuscarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnGuardarFactura = new javax.swing.JButton();
        btnEliminarVenta = new javax.swing.JButton();
        btnCancelarFactura = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();
        btnCancelarVenta = new javax.swing.JButton();
        btnGuardarVenta = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        txtNetoPagar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtIGV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lbltipo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNumeroFactura = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Sistema Ventas ");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel1.setText("Cliente:");

        jLabel2.setText("R.U.C :");

        jLabel3.setText("Dirección:");

        txtCliente.setEditable(false);
        txtCliente.setForeground(new java.awt.Color(0, 0, 153));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        txtRUC.setEditable(false);
        txtRUC.setForeground(new java.awt.Color(0, 0, 153));

        txtDireccion.setEditable(false);
        txtDireccion.setForeground(new java.awt.Color(0, 0, 153));

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Buscar_p.png"))); // NOI18N
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel16.setText("D.N.I. :");

        txtDNI.setEditable(false);
        txtDNI.setForeground(new java.awt.Color(0, 0, 153));

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/nuevo.png"))); // NOI18N
        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDNI))
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Buscar_p.png"))); // NOI18N
        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/eliminar.png"))); // NOI18N
        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaVentas);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        btnGuardarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/disco.png"))); // NOI18N
        btnGuardarFactura.setText("Guardar Factura");
        btnGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFacturaActionPerformed(evt);
            }
        });

        btnEliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/eliminar.png"))); // NOI18N
        btnEliminarVenta.setText("Eliminar Venta");
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });

        btnCancelarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Remove1.png"))); // NOI18N
        btnCancelarFactura.setText("Cancelar Factura");
        btnCancelarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFacturaActionPerformed(evt);
            }
        });

        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/nuevo.png"))); // NOI18N
        btnNuevaVenta.setText("Nueva Venta");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });

        btnCancelarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/error2.png"))); // NOI18N
        btnCancelarVenta.setText("Cancelar Venta");
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });

        btnGuardarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/disco.png"))); // NOI18N
        btnGuardarVenta.setText("Guardar Venta");
        btnGuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnNuevaVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarVenta)
                .addGap(11, 11, 11)
                .addComponent(btnCancelarVenta)
                .addGap(26, 26, 26)
                .addComponent(btnGuardarFactura)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarVenta)
                .addGap(23, 23, 23))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        txtTotal.setForeground(new java.awt.Color(0, 0, 153));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        txtNetoPagar.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setText("Neto a Pagar:");

        jLabel17.setText("I.G.V. :");

        txtIGV.setForeground(new java.awt.Color(0, 0, 153));
        txtIGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIGVActionPerformed(evt);
            }
        });

        jLabel7.setText("Total :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNetoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addComponent(txtIGV)))
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtIGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNetoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbltipo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbltipo.setText("Factura");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("N°");

        lblNumeroFactura.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblNumeroFactura.setForeground(new java.awt.Color(0, 0, 204));
        lblNumeroFactura.setText("000000");

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Vendedor(a):");

        lblVendedor.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lblVendedor.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hora:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha:");

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("jLabel15");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFecha)
                .addGap(120, 120, 120))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblVendedor)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(lblFecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel9.setText("Código Venta:");

        txtCodigoVenta.setEditable(false);
        txtCodigoVenta.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumeroFactura))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbltipo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lbltipo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroFactura)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        ConsultaClientes cc = new ConsultaClientes();
        escritorio.add(cc);
        cc.show();
        CentrarVentanaInterna(cc);
        btnBuscarProducto.setEnabled(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        clientes cli = new clientes();
        escritorio.add(cli);
        cli.show();
        CentrarVentanaInterna(cli);
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        //----------------------
        ConsultaProducto cp = new ConsultaProducto();
        escritorio.add(cp);
        cp.setVisible(true);

        this.btnEliminarProducto.setEnabled(true);
        this.btnGuardarVenta.setEnabled(true);
//        this.btnGuardarFactura
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed

        //indice de la fila seleccionada           
        int fila = tablaVentas.getSelectedRow();

        try {
            if (fila >= 0) {
                //eliminando de la tabla detalle
                String CodigoDetalle = (tablaVentas.getValueAt(fila, 1).toString());
                detalle.setIddetalle_venta(CodigoDetalle);
                detalle.eliminar_detalle();
                //-----------------------------

                //AUMENTAR EL STOCK DEL PRODUCTO 
                //ACTUALIZAR LA TABLA PRODUCTO
                String codigoProducto = (tablaVentas.getValueAt(fila, 0).toString());
                String cantidad = (tablaVentas.getValueAt(fila, 6).toString());

                detalle.setIdproducto(codigoProducto);
                detalle.setCantidad(Double.parseDouble(cantidad));
                detalle.AumentarStock();
                //--------------------------------------------------------------------------

                dtmVenta.removeRow(fila);
                for (int fil = 0; fil < tablaVentas.getRowCount(); fil++) {
                    total = total + Double.parseDouble(tablaVentas.getValueAt(fil, 7).toString()); // la columna 2 es la de costo.
                }

                igv = Math.rint(((total * 0.18) * 1000) / 1000);
                total_pagar = total + igv;

                txtTotal.setText("" + total);
                txtIGV.setText("" + igv);
                txtNetoPagar.setText("" + total_pagar);

                ///actualiza el total a cero
                total = 0;

            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un registro para eliminar");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }


    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void txtIGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIGVActionPerformed
    }//GEN-LAST:event_txtIGVActionPerformed

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        //limpiar
        this.limpiar();
        btnBuscarCliente.setEnabled(true);
        btnNuevoCliente.setEnabled(true);
        
        
        //obteniendo el total de registro 
        int TotalRegistro = Integer.parseInt(venta.ContarVentas());
        //sumando los registros
//        this.contadorVentas = TotalRegistro + 1;
        this.contadorVentas = ++TotalRegistro;
        //mostrando
        this.txtCodigoVenta.setText("VEN" + contadorVentas);

        //contando numero
//        contadorFactura = TotalRegistro + 1;
        contadorFactura = ++TotalRegistro;
        this.lblNumeroFactura.setText("FACT" + contadorFactura);

        //habilitar  
        btnGuardarFactura.setEnabled(true);
        btnNuevaVenta.setEnabled(false);
        btnCancelarVenta.setEnabled(true);
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
    }//GEN-LAST:event_txtClienteActionPerformed

    private void btnCancelarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFacturaActionPerformed

        if (this.txtCodigoVenta.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No hay registro de venta");
        } else {
            venta.setIdventa(this.txtCodigoVenta.getText());
            venta.eliminar_venta();

            limpiar();

            btnNuevaVenta.setEnabled(true);
            btnCancelarFactura.setEnabled(false);
            btnBuscarProducto.setEnabled(false);
        }
    }//GEN-LAST:event_btnCancelarFacturaActionPerformed

    private void btnGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFacturaActionPerformed

        if (txtCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No hay datos del cliente");
        } else {

//-------------guardando venta--------------//
            String GuardarFecha = "" + anio + "-" + mes + "-" + dia;

            //obteniendo los codigo
            String idventa = txtCodigoVenta.getText();
            String idcliente = idcli;
            String idempleado = idemp;
            String fecha = GuardarFecha;
            String tipo_doc = this.lbltipo.getText();
            String num_doc = this.lblNumeroFactura.getText();
            double total = Double.parseDouble(txtTotal.getText());
            double igv = Double.parseDouble(txtIGV.getText());
            double neto = Double.parseDouble(txtNetoPagar.getText());

            venta.setIdventa(idventa);
            venta.setIdcliente(idcliente);
            venta.setIdempleado(idempleado);
            venta.setFecha_venta(fecha);
            venta.setTipo_documento(tipo_doc);
            venta.setNum_documento(num_doc);
            venta.setTotal(total);
            venta.setIgv(igv);
            venta.setNeto(neto);

            venta.InsertarVenta();

            JOptionPane.showMessageDialog(null, "Venta Guardado");

            btnGuardarFactura.setEnabled(false);
            this.btnBuscarProducto.setEnabled(true);
            this.btnCancelarVenta.setEnabled(false);
            btnCancelarFactura.setEnabled(true);
        }


    }//GEN-LAST:event_btnGuardarFacturaActionPerformed

    private void btnGuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVentaActionPerformed
        //-------------guardando venta--------------//
        String GuardarFecha = "" + anio + "-" + mes + "-" + dia;

        //obteniendo los codigo
        String idventa = txtCodigoVenta.getText();
        String idcliente = idcli;
        String idempleado = idemp;
        String fecha = GuardarFecha;
        String tipo_doc = this.lbltipo.getText();
        String num_doc = this.lblNumeroFactura.getText();
        double total_v = Double.parseDouble(txtTotal.getText());
        double igv_v = Double.parseDouble(txtIGV.getText());
        double neto = Double.parseDouble(txtNetoPagar.getText());

        venta.setIdventa(idventa);
        venta.setIdcliente(idcliente);
        venta.setIdempleado(idempleado);
        venta.setFecha_venta(fecha);
        venta.setTipo_documento(tipo_doc);
        venta.setNum_documento(num_doc);
        venta.setTotal(total_v);
        venta.setIgv(igv_v);
        venta.setNeto(neto);

        venta.ActualizarVenta();

        JOptionPane.showMessageDialog(this, "Venta Guardado");

        this.btnBuscarProducto.setEnabled(false);
        this.btnGuardarVenta.setEnabled(false);
        this.btnNuevaVenta.setEnabled(true);
        this.btnEliminarVenta.setEnabled(true);

    }//GEN-LAST:event_btnGuardarVentaActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        limpiar();
        deshabilitar();
        btnNuevaVenta.setEnabled(true);
        btnCancelarVenta.setEnabled(false);
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        this.btnEliminarVenta.setEnabled(false);
        this.btnNuevaVenta.setEnabled(true);
        this.btnBuscarProducto.setEnabled(false);
        limpiar();
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelarFactura;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnGuardarFactura;
    private javax.swing.JButton btnGuardarVenta;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNumeroFactura;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JLabel lbltipo;
    public static javax.swing.JTable tablaVentas;
    public static javax.swing.JTextField txtCliente;
    public static javax.swing.JTextField txtCodigoVenta;
    public static javax.swing.JTextField txtDNI;
    public static javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtIGV;
    public static javax.swing.JTextField txtNetoPagar;
    public static javax.swing.JTextField txtRUC;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
