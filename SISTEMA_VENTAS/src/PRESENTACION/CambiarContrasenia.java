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

public class CambiarContrasenia extends javax.swing.JFrame {

    Cempleado empleado = new Cempleado();
    private int intentos = 0;

    PRINCIPAL principal = new PRINCIPAL();

    public CambiarContrasenia() {
        initComponents();

        

        this.txtlogin.setText("Escriba el Usuario");

        cargarImagen();

    }

    private void llenarCombo(){
        this.cbousuario.addItem("Seleccione...");
        this.cbousuario.addItem("Administrador");
        this.cbousuario.addItem("Vendedor");
        this.cbousuario.addItem("Vendedora");
        this.cbousuario.addItem("Asistente");
    }
    
    private void cargarImagen() {
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("../IMAGENES/contra2.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

    }

    private void limpiar() {
        this.txtlogin.setText("");
        this.txtcontrasenia.setText("");
        this.cbousuario.setSelectedIndex(0);
        this.txtNuevaContrasenia.setText("");
        this.txtConfirmarContrasenia.setText("");
        this.txtlogin.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcontrasenia = new javax.swing.JPasswordField();
        lblActualizar = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNuevaContrasenia = new javax.swing.JPasswordField();
        txtConfirmarContrasenia = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        cbousuario = new javax.swing.JComboBox();

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
        txtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar Contraseña:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");

        txtcontrasenia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcontrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseniaActionPerformed(evt);
            }
        });
        txtcontrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontraseniaKeyPressed(evt);
            }
        });

        lblActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/actualizar.png"))); // NOI18N
        lblActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarMouseClicked(evt);
            }
        });

        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/atras.png"))); // NOI18N
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nueva Contraseña:");

        txtNuevaContrasenia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNuevaContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevaContraseniaActionPerformed(evt);
            }
        });
        txtNuevaContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNuevaContraseniaKeyPressed(evt);
            }
        });

        txtConfirmarContrasenia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtConfirmarContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmarContraseniaKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de Usuario:");

        cbousuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbousuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(lblActualizar))
                                    .addComponent(txtNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcontrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(379, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblActualizar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcontrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(175, 175, 175))
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

    private void txtcontraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseniaKeyPressed
    }//GEN-LAST:event_txtcontraseniaKeyPressed

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked

        //creando variable boolean, guarda true o false       
        boolean verificar;
        //verificando cada caja si tiene datos
        verificar = txtNuevaContrasenia.getText().equals("") || txtConfirmarContrasenia.getText().equals("");
        //capturando los datos de la caja        
        String nombre = txtlogin.getText();
        String usuario = cbousuario.getSelectedItem().toString();
        String clave = txtcontrasenia.getText();

        String nclave = this.txtNuevaContrasenia.getText();
        String cnclave = this.txtConfirmarContrasenia.getText();

        //enviando los datos a las propiedades      
        empleado.setLogin_emp(nombre);
        empleado.setTipo_emp(usuario);
        empleado.setContrasenia_emp(clave);

        //CAPTURANDO LOS RESULTADOS
        String nom = empleado.BuscarLogin(nombre);
        String tip = empleado.BuscarTipo(nombre, usuario);
        String cla = empleado.BuscarContrasenia(nombre, usuario, clave);

        //obteniendo el codigo, nombre y apellidos del empleado
        //obteniendo el codigo, nombre y apellidos del empleado
        codigo = empleado.BuscarCodigo(nombre);
        nombre_usu = empleado.BuscarNombres(nombre);
        apellidos_usu = empleado.BuscarApellidos(nombre);
        //comparando los datos      
        if (nombre.equals(nom)) {
            if (usuario.equals(tip)) {
                if (clave.equals(cla)) {
                    if (nclave.equals(cnclave)) {
                        if (!verificar) { //enviando los datos a las propiedades
                            empleado.setLogin_emp(nombre);
                            empleado.setContrasenia_emp(this.txtConfirmarContrasenia.getText());
                            empleado.ActualizarContrasenia(); //prcedimiento actualizar
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(this, "Faltan datos", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);
                        this.txtConfirmarContrasenia.setText("");
                        this.txtConfirmarContrasenia.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "ingre bien la clave", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);

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


    }//GEN-LAST:event_lblActualizarMouseClicked

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        ventanaTarea vt = new ventanaTarea();
        vt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void txtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginActionPerformed

    private void txtNuevaContraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevaContraseniaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevaContraseniaKeyPressed

    private void txtConfirmarContraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarContraseniaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            //creando variable boolean, guarda true o false       
            boolean verificar;
            //verificando cada caja si tiene datos
            verificar = txtNuevaContrasenia.getText().equals("") || txtConfirmarContrasenia.getText().equals("");
            //capturando los datos de la caja        
            String nombre = txtlogin.getText();
            String usuario = cbousuario.getSelectedItem().toString();
            String clave = txtcontrasenia.getText();

            String nclave = this.txtNuevaContrasenia.getText();
            String cnclave = this.txtConfirmarContrasenia.getText();
            //enviando los datos a las propiedades      
            empleado.setLogin_emp(nombre);
            empleado.setTipo_emp(usuario);
            empleado.setContrasenia_emp(clave);
            //capturando los datos devueltos de los procedimientos             
            String nom = empleado.BuscarLogin(nombre);
            String tip = empleado.BuscarTipo(nombre, usuario);
            String cla = empleado.BuscarContrasenia(nombre, usuario, clave);
            //comparando los datos      
            if (nombre.equals(nom)) {
                if (usuario.equals(tip)) {
                    if (clave.equals(cla)) {
                        if (nclave.equals(cnclave)) {
                            if (!verificar) { //enviando los datos a las propiedades
                                empleado.setLogin_emp(nombre);
                                empleado.setContrasenia_emp(this.txtConfirmarContrasenia.getText());
                                empleado.ActualizarContrasenia(); //prcedimiento actualizar
                                limpiar();
                            } else {
                                JOptionPane.showMessageDialog(this, "Faltan datos", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);
                            this.txtConfirmarContrasenia.setText("");
                            this.txtConfirmarContrasenia.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "ingre bien la clave", "Sistema de Acceso", JOptionPane.ERROR_MESSAGE);

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


    }//GEN-LAST:event_txtConfirmarContraseniaKeyPressed

    private void cbousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbousuarioActionPerformed
        cbousuario.transferFocus();
    }//GEN-LAST:event_cbousuarioActionPerformed

    private void txtcontraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseniaActionPerformed
        txtcontrasenia.transferFocus();
    }//GEN-LAST:event_txtcontraseniaActionPerformed

    private void txtNuevaContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaContraseniaActionPerformed
        txtConfirmarContrasenia.transferFocus();
    }//GEN-LAST:event_txtNuevaContraseniaActionPerformed

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
            java.util.logging.Logger.getLogger(CambiarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarContrasenia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbousuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPasswordField txtConfirmarContrasenia;
    private javax.swing.JPasswordField txtNuevaContrasenia;
    private javax.swing.JPasswordField txtcontrasenia;
    private javax.swing.JTextField txtlogin;
    // End of variables declaration//GEN-END:variables
}
