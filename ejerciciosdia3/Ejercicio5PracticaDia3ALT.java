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
public class Ejercicio5PracticaDia3ALT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa un límite.");
        Scanner leer = new Scanner(System.in);
        int limite = leer.nextInt();
        int suma;
        suma=0;
         if (limite < 0 ) {
             do {
                 System.out.println("ingrese el limite en positivo");
                 limite = leer.nextInt();
             } while (limite < 0);
        System.out.println("ingresa numeros hasta llegar al limite");
         }
      
        for (int i = 0; suma < limite; i++){
         int num = leer.nextInt();
         suma=suma+num;    
        }
        System.out.println(suma);
    }
    
}
      
    
