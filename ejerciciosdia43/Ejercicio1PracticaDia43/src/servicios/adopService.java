/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class adopService {

    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();
    Perro perro1 = new Perro();
    Perro perro2 = new Perro();
    Persona p2 = new Persona();
    Perro perro3 = new Perro();
    Persona p3 = new Persona();

    public void definirCosas() {
        //perro1!
        perro1.setNombre("Chiquito");
        perro1.setEdad(3);
        perro1.setRaza("Beagle");
        perro1.setTamanio("Obeso");
        //persona 1!
        p1.setNombre("Pepe");
        p1.setApellido("Ojeda");
        p1.setEdad(33);
        p1.setDocumento(26160170);
        //perro2!
        perro2.setNombre("Grandote");
        perro2.setEdad(2);
        perro2.setRaza("Chihuaha");
        perro2.setTamanio("MicroPerro");
        //persona 2!
        p2.setNombre("Bienvenida");
        p2.setApellido("Filomena");
        p2.setEdad(26);
        p2.setDocumento(38503880);
        //perro3!
        perro3.setNombre("Medianote");
        perro3.setEdad(3);
        perro3.setRaza("Fox Terrier");
        perro3.setTamanio("Normal");
        //persona 3!
        p3.setNombre("Roberto");
        p3.setApellido("Malicia");
        p3.setEdad(67);
        p3.setDocumento(13156167);
    }

    public void eligePerro() {
        System.out.println("LOG IN");
        System.out.println("1. " + p1.getNombre() + " " + p1.getApellido());
        System.out.println("2. " + p2.getNombre() + " " + p2.getApellido());
        System.out.println("3. " + p3.getNombre() + " " + p3.getApellido());
        int re = leer.nextInt();
        if (re == 1) {
            System.out.println(p1.getNombre() + ", elige tu próxima mascota!");
            System.out.println("Los perros disponibles son:");
            System.out.println("1. " + perro1);
            System.out.println("2. " + perro2);
            System.out.println("3. " + perro3);
            System.out.println("Ingresa el número del perro que deseas!");
            int aux = leer.nextInt();
            switch (aux) {
                case 1:
                    if (perro1.isAdoptado() == false) {
                        p1.setPerruqui(perro1);
                        perro1.setAdoptado(true);
                    } else {
                        System.out.println("Ya fue adoptado por alguien más!");
                    }
                        break;
                case 2:
                    if (perro2.isAdoptado() == false) {
                        p1.setPerruqui(perro2);
                        perro2.setAdoptado(true);
                    } else {
                        System.out.println("Ya fue adoptado por alguien más!");
                    }
                        break;
                case 3:
                    if (perro3.isAdoptado() == false) {
                        p1.setPerruqui(perro3);
                        perro3.setAdoptado(true);
                    } else {
                        System.out.println("Ya fue adoptado por alguien más!");
                    }
                        break;
            }
        }
        if (re == 2) {
            System.out.println(p2.getNombre() + ", elige tu próxima mascota!");
            System.out.println("Los perros disponibles son:");
            System.out.println("1. " + perro1);
            System.out.println("2. " + perro2);
            System.out.println("3. " + perro3);
            System.out.println("Ingresa el número del perro que deseas!");
            int aux = leer.nextInt();
            switch (aux) {
                case 1:
                    if (perro1.isAdoptado() == false) {
                        p2.setPerruqui(perro1);
                        perro1.setAdoptado(true);
                    } else {
                        System.out.println("Ya fue adoptado por alguien más!");
                    }
                        break;
                case 2:
                    if (perro2.isAdoptado() == false) {
                        p2.setPerruqui(perro2);
                        perro2.setAdoptado(true);
                    } else {
                        System.out.println("Ya fue adoptado por alguien más!");
                    }
                        break;
                case 3:
                    if (perro3.isAdoptado() == false) {
                        p2.setPerruqui(perro3);
                        perro3.setAdoptado(true);
                    } else {
                        System.out.println("Ya fue adoptado por alguien más!");
                    }
                        break;
            }
        }
        if (re == 3) {
            System.out.println(p3.getNombre() + ", elige tu próxima mascota!");
            System.out.println("Los perros disponibles son:");
            System.out.println("1. " + perro1);
            System.out.println("2. " + perro2);
            System.out.println("3. " + perro3);
            System.out.println("Ingresa el número del perro que deseas!");
            int aux = leer.nextInt();
            switch (aux) {
                case 1:
                    if (perro1.isAdoptado() == false) {
                        p3.setPerruqui(perro1);
                        perro1.setAdoptado(true);
                    } else {
                        System.out.println("Ya fue adoptado por alguien más!");
                    }
                        break;
                case 2:
                    if (perro2.isAdoptado() == false) {
                        p3.setPerruqui(perro2);
                        perro2.setAdoptado(true);
                    } else {
                        System.out.println("Ya fue adoptado por alguien más!");
                    }
                        break;
                case 3:
                    if (perro3.isAdoptado() == false) {
                        p3.setPerruqui(perro3);
                        perro3.setAdoptado(true);
                    } else {
                        System.out.println("Ya fue adoptado por alguien más!");
                    }
                        break;
            }
        }
    }

    public void menu() {
        String aux = "si";
        while ("si".equalsIgnoreCase(aux)) {
            eligePerro();
            System.out.println("¿Desea loguearse con otro usuario?");
            aux = leer.next();
        }
        System.out.println("ADOPCIONES TOTALES.");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
