/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2practicadia19;

import entidades.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicio;

/**
 *
 * @author ESTEBAN
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera coffy = new Cafetera();
        CafeteraServicio coffee = new CafeteraServicio();
        int opc;
        do {
            System.out.println("");
            System.out.println("---------");
            System.out.println("\nNESPRESSO");
            System.out.println("1. Llenar cafetera.");
            System.out.println("2. Servir taza.");
            System.out.println("3. Vaciar cafetera.");
            System.out.println("4. Agregar café.");
            System.out.println("5. SALIR.");
            System.out.println("ELIGE LA OPCIÓN SELECCIONANDO EL NÚMERO.");
            System.out.println("");
            System.out.println("---------");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    coffee.llenarCafetera(coffy);
                    break;
                case 2:
                    coffee.servirTaza(coffy);
                    break;
                case 3:
                    coffee.vaciarCafetera(coffy);
                    break;
                case 4:
                    coffee.agregarCafe(coffy);
                    break;
                case 5:
                    System.out.println("CHAU.");
                    break;
            }
        } while (opc != 5);

    }

}
