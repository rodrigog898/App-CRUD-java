/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import Entidades.Notebook;
import Interface.iCRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
public class DAONotebook implements iCRUD <Notebook> {
    private static String selecAllCA = "select*from notebook ";
    private static String InsertNO = "INSERT INTO notebook (id,marca,modelo,procesador,ram,grafica,almacenamiento) VALUES (?,?,?,?,?,?,?)";
    private static String UpdateCA = "update notebook set marca= ? ,modelo = ?,procesador = ?,ram = ?,grafica = ?,almacenamiento = ? where id = ?"; 
    private static Conexion objConn = Conexion.InstanciaConn();
    private static String deleteCA = "delete from notebook where id = ?";
    
    private ResultSet rs;
    
    @Override
    public boolean crear(Notebook o) {
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(InsertNO);
            ps.setString(1, o.getId());
            ps.setString(2, o.getMarca());
            ps.setString(3, o.getModelo());
            ps.setString(4, o.getProcesador());
            ps.setString(5, o.getRam());
            ps.setString(6, o.getGrafica());
            ps.setString(7, o.getAlmacenamiento());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAONotebook.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   
    }

    @Override
    public boolean eliminar(Notebook o) {
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(deleteCA);
            ps.setString(1, o.getId());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAONotebook.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    

    @Override
    public Notebook editar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Notebook o) 
    {
        
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(UpdateCA);
            ps.setString(7, o.getId());
            ps.setString(1, o.getMarca());
            ps.setString(2, o.getModelo());
            ps.setString(3, o.getProcesador());
            ps.setString(4, o.getRam());
            ps.setString(5, o.getGrafica());
            ps.setString(6, o.getAlmacenamiento());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAONotebook.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      
        
    }

    @Override
    public ArrayList<Notebook> listartodo() {
        try {
            ArrayList<Notebook> not = new ArrayList<Notebook>();
            PreparedStatement ps;
            
            ps = objConn.getConn().prepareStatement(selecAllCA);
            rs = ps.executeQuery();
            while(rs.next())
            {
                
                not.add(new Notebook(rs.getString("id"),rs.getString("marca"),rs.getString("modelo"),rs.getString("procesador"),rs.getString("ram"),rs.getString("grafica"),rs.getString("almacenamiento")) );
            }
                
                    return not;
        } catch (SQLException ex) {
            Logger.getLogger(DAONotebook.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
