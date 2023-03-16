/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio3PracticaDia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de euros que desea convertir.");
        Scanner leer = new Scanner(System.in);
        int cantidad = leer.nextInt();
        String moneda;
        do {
            System.out.println("Elija la moneda a la cual va a convertir (dolar, yen, libra).");
        moneda = leer.next().toLowerCase();
            if ((!"dolar".equals(moneda)) && (!"yen".equals(moneda)) && (!"libra".equals(moneda))) {
                System.out.println("Elija opciones válidas: DOLAR, YEN o LIBRA.");
            }
        } while ((!"dolar".equals(moneda)) && (!"yen".equals(moneda)) && (!"libra".equals(moneda)));
        conversor(cantidad, moneda);

    }

    public static void conversor(int cantidad, String moneda) {
        double monedita;
        switch (moneda) {
            case "dolar":
                monedita = cantidad * 1.28611;
                monedita= Math.round(monedita*100.0)/100.0;
                System.out.println(cantidad + " euros convertidos a dólares son" + " = " + monedita);
                break;
            case "yen":
                monedita = cantidad * 129.852;
                monedita= Math.round(monedita*100.0)/100.0;
                System.out.println(cantidad + " euros convertidos a yenes son" + " = " + monedita);
                break;
            case "libra":
                monedita = cantidad * 0.86;
                monedita= Math.round(monedita*100.0)/100.0;
                System.out.println(cantidad + " euros convertidos a libras son" + " = " + monedita);
                break;
        }
    }

}
