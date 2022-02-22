/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Santiago
 */
public class Consultas {
    
    public static void llenarDatosModo(JComboBox cbxModo){
       // Conexion.getConexion()
       String consulta = "select *from tipo_usuario order by tipo asc";
        try {
            PreparedStatement pst= Conexion.getConexion().prepareStatement(consulta);
            ResultSet result = pst.executeQuery();
            cbxModo.addItem("Selecciona una opción");
            
            while (result.next()) {  
                cbxModo.addItem(result.getString("tipo"));
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexion.closeConexion();
    }
    
}
