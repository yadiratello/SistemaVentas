package PRESENTACION;

import NEGOCIO.Cempleado;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class acceso extends javax.swing.JFrame {

    int ti = 0;

    Cempleado ce = new Cempleado();

    public static String codigo, nombre_usu, apellidos_usu;

    public acceso() {
        initComponents();

        this.cbousuario.addItem("Seleccione...");
        this.cbousuario.addItem("Administrador");
        this.cbousuario.addItem("Vendedor");
        this.cbousuario.addItem("Vendedora");
        this.cbousuario.addItem("Asistente");


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        cbousuario = new javax.swing.JComboBox();
        txtcontrasenia = new javax.swing.JPasswordField();
        btningresar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de Usuario:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");

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

        txtcontrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontraseniaKeyPressed(evt);
            }
        });

        btningresar.setText("Ingresar");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(txtcontrasenia))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbousuario, 0, 164, Short.MAX_VALUE)
                                    .addComponent(txtlogin))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btningresar)
                        .addGap(41, 41, 41)
                        .addComponent(btnsalir)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalir)
                    .addComponent(btningresar))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/acceso.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtloginKeyPressed

//        nombre=txtnombre.getText();
//        
//        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
//        {
//                if (nombre.equals("ricardo"))
//                            {
//                            cbousuario.enable(true);
//                            cbousuario.requestFocus();
//                            }
//                else
//                {
//                JOptionPane.showMessageDialog(this,"Ingrese el nombre correcto");
//                this.txtnombre.setText("");
//                this.txtnombre.requestFocus();
//                
//                }
//        }
//        
    }//GEN-LAST:event_txtloginKeyPressed

    private void txtloginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtloginKeyTyped

        String s1=""+(evt.getKeyChar());
        
        if(s1.matches("[0-9]"))
        {
        evt.consume();
        }

    }//GEN-LAST:event_txtloginKeyTyped

    private void cbousuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbousuarioKeyPressed

//        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
//        {
//            txtclave.setEditable(true);
//            txtclave.requestFocus();
//               
//        }

    }//GEN-LAST:event_cbousuarioKeyPressed

    private void txtcontraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseniaKeyPressed
//
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            //CAPTURANDO LOS DATOS DE LAS CAJAS
//            String nombre = txtlogin.getText();
//            String usuario = cbousuario.getSelectedItem().toString();
//            String clave = txtcontrasenia.getText();
//
//            //ENVIANDO DATOS A LAS PROPIEDADES
//            ce.setLogin_emp(nombre);
//            ce.setTipo_emp(usuario);
//            ce.setContrasenia_emp(clave);
//
//            //CAPTURANDO LOS RESULTADOS
//            String nom = ce.BuscarLogin(nombre);
//            String tip = ce.BuscarTipo(nombre, usuario);
//            String cla = ce.BuscarContrasenia(nombre, usuario, clave);
//
//            //obteniendo el codigo, nombre y apellidos del empleado
//            codigo = ce.BuscarCodigo(nombre);
//            nombre_usu = ce.BuscarNombres(nombre);
//            apellidos_usu = ce.BuscarApellidos(nombre);
//            //---------------------------------
//            if (nombre.equals(nom)) {
//                if (usuario.equals(tip)) {
//                    if (clave.equals(cla)) {
//                        int t = this.cbousuario.getSelectedIndex();
//
//                        switch (t) {
//                            case 1: {
//                                JOptionPane.showMessageDialog(this, "Bienvenido al sistema" + " " + nombre,
//                                        "Sistema de Ingreso", JOptionPane.INFORMATION_MESSAGE);
//                                PRINCIPAL pri = new PRINCIPAL();
//                                pri.setVisible(true);
//                                dispose();
//                            }
//                            break;
//
//                            case 2: {
//                                JOptionPane.showMessageDialog(this, "Bienvenido al sistema" + " " + nombre,
//                                        "Sistema de Ingreso", JOptionPane.INFORMATION_MESSAGE);
//                                PRINCIPAL pri = new PRINCIPAL();
//                                PRINCIPAL.miUsuario.setEnabled(false);
//                                pri.setVisible(true);
//
//                                dispose();
//                            }
//                            break;
//
//                            case 3: {
//                                JOptionPane.showMessageDialog(this, "Bienvenido al sistema" + " " + nombre,
//                                        "Sistema de Ingreso", JOptionPane.INFORMATION_MESSAGE);
//                                PRINCIPAL pri = new PRINCIPAL();
//                                PRINCIPAL.miUsuario.setEnabled(false);
//                                pri.setVisible(true);
//                                dispose();
//                            }
//                            break;
//
//                            case 4: {
//                                JOptionPane.showMessageDialog(this, "Bienvenido al sistema" + " " + nombre,
//                                        "Sistema de Ingreso", JOptionPane.INFORMATION_MESSAGE);
//                                PRINCIPAL pri = new PRINCIPAL();
//                                pri.setVisible(true);
//                                dispose();
//                            }
//                            break;
//
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(this, "ingre bien la clave", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);
//
//                        this.txtcontrasenia.setText("");
//                        this.txtcontrasenia.requestFocus();
//                        ti++;
//                        JOptionPane.showMessageDialog(this, ti + " Intento", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);
//
//                        if (ti == 3) {
//                            JOptionPane.showMessageDialog(this, "Último Intento, Intruso", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);
//                            dispose();
//                        }
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(this, "Ingrese el tipo correcto");
//                    this.txtlogin.requestFocus();
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Ingrese el nombre correcto");
//                this.cbousuario.requestFocus();
//            }
//
//        }

    }//GEN-LAST:event_txtcontraseniaKeyPressed

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed

        //CAPTURANDO LOS DATOS DE LAS CAJAS
        String nombre = txtlogin.getText();
        String usuario = cbousuario.getSelectedItem().toString();
        String clave = txtcontrasenia.getText();

        //ENVIANDO DATOS A LAS PROPIEDADES
        ce.setLogin_emp(nombre);
        ce.setTipo_emp(usuario);
        ce.setContrasenia_emp(clave);

        //CAPTURANDO LOS RESULTADOS
        String nom = ce.BuscarLogin(nombre);
        String tip = ce.BuscarTipo(nombre, usuario);
        String cla = ce.BuscarContrasenia(nombre, usuario, clave);

        //obteniendo el codigo, nombre y apellidos del empleado
        codigo = ce.BuscarLogin(nombre);
        nombre_usu = ce.BuscarTipo(nombre, usuario);
        apellidos_usu = ce.BuscarContrasenia(nombre, usuario, clave);
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
                    JOptionPane.showMessageDialog(this, "ingre bien la clave", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);

                    this.txtcontrasenia.setText("");
                    this.txtcontrasenia.requestFocus();
                    ti++;
                    JOptionPane.showMessageDialog(this, ti + " Intento", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);

                    if (ti == 3) {
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


    }//GEN-LAST:event_btningresarActionPerformed

    private void txtloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtloginMouseClicked

    }//GEN-LAST:event_txtloginMouseClicked

    private void cbousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbousuarioActionPerformed

    }//GEN-LAST:event_cbousuarioActionPerformed

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
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox cbousuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtcontrasenia;
    public static javax.swing.JTextField txtlogin;
    // End of variables declaration//GEN-END:variables
}
