/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;


import Negocio.NegTv;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo
 */
public class tv extends javax.swing.JInternalFrame {

    /**
     * Creates new form tv
     */
    public tv() {
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
        Modelo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtpulgadas = new javax.swing.JTextField();
        txtentradas = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 255)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Pulgadas", "Cant Entradas"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("ID");

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        jLabel4.setText("Pulgadas");

        jLabel5.setText("Cant Entradas");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtentradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtentradasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModeloLayout = new javax.swing.GroupLayout(Modelo);
        Modelo.setLayout(ModeloLayout);
        ModeloLayout.setHorizontalGroup(
            ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModeloLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ModeloLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtentradas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ModeloLayout.createSequentialGroup()
                        .addGroup(ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ModeloLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19))
                            .addComponent(jLabel2))
                        .addGap(49, 49, 49)
                        .addGroup(ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmarca)
                            .addComponent(txtid)))
                    .addGroup(ModeloLayout.createSequentialGroup()
                        .addGroup(ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(ModeloLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)))
                        .addGap(36, 36, 36)
                        .addGroup(ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpulgadas)
                            .addComponent(txtmodelo))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        ModeloLayout.setVerticalGroup(
            ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModeloLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtmodelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtpulgadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtentradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btneliminar)
                    .addComponent(btnmodificar)
                    .addComponent(btnagregar))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnagregar)
                .addGap(18, 18, 18)
                .addComponent(btnmodificar)
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel6.setText("Stock Television");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/television.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        AgregarCA();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void txtentradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtentradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtentradasActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        modificarca();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminarMa();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

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
            String pulgadas = (String)jTable1.getValueAt(fila,3);
            String entradas = (String)jTable1.getValueAt(fila,4);
            

            txtid.setText(id);
            txtmarca.setText(marca);
            txtmodelo.setText(modelo);
            txtpulgadas.setText(pulgadas);
            txtentradas.setText(entradas);
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

void llenartablaca()
    {
       ArrayList<Entidades.Tv> l_ca = new ArrayList<Entidades.Tv>(); 
       NegTv ng_ca = new NegTv();
       l_ca = ng_ca.listartodo();
       
       
       DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
       Object [] fila = new Object [5];
       for(Entidades.Tv C: l_ca)
       {
           fila[0] = C.getId();
           fila[1] = C.getMarca();
           fila[2] = C.getModelo();
           fila[3] = C.getPulgadas();
           fila[4] = C.getCantidadentradas();
           
           modelo.addRow(fila);
                   
       }
       jTable1.setModel(modelo);
    }
    void AgregarCA()
    {
        String id = txtid.getText();
        String marca =  txtmarca.getText();
        String Modelo = txtmodelo.getText();
        String pulgadas = txtpulgadas.getText();
        String entradas = txtentradas.getText();
       
        
        
        if(marca.equals("")||Modelo.equals("")||pulgadas.equals("")|entradas.equals("")){
            JOptionPane.showMessageDialog(null,"Todos los daton son obligatorios");
            
        }
        else 
        {
          Entidades.Tv CA = new Entidades.Tv();
          NegTv nca = new NegTv();
          CA.setId(id);
          CA.setMarca(marca);
          CA.setModelo(Modelo);
          CA.setPulgadas(pulgadas);
          CA.setCantidadentradas(entradas);
          
          
          if(nca.crear(CA))
          {
            JOptionPane.showMessageDialog(null,"Television Agregado");
            refrescartabla();
              
          }
          else
          {
            JOptionPane.showMessageDialog(null,"No se pudo Agregar la Television");
            
          }
         
        }
    }
    void modificarca()
    {
        String id = txtid.getText();
        String marca =  txtmarca.getText();
        String Modelo = txtmodelo.getText();
        String pulgada = txtpulgadas.getText();
        String entrada = txtentradas.getText();
        

        if(marca.equals("")||Modelo.equals("")||pulgada.equals("")||entrada.equals("")){
            JOptionPane.showMessageDialog(null,"Todos los daton son obligatorios");
            
        }
        else 
        {
          Entidades.Tv vhi = new Entidades.Tv();
          NegTv nVhi = new NegTv();
          vhi.setId(id);
          vhi.setMarca(marca);
          vhi.setModelo(Modelo);
          vhi.setPulgadas(pulgada);
          vhi.setCantidadentradas(entrada);
         

          if(nVhi.modificar(vhi))
          {
            JOptionPane.showMessageDialog(null,"Television Modificado ");
            refrescartabla();
              
          }
          else
          {
            JOptionPane.showMessageDialog(null,"No se pudo modificar el Television");
            
          }
          limpiarCamposMa();
        }
    }
    void eliminarMa()
    {
        String id = txtid.getText();

        Entidades.Tv vhi = new Entidades.Tv();
        NegTv nVhi = new NegTv();
        vhi.setId(id);
        if(nVhi.eliminar(vhi))
        {
           JOptionPane.showMessageDialog(null,"Television eliminada del Stock");
           refrescartabla();
              
        }
        else
        {
          JOptionPane.showMessageDialog(null,"No se pudo eliminado el Televisor");
            
        }
        limpiarCamposMa();
        }

    void limpiarCamposMa()
    {
        txtid.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        txtpulgadas.setText("");
        txtentradas.setText("");
        
        

    }
    void refrescartabla()
    {
        DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
        dm.getDataVector().removeAllElements();
        llenartablaca();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Modelo;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtentradas;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtpulgadas;
    // End of variables declaration//GEN-END:variables
}
