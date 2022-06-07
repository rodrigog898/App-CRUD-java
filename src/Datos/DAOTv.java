/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;



import Entidades.Tv;
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
public class DAOTv implements iCRUD <Tv> {
    private static String selecAllCA = "select*from television";
    private static String InsertNO = "INSERT INTO television (id,marca,modelo,pulgada,cantidadentradas) VALUES (?,?,?,?,?)";
    private static String UpdateCA = "update television set marca= ? ,modelo = ?,pulgada = ?,cantidadentradas = ? where id=?"; 
    private static Conexion objConn = Conexion.InstanciaConn();
    private static String deleteCA = "delete from television where id = ?";
    
    private ResultSet rs;
    
    @Override
    public boolean crear(Tv o) {
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(InsertNO);
            ps.setString(1, o.getId());
            ps.setString(2, o.getMarca());
            ps.setString(3, o.getModelo());
            ps.setString(4, o.getPulgadas());
            ps.setString(5, o.getCantidadentradas());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOTv.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   
    }

    @Override
    public boolean eliminar(Tv o) {
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(deleteCA);
            ps.setString(1, o.getId());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOTv.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    

    @Override
    public Tv editar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Tv o) 
    {
        
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(UpdateCA);
            ps.setString(5, o.getId());
            ps.setString(1, o.getMarca());
            ps.setString(2, o.getModelo());
            ps.setString(3, o.getPulgadas());
            ps.setString(4, o.getCantidadentradas());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOTv.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      
        
    }

    @Override
    public ArrayList<Tv> listartodo() {
        try {
            ArrayList<Tv> not = new ArrayList<Tv>();
            PreparedStatement ps;
            
            ps = objConn.getConn().prepareStatement(selecAllCA);
            rs = ps.executeQuery();
            while(rs.next())
            {
                
                not.add(new Tv(rs.getString("id"),rs.getString("marca"),rs.getString("modelo"),rs.getString("pulgada"),rs.getString("cantidadentradas")) );
            }
                
                    return not;
        } catch (SQLException ex) {
            Logger.getLogger(DAOTv.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
    
    
}
