/*
Crear un programa que dado un número determine si es par o impar.
 */
package ejerciciosdia3;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio1PracticaDia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa un número.");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if (num % 2 == 0){
            System.out.println("El número es par.");
        }
        else{
            System.out.println("El número es impar.");
        }
        
    }
    
}
