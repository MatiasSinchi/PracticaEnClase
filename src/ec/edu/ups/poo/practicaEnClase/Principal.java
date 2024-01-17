/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.poo.practicaEnClase;

import ec.edu.ups.poo.practicaEnClase.Controlador.Gestiones;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.util.List;

/**
 *
 * @author matiassinchi
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        Gestiones g = new Gestiones();
    }

    private void pasteFromClipboard() {
        // Obtener el contenido del portapapeles
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(null);

        if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                String pastedText = (String) contents.getTransferData(DataFlavor.stringFlavor);
                rutaTxt.setText(pastedText);
            } catch (UnsupportedFlavorException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rutaTxt = new javax.swing.JTextField();
        jButtonListarD = new javax.swing.JButton();
        jButtonDOcultos = new javax.swing.JButton();
        jButtonListarA = new javax.swing.JButton();
        jButtonAOcultos = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListElementos = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoPanel = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCrear = new javax.swing.JMenuItem();
        jMenuRenombrar = new javax.swing.JMenuItem();
        jMenuEliminar = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Finder");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(182, 182, 182));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Ruta:");

        rutaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaTxt(evt);
            }
        });
        rutaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Pegar(evt);
            }
        });

        jButtonListarD.setText("Listar Directorios");
        jButtonListarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarDActionPerformed(evt);
            }
        });

        jButtonDOcultos.setText("Directorios Ocultos");
        jButtonDOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDOcultosActionPerformed(evt);
            }
        });

        jButtonListarA.setText("Listar Archivos");
        jButtonListarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarAActionPerformed(evt);
            }
        });

        jButtonAOcultos.setText("Archivos Ocultos ");
        jButtonAOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAOcultosActionPerformed(evt);
            }
        });

        jButtonMostrar.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        jButtonMostrar.setText("Mostrar Datos");
        jButtonMostrar.setEnabled(false);
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarAction(evt);
            }
        });

        jListElementos.setToolTipText("");
        jScrollPane1.setViewportView(jListElementos);

        jScrollPane3.setViewportView(jScrollPane1);

        infoPanel.setColumns(20);
        infoPanel.setRows(5);
        jScrollPane2.setViewportView(infoPanel);

        jScrollPane4.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rutaTxt)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonListarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonListarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonDOcultos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAOcultos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jButtonMostrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonListarD)
                            .addComponent(jButtonDOcultos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAOcultos)
                            .addComponent(jButtonListarA)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addComponent(jButtonMostrar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jMenu1.setText("Gestionar");

        jMenuCrear.setText("Crear");
        jMenuCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCrearActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCrear);

        jMenuRenombrar.setText("Renombrar");
        jMenuRenombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRenombrarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuRenombrar);

        jMenuEliminar.setText("Eliminar");
        jMenuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEliminar);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rutaTxt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaTxt
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaTxt

    private void jMenuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEliminarActionPerformed
        // TODO add your handling code here:
        String ruta = rutaTxt.getText();
        Gestiones g = new Gestiones();
        String e = jListElementos.getSelectedValue();
        if (e != null){
            File archivo = new File(ruta,e);
            g.eliminar(archivo);
        } else { 
            JOptionPane.showMessageDialog(null, "Seleccionar un elemento del Jlist");
        } 
    }//GEN-LAST:event_jMenuEliminarActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jButtonMostrarAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarAction
        // TODO add your handling code here:
        String ruta = rutaTxt.getText();
        String opcion = jListElementos.getSelectedValue();
        List<String> listaElementos = new ArrayList<>();

        File mostrar = new File(ruta, opcion);
        if (opcion != null) {
            if (mostrar.isFile()) {
                String nombre = mostrar.getName();
                String RutaA = mostrar.getPath();
                Boolean hidden = mostrar.isHidden();
                Boolean visible = mostrar.canRead();
                Boolean editable = mostrar.canWrite();
                long fecha = mostrar.lastModified();
                Date f = new Date(fecha);
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String fechaFormat = formato.format(f);

                long size = mostrar.length();

                infoPanel.append("Nombre: " + nombre + "\n" + "Ruta de acceso: " + RutaA + "\n" + "Oculto: " + hidden + "\n" + "Leible: " + visible + "\n" + "Editable: " + editable + "\n" + "Fecha de modificacion: " + fechaFormat + "\n" + "Tamaño: " + size + "bytes");
            }
            if (mostrar.isDirectory()) {
                File[] e = mostrar.listFiles();
                for (File i : e) {
                    listaElementos.add(i.getName());
                }
                for (String j : listaElementos) {
                    infoPanel.append(j + "\n");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento porfavor");
        }
    }//GEN-LAST:event_jButtonMostrarAction

    private void Pegar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pegar
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_V) && ((evt.getModifiers() & Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()) != 0)) {
            pasteFromClipboard();
        }
    }//GEN-LAST:event_Pegar

    private void jButtonListarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarDActionPerformed
        String ruta = rutaTxt.getText();
        jButtonMostrar.setEnabled(true);
        try {
            File directorio = new File(ruta);
            List<String> listaElementos = new ArrayList<>();
            if (directorio.exists() && directorio.isDirectory() && !directorio.isHidden()) {
                File[] elementos = directorio.listFiles();
                for (File a : elementos) {
                    if (!a.isHidden() && a.exists()) {
                        if (a.isDirectory() != false) {
                            cargarInfo(listaElementos, a);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ruta o el directorio no existe.");
            }
        } catch (HeadlessException e) {
            System.out.println("Error en la ruta" + e);
        }
    }//GEN-LAST:event_jButtonListarDActionPerformed

    private void jButtonListarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarAActionPerformed
        // TODO add your handling code here:
        jButtonMostrar.setEnabled(true);
        String ruta = rutaTxt.getText();
        try {
            File archivo = new File(ruta);
            List<String> listaElementos = new ArrayList<>();
            if (archivo.exists() && archivo.isDirectory() && !archivo.isHidden()) {
                File[] elementos = archivo.listFiles();
                for (File a : elementos) {
                    if (!a.isHidden() && a.exists()) {
                        if (a.isFile() != false) {
                            cargarInfo(listaElementos, a);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ruta no existe.");
            }
        } catch (HeadlessException e) {
            System.out.println("Error en la ruta" + e);
        }
    }//GEN-LAST:event_jButtonListarAActionPerformed

    private void jButtonDOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDOcultosActionPerformed
        // TODO add your handling code here:
        jButtonMostrar.setEnabled(true);
        String ruta = rutaTxt.getText();
        try {
            File directorio = new File(ruta);
            List<String> listaElementos = new ArrayList<>();
            if (directorio.exists() && directorio.isDirectory() && !directorio.isHidden()) {
                File[] elementos = directorio.listFiles();
                for (File a : elementos) {
                    if (a.isHidden() && a.exists()) {
                        if (a.isDirectory() != false) {
                            cargarInfo(listaElementos, a);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ruta o el directorio no existe.");
            }
        } catch (HeadlessException e) {
            System.out.println("Error en la ruta" + e);
        }
    }//GEN-LAST:event_jButtonDOcultosActionPerformed

    private void jButtonAOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAOcultosActionPerformed
        // TODO add your handling code here:
        jButtonMostrar.setEnabled(true);       
        String ruta = rutaTxt.getText();
        try {
            File directorio = new File(ruta);
            List<String> listaElementos = new ArrayList<>();
            if (directorio.exists() && directorio.isDirectory() && !directorio.isHidden()) {
                File[] elementos = directorio.listFiles();
                for (File a : elementos) {
                    if (a.isHidden() && a.exists()) {
                        if (a.isFile() != false) {
                            cargarInfo(listaElementos, a);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "La ruta o el directorio no existe.");
            }
        } catch (HeadlessException e) {
            System.out.println("Error en la ruta" + e);
        }
    }//GEN-LAST:event_jButtonAOcultosActionPerformed

    public void cargarInfo(List<String> listaElementos, File a) {
        listaElementos.add(a.getName());
        jListElementos.setListData(listaElementos.toArray(new String[0]));
    }
    private void jMenuCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCrearActionPerformed
        // TODO add your handling code here:
        String ruta = rutaTxt.getText();
        Gestiones g = new Gestiones();
        g.crear(ruta);
    }//GEN-LAST:event_jMenuCrearActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jMenuRenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRenombrarActionPerformed
        // TODO add your handling code here:
        String ruta = rutaTxt.getText();
        Gestiones g = new Gestiones();
        g.renombrar(ruta);
    }//GEN-LAST:event_jMenuRenombrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new Principal());
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea infoPanel;
    private javax.swing.JButton jButtonAOcultos;
    private javax.swing.JButton jButtonDOcultos;
    private javax.swing.JButton jButtonListarA;
    private javax.swing.JButton jButtonListarD;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListElementos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCrear;
    private javax.swing.JMenuItem jMenuEliminar;
    private javax.swing.JMenuItem jMenuRenombrar;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField rutaTxt;
    // End of variables declaration//GEN-END:variables
}
