/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
 */
package javaapplication11;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio1PracticaDia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[] = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }
        for (int i = 99; i > -1; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
    }
    
}
