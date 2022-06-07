/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.Toolkit;







/**
 *
 * @author Rodrigo
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Presentacion/cubo.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuItem3 = new javax.swing.JMenuItem();
        desktop = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_productos = new javax.swing.JMenu();
        mn_camara = new javax.swing.JMenuItem();
        mnnote = new javax.swing.JMenuItem();
        Tecladogamer = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/empresa.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop.setBackground(new java.awt.Color(0, 0, 0));
        desktop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bodega Espacio Terrestre");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/thumb-1920-44975.jpg"))); // NOI18N

        desktop.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3))
            .addComponent(jLabel2)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel3))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        mn_productos.setText("Productos");
        mn_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_productosActionPerformed(evt);
            }
        });

        mn_camara.setText("Camara");
        mn_camara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_camaraActionPerformed(evt);
            }
        });
        mn_productos.add(mn_camara);

        mnnote.setText("Notebook");
        mnnote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnnoteActionPerformed(evt);
            }
        });
        mn_productos.add(mnnote);

        Tecladogamer.setText("Teclado");
        Tecladogamer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladogamerActionPerformed(evt);
            }
        });
        mn_productos.add(Tecladogamer);

        jMenuItem2.setText("Telefono");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mn_productos.add(jMenuItem2);

        jMenuItem1.setText("Television");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mn_productos.add(jMenuItem1);

        jMenuBar1.add(mn_productos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mn_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_productosActionPerformed

    }//GEN-LAST:event_mn_productosActionPerformed

    private void mnnoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnnoteActionPerformed
        Notebook note_mn = new Notebook();
        desktop.add(note_mn);
        note_mn.show();
    }//GEN-LAST:event_mnnoteActionPerformed

    private void mn_camaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_camaraActionPerformed
        Camara cam_mn = new Camara();
        desktop.add(cam_mn);
        cam_mn.show();
    }//GEN-LAST:event_mn_camaraActionPerformed

    private void TecladogamerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladogamerActionPerformed
       Tecladogamer te_mn = new Tecladogamer();
       desktop.add(te_mn);
       
       te_mn.show();
    }//GEN-LAST:event_TecladogamerActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Telefono cam_mn = new Telefono();
        desktop.add(cam_mn);
        cam_mn.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        tv cam_mn = new tv();
        desktop.add(cam_mn);
        cam_mn.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Tecladogamer;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mn_camara;
    private javax.swing.JMenu mn_productos;
    private javax.swing.JMenuItem mnnote;
    // End of variables declaration//GEN-END:variables
}