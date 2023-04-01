/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su 
tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class vectorEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de miembros del equipo.");
        int cantidad = leer.nextInt();
        String[] vector = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del compañero.");
            vector[i] = leer.next();
        }
        System.out.println("---------");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("El nombre " + (i + 1) + " es: " + vector[i]);
        }

    }

}
