/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class Arreglo {
    String [] lista= new String[5];
    ArrayList<Double> notas= new ArrayList<>();
    
    public void llenarNotas(double nota){
        notas.add(nota);
    }
    
    public void mostrarNotas(){
        for(int i=0; i<notas.size();i++){
            System.out.println(notas.get(i));
        }
    }
    
    
}
