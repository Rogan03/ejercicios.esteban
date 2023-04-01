/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio6PracticaDia9ALT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int i, j;
        int suma = 0;

        System.out.println("Ingrese numeros: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        // muestra matriz
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }// suma filas:
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de las Filas es: " + suma);
        /// sumar columnas
        int suma2 = 0;
        for (j = 0; j < 3; j++) {
            for (i = 0; i < 3; i++) {
                suma2 += matriz[i][j];
            }
        }
        System.out.println("La suma de la columnas es: " + suma2);
        // sumar las diagonales;
        int sumadiagonal = 0, sumadiagonal2 = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j) {
                    sumadiagonal += matriz[i][j];
                }
                if (i + j == 3 - 1) {
                    sumadiagonal2 += matriz[i][j];
                }
            }
        }
        System.out.println("suma diagonal: " + sumadiagonal);
        System.out.println("Suma diagoanl: " + sumadiagonal2);
        boolean bandera = false;
        if (sumadiagonal == sumadiagonal2) {
            bandera = true;
        }
        if ((suma == suma2) && (bandera == true)) {
            System.out.println("Es una matriz magica");
        } else {
            System.out.println("No es una matriz mágica");
        }
    }

}
