/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que el 
primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class validarMultiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número.");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número.");
        int num2 = leer.nextInt();
        Esmultiplo(num1, num2);
    }
    public static void Esmultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es multiplo de " + num2);
        }
        else {
            System.out.println(num1 + " no es multiplo de " + num2);
        }
    }
}
