/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package ejerciciosdia2;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio2PracticaDia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor, escribe tu nombre.");
        Scanner leer = new Scanner (System.in);
        String nombre = leer.next();
        System.out.println("Tu nombre es: " + nombre);
    }
    
}
