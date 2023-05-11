/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5practicadia34;

import servicios.paisService;

/**
 *
 * @author Esteban
 */
public class Ejercicio5PracticaDia34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        paisService ps = new paisService();
        ps.ingresarPais();
        ps.ordenarPais();
        ps.retirarPais();
    }
}
