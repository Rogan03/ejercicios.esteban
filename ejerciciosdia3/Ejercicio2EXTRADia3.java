/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, 
realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package javaapplication11;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio2EXTRADia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 2;
        int B = 4;
        int C = 6;
        int D = 8;
        int aux;
        System.out.println("A. " + A);
        System.out.println("B. " + B);
        System.out.println("C. " + C);
        System.out.println("D. " + D);
        System.out.println("----------");
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("A. " + A);
        System.out.println("B. " + B);
        System.out.println("C. " + C);
        System.out.println("D. " + D);
    }
    
}
