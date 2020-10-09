/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofada;

import clientes.Inmigrante;
import clientes.Tabla;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CANDELO
 */
public class TablaHash extends javax.swing.JFrame {
    //Tabla modelo
    DefaultTableModel tblDatosHash;
    
    //Arreglo de Objeto que guardara los registros en la tabla hash.
    Object[] o = new Object[5];
    
    //Instancia de la tabla que llamara las funciones Hash, insertar, modificar, buscar,eliminar.
    Tabla mitabla1 = new Tabla();
    
    // Key que dara la posición en la tabla Hash, tomando como base un m = 100;
    int key = 0;
    
    //Instancia creada que permitara el registro en caso de que haya una colisón de datos.
    HashAnidado anido = new HashAnidado();

    public TablaHash() {
        initComponents();
        
        setDefaultCloseOperation(TablaHash.DO_NOTHING_ON_CLOSE);
        
        tblDatosHash = (DefaultTableModel) tblHashInmigrante.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensajeEmergente = new javax.swing.JDialog();
        btnOK = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnNo = new javax.swing.JButton();
        keyMostar = new javax.swing.JLabel();
        listAnidada = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHashInmigrante = new javax.swing.JTable();
        txtnumPasport = new javax.swing.JTextField();
        btnAgregarHash = new javax.swing.JButton();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtPaisProc = new javax.swing.JTextField();
        txtPaisNacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBuscarHash = new javax.swing.JButton();
        btnEliminarHash = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        mensajeEmergente.setSize(new java.awt.Dimension(410, 266));

        btnOK.setBackground(new java.awt.Color(51, 204, 0));
        btnOK.setText("ABRIR TABLA");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("YA EXISTE EL INMIGRANTE EN LA POSICIÓN");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("¿ DESEA AGREGARLO A LA LISTA ANIDAD?");

        btnNo.setText("NO");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        keyMostar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        keyMostar.setForeground(new java.awt.Color(255, 0, 0));

        listAnidada.setText("AGREGAR A HASH ANIDADO");
        listAnidada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAnidadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mensajeEmergenteLayout = new javax.swing.GroupLayout(mensajeEmergente.getContentPane());
        mensajeEmergente.getContentPane().setLayout(mensajeEmergenteLayout);
        mensajeEmergenteLayout.setHorizontalGroup(
            mensajeEmergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mensajeEmergenteLayout.createSequentialGroup()
                .addGroup(mensajeEmergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mensajeEmergenteLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel8))
                    .addGroup(mensajeEmergenteLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mensajeEmergenteLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(mensajeEmergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mensajeEmergenteLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keyMostar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mensajeEmergenteLayout.createSequentialGroup()
                        .addComponent(listAnidada)
                        .addContainerGap())))
        );
        mensajeEmergenteLayout.setVerticalGroup(
            mensajeEmergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mensajeEmergenteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(mensajeEmergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(keyMostar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(42, 42, 42)
                .addGroup(mensajeEmergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnNo))
                .addGap(43, 43, 43)
                .addComponent(listAnidada)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TABLA HASH");

        tblHashInmigrante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NUMERO PASAPORTE", "NOMBRES", "APELLIDOS", "PAIS PROCEDENCIA", "PAIS NACIONALIDAD"
            }
        ));
        tblHashInmigrante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblHashInmigrante.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tblHashInmigranteMouseMoved(evt);
            }
        });
        tblHashInmigrante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHashInmigranteMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblHashInmigranteMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblHashInmigrante);

        txtnumPasport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumPasportActionPerformed(evt);
            }
        });
        txtnumPasport.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumPasportKeyTyped(evt);
            }
        });

        btnAgregarHash.setText("AGREGAR INMIGRANTE A HASH");
        btnAgregarHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHashActionPerformed(evt);
            }
        });

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRES");

        jLabel3.setText("APELLIDOS");

        jLabel4.setText("PAIS DE PROCEDENCIA");

        jLabel5.setText("PAIS DE NACIONALIDAD");

        jLabel6.setText("NUMERO DE PASAPORTE");

        btnBuscarHash.setText("BUSCAR INMIGRANTE HASH");
        btnBuscarHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHashActionPerformed(evt);
            }
        });

        btnEliminarHash.setText("ELIMINAR INMIGRANTE HASH");
        btnEliminarHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHashActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(255, 0, 0));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnModificar.setText("EDITAR INMIGRANTE HASH");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombres)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtPaisProc))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPaisNacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnumPasport, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnAgregarHash)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnBuscarHash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarHash)))
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(btnClose))
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnumPasport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtPaisNacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPaisProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarHash)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarHash)
                    .addComponent(btnEliminarHash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumPasportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumPasportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumPasportActionPerformed
    
    //Boton agregar en tabla hash.
    private void btnAgregarHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHashActionPerformed
        // Instancia que interactua con el objeto inmigrante.
        Inmigrante nuevoInm = new Inmigrante(txtnumPasport.getText(), txtNombres.getText(),
                txtApellidos.getText(), txtPaisProc.getText(), txtPaisNacion.getText());
        
        
        TablaHash mitablita = TablaHash.this;

        //Conjunto de instrucciones que permitira el registro del Inmigrante en la tabla hash.
        try {
            //LLama el metodo insertar inmigrante de clase funciones Tabla.
            mitabla1.insertar(nuevoInm.getPasaporte(), nuevoInm);
            
            key = mitabla1.funcionHash(nuevoInm.getPasaporte());
            
            int mostrarKey = key + 1;
            
            // Asigna a cada posición del arreglo objeto los datos de los inmigrantes.
            o[0] = nuevoInm.getPasaporte();
            o[1] = nuevoInm.getNombre();
            o[2] = nuevoInm.getApellido();
            o[3] = nuevoInm.getPais_procedencia();
            o[4] = nuevoInm.getPais_nacionalidad();
            String pasaporte = txtnumPasport.getText();
            String nombre = txtNombres.getText();
            String apellido = txtApellidos.getText();
            String paisProc = txtPaisProc.getText();
            String paisNacion = txtPaisNacion.getText();
            //Validaciones para el registro del inmigrante.
            if (pasaporte.length() != 0 && nombre.length() != 0 && apellido.length() != 0 && paisProc.length() != 0
                && paisNacion.length() !=0) {

                if (tblHashInmigrante.getValueAt(key, 0) == null) {
                    
                    // funciones que ingresaran al usuario en la Jtable en la posicón que indica la key.
                    tblHashInmigrante.setValueAt(o[0], key, 0);
                    tblHashInmigrante.setValueAt(o[1], key, 1);
                    tblHashInmigrante.setValueAt(o[2], key, 2);
                    tblHashInmigrante.setValueAt(o[3], key, 3);
                    tblHashInmigrante.setValueAt(o[4], key, 4);

                    JOptionPane.showMessageDialog(null, "El elemento ha sido agregado correctamente en la posición "
                            + mostrarKey);
                    
                    // Validad los campos null
                    txtnumPasport.setText(null);
                    txtNombres.setText(null);
                    txtApellidos.setText(null);
                    txtPaisProc.setText(null);
                    txtPaisNacion.setText(null);
                    // Validad los campos null
                   
                    // Valida Inmigrante con la misma Key; pero con número de pasaporte diferente.
                } else if (!tblHashInmigrante.getValueAt(key, 0).equals(nuevoInm.getPasaporte())) {
                    JOptionPane.showMessageDialog(null, "Ya existe un Inmigrante en la posición " + mostrarKey);
                    mitablita.mensajeEmergente.setVisible(true);
                    mitablita.keyMostar.setText(Integer.toString(mostrarKey));
                    
                  // Valida el Inmigrante con la misma Key; pero no deja registrar ya que se registraria dos veces el mismo
                  // numero de pasaporte.  
                } else {
                    JOptionPane.showMessageDialog(null, "Ya existe un Inmigrante con el mismo número de pasaporte.");
                    
                    
                }
            }
        } catch (StringIndexOutOfBoundsException ev) {
            JOptionPane.showMessageDialog(null, "El campo de Pasaporte esta vacio");
        }


    }//GEN-LAST:event_btnAgregarHashActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void tblHashInmigranteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHashInmigranteMouseReleased

    }//GEN-LAST:event_tblHashInmigranteMouseReleased

    private void tblHashInmigranteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHashInmigranteMouseMoved

    }//GEN-LAST:event_tblHashInmigranteMouseMoved

    private void tblHashInmigranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHashInmigranteMouseClicked


    }//GEN-LAST:event_tblHashInmigranteMouseClicked

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnBuscarHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHashActionPerformed

        //Conjunto de instrucciones que permitira la busqueda del Inmigrante en la tabla hash.
        try {
            if (txtnumPasport.getText().length() != 0) {
                
                String pasaporte = txtnumPasport.getText();
                
                int keyBuscar = mitabla1.funcionHash(pasaporte);
                
                int keyBuscarCont = keyBuscar + 1;
                
                //Ciclo que realiza el recorrido para buscar el Inmigrante en la tabla Hash.
                while (!tblHashInmigrante.getValueAt(keyBuscar, 0).equals(0) && !mitabla1.casas[keyBuscar].equals(0)) {

                    txtnumPasport.setText(tblHashInmigrante.getValueAt(keyBuscar, 0).toString());
                    txtNombres.setText(tblHashInmigrante.getValueAt(keyBuscar, 1).toString());
                    txtApellidos.setText(tblHashInmigrante.getValueAt(keyBuscar, 2).toString());
                    txtPaisNacion.setText(tblHashInmigrante.getValueAt(keyBuscar, 3).toString());
                    txtPaisProc.setText(tblHashInmigrante.getValueAt(keyBuscar, 4).toString());
                    
                    JOptionPane.showMessageDialog(null, "El Inmigrante se encuentra registrado en la posición " + keyBuscarCont);
                    
                    break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "El campo pasaporte no puede estar vacio");
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "El Inmigrante no existe en la tabla hash.");
        }
    }//GEN-LAST:event_btnBuscarHashActionPerformed

    private void btnEliminarHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHashActionPerformed
        //Conjunto de instrucciones que permitira la eliminación del Inmigrante en la tabla hash.
        try {
            if (txtnumPasport.getText().length() != 0) {

                if (tblHashInmigrante.getValueAt(key, 0).equals(txtnumPasport.getText())) {
                    mitabla1.eliminar(txtnumPasport.getText());
                    tblDatosHash.removeRow(key);
                    JOptionPane.showMessageDialog(null, "El inmigrante ha sido eliminado");

                } else {
                    JOptionPane.showMessageDialog(null, "El inmigrante no se encuentra o ya fue eliminado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El campo Pasaporte no puede estar vacio");
            }
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "El inmigrante no se encuentra o ya fue eliminado");
        }
    }//GEN-LAST:event_btnEliminarHashActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        //Permite la visibilidad del cuadro de dialogo
        anido.setVisible(true);
    }//GEN-LAST:event_btnOKActionPerformed

    private void listAnidadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAnidadaActionPerformed
        //Permite la insercción del Inmigrante en la tabla hash anidada que causa  la colición,
        if (anido.isVisible()) {
            HashAnidado.tblHashAnidado.setValueAt(o[0], key, 0);
            HashAnidado.tblHashAnidado.setValueAt(o[1], key, 1);
            HashAnidado.tblHashAnidado.setValueAt(o[2], key, 2);
            HashAnidado.tblHashAnidado.setValueAt(o[3], key, 3);
            HashAnidado.tblHashAnidado.setValueAt(o[4], key, 4);
            
            JOptionPane.showMessageDialog(null, "Se agrego corretamente el Innmingrante con pasaporte " + 
                                                 HashAnidado.tblHashAnidado.getValueAt(key, 0));
        } else {
            JOptionPane.showMessageDialog(null, "Debe abrir la tabla para agregar el dato.");
        }
    }//GEN-LAST:event_listAnidadaActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        TablaHash cerrar = TablaHash.this;
        cerrar.mensajeEmergente.dispose();
    }//GEN-LAST:event_btnNoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Instancia que interactua con el objeto inmigrante.
        Inmigrante miInmigrante = new Inmigrante(txtnumPasport.getText(), txtNombres.getText(), txtApellidos.getText(),
                txtPaisProc.getText(), txtPaisNacion.getText());
        
        // Asigna a cada posición del arreglo objeto los datos de los inmigrantes.
        o[0] = miInmigrante.getPasaporte();
        o[1] = miInmigrante.getNombre();
        o[2] = miInmigrante.getApellido();
        o[3] = miInmigrante.getPais_procedencia();
        o[4] = miInmigrante.getPais_nacionalidad();
        
        try {
            if (txtnumPasport.getText().length() != 0) {
                
                mitabla1.modificar(miInmigrante.getPasaporte(), miInmigrante);
                
                String pasaporte = txtnumPasport.getText();
                
                int keyBuscar = mitabla1.funcionHash(pasaporte);
                
                int keyBuscarCont = keyBuscar + 1;
                
                //Recorrido que realiza la busqueda del dato a modificar.
                while (!tblHashInmigrante.getValueAt(keyBuscar, 0).equals(0) && !mitabla1.casas[keyBuscar].equals(0)) {

                    tblHashInmigrante.setValueAt(o[0], key, 0);
                    tblHashInmigrante.setValueAt(o[1], key, 1);
                    tblHashInmigrante.setValueAt(o[2], key, 2);
                    tblHashInmigrante.setValueAt(o[3], key, 3);
                    tblHashInmigrante.setValueAt(o[4], key, 4);
                    JOptionPane.showMessageDialog(null, "El Inmigrante se modifico correctamente en la posición " + keyBuscarCont);
                    break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "El campo pasaporte no puede estar vacio");
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "El Inmigrante no existe en la tabla hash.");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtnumPasportKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumPasportKeyTyped
        //Validación del campo de texto pasaporte, que permita solo el ingreso de letras y numeros
        char c = evt.getKeyChar();

        if ((c < '0' || c > '9') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }


    }//GEN-LAST:event_txtnumPasportKeyTyped

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
            java.util.logging.Logger.getLogger(TablaHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaHash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarHash;
    private javax.swing.JButton btnBuscarHash;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEliminarHash;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel keyMostar;
    private javax.swing.JButton listAnidada;
    private javax.swing.JDialog mensajeEmergente;
    public javax.swing.JTable tblHashInmigrante;
    public static javax.swing.JTextField txtApellidos;
    public static javax.swing.JTextField txtNombres;
    public static javax.swing.JTextField txtPaisNacion;
    public static javax.swing.JTextField txtPaisProc;
    public static javax.swing.JTextField txtnumPasport;
    // End of variables declaration//GEN-END:variables
}
