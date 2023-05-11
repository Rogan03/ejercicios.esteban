/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

---------------------------

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class perroServiceGpt {

    ArrayList<String> razaPerros = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void guardaPerro() {
        String resp;
        do {
            System.out.println("Ingrese razas de perros (ESCRIBE NO PARA DETENER)");
            resp = leer.next();
            resp = resp.toLowerCase();
            if (!resp.equalsIgnoreCase("NO")) {
                razaPerros.add(resp);
            }
        } while (!resp.equalsIgnoreCase("NO"));
    }

    public void muestraPerro() {
        System.out.println("LISTA DE RAZAS INGRESADAS:");
        for (String i : razaPerros) {
            System.out.println(i);
        }
    }

    public void pidePerro() {
        System.out.println("Ahora ingresa una de las razas que elegiste.");
        String razaBusc = leer.next();
        razaBusc = razaBusc.toLowerCase();
        Iterator<String> trompo = razaPerros.iterator();
        int aux = 0;
        while (trompo.hasNext()) {
            if (trompo.next().equals(razaBusc)) {
                trompo.remove();
                aux++;
                break;
            }
        }
        if (aux == 0) {
            System.out.println("No se ha encontrado en la lista.");
        }
    }

    public void mostrarOrdenada() {
        Collections.sort(razaPerros);
        for (String i : razaPerros) {
            System.out.println(i);
        }
    }
}
