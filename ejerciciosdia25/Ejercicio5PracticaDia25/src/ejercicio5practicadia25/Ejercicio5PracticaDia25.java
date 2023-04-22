/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5practicadia25;

import entidades.Persona;
import servicios.PersonaService;

/**
 *
 * @author Esteban
 */
public class Ejercicio5PracticaDia25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService pe = new PersonaService();
        Persona p1 = new Persona();
        pe.crearPersona(p1);
        System.out.println("Su edad es: " + pe.calcularEdad(p1));
        System.out.println("-------------------");
        if (pe.menorQue(p1, 0) == true) {
            System.out.println("Eres menor que tu familiar.");
        } else {
            System.out.println("Eres mayor que tu familiar.");
        }
        System.out.println("-------------------");
        pe.mostrarPersona(p1);
    }
}
