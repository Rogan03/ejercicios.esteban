/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio1EXTRADia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de minutos.");
        Scanner leer = new Scanner(System.in);
        int min = leer.nextInt();
        int horas = (int) (min/60);
        int dias = horas / 24;
        System.out.println(min +  " minutos convertidos son: " + dias + " día(s) y " + horas%24 + " horas.");
    }
    
}
