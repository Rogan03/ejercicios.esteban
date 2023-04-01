/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es 
antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaapplication11;

/**
 *
 * @author ESTEBAN
 */
public class Ejercicio5PracticaDia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}};
        boolean bandera = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    bandera = false;
                    break;
                }
            }
        }
       if (bandera) {
        System.out.println("La matriz es antisimétrica.");   
       } else {
           System.out.println("La matriz no es antisimétrica.");
       }
    }

}
