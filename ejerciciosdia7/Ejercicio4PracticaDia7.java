/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que 
nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio4PracticaDia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un número.");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        boolean check = chequeo(num);
        System.out.println(num + " es un número primo?. " + check);

    }

    public static boolean chequeo(int num) {
        boolean check1 = false;
        int aux = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                aux = aux + 1;
            }
        }
        if (aux == 2) {
            check1 = true;
        }
        return check1;
    }

}
