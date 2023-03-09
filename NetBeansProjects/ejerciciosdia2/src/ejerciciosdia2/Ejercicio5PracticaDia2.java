/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package ejerciciosdia2;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio5PracticaDia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa un número entero.");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        System.out.println("El doble es: " + num1*2);
        System.out.println("El triple es: " + num1*3);
        System.out.println("La raíz cuadrada es: " + Math.sqrt(num1));
    }
    
}
