/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio4PracticaDia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra.");
        Scanner leer = new Scanner(System.in);
        String palabra = leer.next();
        if (palabra.substring(0,1).equalsIgnoreCase("A")){
            System.out.println("Correcto.");
        }
        else {
            System.out.println("Incorrecto.");
        }
    }
    
}
