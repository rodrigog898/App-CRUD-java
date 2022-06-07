/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.DAOCamara;
import Entidades.Camara;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class NegCamara {
    public ArrayList<Camara> listartodo()
    {
        try{
        ArrayList<Camara> vhi = new ArrayList<Camara>();
        DAOCamara dat_vhi = new DAOCamara();
        vhi = dat_vhi.listartodo();
        return vhi;
        }catch(Exception e)
        {
           return null; 
        }
                
    }
    
    public boolean crear(Camara o)
    {
        DAOCamara davhi = new DAOCamara();
        
        if (davhi.crear(o))
        {
            
            return true;
        }
        else
        {
            return false;
        
        }
    }
    public boolean modificar(Camara o)
    {
        DAOCamara davhi = new DAOCamara();
        
        if (davhi.modificar(o))
        {
            
            return true;
        }
        else
        {
            return false;
        
        }
    }
        public boolean eliminar(Camara o)
    {
        DAOCamara davhi = new DAOCamara();
        
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
