/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.sql.*;

/**
 *
 * @author Santiago
 */
public class Conexion {

    private static Connection conexion;
    private static String userSGBD = "root";
    private static String passwdSGBD = "root";
    private static String urlSGBD = "jdbc:mysql://localhost:3306/proyecto_poo";

    public static Connection getConexion() {
        try {
            conexion = DriverManager.getConnection(urlSGBD, userSGBD, passwdSGBD);
            System.out.println("conexion exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conexion;
    }
    
    public static void closeConexion(){
        try {
            getConexion().close();
            System.out.println("Conexion cerrada exitosamente");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
}
