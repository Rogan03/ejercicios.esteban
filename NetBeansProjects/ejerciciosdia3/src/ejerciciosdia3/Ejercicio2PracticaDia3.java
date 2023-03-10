/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 */
package ejerciciosdia3;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio2PracticaDia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa una palabra.");
        Scanner leer = new Scanner(System.in);
        String palabra = leer.nextLine();
        if(palabra.equalsIgnoreCase("eureka")){
            System.out.println("Correcto.");
        }
        else {
            System.out.println("Incorrecto.");
        }
    }
    
}
