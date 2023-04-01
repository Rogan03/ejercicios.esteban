/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package javaapplication11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio2PracticaDia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("Ingrese la cantidad de números a generar.");
        int longitud = leer.nextInt();
        int[] vector = new int[longitud];
        System.out.println("Ingrese el número que desee buscar, entre 1 y 100.");
        int numFind = leer.nextInt();
        int contador = 0;
        for (int i = 0; i < longitud; i++) {
            vector[i] = aleatorio.nextInt(100);
        }
        for (int i = 0; i < longitud; i++) {
            if (vector[i] == numFind) {
                contador += 1;
                System.out.println("NÚMERO ENCONTRADO! en la posición: " + i);
            }
        }
        System.out.println("EL NÚMERO SE HA REPETIDO: " + contador + " VECES.");
    }
}
    
