package clase05;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Primero extends javax.swing.JFrame {
    private ButtonGroup grupoEstado;
    public Primero() {
        initComponents();
        grupoEstado=new ButtonGroup();
        grupoEstado.add(radSoltero);
        grupoEstado.add(radCasado);
        grupoEstado.add(radViudo);
        grupoEstado.add(radDivorciado);
        radSoltero.setSelected(true);
        
        //cargar colores en cmbColores
        cmbColores.addItem("Rojo");
        cmbColores.addItem("Verde");
        cmbColores.addItem("Azul");
        cmbColores.addItem("Negro");
        cmbColores.addItem("Blanco");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        chkBici = new javax.swing.JCheckBox();
        chkMoto = new javax.swing.JCheckBox();
        chkAuto = new javax.swing.JCheckBox();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaTexto = new javax.swing.JTextArea();
        radSoltero = new javax.swing.JRadioButton();
        radCasado = new javax.swing.JRadioButton();
        radViudo = new javax.swing.JRadioButton();
        radDivorciado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cmbColores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Primer Formulario");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(102, 102, 255));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        chkBici.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkBici.setText("Tiene Bicicleta");

        chkMoto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkMoto.setText("Tiene Moto");
        chkMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMotoActionPerformed(evt);
            }
        });

        chkAuto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkAuto.setText("Tiene Auto");
        chkAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutoActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txaTexto.setEditable(false);
        txaTexto.setColumns(20);
        txaTexto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txaTexto.setRows(5);
        jScrollPane1.setViewportView(txaTexto);

        radSoltero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radSoltero.setText("Soltero");

        radCasado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radCasado.setText("Casado");

        radViudo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radViudo.setText("Viudo");

        radDivorciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radDivorciado.setText("Divorciado");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Color:");

        cmbColores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chkMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chkBici, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radCasado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radSoltero, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radViudo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radDivorciado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbColores, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBici)
                    .addComponent(radSoltero))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(chkMoto)
                        .addGap(18, 18, 18)
                        .addComponent(chkAuto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(radCasado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radViudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radDivorciado)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // evento aceptar
        String nombre=txtNombre.getText();
        if(nombre==null || nombre.length()<3) return;
        JOptionPane.showMessageDialog(this, "Hola "+nombre);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void chkMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMotoActionPerformed

    private void chkAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAutoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Evento Agregar
        String nombre=txtNombre.getText();
        String texto="";
        if(nombre==null || nombre.length()<3) return;
        texto+="Nombre: "+nombre+".\n";
        if(chkBici.isSelected())        texto+="Tiene Bici.\n";
        if(chkMoto.isSelected())        texto+="Tiene Moto.\n";
        if(chkAuto.isSelected())        texto+="Tiene Auto.\n";
        if(radSoltero.isSelected())     texto+="Estado Civil: Soltero.\n";
        if(radCasado.isSelected())      texto+="Estado Civil: Casado.\n";
        if(radViudo.isSelected())       texto+="Estado Civil: Viudo.\n";
        if(radDivorciado.isSelected())  texto+="Estado Civil: Soltero.\n";
        //texto+="Estado Civil: "+gr.toString();
        
        texto+="Color: "+cmbColores.getSelectedItem()+".\n";
        
        limpiar();
        
        txaTexto.setText(texto);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void limpiar() {
        //Limpiar el formulario
        txtNombre.setText("");
        txtNombre.requestFocus();
        chkBici.setSelected(false);
        chkMoto.setSelected(false);
        chkAuto.setSelected(false);
        radSoltero.setSelected(true);
    }
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
            java.util.logging.Logger.getLogger(Primero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Primero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Primero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Primero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Primero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JCheckBox chkAuto;
    private javax.swing.JCheckBox chkBici;
    private javax.swing.JCheckBox chkMoto;
    private javax.swing.JComboBox<String> cmbColores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radCasado;
    private javax.swing.JRadioButton radDivorciado;
    private javax.swing.JRadioButton radSoltero;
    private javax.swing.JRadioButton radViudo;
    private javax.swing.JTextArea txaTexto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
