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
    Docente docente=new Docente(this);
    
    public void mostrarDocente(){
        docente.setVisible(true);
    }
    
    public void mostrarAdministrador(){
        administrador.setVisible(true);
    }
    
    public void mostrarEstudiante(){
        estudiante.setVisible(true);
    }
    
    public void mostrarLoggin(){
        loggin.setVisible(true);
    }
    
    
    //DDL: LENGUAJE DE DEFINICION DE DATOS (CREATE, ALTER, DROP)
    
    //DML: LENGUAJE DE MANIPULACION DE DATOS (SELECT, DELETE, UPDATE, INSERT)
    
    //CRUD
    //CREATE
    //READ
    //UPDATE
    //DELETE
    
}
