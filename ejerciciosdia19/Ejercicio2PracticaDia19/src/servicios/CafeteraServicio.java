/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafe) {
        System.out.println("LA CAFETERA SE HA LLENADO.");
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        System.out.println(cafe.getCantidadActual());
    }

    public void servirTaza(Cafetera cafe) {
        System.out.println(cafe.getCantidadActual());
        System.out.println("Ingrese el tamaño de la taza.");
        int tamañoTaza = leer.nextInt();
        if (tamañoTaza > cafe.getCantidadActual()) {
            System.out.println("NO ALCANZA PARA LLENARLA.");
            System.out.println("SE SIRVIÓ: " + (cafe.getCantidadActual()) + " LITROS.");
            System.out.println("FALTÓ POR LLENAR " + (tamañoTaza - cafe.getCantidadActual()) + " LITROS DE LA TAZA.");
            cafe.setCantidadActual(0);
        } else {
            System.out.println("SE LLENARÁ LA TAZA.");
            System.out.println("QUEDA " + (cafe.getCantidadActual() - tamañoTaza) + " LITROS RESTANTES EN LA CAFETERA.");
            cafe.setCantidadActual( (cafe.getCantidadActual() - tamañoTaza));
        }

    }

    public void vaciarCafetera(Cafetera cafe) {
        System.out.println("SE TIRÓ TODO, CAFETERA VACÍA");
        cafe.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafe) {
        System.out.println("AGREGAREMOS CAFÉ, ¿CUANTOS LITROS?");
        int cantidad = leer.nextInt();
        if (cantidad > cafe.getCapacidadMaxima()) {
            System.out.println("NECESITARÁS UNA CAFETERA INDUSTRIAL PARA ESO.");
        } else {
            cafe.setCantidadActual(cantidad);
        }

    }
}
