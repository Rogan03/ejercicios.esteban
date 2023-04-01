/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extrasdia13;

import entidades.Puntos;

/**
 *
 * @author ESTEBAN
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos calculo = new Puntos();
        calculo.crearPuntos();
        System.out.println("La distancia es: " + calculo.distancia()); 
    }  
}
