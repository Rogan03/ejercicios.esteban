/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla 
el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio6PracticaDia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----------CALCULADORA----------");
        System.out.println("Ingrese el primer número.");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número.");
        int num2 = leer.nextInt();
        String resp = " ";
        do {
            System.out.println("-------------------------------");
            System.out.println("MENU");
            System.out.println("Elige una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir.");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
                    break;
                case 4:
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Realmente desea salir del programa? (S/N)");
                    resp = leer.next();
                    if (resp.equals("S")) {
                        System.out.println("Hasta luego.");
                    }
            }
        } while(resp.equals("N"));
         
}

}
