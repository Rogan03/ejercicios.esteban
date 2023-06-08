/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1extrasdia52;

import ejercicio1extrasdia52.entidades.Barco;
import ejercicio1extrasdia52.entidades.Motorizado;
import ejercicio1extrasdia52.entidades.Velero;
import ejercicio1extrasdia52.entidades.YateLujo;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio1EXTRASDia52 {

    public static void main(String[] args) {

        Barco ba = new Barco();
        Scanner leer = new Scanner(System.in);
        System.out.println("MENU.");
        System.out.println("Bienvenido " + ba.getNombre() + ".");
        System.out.println("Su reserva es:");
        System.out.println("Fecha de retiro: " + ba.getFechaRe());
        System.out.println("Fecha de devolucion: " + ba.getFechaDe());
        System.out.println("Deseas alquilar un velero o motorizado? (1/2)");
        int opc = leer.nextInt();
        if (opc == 1) {
            Barco ve = new Velero();
            ve.calcularAlquiler();
        }
        if (opc == 2) {
            System.out.println("Deseas uno comun o de lujo? (1/2)");
            int lujo = leer.nextInt();
            if (lujo == 1) {
                Barco mo = new Motorizado();
                mo.calcularAlquiler();
            } else if (lujo == 2) {
                Barco lu = new YateLujo();
                lu.calcularAlquiler();
            }
        }
    }
}
