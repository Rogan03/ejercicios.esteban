/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class paisService {

    HashSet<Pais> countries = new HashSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarPais() {
        String re = "si";
        while (re.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el nombre del pais.");
            String paIng = leer.next();
            paIng = paIng.toLowerCase();
            System.out.println("¿Deseas agregar otro? si/no");
            re = leer.next();
            Pais p1 = new Pais(paIng);
            countries.add(p1);
        }
        System.out.println("PAISES INGRESADOS:");
        for (Pais country : countries) {
            System.out.println(country);
        }
    }

    public void ordenarPais() {
        ArrayList<Pais> aux = new ArrayList(countries);
        System.out.println("---------");
        System.out.println("ORDENADO ALFABÉTICAMENTE:");
        Collections.sort(aux, Comparator.comparing(Pais::getNombre));
        for (Pais aux1 : aux) {
            System.out.println(aux1);
        }
    }

    public void retirarPais() {
        System.out.println("---------");
        System.out.println("ELIGE UN PAIS PARA REMOVER DE LA LISTA.");
        String remover = leer.next();
        remover = remover.toLowerCase();
        Iterator<Pais> trompo = countries.iterator();
        int aux3 = 0;
        while (trompo.hasNext()) {
            if (trompo.next().getNombre().equals(remover)) {
                trompo.remove();
                aux3++;
                break;
            }
        }
        if (aux3 > 0) {
            System.out.println("---------");
            System.out.println("LISTA NUEVA:");
           for (Pais a : countries) {
            System.out.println(a); 
        }
        }
        if (aux3 == 0) {
            System.out.println("No se ha encontrado en la lista.");
        }
    }
}
