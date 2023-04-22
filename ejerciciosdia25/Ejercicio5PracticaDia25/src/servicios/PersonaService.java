/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes 
métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada 
o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona(Persona p) {
        System.out.println("Ingrese el nombre.");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese su día de nacimiento.");
        int dia = leer.nextInt();
        System.out.println("Ahora el mes.");
        int mes = leer.nextInt();
        System.out.println("Por último, el año de nacimiento.");
        int año = leer.nextInt();
        Date fecha = new Date(año - 1900, mes - 1, dia);
        p.setFechaNac(fecha);
        return p;
    }

    public int calcularEdad(Persona p) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - p.getFechaNac().getYear();
        if (fechaActual.getMonth() < p.getFechaNac().getMonth() || fechaActual.getDay() < p.getFechaNac().getDay()) {
            return edad - 1;
        } else {
            return edad;
        }
    }

    public boolean menorQue(Persona p, int edad) {
        System.out.println("Ingrese la edad de un familiar.");
        int edad2 = leer.nextInt();
        if (edad2 > calcularEdad(p)) {
            return true;
        } else {
            return false;
            //ALTERNATIVA MAS SENCILLA: return edad2>calcularEdad(p);
        }
    }

    public void mostrarPersona(Persona p) {
        System.out.println(p.getNombre());
        System.out.println(p.getFechaNac());
    }
}
