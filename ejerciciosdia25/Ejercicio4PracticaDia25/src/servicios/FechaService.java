/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes 
métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: 
Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
 */
package servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class FechaService {

    public Date fechaNacimiento() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su día de nacimiento.");
        int dia = leer.nextInt();
        System.out.println("Ahora el mes.");
        int mes = leer.nextInt();
        System.out.println("Por último, el año de nacimiento.");
        int año = leer.nextInt();
        Date fecha = new Date(año - 1900, mes - 1, dia);
        return fecha;
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int tuEdad(Date fecha, Date fechaActual) {
        int edad = fechaActual.getYear() - fecha.getYear();
        if (fechaActual.getMonth() < fecha.getMonth() || fechaActual.getDay() < fecha.getDay()) {
            return edad - 1;
        } else {
            return edad;
        }
    }
}
