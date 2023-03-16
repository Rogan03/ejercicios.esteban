/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio7EXTRAdia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de números que quiere ingresar.");
        Scanner leer = new Scanner(System.in);
        int cantidad = leer.nextInt(); int contador = 0; int num; int max = 0; int min = 9999; int sumatoria = 0;
        if (cantidad>0) {
            do {
                System.out.println("Ingrese un número.");
                num = leer.nextInt();
                if (num>max) {
                    max = num;
                }
                if (num<min) {
                    min = num;
                }
                sumatoria = sumatoria + num;    
                contador = contador + 1;
            } while (contador!=cantidad);
            
            System.out.println("El máximo número ingresado es: " + max);
            System.out.println("El mínimo número ingresado es: " + min);
            System.out.println("El promedio es: " + sumatoria/cantidad);
        }
    }
    
}
