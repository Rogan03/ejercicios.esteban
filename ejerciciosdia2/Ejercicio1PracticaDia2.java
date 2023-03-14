/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
package ejerciciosdia2;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio1PracticaDia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor ingresa un número.");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        System.out.println("Por favor ingresa otro número.");
        int num2 = leer.nextInt();
        int suma = (num1+num2);
        System.out.println("El resultado de la suma es: " + suma);
    }
    
}
