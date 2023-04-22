/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, 
en minúsculas. A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array 
(por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el usuario 
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución 
del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package servicios;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class mesService {

    String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    String mesSecreto = meses[3];
    Scanner leer = new Scanner(System.in);

    public void adivina() {
        System.out.println("Escribe un mes del año.");
        String mesPro = leer.next().toLowerCase();
        while (!mesPro.equals(mesSecreto)) {
            System.out.println("Incorrecto, vuelve a intentarlo!");
            System.out.println("Escribe un mes del año.");
            mesPro = leer.next().toLowerCase();
        }
        System.out.println("-----------------------------------");
        System.out.println("Lo lograste, el mes era ESE!");
        System.out.println("-----------------------------------");
    }
}
