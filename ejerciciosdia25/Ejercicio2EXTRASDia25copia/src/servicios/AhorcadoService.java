/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la 
palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. Definir 
los siguientes métodos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la 
longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada 
letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra 
o no. También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas 
y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada 
vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando 
el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:

Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades

 */
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class AhorcadoService {

    Ahorcado a = new Ahorcado();
    Scanner leer = new Scanner(System.in);

    public void crearJuego() {
        System.out.println("RETADOR, ingresa la palabra a encontrar!");
        String palabra = leer.next();
        a.setPalaLong(palabra.length());
        String aux[] = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            aux[i] = palabra.substring(i, i + 1);
        }
        a.setPalaFind(aux);
        System.out.println("¿Cuantos intentos quieres darle al oponente?");
        a.setIntentos(leer.nextInt());
    }

    public void Juego() {
        crearJuego();
        System.out.println("La palabra tiene " + a.getPalaLong() + " caracteres.");
        int intento = 0;
        int letraEnc = 0;
        int aux = 0;
        String letraIng;
        for (int i = 0; i < a.getIntentos(); i++) {
            System.out.println("JUGADOR, ingresa letras (1x1)!");
            letraIng = leer.next();
            for (int j = 0; j < a.getPalaLong(); j++) {
                if (letraIng.equals(a.getPalaFind()[j])) {
                    letraEnc++;
                    aux = aux + letraEnc;
                    i--;
                    if (aux == a.getPalaLong()) { 
                        i = a.getIntentos();
                    }
                }
            }
            if (letraEnc > 0) {
                System.out.println("----------------");
                System.out.println("LETRA ENCONTRADA!!!!");
                System.out.println("(se encontró " + letraEnc + " veces.)");
                System.out.println("(te quedan " + (a.getPalaLong() - letraEnc) + " letras restantes.)");
                System.out.println("----------------");
            } else {
                System.out.println("La letra no está en la palabra.");
                intento++;
            }
            System.out.println("Te quedan " + (a.getIntentos() - intento) + " intentos!");
            System.out.println("----------------");
            letraEnc = 0;
        }
        if (aux == a.getPalaLong()) {
            System.out.println("JUGADOR, has ganado!");
        }
        if (intento == a.getIntentos()) {
            System.out.println("JUGADOR, has perdido!");
        }
    }
}
