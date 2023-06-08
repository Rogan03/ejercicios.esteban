/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package ejercicio2practicadia52;

import ejercicio2practicadia52.entidades.Electrodomestico;
import ejercicio2practicadia52.entidades.Lavadora;
import ejercicio2practicadia52.entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class Ejercicio2PracticaDia52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aux = 0;
        ArrayList<Electrodomestico> Fravega = new ArrayList();
        Electrodomestico lava1 = new Lavadora();
        Fravega.add(lava1);
        Electrodomestico tele1 = new Televisor();
        Fravega.add(tele1);
        Electrodomestico tele2 = new Televisor();
        Fravega.add(tele2);
        Electrodomestico lava2 = new Lavadora();
        Fravega.add(lava2);
        for (Electrodomestico electro : Fravega) {
            electro.precioFinal();
            aux+= electro.getPrecio();
        }
        System.out.println("El total es: " + aux);
    }
}
