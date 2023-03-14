/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y 
determine el importe en efectivo a pagar por dicho socio.

 */
package javaapplication11;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio5EXTRADia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su plan (A, B o C).");
        String plan = leer.next();
        plan = toUpperCase(plan);
        int valor;
        switch (plan) {
            case "A":
                System.out.println("Ingrese el valor de su tratamiento.");
                valor = leer.nextInt();
                System.out.println("El valor con el descuento incluido es: " + (valor / 2));
                break;
            case "B":
                System.out.println("Ingrese el valor de su tratamiento.");
                valor = leer.nextInt();
                System.out.println("El valor con el descuento incluido es: " + (valor - (valor * 0.35)));
                break;
            case "C":
                System.out.println("Ingrese el valor de su tratamiento.");
                valor = leer.nextInt();
                System.out.println("Su plan no posee descuentos.");
                break;
            default:
                System.out.println("Elija opciones válidas.");
        }
    }

}

   
