/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio3EXTRADia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una letra.");
        Scanner leer = new Scanner(System.in);
        String letra = leer.next();
        if (letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")) {
            System.out.println("VOCAL.");
        } else{
            System.out.println("NO VOCAL.");
        }
    }
    
}
