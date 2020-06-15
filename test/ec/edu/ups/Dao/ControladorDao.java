/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Dao;

import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author braya
 */
public class ControladorDao implements IDao{
    private HashMap<Integer,Telefono> telefonoslista;

    public ControladorDao() {
        telefonoslista = new HashMap<>();
    }
    
    @Override
    public void crearTelefono(Telefono telefono) {
        telefonoslista.put(telefono.hashCode(), telefono);
    }

//    @Override
//    public Telefono leerTelefonos() {
//        return telefonoslista;
//    }

    
    @Override
    public List<Telefono> mostrarTelefonos() {
        return new ArrayList<>(telefonoslista.values());
    }
    
}
