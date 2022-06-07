/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


import Datos.DAOTelefono;
import Entidades.Telefono;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class NegTelefono {
    public ArrayList<Telefono> listartodo()
    {
        try{
        ArrayList<Telefono> vhi = new ArrayList<Telefono>();
        DAOTelefono dat_vhi = new DAOTelefono();
        vhi = dat_vhi.listartodo();
        return vhi;
        }catch(Exception e)
        {
           return null; 
        }
                
    }
    
    public boolean crear(Telefono o)
    {
        DAOTelefono davhi = new DAOTelefono();
        
        if (davhi.crear(o))
        {
            
            return true;
        }
        else
        {
            return false;
        
        }
    }
    public boolean modificar(Telefono o)
    {
        DAOTelefono davhi = new DAOTelefono();
        
        if (davhi.modificar(o))
        {
            
            return true;
        }
        else
        {
            return false;
        
        }
    }
        public boolean eliminar(Telefono o)
    {
        DAOTelefono davhi = new DAOTelefono();
        
        if (davhi.eliminar(o))
        {
            
            return true;
        }
        else
        {
            return false;
        
        }
    }
    
}
