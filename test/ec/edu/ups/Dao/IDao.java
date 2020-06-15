/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Dao;

import ec.edu.ups.modelo.Telefono;
import java.util.List;

/**
 *
 * @author braya
 */
public interface IDao {
    public void crearTelefono(Telefono telefono);
    //public Telefono leerTelefonos();
    public List<Telefono> mostrarTelefonos();
}
