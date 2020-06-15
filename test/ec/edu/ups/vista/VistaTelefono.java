/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import java.awt.TextField;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author braya
 */
public class VistaTelefono {
    private Scanner l;

    public VistaTelefono() {
        l=new Scanner(System.in);
    }
    
    public Telefono agregarTelefono(int codigo, String numero, String tipo, String operadora){
//        Telefono telf = new Telefono();
//        telf.setCodigo(codigo);
        return new Telefono(codigo, numero, tipo, operadora);
    }
    
    public void mostrarTelefonos(List<Telefono> telefonos){
        for (Telefono telefono : telefonos) {
            System.out.println("Telefonos: "    + telefono);
        }
    }
}
