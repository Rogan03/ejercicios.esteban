/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package javaapplication11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio3PracticaDia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que desea generar.");
        int longitud = leer.nextInt();
        int[] vector = new int[longitud];
        int contadorDig; int cincoDig = 0; int cuatroDig = 0; int tresDig = 0; int dosDig = 0; int unDig = 0;
        for (int i = 0; i < longitud; i++) {
            vector[i] = aleatorio.nextInt(11000);
            contadorDig = 0;
            while (vector[i] != 0){
                vector[i] = vector[i] / 10;
                contadorDig++;
            } 
            switch (contadorDig) {
                case 5:
                    cincoDig++;
                    break;
                case 4:
                    cuatroDig++;
                    break;  
                case 3:
                    tresDig++;
                    break;
                case 2:
                    dosDig++;
                    break;
                case 1:
                    unDig++;
                    break;
            }
        }
        System.out.println("La cantidad de valores de 1 digitos " + unDig);
        System.out.println("La cantidad de valores de 2 digitos " + dosDig);
        System.out.println("La cantidad de valores de 3 digitos " + tresDig);
        System.out.println("La cantidad de valores de 4 digitos " + cuatroDig);
        System.out.println("La cantidad de valores de 5 digitos " + cincoDig);
    }

}
