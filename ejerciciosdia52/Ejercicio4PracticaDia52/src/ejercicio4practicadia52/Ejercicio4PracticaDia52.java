/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package ejercicio4practicadia52;

import ejercicio4practicadia52.entidades.Circulo;
import ejercicio4practicadia52.entidades.Rectangulo;
import ejercicio4practicadia52.entidades.interfaces.calculosFormas;

/**
 *
 * @author Esteban
 */
public class Ejercicio4PracticaDia52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculosFormas cir = new Circulo(1.5,3.1,5,5);
        calculosFormas rec = new Rectangulo(1.5,2.8,3.1,5);
        cir.calcularAreaCir();
        cir.calcularPerCir();
        rec.calcularAreaRec();
        rec.calcularPerRec();
    }
}
