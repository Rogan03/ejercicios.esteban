/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio4EXTRADia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un número entre 1 y 10.");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if ((num<=10) && (num>0)) {
            switch (num) {
                case 1:
                    System.out.println(num + " en romano es: " + "I");
                    break;
                case 2:
                    System.out.println(num + " en romano es: " + "II");
                    break;
                case 3:
                    System.out.println(num + " en romano es: " + "III");
                    break;
                case 4:
                    System.out.println(num + " en romano es: " + "IV");
                    break;
                 case 5:
                    System.out.println(num + " en romano es: " + "V");
                    break;
                 case 6:
                    System.out.println(num + " en romano es: " + "VI");
                    break;
                 case 7:
                    System.out.println(num + " en romano es: " + "VII");
                    break;
                 case 8:
                    System.out.println(num + " en romano es: " + "VIII");
                    break;
                 case 9:
                    System.out.println(num + " en romano es: " + "IX");
                    break;
                 case 10:
                    System.out.println(num + " en romano es: " + "X");
                    break;
            }
        }
        else {
            System.out.println("Solo números entre 1 y 10");
        }
    }
    
}
