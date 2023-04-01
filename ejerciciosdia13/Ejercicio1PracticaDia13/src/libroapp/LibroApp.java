/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroapp;

import java.util.Scanner;
import libroapp.Caracteristicas.Libro;

/**
 *
 * @author ESTEBAN
 */
public class LibroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro l1 = new Libro();
        Libro l2 = new Libro(); 
        System.out.println("Ingresa el ISBN del libro.");
        l1.ISBN = leer.nextInt();
        System.out.println("Ingresa el título.");
        l1.titulo = leer.next();
        System.out.println("Ingresa el autor.");
        l1.autor = leer.next();
        System.out.println("Ingresa la cantidad de paginas.");
        l1.paginas = leer.nextInt();
        System.out.println("----------------");
        System.out.println(l1.toString());
        System.out.println(l2.toString());
    }
    
}
