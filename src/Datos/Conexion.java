/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
public class Conexion {
    public static Conexion instConn;
    private Connection conn;
    
    private Conexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/distribuidora", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public synchronized static Conexion InstanciaConn(){
        
        if (instConn==null){
            instConn = new Conexion();
            
        }
        return instConn;
    }
    public Connection getConn()
    {
        return conn;
    }
    public void Cerrar()
    {
        instConn = null;
    }
    
}
