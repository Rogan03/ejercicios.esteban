/*
Nos piden hacer un programa sobre un Caux2ne, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
-----------
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package servicios;

import entidades.Butacas;
import entidades.Cine;
import entidades.Espectador;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class cineServicio {

    Cine cn = new Cine();
    ArrayList<Espectador> gentusa = new ArrayList();
    Espectador gente = new Espectador();
    Butacas lugar[][] = new Butacas[8][6];
    Butacas silla = new Butacas();

    public void butacas() {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                silla = new Butacas();
                silla.setOcupado(false);
                switch (j) {
                    case 0:
                        silla.setFila(i + 1);
                        silla.setColumna("A");
                        break;
                    case 1:
                        silla.setFila(i + 1);
                        silla.setColumna("B");
                        break;
                    case 2:
                        silla.setFila(i + 1);
                        silla.setColumna("C");
                        break;
                    case 3:
                        silla.setFila(i + 1);
                        silla.setColumna("D");
                        break;
                    case 4:
                        silla.setFila(i + 1);
                        silla.setColumna("E");
                        break;
                    case 5:
                        silla.setFila(i + 1);
                        silla.setColumna("F");
                        break;
                }
                lugar[i][j] = silla;
            }
        }
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print(lugar[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void generarPersonas() {
        cn.generarPublico();
        String aux = "";
        if (cn.getPublico() != 0) {
            for (int i = 0; i < cn.getPublico(); i++) {
                gente = new Espectador();
                gente.setID(i);
                gente.setEdad((int) (Math.random() * 65));
                gente.setDinero((int) (Math.random() * 2000));
                gente.setFila(((int) (Math.random() * 8)));
                aux = String.valueOf((int) (Math.random() * 6 + 1));
                switch (aux) {
                    case "1":
                        aux = "A";
                        break;
                    case "2":
                        aux = "B";
                        break;
                    case "3":
                        aux = "C";
                        break;
                    case "4":
                        aux = "D";
                        break;
                    case "5":
                        aux = "E";
                        break;
                    case "6":
                        aux = "F";
                        break;
                }
                gente.setColumna(aux);
                gentusa.add(gente);
            }
            for (Espectador espectador : gentusa) {
                System.out.println(espectador);
            }
        } else {
            System.out.println("Sala vacía.");
        }
    }

    public void checkPersonas() {
        int aux = cn.getPublico();
        for (int i = 0; i < cn.getPublico(); i++) {
            if (cn.getEdadMin() > gente.getEdad() || cn.getPrecio() > gente.getDinero()) {
                gentusa.remove(gente);
                aux--;
            }
        }

        System.out.println("-----------------------");
        for (Espectador espectador : gentusa) {
            System.out.println(espectador);
        }

        cn.setPublico(aux);
        for (Espectador espectador : gentusa) {
            silla.setFila(gente.getFila());
            silla.setColumna(gente.getColumna());
            if (silla.isOcupado() == true) {
                System.out.println("ASIENTO OCUPADO.");
                System.out.println("Generando uno nuevo...");
                while (silla.isOcupado() == true) {
                    String aux2 = "";
                    gente.setFila(((int) (Math.random() * 8)));
                    aux2 = String.valueOf((int) (Math.random() * 6 + 1));
                    switch (aux2) {
                        case "1":
                            aux2 = "A";
                            break;
                        case "2":
                            aux2 = "B";
                            break;
                        case "3":
                            aux2 = "C";
                            break;
                        case "4":
                            aux2 = "D";
                            break;
                        case "5":
                            aux2 = "E";
                            break;
                        case "6":
                            aux2 = "F";
                            break;
                    }
                    gente.setColumna(aux2);
                }
            }
            silla.setOcupado(true);
        }
        System.out.println("-----------------------");
        for (Espectador espectador : gentusa) {
            System.out.println(espectador);
        }
    }
}
