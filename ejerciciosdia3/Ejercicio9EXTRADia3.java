/*
Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el 
cociente y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio9EXTRADia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un número entero.");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero.");
        int num2 = leer.nextInt();
        if ((num1>0) && (num2>0) && (num1>num2)) {
            int aux = 0;
            int result;
            do {
                result = num1 - num2;
                num1 = result;
                aux=aux+1;
                
            } while (result>=num2);
            
            System.out.println("El cociente: " + aux);
            System.out.println("El residuo es: " + result);
            
        }else{
            System.out.println("El primer número debe ser mayor al segundo.");
        }
    }
    
}
