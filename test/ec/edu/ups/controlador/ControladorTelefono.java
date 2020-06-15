/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.Dao.IDao;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;

/**
 *
 * @author braya
 */
public class ControladorTelefono{
    private Telefono modelo;
    private VistaTelefono vista;
    private IDao dao;

    public ControladorTelefono(Telefono modelo, VistaTelefono vista, IDao dao) {
        this.modelo = modelo;
        this.vista = vista;
        this.dao = dao;
    }

    public void crearTelefono() {
        //modelo=vista.agregarTelefono();
        dao.crearTelefono((Telefono) modelo);
    }

    public void mostrarTelefonos() {
        vista.mostrarTelefonos(dao.mostrarTelefonos());
    }
}
