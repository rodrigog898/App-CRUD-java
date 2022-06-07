/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


import Datos.DAOTecladogamer;
import Entidades.TecladoGamer;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class NegTecladoGamer {
    public ArrayList<TecladoGamer> listartodo()
    {
        try{
        ArrayList<TecladoGamer> vhi = new ArrayList<TecladoGamer>();
        DAOTecladogamer dat_vhi = new DAOTecladogamer();
        vhi = dat_vhi.listartodo();
        return vhi;
        }catch(Exception e)
        {
           return null; 
        }
                
    }
    
    public boolean crear(TecladoGamer o)
    {
        DAOTecladogamer davhi = new DAOTecladogamer();
        
        if (davhi.crear(o))
        {
            
            return true;
        }
        else
        {
            return false;
        
        }
    }
    public boolean modificar(TecladoGamer o)
    {
        DAOTecladogamer davhi = new DAOTecladogamer();
        
        if (davhi.modificar(o))
        {
            
            return true;
        }
        else
        {
            return false;
        
        }
    }
        public boolean eliminar(TecladoGamer o)
    {
        DAOTecladogamer davhi = new DAOTecladogamer();
        
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
