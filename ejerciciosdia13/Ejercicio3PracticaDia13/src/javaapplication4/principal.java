/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import entidades.Operacion;

/**
 *
 * @author ESTEBAN
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion calculadora = new Operacion();
        calculadora.crearOperacion();
        System.out.println("Suma: " + calculadora.sumar()); 
        System.out.println("Resta: " + calculadora.restar());
        System.out.println("Multiplicación: " + calculadora.multiplicar());
        System.out.println("División: " + calculadora.dividir());        
    }
    
}
