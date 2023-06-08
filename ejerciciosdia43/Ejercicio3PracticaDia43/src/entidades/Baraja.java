/*
La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Baraja {

    Scanner leer = new Scanner(System.in);
    private Carta unidad = new Carta();
    private ArrayList baraja = new ArrayList();
    private ArrayList baraja2 = new ArrayList();

    public void llenarBaraja(Carta unidad) {
        int aux = 40;
        for (int i = 0; i < aux; i++) {
            unidad = new Carta();
            unidad.definirCarta();
            if (unidad.getNum() != 8 && unidad.getNum() != 9) {
                baraja.add(unidad);
            } else {
                aux++;
            }
        }
        System.out.println("BARAJA ACTUAL:");
        System.out.println(baraja);
    }

    public void barajar() {
        Collections.shuffle(baraja);
        System.out.println("BARAJA MEZCLADA:");
        for (Object bruh : baraja) {
            System.out.println(bruh);
        }
        System.out.println("Esa es toda la baraja.");
    }

    public void darCartas() {
        System.out.println("¿Cuantas cartas quieres pedir?");
        int re = leer.nextInt();
        if (re < 40) {
            for (int i = 0; i < re; i++) {
                baraja.remove(i);
            }
        } else {
            System.out.println("No puedes pedir más de las que ya hay.");
        }
    }

    public void cartasDisponibles() {
        System.out.println("RESTO DE CARTAS:");
        for (Object bruh : baraja) {
            System.out.println(bruh);
        }
        System.out.println("Esa es toda la baraja.");
    }
}
