package redundanciaLongitudinal;

import javax.swing.JOptionPane;

public class JifLongitudinal extends javax.swing.JInternalFrame {

    private String mensajeOriginal;
    private String mensajeConBCC;
    private boolean modoEdicion = false;

    public JifLongitudinal() {
        initComponents();
        btnVerificar.setEnabled(false);
        
        // Al inicio, solo debe estar habilitado el campo original y el botón ingresar
        txtARedundante.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAOriginal = new javax.swing.JTextArea();
        btnIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtARedundante = new javax.swing.JTextArea();
        btnVerificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAVerificacion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Redundancia Longitudinal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Mensaje Original:");

        txtAOriginal.setColumns(20);
        txtAOriginal.setRows(5);
        jScrollPane1.setViewportView(txtAOriginal);

        btnIngresar.setBackground(new java.awt.Color(0, 102, 102));
        btnIngresar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR MENSAJE");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Mensaje con Redundancia Longitudinal:");

        txtARedundante.setEditable(false);
        txtARedundante.setColumns(20);
        txtARedundante.setRows(5);
        jScrollPane2.setViewportView(txtARedundante);

        btnVerificar.setBackground(new java.awt.Color(0, 102, 102));
        btnVerificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVerificar.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificar.setText("VERIFICAR MENSAJE");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Resultado");

        txtAVerificacion.setEditable(false);
        txtAVerificacion.setColumns(20);
        txtAVerificacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAVerificacion.setRows(5);
        jScrollPane3.setViewportView(txtAVerificacion);

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Verificación de Integridad:");

