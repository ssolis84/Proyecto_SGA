/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.*;

/**
 *
 * @author Santiago
 */
public class Controlador {
    
    Administrador administrador=new Administrador(this);
    Estudiante estudiante= new Estudiante(this);
    Loggin loggin= new Loggin(this);
    
    public void mostrarAdministrador(){
        administrador.setVisible(true);
    }
    
    public void mostrarEstudiante(){
        estudiante.setVisible(true);
    }
    
    public void mostrarLoggin(){
        loggin.setVisible(true);
    }
    
            
    
}
