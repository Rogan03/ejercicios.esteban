/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package ejercicio1practicadia52;

import ejercicio1practicadia52.entidades.Animal;
import ejercicio1practicadia52.entidades.Caballo;
import ejercicio1practicadia52.entidades.Gato;
import ejercicio1practicadia52.entidades.Perro;

/**
 *
 * @author Esteban
 */
public class Ejercicio1PracticaDia52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stitch", "Carnívoro", 15, "Doberman");
        perro1.Alimentarse();
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuaha");
        perro2.Alimentarse();
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.Alimentarse();
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Árabe");
        caballo1.Alimentarse();
    }
}
