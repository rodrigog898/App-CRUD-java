/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Negocio.NegCamara;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo
 */
public class Camara extends javax.swing.JInternalFrame {

    /**
     * Creates new form Camara
     */
    public Camara() {
        initComponents();
        llenartablaca();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtmemoria = new javax.swing.JTextField();
        txtmegapixeles = new javax.swing.JTextField();
        txtaccesorios = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 204)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Stock Camaras");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/cubo.png"))); // NOI18N

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Lucida Fax", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Memoria", "Megapixeles", "Accesorios"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/camera (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel2.setText("Stock De Camaras");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        jLabel4.setText("Marca");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("Modelo");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setText("Memoria");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setText("Megapixeles");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setText("Accesorios");

        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel9.setText("Stock Disponible");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addComponent(txtmemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3))
                                        .addComponent(jLabel8))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtaccesorios, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtmegapixeles, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnmodificar)
                                        .addComponent(btneliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(jLabel9))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnagregar)
                        .addGap(19, 19, 19)
                        .addComponent(btneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnmodificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtmegapixeles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaccesorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        AgregarCA();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        modificarca();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminarMa();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
        if (fila ==-1)
        {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar un cliente");
        }
        else
        {
            String id = (String)jTable1.getValueAt(fila,0);
            String marca = (String)jTable1.getValueAt(fila,1);
            String modelo = (String)jTable1.getValueAt(fila,2);
            String memoria = (String)jTable1.getValueAt(fila,3);
            String mpx = (String)jTable1.getValueAt(fila,4);
            String accesorios = (String)jTable1.getValueAt(fila,5);

            txtid.setText(id);
            txtmarca.setText(marca);
            txtmodelo.setText(modelo);
            txtmemoria.setText(memoria);
            txtmegapixeles.setText(mpx);
            txtaccesorios.setText(accesorios);

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaActionPerformed
void llenartablaca()
    {
       ArrayList<Entidades.Camara> l_ca = new ArrayList<Entidades.Camara>(); 
       NegCamara ng_ca = new NegCamara();
       l_ca = ng_ca.listartodo();
       
       
       DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
       Object [] fila = new Object [6];
       for(Entidades.Camara C: l_ca)
       {
           fila[0] = C.getId();
           fila[1] = C.getMarca();
           fila[2] = C.getModelo();
           fila[3] = C.getMemoria();
           fila[4] = C.getMpx();
           fila[5] = C.getAccesorios();
           modelo.addRow(fila);
                   
       }
       jTable1.setModel(modelo);
    }
    void AgregarCA()
    {
        String id = txtid.getText();
        String marca =  txtmarca.getText();
        String Modelo = txtmodelo.getText();
        String memoria = txtmemoria.getText();
        String mpx = txtmegapixeles.getText();
        String accesorios = txtaccesorios.getText();
        
        if(marca.equals("")||Modelo.equals("")||memoria.equals("")||mpx.equals("")||accesorios.equals("")){
            JOptionPane.showMessageDialog(null,"Todos los daton son obligatorios");
            
        }
        else 
        {
          Entidades.Camara CA = new Entidades.Camara();
          NegCamara nca = new NegCamara();
          CA.setId(id);
          CA.setMarca(marca);
          CA.setModelo(Modelo);
          CA.setMemoria(memoria);
          CA.setMpx(mpx);
          CA.setAccesorios(accesorios);
          if(nca.crear(CA))
          {
            JOptionPane.showMessageDialog(null,"Camara Agregado");
            refrescartabla();
              
          }
          else
          {
            JOptionPane.showMessageDialog(null,"No se pudo Agregar la Camara");
            
          }
         
        }
    }
    void modificarca()
    {
        String id = txtid.getText();
        String marca =  txtmarca.getText();
        String Modelo = txtmodelo.getText();
        String memoria = txtmemoria.getText();
        String mpx = txtmegapixeles.getText();
        String accesorios = txtaccesorios.getText();

        
        if(marca.equals("")||Modelo.equals("")||memoria.equals("")||mpx.equals("")||accesorios.equals("")){
            JOptionPane.showMessageDialog(null,"Todos los daton son obligatorios");
            
        }
        else 
        {
          Entidades.Camara vhi = new Entidades.Camara();
          NegCamara nVhi = new NegCamara();
          vhi.setId(id);
          vhi.setMarca(marca);
          vhi.setModelo(Modelo);
          vhi.setMemoria(memoria);
          vhi.setMpx(mpx);
          vhi.setAccesorios(accesorios);



          if(nVhi.modificar(vhi))
          {
            JOptionPane.showMessageDialog(null,"Camara Modificada ");
            refrescartabla();
              
          }
          else
          {
            JOptionPane.showMessageDialog(null,"No se pudo modificar la Camara");
            
          }
          limpiarCamposMa();
        }
    }
    void eliminarMa()
    {
        String id = txtid.getText();

        Entidades.Camara vhi = new Entidades.Camara();
        NegCamara nVhi = new NegCamara();
        vhi.setId(id);
        if(nVhi.eliminar(vhi))
        {
           JOptionPane.showMessageDialog(null,"Camara eliminada del Stock");
           refrescartabla();
              
        }
        else
        {
          JOptionPane.showMessageDialog(null,"No se pudo eliminado la Camara");
            
        }
        limpiarCamposMa();
        }

    void limpiarCamposMa()
    {
        txtid.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        txtmemoria.setText("");
        txtmegapixeles.setText("");
        txtaccesorios.setText("");

    }
    void refrescartabla()
    {
        DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
        dm.getDataVector().removeAllElements();
        llenartablaca();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaccesorios;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmegapixeles;
    private javax.swing.JTextField txtmemoria;
    private javax.swing.JTextField txtmodelo;
    // End of variables declaration//GEN-END:variables
}
