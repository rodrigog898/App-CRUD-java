/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidades.Camara;
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
public class DAOCamara implements iCRUD <Camara> {
    private static String selecAllCA = "select*from camara";
    private static String InsertCA = "INSERT INTO camara (id,marca,modelo,memoria,mpx,accesorios) VALUES (?,?,?,?,?,?)";
    private static String UpdateCA = "update camara set marca= ? ,modelo = ?,memoria = ?,mpx = ?,accesorios = ? where id = ?"; 
    private static Conexion objConn = Conexion.InstanciaConn();
    private static String deleteCA = "delete from camara where id = ?";
    
    private ResultSet rs;
    
    @Override
    public boolean crear(Camara o) {
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(InsertCA);
            ps.setString(1, o.getId());
            ps.setString(2, o.getMarca());
            ps.setString(3, o.getModelo());
            ps.setString(4, o.getMemoria());
            ps.setString(5, o.getMpx());
            ps.setString(6, o.getAccesorios());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCamara.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   
    }

    @Override
    public boolean eliminar(Camara o) {
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(deleteCA);
            ps.setString(1, o.getId());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCamara.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    

    @Override
    public Camara editar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Camara o) 
    {
        
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(UpdateCA);
            ps.setString(6, o.getId());
            ps.setString(1, o.getMarca());
            ps.setString(2, o.getModelo());
            ps.setString(3, o.getMemoria());
            ps.setString(4, o.getMpx());
            ps.setString(5, o.getAccesorios());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCamara.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      
        
    }

    @Override
    public ArrayList<Camara> listartodo() {
        try {
            ArrayList<Camara> cam = new ArrayList<Camara>();
            PreparedStatement ps;
            
            ps = objConn.getConn().prepareStatement(selecAllCA);
            rs = ps.executeQuery();
            while(rs.next())
            {
                cam.add(new Camara(rs.getString("id"),rs.getString("marca"),rs.getString("modelo"),rs.getString("memoria"),rs.getString("mpx"),rs.getString("accesorios")) );
            }
                
                    return cam;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCamara.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
    

