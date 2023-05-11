/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4practicadia34;

import servicios.PeliService;

/**
 *
 * @author Esteban
 */
public class Ejercicio4PracticaDia34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliService ps = new PeliService();
        ps.crearPeli();
        ps.mostrarCartelera();
        ps.mayoresA1Hora();
        ps.deMayorAMenor();
        ps.deMenorAMayor();
        ps.ordenadaPorTitulo();
        ps.ordenadaPorDirector();
    }
    
}
