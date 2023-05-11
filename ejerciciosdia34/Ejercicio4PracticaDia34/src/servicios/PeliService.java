/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class PeliService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> cartelera = new ArrayList();

    public void crearPeli() {
        String re = "si";
        do {
            System.out.println("Ingrese el título.");
            String titulo = leer.next();
            System.out.println("Ingrese director.");
            String direc = leer.next();
            System.out.println("Ingrese duración en HORAS.");
            double durac = leer.nextFloat();
            System.out.println("¿Desea cargar otra película?(si/no)");
            re = leer.next().toLowerCase();
            Pelicula P1 = new Pelicula(titulo, direc, durac);
            cartelera.add(P1);
        } while (re.equals("si"));
    }

    public void mostrarCartelera() {
        System.out.println("---------");
        System.out.println("CARTELERA:");
        for (Pelicula pelicula : cartelera) {
            System.out.println(pelicula);
        }
    }

    public void mayoresA1Hora() {
        System.out.println("---------");
        System.out.println("MAYORES A 1 HORA:");
        for (Pelicula pelicula : cartelera) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void deMayorAMenor() {
        System.out.println("---------");
        System.out.println("DE MAYOR A MENOR (duración):");
        Collections.sort(cartelera, Comparator.comparingDouble(Pelicula::getDuracion).reversed());
        for (Pelicula pelicula : cartelera) {
            System.out.println(pelicula);
        }
    }

    public void deMenorAMayor() {
        System.out.println("---------");
        System.out.println("DE MENOR A MAYOR (duración):");
        Collections.sort(cartelera, Comparator.comparingDouble(Pelicula::getDuracion));
        for (Pelicula pelicula : cartelera) {
            System.out.println(pelicula);
        }
    }

    public void ordenadaPorTitulo() {
        System.out.println("---------");
        System.out.println("ALFABÉTICAMENTE:");
        Collections.sort(cartelera, Comparator.comparing(Pelicula::getTitulo));
        for (Pelicula pelicula : cartelera) {
            System.out.println(pelicula);
        }
    }

    public void ordenadaPorDirector() {
        System.out.println("---------");
        System.out.println("POR DIRECTOR:");
        Collections.sort(cartelera, Comparator.comparing(Pelicula::getDirector));
        for (Pelicula pelicula : cartelera) {
            System.out.println(pelicula);
        }
    }
}
