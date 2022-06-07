/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;



import Entidades.TecladoGamer;
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
public class DAOTecladogamer implements iCRUD <TecladoGamer> {
    private static String selecAllCA = "select*from teclado ";
    private static String InsertNO = "INSERT INTO teclado (id,marca,modelo,switch,color,velocidad,cantidadteclas) VALUES (?,?,?,?,?,?,?)";
    private static String UpdateCA = "update teclado set marca= ? ,modelo = ?,switch = ?,color = ?,velocidad = ?,cantidadteclas = ? where id = ?"; 
    private static Conexion objConn = Conexion.InstanciaConn();
    private static String deleteCA = "delete from teclado where id = ?";
    
    private ResultSet rs;
    
    @Override
    public boolean crear(TecladoGamer o) {
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(InsertNO);
            ps.setString(1, o.getId());
            ps.setString(2, o.getMarca());
            ps.setString(3, o.getModelo());
            ps.setString(4, o.getSwitchs());
            ps.setString(5, o.getColor());
            ps.setString(6, o.getVelocidad());
            ps.setString(7, o.getCantidadteclas());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOTecladogamer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   
    }

    @Override
    public boolean eliminar(TecladoGamer o) {
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(deleteCA);
            ps.setString(1, o.getId());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOTecladogamer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    

    @Override
    public TecladoGamer editar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(TecladoGamer o) 
    {
        
        try {
            PreparedStatement ps = objConn.getConn().prepareStatement(UpdateCA);
            ps.setString(7, o.getId());
            ps.setString(1, o.getMarca());
            ps.setString(2, o.getModelo());
            ps.setString(3, o.getSwitchs());
            ps.setString(4, o.getColor());
            ps.setString(5, o.getVelocidad());
            ps.setString(6, o.getCantidadteclas());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOTecladogamer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      
        
    }

    @Override
    public ArrayList<TecladoGamer> listartodo() {
        try {
            ArrayList<TecladoGamer> not = new ArrayList<TecladoGamer>();
            PreparedStatement ps;
            
            ps = objConn.getConn().prepareStatement(selecAllCA);
            rs = ps.executeQuery();
            while(rs.next())
            {
                
                not.add(new TecladoGamer(rs.getString("id"),rs.getString("marca"),rs.getString("modelo"),rs.getString("switch"),rs.getString("color"),rs.getString("velocidad"),rs.getString("cantidadteclas")) );
            }
                
                    return not;
        } catch (SQLException ex) {
            Logger.getLogger(DAONotebook.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
}
