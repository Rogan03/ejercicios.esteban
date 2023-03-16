/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 
1.60 mts. y el promedio de estaturas en general.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio6EXTRAdia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de personas a medir.");
        Scanner leer = new Scanner(System.in);
        int cantidadPer = leer.nextInt();
        double alturaMenor = 0; double alturaTotal = 0; int promedioMenor = 0;
        if (cantidadPer>0) {
            for (int i = 0; i < cantidadPer; i++) {
                System.out.println("Ingrese la estatura en CM.");
                int alturas = leer.nextInt();
                if (alturas<160) {
                    alturaMenor = alturas + alturaMenor;
                    promedioMenor = promedioMenor + 1;
                }
                alturaTotal = alturas + alturaTotal;
            }
            double peques; double todes;
            peques = alturaMenor/promedioMenor;
            peques= Math.round(peques*10.0)/10.0;
            todes = alturaTotal/cantidadPer;
            todes = Math.round(todes*10.0)/10.0;
            System.out.println("El promedio de estaturas por debajo del 1.60mts es: " + peques + " centímetros.");
            System.out.println("El promedio de estaturas en total es: " + todes + " centímetros.");
        }
    }
    
}
