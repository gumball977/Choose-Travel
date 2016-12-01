package ventanas;

import chooseandtravel.Datos_Cuentas;
import chooseandtravel.Datos_Empresa;
import chooseandtravel.Sistema;
import chooseandtravel.Validador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kuuzou
 */
public class AgregarEliminarCuenta extends javax.swing.JFrame {
    
    Sistema sistema;
    Datos_Cuentas mCuentas = new Datos_Cuentas();
    Datos_Empresa mSuc = new Datos_Empresa();

    /**
     *
     * @param system
     */
    public AgregarEliminarCuenta(Sistema system) {
        sistema=system;
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        inputUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputPass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        valUsu = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        agregar = new javax.swing.JRadioButton();
        eliminar = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        valCon = new javax.swing.JCheckBox();
        inputPassConfirmar = new javax.swing.JPasswordField();
        inputSucursal = new javax.swing.JComboBox<>();
        aceptarB = new javax.swing.JLabel();
        volverB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Choose & Travel - Agregar / Eliminar Cuenta");
        setPreferredSize(new java.awt.Dimension(530, 330));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(530, 330));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cuenta");

        inputUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputUserKeyReleased(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña");

        inputPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputPassKeyReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre trabajador");

        valUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        valUsu.setEnabled(false);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sucursales");

        agregar.setSelected(true);
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Confirmar contraseña");

        valCon.setEnabled(false);

        inputPassConfirmar.setEnabled(false);
        inputPassConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputPassConfirmarKeyReleased(evt);
            }
        });

        inputSucursal.setBackground(new java.awt.Color(39, 174, 96));
        inputSucursal.setModel(mSuc.arrayToComboBox(sistema.getSucursales())
        );

        aceptarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptarDefault.png"))); // NOI18N
        aceptarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aceptarBMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                aceptarBMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarBMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptarBMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptarBMouseEntered(evt);
            }
        });

        volverB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volverDefault.png"))); // NOI18N
        volverB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                volverBMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                volverBMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverBMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverBMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverBMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputSucursal, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputPassConfirmar)
                            .addComponent(inputPass)
                            .addComponent(inputUser, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valCon)
                            .addComponent(valUsu))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(aceptarB)
                .addGap(46, 46, 46)
                .addComponent(agregar)
                .addGap(27, 27, 27)
                .addComponent(eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(volverB)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(valUsu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valCon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(inputPassConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar)
                            .addComponent(eliminar))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(inputSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aceptarB)
                            .addComponent(volverB))
                        .addGap(0, 36, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        eliminar.setSelected(false);
        inputPass.setEnabled(true);
        inputNombre.setEnabled(true);
        inputSucursal.setEnabled(true);
    }//GEN-LAST:event_agregarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        String nu = "";
        agregar.setSelected(false);
        inputPass.setText(nu);
        inputPassConfirmar.setText(nu);
        inputNombre.setText(nu);
        inputPass.setEnabled(false);
        inputPassConfirmar.setEnabled(false);
        inputNombre.setEnabled(false);
        inputSucursal.setEnabled(false);

    }//GEN-LAST:event_eliminarActionPerformed

    private void inputUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputUserKeyReleased
        String us = inputUser.getText();
        if (Validador.valUs(us) == true && Validador.existUs(sistema.getCuentas(), us)) {
            valUsu.setSelected(true);
        } else {
            valUsu.setSelected(false);
        }
    }//GEN-LAST:event_inputUserKeyReleased

    private void inputPassConfirmarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPassConfirmarKeyReleased
        if (inputPass.getText() != "") {
            if (inputPass.getText().equals(inputPassConfirmar.getText())) {
                valCon.setSelected(true);
            } else {
                valCon.setSelected(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha ingresado la contraseña en el campo anterior");
        }
    }//GEN-LAST:event_inputPassConfirmarKeyReleased

    private void inputPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPassKeyReleased
        String password = inputPass.getText();
        if (password != "") {
            inputPassConfirmar.setEnabled(true);
        }
    }//GEN-LAST:event_inputPassKeyReleased

    private void aceptarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBMouseClicked
        int op=1;
        if (agregar.isSelected() || eliminar.isSelected()) {
            if (inputUser.getText() != "") {
                if(agregar.isSelected()){
                    if (inputPass.getText() != "" && inputNombre.getText() != "" || inputPass.getText() != "" && inputNombre.getText() != null
                                || inputPass.getText() != null && inputNombre.getText() != null || inputPass.getText() != "" && inputNombre.getText() != null) {
                            mCuentas.agregarCuentaTxt(inputUser.getText(), inputPass.getText(), inputNombre.getText(), mSuc.getCodigoNomn((String) inputSucursal.getSelectedItem(),sistema.getSucursales()),sistema.getCuentas());
                            JOptionPane.showMessageDialog(this, "Cuenta agregada exitosamente");
                            sistema.hacerVisible();
                            dispose();
                        }  
                }else{
                    if(mCuentas.eliminarUser(inputUser.getText(), sistema.getCuentas())){
                    }else{
                        JOptionPane.showMessageDialog(this, "El usuario ha sido eliminado");
                        sistema.hacerVisible();
                        dispose();
                    }
                    
                }
            }
        } else {
            
            JOptionPane.showMessageDialog(this, "Debe elegir una opcion agregar/eliminar","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_aceptarBMouseClicked

    private void aceptarBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBMouseEntered
        ImageIcon ico=new ImageIcon(getClass().getResource("/Imagenes/aceptarHover.png"));
        this.aceptarB.setIcon(ico);
    }//GEN-LAST:event_aceptarBMouseEntered

    private void aceptarBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBMouseExited
        ImageIcon ico=new ImageIcon(getClass().getResource("/Imagenes/aceptarDefault.png"));
        this.aceptarB.setIcon(ico);
    }//GEN-LAST:event_aceptarBMouseExited

    private void aceptarBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBMousePressed
        ImageIcon ico=new ImageIcon(getClass().getResource("/Imagenes/aceptarPressed.png"));
        this.aceptarB.setIcon(ico);
    }//GEN-LAST:event_aceptarBMousePressed

    private void aceptarBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBMouseReleased
        ImageIcon ico=new ImageIcon(getClass().getResource("/Imagenes/aceptarDefault.png"));
        this.aceptarB.setIcon(ico);
    }//GEN-LAST:event_aceptarBMouseReleased

    private void volverBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBMouseClicked
        sistema.hacerVisible();
        dispose();
    }//GEN-LAST:event_volverBMouseClicked

    private void volverBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBMouseEntered
        ImageIcon ico=new ImageIcon(getClass().getResource("/Imagenes/volverHover.png"));
        this.volverB.setIcon(ico);
    }//GEN-LAST:event_volverBMouseEntered

    private void volverBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBMouseExited
        ImageIcon ico=new ImageIcon(getClass().getResource("/Imagenes/volverDefault.png"));
        this.volverB.setIcon(ico);
    }//GEN-LAST:event_volverBMouseExited

    private void volverBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBMousePressed
        ImageIcon ico=new ImageIcon(getClass().getResource("/Imagenes/volverPressed.png"));
        this.volverB.setIcon(ico);
    }//GEN-LAST:event_volverBMousePressed

    private void volverBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverBMouseReleased
        ImageIcon ico=new ImageIcon(getClass().getResource("/Imagenes/volverDefault.png"));
        this.volverB.setIcon(ico);
    }//GEN-LAST:event_volverBMouseReleased

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
            java.util.logging.Logger.getLogger(AgregarEliminarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEliminarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEliminarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEliminarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AgregarEliminarCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceptarB;
    private javax.swing.JRadioButton agregar;
    private javax.swing.JRadioButton eliminar;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputPass;
    private javax.swing.JPasswordField inputPassConfirmar;
    private javax.swing.JComboBox<String> inputSucursal;
    private javax.swing.JTextField inputUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox valCon;
    private javax.swing.JCheckBox valUsu;
    private javax.swing.JLabel volverB;
    // End of variables declaration//GEN-END:variables
}
