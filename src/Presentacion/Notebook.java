/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;


import Negocio.NegNotebook;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo
 */
public class Notebook extends javax.swing.JInternalFrame {

    /**
     * Creates new form Notebook
     */
    public Notebook() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtprocesador = new javax.swing.JTextField();
        txtram = new javax.swing.JTextField();
        txtgrafica = new javax.swing.JTextField();
        txtalmacenamiento = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setForeground(java.awt.Color.pink);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Stock Computadores");
        setFont(new java.awt.Font("Bodoni MT Condensed", 0, 18)); // NOI18N
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/cubo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel1.setText("Stock Computadores");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/pc.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Procesador", "Ram", "Grafica", "Almacenamiento"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Marca");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("Modelo");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setText("Procesador");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setText("Ram");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setText("Grafica");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setText("Almacenamiento");

        txtprocesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprocesadorActionPerformed(evt);
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

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel10.setText("Stock Disponible");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btneliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnmodificar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtgrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtalmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtram, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel10)))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnagregar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmodificar)
                            .addComponent(txtram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtgrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtalmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void txtprocesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprocesadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprocesadorActionPerformed

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
            String procesador = (String)jTable1.getValueAt(fila,3);
            String ram = (String)jTable1.getValueAt(fila,4);
            String grafica = (String)jTable1.getValueAt(fila,5);
            String almacenamiento = (String)jTable1.getValueAt(fila,6);

            txtid.setText(id);
            txtmarca.setText(marca);
            txtmodelo.setText(modelo);
            txtprocesador.setText(procesador);
            txtram.setText(ram);
            txtgrafica.setText(grafica);
            txtalmacenamiento.setText(almacenamiento);

        }
    }//GEN-LAST:event_jTable1MouseClicked
void llenartablaca()
    {
       ArrayList<Entidades.Notebook> l_ca = new ArrayList<Entidades.Notebook>(); 
       NegNotebook ng_ca = new NegNotebook();
       l_ca = ng_ca.listartodo();
       
       
       DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
       Object [] fila = new Object [7];
       for(Entidades.Notebook C: l_ca)
       {
           fila[0] = C.getId();
           fila[1] = C.getMarca();
           fila[2] = C.getModelo();
           fila[3] = C.getProcesador();
           fila[4] = C.getRam();
           fila[5] = C.getGrafica();
           fila[6] = C.getAlmacenamiento();
           modelo.addRow(fila);
                   
       }
       jTable1.setModel(modelo);
    }
    void AgregarCA()
    {
        String id = txtid.getText();
        String marca =  txtmarca.getText();
        String Modelo = txtmodelo.getText();
        String procesador = txtprocesador.getText();
        String ram = txtram.getText();
        String grafica = txtgrafica.getText();
        String almacenamiento = txtalmacenamiento.getText();
        
        if(marca.equals("")||Modelo.equals("")||procesador.equals("")||ram.equals("")||grafica.equals("")||almacenamiento.equals("")){
            JOptionPane.showMessageDialog(null,"Todos los daton son obligatorios");
            
        }
        else 
        {
          Entidades.Notebook CA = new Entidades.Notebook();
          NegNotebook nca = new NegNotebook();
          CA.setId(id);
          CA.setMarca(marca);
          CA.setModelo(Modelo);
          CA.setProcesador(procesador);
          CA.setRam(ram);
          CA.setGrafica(grafica);
          CA.setAlmacenamiento(almacenamiento);
          if(nca.crear(CA))
          {
            JOptionPane.showMessageDialog(null,"Notebook Agregado");
            refrescartabla();
              
          }
          else
          {
            JOptionPane.showMessageDialog(null,"No se pudo Agregar el Notebook");
            
          }
         
        }
    }
    void modificarca()
    {
        String id = txtid.getText();
        String marca =  txtmarca.getText();
        String Modelo = txtmodelo.getText();
        String procesador = txtprocesador.getText();
        String ram = txtram.getText();
        String grafica = txtgrafica.getText();
        String almacenamiento = txtalmacenamiento.getText();

        
        if(marca.equals("")||Modelo.equals("")||procesador.equals("")||ram.equals("")||grafica.equals("")||almacenamiento.equals("")){
            JOptionPane.showMessageDialog(null,"Todos los daton son obligatorios");
            
        }
        else 
        {
          Entidades.Notebook vhi = new Entidades.Notebook();
          NegNotebook nVhi = new NegNotebook();
          vhi.setId(id);
          vhi.setMarca(marca);
          vhi.setModelo(Modelo);
          vhi.setProcesador(procesador);
          vhi.setRam(ram);
          vhi.setGrafica(grafica);
          vhi.setAlmacenamiento(almacenamiento);




          if(nVhi.modificar(vhi))
          {
            JOptionPane.showMessageDialog(null,"Notebook Modificado ");
            refrescartabla();
              
          }
          else
          {
            JOptionPane.showMessageDialog(null,"No se pudo modificar el Notebook");
            
          }
          limpiarCamposMa();
        }
    }
    void eliminarMa()
    {
        String id = txtid.getText();

        Entidades.Notebook vhi = new Entidades.Notebook();
        NegNotebook nVhi = new NegNotebook();
        vhi.setId(id);
        if(nVhi.eliminar(vhi))
        {
           JOptionPane.showMessageDialog(null,"Notebook eliminada del Stock");
           refrescartabla();
              
        }
        else
        {
          JOptionPane.showMessageDialog(null,"No se pudo eliminado la Notebook");
            
        }
        limpiarCamposMa();
        }

    void limpiarCamposMa()
    {
        txtid.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        txtprocesador.setText("");
        txtram.setText("");
        txtgrafica.setText("");
        txtalmacenamiento.setText("");

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
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txtalmacenamiento;
    private javax.swing.JTextField txtgrafica;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtprocesador;
    private javax.swing.JTextField txtram;
    // End of variables declaration//GEN-END:variables
}
