/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;



import Entidades.Telefono;
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
public class DAOTelefono implements iCRUD <Telefono> {
    private static String selecAllCA = "select*from telefono ";
    private static String InsertNO = "INSERT INTO telefono (imei,marca,modelo,color,mpxcamara,ram) VALUES (?,?,?,?,?,?)";
    private static String UpdateCA = "update telefono set marca= ? ,modelo = ?,color = ?,mpxcamara = ?,ram = ? where imei=?"; 
    private static Conexion objConn = Conexion.InstanciaConn();
    private static String deleteCA = "delete from telefono where imei = ?";
    
    private ResultSet rs;
    
    @Override
    public boolean crear(Telefono o) {
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(InsertNO);
            ps.setString(1, o.getImei());
            ps.setString(2, o.getMarca());
            ps.setString(3, o.getModelo());
            ps.setString(4, o.getColor());
            ps.setString(5, o.getMpxcamara());
            ps.setString(6, o.getRam());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOTelefono.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   
    }

    @Override
    public boolean eliminar(Telefono o) {
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(deleteCA);
            ps.setString(1, o.getImei());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOTelefono.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    

    @Override
    public Telefono editar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Telefono o) 
    {
        
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(UpdateCA);
            ps.setString(6, o.getImei());
            ps.setString(1, o.getMarca());
            ps.setString(2, o.getModelo());
            ps.setString(3, o.getColor());
            ps.setString(4, o.getMpxcamara());
            ps.setString(5, o.getRam());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOTelefono.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      
        
    }

    @Override
    public ArrayList<Telefono> listartodo() {
        try {
            ArrayList<Telefono> not = new ArrayList<Telefono>();
            PreparedStatement ps;
            
            ps = objConn.getConn().prepareStatement(selecAllCA);
            rs = ps.executeQuery();
            while(rs.next())
            {
                
                not.add(new Telefono(rs.getString("imei"),rs.getString("marca"),rs.getString("modelo"),rs.getString("color"),rs.getString("mpxcamara"),rs.getString("ram")) );
            }
                
                    return not;
        } catch (SQLException ex) {
            Logger.getLogger(DAOTelefono.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
}
