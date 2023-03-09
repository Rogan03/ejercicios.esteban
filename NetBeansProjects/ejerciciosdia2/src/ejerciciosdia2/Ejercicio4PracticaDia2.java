/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdia2;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio4PracticaDia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ingresa la cantidad de grados C.");
        Scanner leer = new Scanner(System.in);
        double temp = leer.nextInt();
        double result = 32 + (9 * temp / 5);
        System.out.println("La temperatura en Fahrenheit es: " + result);
    }
    
}
