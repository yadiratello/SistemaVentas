package PRESENTACION;

import NEGOCIO.Cempleado;
import static PRESENTACION.acceso.apellidos_usu;
import static PRESENTACION.acceso.codigo;
import static PRESENTACION.acceso.nombre_usu;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cambiarUsuario extends javax.swing.JFrame {

    Cempleado empleado = new Cempleado();
    int intentos = 0;
    PRINCIPAL principal = new PRINCIPAL();

    public cambiarUsuario() {
        initComponents();
        llenarCombo();        

        txtlogin.setText("Escriba el Usuario");

        cargarImagen();

    }
    
    private void llenarCombo(){
        cbousuario.addItem("Seleccione...");
        cbousuario.addItem("Administrador");
        cbousuario.addItem("Vendedor");
        cbousuario.addItem("Vendedora");
        cbousuario.addItem("Asistente");
    }

    void cargarImagen() {
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("../IMAGENES/sesion.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        cbousuario = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcontrasenia = new javax.swing.JPasswordField();
        lblIngresar = new javax.swing.JLabel();
        lblREgresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuario2.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(216, 440));

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/apagar.png"))); // NOI18N
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");

        txtlogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtlogin.setSelectionEnd(1);
        txtlogin.setSelectionStart(1);
        txtlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtloginMouseClicked(evt);
            }
        });
        txtlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtloginKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtloginKeyTyped(evt);
            }
        });

        cbousuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbousuarioActionPerformed(evt);
            }
        });
        cbousuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbousuarioKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de Usuario:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");

        txtcontrasenia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcontrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontraseniaKeyPressed(evt);
            }
        });

        lblIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/boton-ingresar 2.png"))); // NOI18N
        lblIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIngresarMouseClicked(evt);
            }
        });

        lblREgresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/atras.png"))); // NOI18N
        lblREgresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblREgresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblREgresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtcontrasenia)
                            .addComponent(cbousuario, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtlogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(lblIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(288, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblREgresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblREgresar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 197, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(cbousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcontrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(lblIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void txtloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtloginMouseClicked

        txtlogin.setText("");

    }//GEN-LAST:event_txtloginMouseClicked

    private void txtloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtloginKeyPressed

    }//GEN-LAST:event_txtloginKeyPressed

    private void txtloginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtloginKeyTyped

    }//GEN-LAST:event_txtloginKeyTyped

    private void cbousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbousuarioActionPerformed

    }//GEN-LAST:event_cbousuarioActionPerformed

    private void cbousuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbousuarioKeyPressed

    }//GEN-LAST:event_cbousuarioKeyPressed

    private void txtcontraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseniaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            //CAPTURANDO LOS DATOS DE LAS CAJAS
            String nombre = txtlogin.getText();
            String usuario = cbousuario.getSelectedItem().toString();
            String clave = txtcontrasenia.getText();

            //ENVIANDO DATOS A LAS PROPIEDADES
            empleado.setLogin_emp(nombre);
            empleado.setTipo_emp(usuario);
            empleado.setContrasenia_emp(clave);

            //CAPTURANDO LOS RESULTADOS
            String nom = empleado.BuscarLogin(nombre);
            String tip = empleado.BuscarTipo(nombre, usuario);
            String cla = empleado.BuscarContrasenia(nombre, usuario, clave);

            //obteniendo el codigo, nombre y apellidos del empleado
            codigo = empleado.BuscarCodigo(nombre);
            nombre_usu = empleado.BuscarNombres(nombre);
            apellidos_usu = empleado.BuscarApellidos(nombre);
            //---------------------------------
            if (nombre.equals(nom)) {
                if (usuario.equals(tip)) {
                    if (clave.equals(cla)) {
                        int t = this.cbousuario.getSelectedIndex();

                        switch (t) {
                            case 1: {
                                JOptionPane.showMessageDialog(this, "Bienvenido al sistema" + " " + nombre,
                                        "Sistema de Ingreso", JOptionPane.INFORMATION_MESSAGE);
                                PRINCIPAL pri = new PRINCIPAL();
                                pri.setVisible(true);
                                dispose();
                            }
                            break;

                            case 2: {
                                JOptionPane.showMessageDialog(this, "Bienvenido al sistema" + " " + nombre,
                                        "Sistema de Ingreso", JOptionPane.INFORMATION_MESSAGE);
                                PRINCIPAL pri = new PRINCIPAL();
                                PRINCIPAL.miUsuario.setEnabled(false);
                                pri.setVisible(true);

                                dispose();
                            }
                            break;

                            case 3: {
                                JOptionPane.showMessageDialog(this, "Bienvenido al sistema" + " " + nombre,
                                        "Sistema de Ingreso", JOptionPane.INFORMATION_MESSAGE);
                                PRINCIPAL pri = new PRINCIPAL();
                                PRINCIPAL.miUsuario.setEnabled(false);
                                pri.setVisible(true);
                                dispose();
                            }
                            break;

                            case 4: {
                                JOptionPane.showMessageDialog(this, "Bienvenido al sistema" + " " + nombre,
                                        "Sistema de Ingreso", JOptionPane.INFORMATION_MESSAGE);
                                PRINCIPAL pri = new PRINCIPAL();
                                pri.setVisible(true);
                                dispose();
                            }
                            break;

                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "ingrese bien la clave", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);

                        this.txtcontrasenia.setText("");
                        this.txtcontrasenia.requestFocus();
                        intentos++;
                        JOptionPane.showMessageDialog(this, intentos + " Intento", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);

                        if (intentos == 3) {
                            JOptionPane.showMessageDialog(this, "Último Intento, Intruso", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);
                            dispose();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese el tipo correcto");
                    this.txtlogin.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese el nombre correcto");
                this.cbousuario.requestFocus();
            }

        }

    }//GEN-LAST:event_txtcontraseniaKeyPressed

    private void lblIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseClicked

        //CAPTURANDO LOS DATOS DE LAS CAJAS
        String nombre = txtlogin.getText();
        String usuario = cbousuario.getSelectedItem().toString();
        String clave = txtcontrasenia.getText();

        //ENVIANDO DATOS A LAS PROPIEDADES
        //ENVIANDO DATOS A LAS PROPIEDADES
        empleado.setLogin_emp(nombre);
        empleado.setTipo_emp(usuario);
        empleado.setContrasenia_emp(clave);

        //CAPTURANDO LOS RESULTADOS
        String nom = empleado.BuscarLogin(nombre);
        String tip = empleado.BuscarTipo(nombre, usuario);
        String cla = empleado.BuscarContrasenia(nombre, usuario, clave);

        //obteniendo el codigo, nombre y apellidos del empleado
        codigo = empleado.BuscarCodigo(nombre);
        nombre_usu = empleado.BuscarNombres(nombre);
        apellidos_usu = empleado.BuscarApellidos(nombre);
        //---------------------------------
        if (nombre.equals(nom)) {
            if (usuario.equals(tip)) {
                if (clave.equals(cla)) {
                    int t = this.cbousuario.getSelectedIndex();

                    switch (t) {
                        case 1: {
                            JOptionPane.showMessageDialog(this, "Bienvenido al sistema" + " " + nombre,
                                    "Sistema de Ingreso", JOptionPane.INFORMATION_MESSAGE);
                            PRINCIPAL pri = new PRINCIPAL();
                            pri.setVisible(true);
                            dispose();
                        }
                        break;

                        case 2: {
                            JOptionPane.showMessageDialog(this, "Bienvenido al sistema" + " " + nombre,
                                    "Sistema de Ingreso", JOptionPane.INFORMATION_MESSAGE);
                            PRINCIPAL pri = new PRINCIPAL();
                            PRINCIPAL.miUsuario.setEnabled(false);
                            pri.setVisible(true);

                            dispose();
                        }
                        break;

                        case 3: {
                            JOptionPane.showMessageDialog(this, "Bienvenido al sistema" + " " + nombre,
                                    "Sistema de Ingreso", JOptionPane.INFORMATION_MESSAGE);
                            PRINCIPAL pri = new PRINCIPAL();
                            PRINCIPAL.miUsuario.setEnabled(false);
                            pri.setVisible(true);
                            dispose();
                        }
                        break;

                        case 4: {
                            JOptionPane.showMessageDialog(this, "Bienvenido al sistema" + " " + nombre,
                                    "Sistema de Ingreso", JOptionPane.INFORMATION_MESSAGE);
                            PRINCIPAL pri = new PRINCIPAL();
                            pri.setVisible(true);
                            dispose();
                        }
                        break;

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "ingrese bien la clave", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);

                    this.txtcontrasenia.setText("");
                    this.txtcontrasenia.requestFocus();
                    intentos++;
                    JOptionPane.showMessageDialog(this, intentos + " Intento", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);

                    if (intentos == 3) {
                        JOptionPane.showMessageDialog(this, "Último Intento, Intruso", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);
                        dispose();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese el tipo correcto");
                this.txtlogin.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre correcto");
            this.cbousuario.requestFocus();
        }


    }//GEN-LAST:event_lblIngresarMouseClicked

    private void lblREgresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblREgresarMouseClicked
        ventanaTarea vt = new ventanaTarea();
        vt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblREgresarMouseClicked

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
            java.util.logging.Logger.getLogger(cambiarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cambiarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cambiarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cambiarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cambiarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbousuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblREgresar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPasswordField txtcontrasenia;
    public static javax.swing.JTextField txtlogin;
    // End of variables declaration//GEN-END:variables
}
