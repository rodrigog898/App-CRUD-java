/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


import Datos.DAONotebook;
import Entidades.Notebook;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class NegNotebook {
    public ArrayList<Notebook> listartodo()
    {
        try{
        ArrayList<Notebook> vhi = new ArrayList<Notebook>();
        DAONotebook dat_vhi = new DAONotebook();
        vhi = dat_vhi.listartodo();
        return vhi;
        }catch(Exception e)
        {
           return null; 
        }
                
    }
    
    public boolean crear(Notebook o)
    {
        DAONotebook davhi = new DAONotebook();
        
        if (davhi.crear(o))
        {
            
            return true;
        }
        else
        {
            return false;
        
        }
    }
    public boolean modificar(Notebook o)
    {
        DAONotebook davhi = new DAONotebook();
        
        if (davhi.modificar(o))
        {
            
            return true;
        }
        else
        {
            return false;
        
        }
    }
        public boolean eliminar(Notebook o)
    {
        DAONotebook davhi = new DAONotebook();
        
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