        btnNuevo.setBackground(new java.awt.Color(0, 102, 102));
        btnNuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 102, 102));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnIngresar)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVerificar)
                        .addGap(190, 190, 190))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Calcula el carácter BCC (Block Check Character) para un mensaje
     * contando los bits '1' en cada posición de columna
     */
    private char calcularBCC(String mensaje) {
        // Convertir cada carácter a su representación binaria
        String[] binarios = new String[mensaje.length()];
        for (int i = 0; i < mensaje.length(); i++) {
            binarios[i] = String.format("%8s", Integer.toBinaryString(mensaje.charAt(i))).replace(' ', '0');
        }
        
        // Calcular el BCC
        StringBuilder bccBits = new StringBuilder();
        for (int bit = 0; bit < 8; bit++) {
            int unos = 0;
            for (int i = 0; i < mensaje.length(); i++) {
                if (binarios[i].charAt(bit) == '1') {
                    unos++;
                }
            }
            // Si el número de unos es par, se añade 0, si es impar, se añade 1
            bccBits.append(unos % 2 == 0 ? '0' : '1');
        }
        
        // Convertir los bits de BCC a un carácter
        int codigoBCC = Integer.parseInt(bccBits.toString(), 2);
        return (char) codigoBCC;
    }
    
    /**
     * Genera una representación visual de la matriz de bits y el BCC
     */
    private String generarMatrizBits(String mensaje, char bcc) {
        StringBuilder matriz = new StringBuilder();
        
        // Encabezado de columnas
        matriz.append("    Bit: | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |\n");
        matriz.append("         |---|---|---|---|---|---|---|---|\n");
        
        // Filas para cada carácter
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            String binario = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
            matriz.append(String.format("Char %d: %c | ", i+1, c));
            for (int j = 0; j < 8; j++) {
                matriz.append(binario.charAt(j)).append(" | ");
            }
            matriz.append("\n");
        }
        
        // Línea separadora
        matriz.append("         |---|---|---|---|---|---|---|---|\n");
        
        // Fila del BCC
        String bccBinario = String.format("%8s", Integer.toBinaryString(bcc)).replace(' ', '0');
        matriz.append("BCC:      | ");
        for (int j = 0; j < 8; j++) {
            matriz.append(bccBinario.charAt(j)).append(" | ");
        }
        matriz.append("← ").append(bcc).append("\n");
        
        return matriz.toString();
    }
    
    /**
     * Añade el BCC al final del mensaje
     */
    private String agregarBCC(String mensaje) {
        char bcc = calcularBCC(mensaje);
        return mensaje + bcc;
    }
    
    /**
     * Verifica un mensaje con BCC
     * @return true si el mensaje está íntegro, false si ha sido alterado
     */
    private boolean verificarMensaje(String mensajeConBCC) {
        if (mensajeConBCC.length() < 2) {
            return false;
        }
        
        String mensaje = mensajeConBCC.substring(0, mensajeConBCC.length() - 1);
        char bccRecibido = mensajeConBCC.charAt(mensajeConBCC.length() - 1);
        char bccCalculado = calcularBCC(mensaje);
        
        return bccRecibido == bccCalculado;
    }

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (txtAOriginal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No ha ingresado nada en el área de texto", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtAOriginal.requestFocus();
            return;
        }
        
        mensajeOriginal = txtAOriginal.getText();
        mensajeConBCC = agregarBCC(mensajeOriginal);
        
        char bcc = mensajeConBCC.charAt(mensajeConBCC.length() - 1);
        
        // Mostrar el mensaje con BCC y una explicación visual
        StringBuilder resultadoText = new StringBuilder();
        resultadoText.append("Mensaje original: ").append(mensajeOriginal).append("\n");
        resultadoText.append("Carácter BCC: ").append(bcc).append(" (").append((int)bcc).append(")\n\n");
        resultadoText.append("Mensaje con BCC: ").append(mensajeConBCC).append("\n\n");
        resultadoText.append("Matriz de bits de caracteres:\n");
        resultadoText.append(generarMatrizBits(mensajeOriginal, bcc));
        
        txtARedundante.setText(mensajeConBCC);
        txtAVerificacion.setText(resultadoText.toString());
        
        // Habilitar la edición del mensaje con BCC para permitir pruebas
        txtARedundante.setEditable(true);
        txtAOriginal.setEditable(false);
        btnVerificar.setEnabled(true);
        
        modoEdicion = true;
        
        JOptionPane.showMessageDialog(this, "Se ha calculado y añadido la redundancia longitudinal (BCC).\nPuede modificar el mensaje en el área del medio para probar la detección de errores.", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        String mensajeVerificar = txtARedundante.getText();
        if (mensajeVerificar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay mensaje para verificar", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        boolean integro = verificarMensaje(mensajeVerificar);
        
        // Extraer información para mostrar
        String mensajeSinBCC = mensajeVerificar.substring(0, mensajeVerificar.length() - 1);
        char bccRecibido = mensajeVerificar.charAt(mensajeVerificar.length() - 1);
        char bccCalculado = calcularBCC(mensajeSinBCC);
        
        // Mostrar detalles de la verificación
        StringBuilder resultadoText = new StringBuilder();
        resultadoText.append("Mensaje recibido: ").append(mensajeVerificar).append("\n\n");
        resultadoText.append("Mensaje sin BCC: ").append(mensajeSinBCC).append("\n");
        resultadoText.append("BCC recibido: ").append(bccRecibido).append(" (").append((int)bccRecibido).append(")\n");
        resultadoText.append("BCC calculado: ").append(bccCalculado).append(" (").append((int)bccCalculado).append(")\n\n");
        
        if (integro) {
            resultadoText.append("RESULTADO: VERIFICACIÓN EXITOSA - El mensaje está íntegro");
            JOptionPane.showMessageDialog(this, "¡El mensaje no ha sido alterado!", "VERIFICACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE);
        } else {
            resultadoText.append("RESULTADO: VERIFICACIÓN FALLIDA - El mensaje ha sido alterado");
            JOptionPane.showMessageDialog(this, "¡El mensaje ha sido alterado!", "VERIFICACIÓN FALLIDA", JOptionPane.ERROR_MESSAGE);
        }
        
        resultadoText.append("\n\nMatriz de bits actual:\n");
        resultadoText.append(generarMatrizBits(mensajeSinBCC, bccCalculado));
        
        txtAVerificacion.setText(resultadoText.toString());
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtAOriginal.setText("");
        txtARedundante.setText("");
        txtAVerificacion.setText("");
        
        txtAOriginal.setEditable(true);
        txtARedundante.setEditable(false);
        btnVerificar.setEnabled(false);
        
        mensajeOriginal = null;
        mensajeConBCC = null;
        modoEdicion = false;
        
        txtAOriginal.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAOriginal;
    private javax.swing.JTextArea txtARedundante;
    private javax.swing.JTextArea txtAVerificacion;
    // End of variables declaration//GEN-END:variables
}