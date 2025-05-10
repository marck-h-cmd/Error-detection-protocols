
package paridad;

import javax.swing.JOptionPane;

public class JifParidad extends javax.swing.JInternalFrame {

    public JifParidad() {
        initComponents();
    }

    private static String[][] calcularMatrizConParidad(String[][] matrizOriginal) {
        int filas = matrizOriginal.length;
        int columnas = matrizOriginal[0].length;
        String[][] matrizConParidad = new String[filas + 1][columnas + 1];

        // Copiar bits y calcular paridad horizontal
        for (int i = 0; i < filas; i++) {
            int suma = 0;
            for (int j = 0; j < columnas; j++) {
                matrizConParidad[i][j] = matrizOriginal[i][j];
                suma += Integer.parseInt(matrizOriginal[i][j]);
            }
            matrizConParidad[i][columnas] = String.valueOf(suma % 2);
        }

        // Calcular paridad vertical
        for (int j = 0; j < columnas; j++) {
            int suma = 0;
            for (int i = 0; i < filas; i++) {
                suma += Integer.parseInt(matrizOriginal[i][j]);
            }
            matrizConParidad[filas][j] = String.valueOf(suma % 2);
        }

        // Esquina inferior derecha (opcional)
        matrizConParidad[filas][columnas] = " ";

        return matrizConParidad;
    }
    
    private static String[][] convertirAMatrizBinaria(String mensaje) {
        int columnas = 8;
        String[][] matriz = new String[mensaje.length()][columnas];

        for (int i = 0; i < mensaje.length(); i++) {
            String binario = String.format("%8s", Integer.toBinaryString(mensaje.charAt(i))).replace(' ', '0');
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = String.valueOf(binario.charAt(j));
            }
        }
        return matriz;
    }

    private static String matrizToTexto(String[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (String[] fila : matriz) {
            for (String bit : fila) {
                sb.append(bit);
            }
            sb.append("\n");
        }
        return sb.toString().trim(); // sin línea extra al final
    }
    
    private static String[][] textoAMatriz(String texto) {
        String[] filas = texto.trim().split("\n");
        int numFilas = filas.length;
        int numColumnas = filas[0].length();

        String[][] matriz = new String[numFilas][numColumnas];
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                matriz[i][j] = String.valueOf(filas[i].charAt(j));
            }
        }
        return matriz;
    }
    
    private static boolean matricesConParidadSonIguales(String[][] m1, String[][] m2) {
        int filas = m1.length;
        int columnas = m1[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (!m1[i][j].equals(m2[i][j])) {
                    return false; // hubo alteración
                }
            }
        }
        return true; // no hubo alteración
    }
    
    private static String obtenerMensajeDesdeMatrizBinaria(String[][] matriz) {
        StringBuilder mensaje = new StringBuilder();

        for (String[] fila : matriz) {
            StringBuilder binario = new StringBuilder();
            for (String bit : fila) {
                binario.append(bit);
            }
            int ascii = Integer.parseInt(binario.toString(), 2);
            mensaje.append((char) ascii);
        }

        return mensaje.toString();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAVerificacion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAOriginal = new javax.swing.JTextArea();
        btnVerificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtABinario = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAModificado = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtAVerificacion.setEditable(false);
        txtAVerificacion.setColumns(20);
        txtAVerificacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAVerificacion.setRows(5);
        txtAVerificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(txtAVerificacion);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Mensaje Original:");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Verificación de Integridad:");

        btnIngresar.setBackground(new java.awt.Color(0, 102, 102));
        btnIngresar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR MENSAJE");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        txtAOriginal.setColumns(20);
        txtAOriginal.setRows(5);
        jScrollPane1.setViewportView(txtAOriginal);

        btnVerificar.setBackground(new java.awt.Color(0, 102, 102));
        btnVerificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVerificar.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificar.setText("VERIFICAR MENSAJE");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Mensaje Modificado:");

        txtABinario.setEditable(false);
        txtABinario.setColumns(20);
        txtABinario.setRows(5);
        jScrollPane2.setViewportView(txtABinario);

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Mensaje en Binario:");

        txtAModificado.setEditable(false);
        txtAModificado.setColumns(20);
        txtAModificado.setRows(5);
        jScrollPane4.setViewportView(txtAModificado);

        btnSalir.setBackground(new java.awt.Color(0, 102, 102));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(0, 102, 102));
        btnNuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(124, 124, 124)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btnIngresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btnVerificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (txtAOriginal.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No ha ingresado nada en el área de texto", "ADVERTENCIA", 2);
            txtAOriginal.requestFocus();
        } else {
            String original = txtAOriginal.getText();
            String[][] auxiliar = convertirAMatrizBinaria(original);
            String binarioOriginal = matrizToTexto(auxiliar);
            JOptionPane.showMessageDialog(this, "Se ha ingresado el mensaje correctamente", "INFORMACIÓN", 1);
            txtABinario.setText(binarioOriginal);
            matrizAuxiliar1 = calcularMatrizConParidad(auxiliar);
            txtAOriginal.setEditable(false);
            txtABinario.setEditable(true);
            txtABinario.requestFocus();
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        String modificado = txtABinario.getText();
        String[][] auxiliar = textoAMatriz(modificado);
        matrizAuxiliar2 = calcularMatrizConParidad(auxiliar); 
        boolean rpta = matricesConParidadSonIguales(matrizAuxiliar1, matrizAuxiliar2);
        JOptionPane.showMessageDialog(this, "VERIFICANDO...", "INFORMACIÓN", 1);
        String mensajeMod = obtenerMensajeDesdeMatrizBinaria(auxiliar);
        txtAModificado.setText(mensajeMod);
        if(!rpta)
            txtAVerificacion.setText("¡El mensaje fue adulterado!");
        else
            txtAVerificacion.setText("¡El mensaje no fue adulterado!");
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtAOriginal.setText(null);
        txtAOriginal.setEditable(true);
        txtABinario.setText(null);
        txtAModificado.setText(null);
        txtAVerificacion.setText(null);
        txtAOriginal.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtABinario;
    private javax.swing.JTextArea txtAModificado;
    private javax.swing.JTextArea txtAOriginal;
    private javax.swing.JTextArea txtAVerificacion;
    // End of variables declaration//GEN-END:variables
    private String[][] matrizAuxiliar1;
    private String[][] matriz;
    private String[][] matrizAuxiliar2;
}
