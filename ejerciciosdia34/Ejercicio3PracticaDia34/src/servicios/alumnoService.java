/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class alumnoService {

    ArrayList<Alumno> lista = new ArrayList();
    ArrayList<Integer> notas;
    Scanner leer = new Scanner(System.in);

    public void crearAlumno() {
        String re = "si";
        do {
            Alumno alum = new Alumno();
            notas = new ArrayList();
            System.out.println("Ingrese el nombre del alumno.");
            String name = leer.next();
            System.out.println("Ingresa la nota 1.");
            int nota1 = leer.nextInt();
            System.out.println("Ingresa la nota 2.");
            int nota2 = leer.nextInt();
            System.out.println("Ingresa la nota 3.");
            int nota3 = leer.nextInt();
            notas.add(nota1);
            notas.add(nota2);
            notas.add(nota3);
            alum.setNombre(name);
            alum.setNotas(notas);
            lista.add(alum);
            System.out.println("¿Desea cargar otro alumno?(si/no)");
            re = leer.next();
        } while (re.equals("si"));
    }

    public void mostrarAlumnos() {
        Iterator<Alumno> trompo = lista.iterator();
        while (trompo.hasNext()) {
            System.out.println(trompo.next());
        }
    }

    public void notaFinal(ArrayList<Alumno> lista) { //paso la lista entera con todos los objetos
        System.out.println("Ingrese el nombre del alumno para ver su nota final.");
        String nombreBusc = leer.next();
        int nota, notafinal;
        int sumaNotas = 0;
        int aux = 0;
        for (Alumno alumno : lista) {
            if (nombreBusc.equals(alumno.getNombre())) {
                nota = alumno.getNotas().get(0) + alumno.getNotas().get(1) + alumno.getNotas().get(2);
                sumaNotas += nota;
                aux++;
            }
        }
        if (aux == 0) {
            System.out.println("El alumno no se encuentra en la lista.");
        } else {
            notafinal = sumaNotas / 3;
            System.out.println("La nota final de " + nombreBusc + " es: " + notafinal);
        }
    }

    public void elOrigenDeLosTiempos(Alumno a) {
        crearAlumno();
        System.out.println("--------------");
        System.out.println("LISTA DE ALUMNOS.");
        System.out.println("--------------");
        mostrarAlumnos();
        System.out.println("--------------");
        notaFinal(lista);
    }
}
