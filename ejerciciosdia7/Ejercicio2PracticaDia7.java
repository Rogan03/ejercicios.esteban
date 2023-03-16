/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado 
e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere 
seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio2PracticaDia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String resp;
        do {
            analisis();
            System.out.println("¿Desea ingresar más datos? Y/N");
            resp = leer.next();
            if ((!"Y".equals(resp)) && (!"N".equals(resp))) {
                System.out.println("Opción incorrecta.");
            }
        } while ((resp.equalsIgnoreCase("N") == false) && (resp.equalsIgnoreCase("Y") == true));
    }

    public static void analisis() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre.");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad.");
        int edad = leer.nextInt();
        System.out.println("------------");
        System.out.println("Nombre: " + nombre);
        if (edad >= 18) {
            System.out.println("MAYOR DE EDAD.");
            System.out.println("");
        } else {
            System.out.println("MENOR DE EDAD.");
            System.out.println("");
        }
    }

}
