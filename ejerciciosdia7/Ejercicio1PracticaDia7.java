/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio1PracticaDia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un primer número.");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número.");
        int num2 = leer.nextInt();
        int suma1= suma(num1, num2);
        int resta1= resta(num1, num2);
        int multi1= multiplicacion(num1, num2);
        int div1= division(num1, num2);
        if ((num1>0) && (num2>0)) {
            System.out.println("MENU");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR.");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println(num1 + "+" + num2 + "=" + suma1);
                    break;
                case 2:
                    System.out.println(num1 + "-" + num2 + "=" + resta1);
                    break;
                case 3:
                    System.out.println(num1 + "x" + num2 + "=" + multi1);
                    break;
                case 4:
                    System.out.println(num1 + "/" + num2 + "=" + div1);
                    break;   
            }
        }
        else {
            System.out.println("Solo se toman en cuenta números positivos.");
        }
    }
    public static int suma(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
    public static int resta(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }
    public static int multiplicacion(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }
    public static int division(int num1, int num2) {
        int division = num1 / num2;
        return division;
    }
}
