package redundanciaCiclica;

public class JifCiclica extends javax.swing.JInternalFrame {


    public JifCiclica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JTextField();
        lblCodificado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCodificado = new javax.swing.JTextArea();
        btnCodificar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        lblDivisor = new javax.swing.JLabel();
        txtDivisor = new javax.swing.JTextField();
        lblResiduo = new javax.swing.JLabel();
        txtResiduo = new javax.swing.JTextField();
        lblModificar = new javax.swing.JLabel();
        txtModificado = new javax.swing.JTextField();
        btnModificado = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Redundancia Cíclica - CRC");

        lblMensaje.setText("Mensaje Original:");

        lblCodificado.setText("Mensaje Codificado (CRC):");

        txtCodificado.setColumns(20);
        txtCodificado.setRows(5);
        txtCodificado.setEnabled(false);
        jScrollPane1.setViewportView(txtCodificado);

        btnCodificar.setText("Codificar con CRC");
        btnCodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodificarActionPerformed(evt);
            }
        });

        btnVerificar.setText("Guardar Mensaje");
        btnVerificar.setEnabled(false);
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        lblDivisor.setText("Divisor polinomio G:");

        txtDivisor.setEnabled(false);

        lblResiduo.setText("Residuo CRC:");

        txtResiduo.setEnabled(false);

        lblModificar.setText("Modificar mensaje:");

        txtModificado.setEnabled(false);

        btnModificado.setText("Verificar Mensaje Modificado");
        btnModificado.setEnabled(false);
        btnModificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificadoActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCodificar)
                .addGap(191, 191, 191))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnModificado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblModificar)
                        .addGap(18, 18, 18)
                        .addComponent(txtModificado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMensaje)
                        .addGap(18, 18, 18)
                        .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDivisor)
                        .addGap(18, 18, 18)
                        .addComponent(txtDivisor, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodificado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblResiduo)
                                .addGap(18, 18, 18)
                                .addComponent(txtResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(btnVerificar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensaje)
                    .addComponent(lblDivisor)
                    .addComponent(txtDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCodificar)
                .addGap(15, 15, 15)
                .addComponent(lblCodificado)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResiduo)
                    .addComponent(txtResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificado)
                    .addComponent(btnNuevo))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodificarActionPerformed
        String mensaje = txtMensaje.getText().trim();

        if (mensaje.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "El campo 'Mensaje Original' no puede estar vacío.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String binario = toBinaryString(mensaje);
        String divisor = "1001"; 

        String mensajeConCeros = binario + "000";
        String residuo = obtenerResiduoCRC(mensajeConCeros, divisor);
        String mensajeCRC = binario + residuo;

        txtCodificado.setText(mensajeCRC);
        txtResiduo.setText(residuo);
        txtDivisor.setText(divisor);

        btnVerificar.setEnabled(true);
    }//GEN-LAST:event_btnCodificarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        String mensajeOriginal = txtMensaje.getText().trim();

        if (mensajeOriginal.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "El campo 'Mensaje Original' no puede estar vacío.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        javax.swing.JOptionPane.showMessageDialog(this, "Mensaje Original: " + mensajeOriginal, "Mensaje Original", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        javax.swing.JOptionPane.showMessageDialog(this, "Mensaje guardado correctamente.", "CRC", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        txtModificado.setText(txtCodificado.getText());

        txtModificado.setEnabled(true);
        btnModificado.setEnabled(true);
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnModificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificadoActionPerformed
        String mensajeOriginal = txtMensaje.getText().trim();
        String mensajeModificado = txtModificado.getText().trim();

        if (mensajeModificado.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "El mensaje modificado no puede estar vacío.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        javax.swing.JOptionPane.showMessageDialog(this, "Mensaje Original: " + mensajeOriginal, "Mensaje Original", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        javax.swing.JOptionPane.showMessageDialog(this, "Mensaje Modificado: " + mensajeModificado, "Mensaje Modificado", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        String divisor = "1001"; 

        String residuoVerificado = obtenerResiduoCRC(mensajeModificado, divisor);
        txtResiduo.setText(residuoVerificado); 

        if (residuoVerificado.contains("1")) {
            javax.swing.JOptionPane.showMessageDialog(this, "¡Mensaje adulterado!", "Error CRC", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Mensaje recibido correctamente.", "CRC Verificación", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModificadoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtMensaje.setText("");
        txtDivisor.setText("");
        txtResiduo.setText("");
        txtCodificado.setText("");
        txtModificado.setText("");

        btnVerificar.setEnabled(false);
        btnModificado.setEnabled(false);

        txtDivisor.setEnabled(false);
        txtModificado.setEnabled(false);                           
        txtMensaje.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private String toBinaryString(String mensaje) {
        StringBuilder bin = new StringBuilder();
        for (char c : mensaje.toCharArray()) {
            bin.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));
        }
        return bin.toString();
    }

    private String obtenerResiduoCRC(String dividendo, String divisor) {
        int len = divisor.length();
        String resultado = dividendo.substring(0, len);

        for (int i = len; i < dividendo.length(); i++) {
            if (resultado.charAt(0) == '1') {
                resultado = xor(resultado, divisor) + dividendo.charAt(i);
            } else {
                resultado = xor(resultado, "0000") + dividendo.charAt(i);
            }
            resultado = resultado.substring(1);
        }

        if (resultado.charAt(0) == '1') {
            resultado = xor(resultado, divisor);
        } else {
            resultado = xor(resultado, "0000");
        }

        return resultado.substring(1);
    }

    private String xor(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }
        return result.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCodificar;
    private javax.swing.JButton btnModificado;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodificado;
    private javax.swing.JLabel lblDivisor;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblResiduo;
    private javax.swing.JTextArea txtCodificado;
    private javax.swing.JTextField txtDivisor;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtModificado;
    private javax.swing.JTextField txtResiduo;
    // End of variables declaration//GEN-END:variables
}
