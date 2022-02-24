/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

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
    
    public void llenarDatosModo(JComboBox cbxCombo){
        String consultaModo="select * from tipo_usuario order by tipo asc";
        
        try {
            PreparedStatement pst= Conexion.getConexion().prepareStatement(consultaModo);
            ResultSet result = pst.executeQuery();
            cbxCombo.addItem("Seleccione una opción");
            while (result.next()) {   
                cbxCombo.addItem(result.getString("tipo"));
                
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
           Conexion.closeConexion();
        
        
    }
    
    public boolean consultaUsuario(String user){
       String consultaUsuario="select nombre_usuario from usuario ";
       boolean ok=false;
        try {
            PreparedStatement pst= Conexion.getConexion().prepareStatement(consultaUsuario);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                if(user.equals(result.getString("nombre_usuario")))
                    ok=true;
                
            }
        } catch (SQLException e) {
                 System.out.println(e.getMessage());
        }
        Conexion.closeConexion();
     
        return ok;
    }
    
}
