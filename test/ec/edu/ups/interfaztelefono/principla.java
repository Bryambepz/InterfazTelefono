/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaztelefono;

import ec.edu.ups.Dao.ControladorDao;
import ec.edu.ups.Dao.IDao;
import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;

/**
 *
 * @author braya
 */
public class principla {
        static Telefono modelo = new Telefono();
        static VistaTelefono vista = new VistaTelefono();
        static IDao dao = new ControladorDao();
        static ControladorTelefono ctrlTelf = new ControladorTelefono(modelo, vista, dao);    
    public static void main(String[] args) {

        
        ctrlTelf.crearTelefono();
        ctrlTelf.crearTelefono();
        System.out.println("Telefonos");
        ctrlTelf.mostrarTelefonos();
    }
}
