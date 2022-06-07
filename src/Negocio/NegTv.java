/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


import Datos.DAOTv;
import Entidades.Tv;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class NegTv {
    public ArrayList<Tv> listartodo()
    {
        try{
        ArrayList<Tv> vhi = new ArrayList<Tv>();
        DAOTv dat_vhi = new DAOTv();
        vhi = dat_vhi.listartodo();
        return vhi;
        }catch(Exception e)
        {
           return null; 
        }
                
    }
    
    public boolean crear(Tv o)
    {
        DAOTv davhi = new DAOTv();
        
        if (davhi.crear(o))
        {
            
            return true;
        }
        else
        {
            return false;
        
        }
    }
    public boolean modificar(Tv o)
    {
        DAOTv davhi = new DAOTv();
        
        if (davhi.modificar(o))
        {
            
            return true;
        }
        else
        {
            return false;
        
        }
    }
        public boolean eliminar(Tv o)
    {
        DAOTv davhi = new DAOTv();
        
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
