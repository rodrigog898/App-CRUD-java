/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public interface iCRUD <Objeto> {
    public boolean crear(Objeto o);
    public boolean eliminar(Objeto o);
    public Objeto editar(int id );
    public boolean modificar(Objeto o);
    public ArrayList<Objeto> listartodo();
    
}
